package com.fourthis4.spider.robot.job;

import com.alibaba.fastjson.JSONObject;
import com.fourthis4.spider.robot.generate.mapper.StockPriceDetailMapper;
import com.fourthis4.spider.robot.generate.model.StockPriceDetail;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

@Component
@Slf4j
public class NetEasySpiderRobot{

  @Autowired
  private StockPriceDetailMapper stockPriceDetailMapper;

  @Autowired
  private RedisTemplate redisTemplate;

  private static final String API_URL = "http://api.money.126.net/data/feed/";

  @Autowired
  private RestTemplate restTemplate;

  public void run(String code){

    StockPriceDetail lastValue;
      String result = call(code);

      lastValue = parse(result);
      lastValue.setStockCode(code);

      if (needInsert(lastValue)) {

        lastValue.setId(UUID.randomUUID().toString());
        lastValue.setDateTimestamp(System.currentTimeMillis());
        stockPriceDetailMapper.insert(lastValue);
      }

  }

  private boolean needInsert(StockPriceDetail lastValue) {

    Integer v = (Integer) redisTemplate.opsForValue()
        .get("stock_code_" + lastValue.getStockCode());

    if (v != null && lastValue.hashCode() == v) {
      return false;
    } else {
      redisTemplate.opsForValue()
          .set("stock_code_" + lastValue.getStockCode(), lastValue.hashCode());
      return true;
    }
  }
  private String call(String code) {

    if (code.startsWith("6")) {
      code = "0" + code;
    } else {
      code = "1" + code;
    }

    String url = API_URL + code + "?callback=callback";

    String result;

    try {
      result = restTemplate.getForObject(url, String.class);
    } catch (Exception e) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }
      result = restTemplate.getForObject(url, String.class);
    }

    log.info(result);

    return result;
  }

  private StockPriceDetail parse(String result) {
    String json = result.substring(9, result.length() - 2);

    JSONObject jsonObject = JSONObject.parseObject(json);

    Set<String> set = jsonObject.keySet();

    String key = set.stream().findFirst().get();

    jsonObject = jsonObject.getJSONObject(key);

    StockPriceDetail stockPriceDetail =  JSONObject.parseObject(jsonObject.toJSONString(), StockPriceDetail.class);

    BigDecimal thousand = new BigDecimal(1000);
    stockPriceDetail.setAsk1(jsonObject.get("ask1") != null ? jsonObject.getBigDecimal("ask1").multiply(thousand).intValue(): 0);
    stockPriceDetail.setAsk2(jsonObject.get("ask2") != null ? jsonObject.getBigDecimal("ask2").multiply(thousand).intValue(): 0);
    stockPriceDetail.setAsk3(jsonObject.get("ask3") != null ? jsonObject.getBigDecimal("ask3").multiply(thousand).intValue(): 0);
    stockPriceDetail.setAsk4(jsonObject.get("ask4") != null ? jsonObject.getBigDecimal("ask4").multiply(thousand).intValue(): 0);
    stockPriceDetail.setAsk5(jsonObject.get("ask5") != null ? jsonObject.getBigDecimal("ask5").multiply(thousand).intValue(): 0);

    stockPriceDetail.setBid1(jsonObject.get("bid1") != null ? jsonObject.getBigDecimal("bid1").multiply(thousand).intValue(): 0);
    stockPriceDetail.setBid2(jsonObject.get("bid2") != null ? jsonObject.getBigDecimal("bid2").multiply(thousand).intValue(): 0);
    stockPriceDetail.setBid3(jsonObject.get("bid3") != null ? jsonObject.getBigDecimal("bid3").multiply(thousand).intValue(): 0);
    stockPriceDetail.setBid4(jsonObject.get("bid4") != null ? jsonObject.getBigDecimal("bid4").multiply(thousand).intValue(): 0);
    stockPriceDetail.setBid5(jsonObject.get("bid5") != null ? jsonObject.getBigDecimal("bid5").multiply(thousand).intValue(): 0);

    stockPriceDetail.setCurrentPrice(jsonObject.get("price") != null ? jsonObject.getBigDecimal("price").multiply(thousand).intValue() : 0);
    return stockPriceDetail;
  }
}
