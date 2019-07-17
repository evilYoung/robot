package com.fourthis4.spider.robot.generate.model;

import java.io.Serializable;

public class StockPriceDetail implements Serializable {
  private String id;

  private String stockCode;

  private Integer bid1;

  private Integer bidvol1;

  private Integer bid2;

  private Integer bidvol2;

  private Integer bid3;

  private Integer bidvol3;

  private Integer bid4;

  private Integer bidvol4;

  private Integer bid5;

  private Integer bidvol5;

  private Integer ask1;

  private Integer askvol1;

  private Integer ask2;

  private Integer askvol2;

  private Integer ask3;

  private Integer askvol3;

  private Integer ask4;

  private Integer askvol4;

  private Integer ask5;

  private Integer askvol5;

  private Long dateTimestamp;

  private static final long serialVersionUID = 1L;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getStockCode() {
    return stockCode;
  }

  public void setStockCode(String stockCode) {
    this.stockCode = stockCode;
  }

  public Integer getBid1() {
    return bid1;
  }

  public void setBid1(Integer bid1) {
    this.bid1 = bid1;
  }

  public Integer getBidvol1() {
    return bidvol1;
  }

  public void setBidvol1(Integer bidvol1) {
    this.bidvol1 = bidvol1;
  }

  public Integer getBid2() {
    return bid2;
  }

  public void setBid2(Integer bid2) {
    this.bid2 = bid2;
  }

  public Integer getBidvol2() {
    return bidvol2;
  }

  public void setBidvol2(Integer bidvol2) {
    this.bidvol2 = bidvol2;
  }

  public Integer getBid3() {
    return bid3;
  }

  public void setBid3(Integer bid3) {
    this.bid3 = bid3;
  }

  public Integer getBidvol3() {
    return bidvol3;
  }

  public void setBidvol3(Integer bidvol3) {
    this.bidvol3 = bidvol3;
  }

  public Integer getBid4() {
    return bid4;
  }

  public void setBid4(Integer bid4) {
    this.bid4 = bid4;
  }

  public Integer getBidvol4() {
    return bidvol4;
  }

  public void setBidvol4(Integer bidvol4) {
    this.bidvol4 = bidvol4;
  }

  public Integer getBid5() {
    return bid5;
  }

  public void setBid5(Integer bid5) {
    this.bid5 = bid5;
  }

  public Integer getBidvol5() {
    return bidvol5;
  }

  public void setBidvol5(Integer bidvol5) {
    this.bidvol5 = bidvol5;
  }

  public Integer getAsk1() {
    return ask1;
  }

  public void setAsk1(Integer ask1) {
    this.ask1 = ask1;
  }

  public Integer getAskvol1() {
    return askvol1;
  }

  public void setAskvol1(Integer askvol1) {
    this.askvol1 = askvol1;
  }

  public Integer getAsk2() {
    return ask2;
  }

  public void setAsk2(Integer ask2) {
    this.ask2 = ask2;
  }

  public Integer getAskvol2() {
    return askvol2;
  }

  public void setAskvol2(Integer askvol2) {
    this.askvol2 = askvol2;
  }

  public Integer getAsk3() {
    return ask3;
  }

  public void setAsk3(Integer ask3) {
    this.ask3 = ask3;
  }

  public Integer getAskvol3() {
    return askvol3;
  }

  public void setAskvol3(Integer askvol3) {
    this.askvol3 = askvol3;
  }

  public Integer getAsk4() {
    return ask4;
  }

  public void setAsk4(Integer ask4) {
    this.ask4 = ask4;
  }

  public Integer getAskvol4() {
    return askvol4;
  }

  public void setAskvol4(Integer askvol4) {
    this.askvol4 = askvol4;
  }

  public Integer getAsk5() {
    return ask5;
  }

  public void setAsk5(Integer ask5) {
    this.ask5 = ask5;
  }

  public Integer getAskvol5() {
    return askvol5;
  }

  public void setAskvol5(Integer askvol5) {
    this.askvol5 = askvol5;
  }

  public Long getDateTimestamp() {
    return dateTimestamp;
  }

  public void setDateTimestamp(Long dateTimestamp) {
    this.dateTimestamp = dateTimestamp;
  }
}