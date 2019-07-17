package com.fourthis4.spider.robot.generate.mapper;

import com.fourthis4.spider.robot.generate.model.StockPriceDetail;
import com.fourthis4.spider.robot.generate.model.StockPriceDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockPriceDetailMapper {
  long countByExample(StockPriceDetailExample example);

  int deleteByExample(StockPriceDetailExample example);

  int deleteByPrimaryKey(String id);

  int insert(StockPriceDetail record);

  int insertSelective(StockPriceDetail record);

  List<StockPriceDetail> selectByExample(StockPriceDetailExample example);

  StockPriceDetail selectByPrimaryKey(String id);

  int updateByExampleSelective(@Param("record") StockPriceDetail record, @Param("example") StockPriceDetailExample example);

  int updateByExample(@Param("record") StockPriceDetail record, @Param("example") StockPriceDetailExample example);

  int updateByPrimaryKeySelective(StockPriceDetail record);

  int updateByPrimaryKey(StockPriceDetail record);
}