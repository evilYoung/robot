package com.fourthis4.spider.robot.generate.model;

import java.util.ArrayList;
import java.util.List;

public class StockPriceDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockPriceDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNull() {
            addCriterion("stock_code is null");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNotNull() {
            addCriterion("stock_code is not null");
            return (Criteria) this;
        }

        public Criteria andStockCodeEqualTo(String value) {
            addCriterion("stock_code =", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotEqualTo(String value) {
            addCriterion("stock_code <>", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThan(String value) {
            addCriterion("stock_code >", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stock_code >=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThan(String value) {
            addCriterion("stock_code <", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThanOrEqualTo(String value) {
            addCriterion("stock_code <=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLike(String value) {
            addCriterion("stock_code like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotLike(String value) {
            addCriterion("stock_code not like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeIn(List<String> values) {
            addCriterion("stock_code in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotIn(List<String> values) {
            addCriterion("stock_code not in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeBetween(String value1, String value2) {
            addCriterion("stock_code between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotBetween(String value1, String value2) {
            addCriterion("stock_code not between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceIsNull() {
            addCriterion("current_price is null");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceIsNotNull() {
            addCriterion("current_price is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceEqualTo(Integer value) {
            addCriterion("current_price =", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceNotEqualTo(Integer value) {
            addCriterion("current_price <>", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceGreaterThan(Integer value) {
            addCriterion("current_price >", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_price >=", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceLessThan(Integer value) {
            addCriterion("current_price <", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceLessThanOrEqualTo(Integer value) {
            addCriterion("current_price <=", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceIn(List<Integer> values) {
            addCriterion("current_price in", values, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceNotIn(List<Integer> values) {
            addCriterion("current_price not in", values, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceBetween(Integer value1, Integer value2) {
            addCriterion("current_price between", value1, value2, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("current_price not between", value1, value2, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andBid1IsNull() {
            addCriterion("bid1 is null");
            return (Criteria) this;
        }

        public Criteria andBid1IsNotNull() {
            addCriterion("bid1 is not null");
            return (Criteria) this;
        }

        public Criteria andBid1EqualTo(Integer value) {
            addCriterion("bid1 =", value, "bid1");
            return (Criteria) this;
        }

        public Criteria andBid1NotEqualTo(Integer value) {
            addCriterion("bid1 <>", value, "bid1");
            return (Criteria) this;
        }

        public Criteria andBid1GreaterThan(Integer value) {
            addCriterion("bid1 >", value, "bid1");
            return (Criteria) this;
        }

        public Criteria andBid1GreaterThanOrEqualTo(Integer value) {
            addCriterion("bid1 >=", value, "bid1");
            return (Criteria) this;
        }

        public Criteria andBid1LessThan(Integer value) {
            addCriterion("bid1 <", value, "bid1");
            return (Criteria) this;
        }

        public Criteria andBid1LessThanOrEqualTo(Integer value) {
            addCriterion("bid1 <=", value, "bid1");
            return (Criteria) this;
        }

        public Criteria andBid1In(List<Integer> values) {
            addCriterion("bid1 in", values, "bid1");
            return (Criteria) this;
        }

        public Criteria andBid1NotIn(List<Integer> values) {
            addCriterion("bid1 not in", values, "bid1");
            return (Criteria) this;
        }

        public Criteria andBid1Between(Integer value1, Integer value2) {
            addCriterion("bid1 between", value1, value2, "bid1");
            return (Criteria) this;
        }

        public Criteria andBid1NotBetween(Integer value1, Integer value2) {
            addCriterion("bid1 not between", value1, value2, "bid1");
            return (Criteria) this;
        }

        public Criteria andBidvol1IsNull() {
            addCriterion("bidvol1 is null");
            return (Criteria) this;
        }

        public Criteria andBidvol1IsNotNull() {
            addCriterion("bidvol1 is not null");
            return (Criteria) this;
        }

        public Criteria andBidvol1EqualTo(Integer value) {
            addCriterion("bidvol1 =", value, "bidvol1");
            return (Criteria) this;
        }

        public Criteria andBidvol1NotEqualTo(Integer value) {
            addCriterion("bidvol1 <>", value, "bidvol1");
            return (Criteria) this;
        }

        public Criteria andBidvol1GreaterThan(Integer value) {
            addCriterion("bidvol1 >", value, "bidvol1");
            return (Criteria) this;
        }

        public Criteria andBidvol1GreaterThanOrEqualTo(Integer value) {
            addCriterion("bidvol1 >=", value, "bidvol1");
            return (Criteria) this;
        }

        public Criteria andBidvol1LessThan(Integer value) {
            addCriterion("bidvol1 <", value, "bidvol1");
            return (Criteria) this;
        }

        public Criteria andBidvol1LessThanOrEqualTo(Integer value) {
            addCriterion("bidvol1 <=", value, "bidvol1");
            return (Criteria) this;
        }

        public Criteria andBidvol1In(List<Integer> values) {
            addCriterion("bidvol1 in", values, "bidvol1");
            return (Criteria) this;
        }

        public Criteria andBidvol1NotIn(List<Integer> values) {
            addCriterion("bidvol1 not in", values, "bidvol1");
            return (Criteria) this;
        }

        public Criteria andBidvol1Between(Integer value1, Integer value2) {
            addCriterion("bidvol1 between", value1, value2, "bidvol1");
            return (Criteria) this;
        }

        public Criteria andBidvol1NotBetween(Integer value1, Integer value2) {
            addCriterion("bidvol1 not between", value1, value2, "bidvol1");
            return (Criteria) this;
        }

        public Criteria andBid2IsNull() {
            addCriterion("bid2 is null");
            return (Criteria) this;
        }

        public Criteria andBid2IsNotNull() {
            addCriterion("bid2 is not null");
            return (Criteria) this;
        }

        public Criteria andBid2EqualTo(Integer value) {
            addCriterion("bid2 =", value, "bid2");
            return (Criteria) this;
        }

        public Criteria andBid2NotEqualTo(Integer value) {
            addCriterion("bid2 <>", value, "bid2");
            return (Criteria) this;
        }

        public Criteria andBid2GreaterThan(Integer value) {
            addCriterion("bid2 >", value, "bid2");
            return (Criteria) this;
        }

        public Criteria andBid2GreaterThanOrEqualTo(Integer value) {
            addCriterion("bid2 >=", value, "bid2");
            return (Criteria) this;
        }

        public Criteria andBid2LessThan(Integer value) {
            addCriterion("bid2 <", value, "bid2");
            return (Criteria) this;
        }

        public Criteria andBid2LessThanOrEqualTo(Integer value) {
            addCriterion("bid2 <=", value, "bid2");
            return (Criteria) this;
        }

        public Criteria andBid2In(List<Integer> values) {
            addCriterion("bid2 in", values, "bid2");
            return (Criteria) this;
        }

        public Criteria andBid2NotIn(List<Integer> values) {
            addCriterion("bid2 not in", values, "bid2");
            return (Criteria) this;
        }

        public Criteria andBid2Between(Integer value1, Integer value2) {
            addCriterion("bid2 between", value1, value2, "bid2");
            return (Criteria) this;
        }

        public Criteria andBid2NotBetween(Integer value1, Integer value2) {
            addCriterion("bid2 not between", value1, value2, "bid2");
            return (Criteria) this;
        }

        public Criteria andBidvol2IsNull() {
            addCriterion("bidvol2 is null");
            return (Criteria) this;
        }

        public Criteria andBidvol2IsNotNull() {
            addCriterion("bidvol2 is not null");
            return (Criteria) this;
        }

        public Criteria andBidvol2EqualTo(Integer value) {
            addCriterion("bidvol2 =", value, "bidvol2");
            return (Criteria) this;
        }

        public Criteria andBidvol2NotEqualTo(Integer value) {
            addCriterion("bidvol2 <>", value, "bidvol2");
            return (Criteria) this;
        }

        public Criteria andBidvol2GreaterThan(Integer value) {
            addCriterion("bidvol2 >", value, "bidvol2");
            return (Criteria) this;
        }

        public Criteria andBidvol2GreaterThanOrEqualTo(Integer value) {
            addCriterion("bidvol2 >=", value, "bidvol2");
            return (Criteria) this;
        }

        public Criteria andBidvol2LessThan(Integer value) {
            addCriterion("bidvol2 <", value, "bidvol2");
            return (Criteria) this;
        }

        public Criteria andBidvol2LessThanOrEqualTo(Integer value) {
            addCriterion("bidvol2 <=", value, "bidvol2");
            return (Criteria) this;
        }

        public Criteria andBidvol2In(List<Integer> values) {
            addCriterion("bidvol2 in", values, "bidvol2");
            return (Criteria) this;
        }

        public Criteria andBidvol2NotIn(List<Integer> values) {
            addCriterion("bidvol2 not in", values, "bidvol2");
            return (Criteria) this;
        }

        public Criteria andBidvol2Between(Integer value1, Integer value2) {
            addCriterion("bidvol2 between", value1, value2, "bidvol2");
            return (Criteria) this;
        }

        public Criteria andBidvol2NotBetween(Integer value1, Integer value2) {
            addCriterion("bidvol2 not between", value1, value2, "bidvol2");
            return (Criteria) this;
        }

        public Criteria andBid3IsNull() {
            addCriterion("bid3 is null");
            return (Criteria) this;
        }

        public Criteria andBid3IsNotNull() {
            addCriterion("bid3 is not null");
            return (Criteria) this;
        }

        public Criteria andBid3EqualTo(Integer value) {
            addCriterion("bid3 =", value, "bid3");
            return (Criteria) this;
        }

        public Criteria andBid3NotEqualTo(Integer value) {
            addCriterion("bid3 <>", value, "bid3");
            return (Criteria) this;
        }

        public Criteria andBid3GreaterThan(Integer value) {
            addCriterion("bid3 >", value, "bid3");
            return (Criteria) this;
        }

        public Criteria andBid3GreaterThanOrEqualTo(Integer value) {
            addCriterion("bid3 >=", value, "bid3");
            return (Criteria) this;
        }

        public Criteria andBid3LessThan(Integer value) {
            addCriterion("bid3 <", value, "bid3");
            return (Criteria) this;
        }

        public Criteria andBid3LessThanOrEqualTo(Integer value) {
            addCriterion("bid3 <=", value, "bid3");
            return (Criteria) this;
        }

        public Criteria andBid3In(List<Integer> values) {
            addCriterion("bid3 in", values, "bid3");
            return (Criteria) this;
        }

        public Criteria andBid3NotIn(List<Integer> values) {
            addCriterion("bid3 not in", values, "bid3");
            return (Criteria) this;
        }

        public Criteria andBid3Between(Integer value1, Integer value2) {
            addCriterion("bid3 between", value1, value2, "bid3");
            return (Criteria) this;
        }

        public Criteria andBid3NotBetween(Integer value1, Integer value2) {
            addCriterion("bid3 not between", value1, value2, "bid3");
            return (Criteria) this;
        }

        public Criteria andBidvol3IsNull() {
            addCriterion("bidvol3 is null");
            return (Criteria) this;
        }

        public Criteria andBidvol3IsNotNull() {
            addCriterion("bidvol3 is not null");
            return (Criteria) this;
        }

        public Criteria andBidvol3EqualTo(Integer value) {
            addCriterion("bidvol3 =", value, "bidvol3");
            return (Criteria) this;
        }

        public Criteria andBidvol3NotEqualTo(Integer value) {
            addCriterion("bidvol3 <>", value, "bidvol3");
            return (Criteria) this;
        }

        public Criteria andBidvol3GreaterThan(Integer value) {
            addCriterion("bidvol3 >", value, "bidvol3");
            return (Criteria) this;
        }

        public Criteria andBidvol3GreaterThanOrEqualTo(Integer value) {
            addCriterion("bidvol3 >=", value, "bidvol3");
            return (Criteria) this;
        }

        public Criteria andBidvol3LessThan(Integer value) {
            addCriterion("bidvol3 <", value, "bidvol3");
            return (Criteria) this;
        }

        public Criteria andBidvol3LessThanOrEqualTo(Integer value) {
            addCriterion("bidvol3 <=", value, "bidvol3");
            return (Criteria) this;
        }

        public Criteria andBidvol3In(List<Integer> values) {
            addCriterion("bidvol3 in", values, "bidvol3");
            return (Criteria) this;
        }

        public Criteria andBidvol3NotIn(List<Integer> values) {
            addCriterion("bidvol3 not in", values, "bidvol3");
            return (Criteria) this;
        }

        public Criteria andBidvol3Between(Integer value1, Integer value2) {
            addCriterion("bidvol3 between", value1, value2, "bidvol3");
            return (Criteria) this;
        }

        public Criteria andBidvol3NotBetween(Integer value1, Integer value2) {
            addCriterion("bidvol3 not between", value1, value2, "bidvol3");
            return (Criteria) this;
        }

        public Criteria andBid4IsNull() {
            addCriterion("bid4 is null");
            return (Criteria) this;
        }

        public Criteria andBid4IsNotNull() {
            addCriterion("bid4 is not null");
            return (Criteria) this;
        }

        public Criteria andBid4EqualTo(Integer value) {
            addCriterion("bid4 =", value, "bid4");
            return (Criteria) this;
        }

        public Criteria andBid4NotEqualTo(Integer value) {
            addCriterion("bid4 <>", value, "bid4");
            return (Criteria) this;
        }

        public Criteria andBid4GreaterThan(Integer value) {
            addCriterion("bid4 >", value, "bid4");
            return (Criteria) this;
        }

        public Criteria andBid4GreaterThanOrEqualTo(Integer value) {
            addCriterion("bid4 >=", value, "bid4");
            return (Criteria) this;
        }

        public Criteria andBid4LessThan(Integer value) {
            addCriterion("bid4 <", value, "bid4");
            return (Criteria) this;
        }

        public Criteria andBid4LessThanOrEqualTo(Integer value) {
            addCriterion("bid4 <=", value, "bid4");
            return (Criteria) this;
        }

        public Criteria andBid4In(List<Integer> values) {
            addCriterion("bid4 in", values, "bid4");
            return (Criteria) this;
        }

        public Criteria andBid4NotIn(List<Integer> values) {
            addCriterion("bid4 not in", values, "bid4");
            return (Criteria) this;
        }

        public Criteria andBid4Between(Integer value1, Integer value2) {
            addCriterion("bid4 between", value1, value2, "bid4");
            return (Criteria) this;
        }

        public Criteria andBid4NotBetween(Integer value1, Integer value2) {
            addCriterion("bid4 not between", value1, value2, "bid4");
            return (Criteria) this;
        }

        public Criteria andBidvol4IsNull() {
            addCriterion("bidvol4 is null");
            return (Criteria) this;
        }

        public Criteria andBidvol4IsNotNull() {
            addCriterion("bidvol4 is not null");
            return (Criteria) this;
        }

        public Criteria andBidvol4EqualTo(Integer value) {
            addCriterion("bidvol4 =", value, "bidvol4");
            return (Criteria) this;
        }

        public Criteria andBidvol4NotEqualTo(Integer value) {
            addCriterion("bidvol4 <>", value, "bidvol4");
            return (Criteria) this;
        }

        public Criteria andBidvol4GreaterThan(Integer value) {
            addCriterion("bidvol4 >", value, "bidvol4");
            return (Criteria) this;
        }

        public Criteria andBidvol4GreaterThanOrEqualTo(Integer value) {
            addCriterion("bidvol4 >=", value, "bidvol4");
            return (Criteria) this;
        }

        public Criteria andBidvol4LessThan(Integer value) {
            addCriterion("bidvol4 <", value, "bidvol4");
            return (Criteria) this;
        }

        public Criteria andBidvol4LessThanOrEqualTo(Integer value) {
            addCriterion("bidvol4 <=", value, "bidvol4");
            return (Criteria) this;
        }

        public Criteria andBidvol4In(List<Integer> values) {
            addCriterion("bidvol4 in", values, "bidvol4");
            return (Criteria) this;
        }

        public Criteria andBidvol4NotIn(List<Integer> values) {
            addCriterion("bidvol4 not in", values, "bidvol4");
            return (Criteria) this;
        }

        public Criteria andBidvol4Between(Integer value1, Integer value2) {
            addCriterion("bidvol4 between", value1, value2, "bidvol4");
            return (Criteria) this;
        }

        public Criteria andBidvol4NotBetween(Integer value1, Integer value2) {
            addCriterion("bidvol4 not between", value1, value2, "bidvol4");
            return (Criteria) this;
        }

        public Criteria andBid5IsNull() {
            addCriterion("bid5 is null");
            return (Criteria) this;
        }

        public Criteria andBid5IsNotNull() {
            addCriterion("bid5 is not null");
            return (Criteria) this;
        }

        public Criteria andBid5EqualTo(Integer value) {
            addCriterion("bid5 =", value, "bid5");
            return (Criteria) this;
        }

        public Criteria andBid5NotEqualTo(Integer value) {
            addCriterion("bid5 <>", value, "bid5");
            return (Criteria) this;
        }

        public Criteria andBid5GreaterThan(Integer value) {
            addCriterion("bid5 >", value, "bid5");
            return (Criteria) this;
        }

        public Criteria andBid5GreaterThanOrEqualTo(Integer value) {
            addCriterion("bid5 >=", value, "bid5");
            return (Criteria) this;
        }

        public Criteria andBid5LessThan(Integer value) {
            addCriterion("bid5 <", value, "bid5");
            return (Criteria) this;
        }

        public Criteria andBid5LessThanOrEqualTo(Integer value) {
            addCriterion("bid5 <=", value, "bid5");
            return (Criteria) this;
        }

        public Criteria andBid5In(List<Integer> values) {
            addCriterion("bid5 in", values, "bid5");
            return (Criteria) this;
        }

        public Criteria andBid5NotIn(List<Integer> values) {
            addCriterion("bid5 not in", values, "bid5");
            return (Criteria) this;
        }

        public Criteria andBid5Between(Integer value1, Integer value2) {
            addCriterion("bid5 between", value1, value2, "bid5");
            return (Criteria) this;
        }

        public Criteria andBid5NotBetween(Integer value1, Integer value2) {
            addCriterion("bid5 not between", value1, value2, "bid5");
            return (Criteria) this;
        }

        public Criteria andBidvol5IsNull() {
            addCriterion("bidvol5 is null");
            return (Criteria) this;
        }

        public Criteria andBidvol5IsNotNull() {
            addCriterion("bidvol5 is not null");
            return (Criteria) this;
        }

        public Criteria andBidvol5EqualTo(Integer value) {
            addCriterion("bidvol5 =", value, "bidvol5");
            return (Criteria) this;
        }

        public Criteria andBidvol5NotEqualTo(Integer value) {
            addCriterion("bidvol5 <>", value, "bidvol5");
            return (Criteria) this;
        }

        public Criteria andBidvol5GreaterThan(Integer value) {
            addCriterion("bidvol5 >", value, "bidvol5");
            return (Criteria) this;
        }

        public Criteria andBidvol5GreaterThanOrEqualTo(Integer value) {
            addCriterion("bidvol5 >=", value, "bidvol5");
            return (Criteria) this;
        }

        public Criteria andBidvol5LessThan(Integer value) {
            addCriterion("bidvol5 <", value, "bidvol5");
            return (Criteria) this;
        }

        public Criteria andBidvol5LessThanOrEqualTo(Integer value) {
            addCriterion("bidvol5 <=", value, "bidvol5");
            return (Criteria) this;
        }

        public Criteria andBidvol5In(List<Integer> values) {
            addCriterion("bidvol5 in", values, "bidvol5");
            return (Criteria) this;
        }

        public Criteria andBidvol5NotIn(List<Integer> values) {
            addCriterion("bidvol5 not in", values, "bidvol5");
            return (Criteria) this;
        }

        public Criteria andBidvol5Between(Integer value1, Integer value2) {
            addCriterion("bidvol5 between", value1, value2, "bidvol5");
            return (Criteria) this;
        }

        public Criteria andBidvol5NotBetween(Integer value1, Integer value2) {
            addCriterion("bidvol5 not between", value1, value2, "bidvol5");
            return (Criteria) this;
        }

        public Criteria andAsk1IsNull() {
            addCriterion("ask1 is null");
            return (Criteria) this;
        }

        public Criteria andAsk1IsNotNull() {
            addCriterion("ask1 is not null");
            return (Criteria) this;
        }

        public Criteria andAsk1EqualTo(Integer value) {
            addCriterion("ask1 =", value, "ask1");
            return (Criteria) this;
        }

        public Criteria andAsk1NotEqualTo(Integer value) {
            addCriterion("ask1 <>", value, "ask1");
            return (Criteria) this;
        }

        public Criteria andAsk1GreaterThan(Integer value) {
            addCriterion("ask1 >", value, "ask1");
            return (Criteria) this;
        }

        public Criteria andAsk1GreaterThanOrEqualTo(Integer value) {
            addCriterion("ask1 >=", value, "ask1");
            return (Criteria) this;
        }

        public Criteria andAsk1LessThan(Integer value) {
            addCriterion("ask1 <", value, "ask1");
            return (Criteria) this;
        }

        public Criteria andAsk1LessThanOrEqualTo(Integer value) {
            addCriterion("ask1 <=", value, "ask1");
            return (Criteria) this;
        }

        public Criteria andAsk1In(List<Integer> values) {
            addCriterion("ask1 in", values, "ask1");
            return (Criteria) this;
        }

        public Criteria andAsk1NotIn(List<Integer> values) {
            addCriterion("ask1 not in", values, "ask1");
            return (Criteria) this;
        }

        public Criteria andAsk1Between(Integer value1, Integer value2) {
            addCriterion("ask1 between", value1, value2, "ask1");
            return (Criteria) this;
        }

        public Criteria andAsk1NotBetween(Integer value1, Integer value2) {
            addCriterion("ask1 not between", value1, value2, "ask1");
            return (Criteria) this;
        }

        public Criteria andAskvol1IsNull() {
            addCriterion("askvol1 is null");
            return (Criteria) this;
        }

        public Criteria andAskvol1IsNotNull() {
            addCriterion("askvol1 is not null");
            return (Criteria) this;
        }

        public Criteria andAskvol1EqualTo(Integer value) {
            addCriterion("askvol1 =", value, "askvol1");
            return (Criteria) this;
        }

        public Criteria andAskvol1NotEqualTo(Integer value) {
            addCriterion("askvol1 <>", value, "askvol1");
            return (Criteria) this;
        }

        public Criteria andAskvol1GreaterThan(Integer value) {
            addCriterion("askvol1 >", value, "askvol1");
            return (Criteria) this;
        }

        public Criteria andAskvol1GreaterThanOrEqualTo(Integer value) {
            addCriterion("askvol1 >=", value, "askvol1");
            return (Criteria) this;
        }

        public Criteria andAskvol1LessThan(Integer value) {
            addCriterion("askvol1 <", value, "askvol1");
            return (Criteria) this;
        }

        public Criteria andAskvol1LessThanOrEqualTo(Integer value) {
            addCriterion("askvol1 <=", value, "askvol1");
            return (Criteria) this;
        }

        public Criteria andAskvol1In(List<Integer> values) {
            addCriterion("askvol1 in", values, "askvol1");
            return (Criteria) this;
        }

        public Criteria andAskvol1NotIn(List<Integer> values) {
            addCriterion("askvol1 not in", values, "askvol1");
            return (Criteria) this;
        }

        public Criteria andAskvol1Between(Integer value1, Integer value2) {
            addCriterion("askvol1 between", value1, value2, "askvol1");
            return (Criteria) this;
        }

        public Criteria andAskvol1NotBetween(Integer value1, Integer value2) {
            addCriterion("askvol1 not between", value1, value2, "askvol1");
            return (Criteria) this;
        }

        public Criteria andAsk2IsNull() {
            addCriterion("ask2 is null");
            return (Criteria) this;
        }

        public Criteria andAsk2IsNotNull() {
            addCriterion("ask2 is not null");
            return (Criteria) this;
        }

        public Criteria andAsk2EqualTo(Integer value) {
            addCriterion("ask2 =", value, "ask2");
            return (Criteria) this;
        }

        public Criteria andAsk2NotEqualTo(Integer value) {
            addCriterion("ask2 <>", value, "ask2");
            return (Criteria) this;
        }

        public Criteria andAsk2GreaterThan(Integer value) {
            addCriterion("ask2 >", value, "ask2");
            return (Criteria) this;
        }

        public Criteria andAsk2GreaterThanOrEqualTo(Integer value) {
            addCriterion("ask2 >=", value, "ask2");
            return (Criteria) this;
        }

        public Criteria andAsk2LessThan(Integer value) {
            addCriterion("ask2 <", value, "ask2");
            return (Criteria) this;
        }

        public Criteria andAsk2LessThanOrEqualTo(Integer value) {
            addCriterion("ask2 <=", value, "ask2");
            return (Criteria) this;
        }

        public Criteria andAsk2In(List<Integer> values) {
            addCriterion("ask2 in", values, "ask2");
            return (Criteria) this;
        }

        public Criteria andAsk2NotIn(List<Integer> values) {
            addCriterion("ask2 not in", values, "ask2");
            return (Criteria) this;
        }

        public Criteria andAsk2Between(Integer value1, Integer value2) {
            addCriterion("ask2 between", value1, value2, "ask2");
            return (Criteria) this;
        }

        public Criteria andAsk2NotBetween(Integer value1, Integer value2) {
            addCriterion("ask2 not between", value1, value2, "ask2");
            return (Criteria) this;
        }

        public Criteria andAskvol2IsNull() {
            addCriterion("askvol2 is null");
            return (Criteria) this;
        }

        public Criteria andAskvol2IsNotNull() {
            addCriterion("askvol2 is not null");
            return (Criteria) this;
        }

        public Criteria andAskvol2EqualTo(Integer value) {
            addCriterion("askvol2 =", value, "askvol2");
            return (Criteria) this;
        }

        public Criteria andAskvol2NotEqualTo(Integer value) {
            addCriterion("askvol2 <>", value, "askvol2");
            return (Criteria) this;
        }

        public Criteria andAskvol2GreaterThan(Integer value) {
            addCriterion("askvol2 >", value, "askvol2");
            return (Criteria) this;
        }

        public Criteria andAskvol2GreaterThanOrEqualTo(Integer value) {
            addCriterion("askvol2 >=", value, "askvol2");
            return (Criteria) this;
        }

        public Criteria andAskvol2LessThan(Integer value) {
            addCriterion("askvol2 <", value, "askvol2");
            return (Criteria) this;
        }

        public Criteria andAskvol2LessThanOrEqualTo(Integer value) {
            addCriterion("askvol2 <=", value, "askvol2");
            return (Criteria) this;
        }

        public Criteria andAskvol2In(List<Integer> values) {
            addCriterion("askvol2 in", values, "askvol2");
            return (Criteria) this;
        }

        public Criteria andAskvol2NotIn(List<Integer> values) {
            addCriterion("askvol2 not in", values, "askvol2");
            return (Criteria) this;
        }

        public Criteria andAskvol2Between(Integer value1, Integer value2) {
            addCriterion("askvol2 between", value1, value2, "askvol2");
            return (Criteria) this;
        }

        public Criteria andAskvol2NotBetween(Integer value1, Integer value2) {
            addCriterion("askvol2 not between", value1, value2, "askvol2");
            return (Criteria) this;
        }

        public Criteria andAsk3IsNull() {
            addCriterion("ask3 is null");
            return (Criteria) this;
        }

        public Criteria andAsk3IsNotNull() {
            addCriterion("ask3 is not null");
            return (Criteria) this;
        }

        public Criteria andAsk3EqualTo(Integer value) {
            addCriterion("ask3 =", value, "ask3");
            return (Criteria) this;
        }

        public Criteria andAsk3NotEqualTo(Integer value) {
            addCriterion("ask3 <>", value, "ask3");
            return (Criteria) this;
        }

        public Criteria andAsk3GreaterThan(Integer value) {
            addCriterion("ask3 >", value, "ask3");
            return (Criteria) this;
        }

        public Criteria andAsk3GreaterThanOrEqualTo(Integer value) {
            addCriterion("ask3 >=", value, "ask3");
            return (Criteria) this;
        }

        public Criteria andAsk3LessThan(Integer value) {
            addCriterion("ask3 <", value, "ask3");
            return (Criteria) this;
        }

        public Criteria andAsk3LessThanOrEqualTo(Integer value) {
            addCriterion("ask3 <=", value, "ask3");
            return (Criteria) this;
        }

        public Criteria andAsk3In(List<Integer> values) {
            addCriterion("ask3 in", values, "ask3");
            return (Criteria) this;
        }

        public Criteria andAsk3NotIn(List<Integer> values) {
            addCriterion("ask3 not in", values, "ask3");
            return (Criteria) this;
        }

        public Criteria andAsk3Between(Integer value1, Integer value2) {
            addCriterion("ask3 between", value1, value2, "ask3");
            return (Criteria) this;
        }

        public Criteria andAsk3NotBetween(Integer value1, Integer value2) {
            addCriterion("ask3 not between", value1, value2, "ask3");
            return (Criteria) this;
        }

        public Criteria andAskvol3IsNull() {
            addCriterion("askvol3 is null");
            return (Criteria) this;
        }

        public Criteria andAskvol3IsNotNull() {
            addCriterion("askvol3 is not null");
            return (Criteria) this;
        }

        public Criteria andAskvol3EqualTo(Integer value) {
            addCriterion("askvol3 =", value, "askvol3");
            return (Criteria) this;
        }

        public Criteria andAskvol3NotEqualTo(Integer value) {
            addCriterion("askvol3 <>", value, "askvol3");
            return (Criteria) this;
        }

        public Criteria andAskvol3GreaterThan(Integer value) {
            addCriterion("askvol3 >", value, "askvol3");
            return (Criteria) this;
        }

        public Criteria andAskvol3GreaterThanOrEqualTo(Integer value) {
            addCriterion("askvol3 >=", value, "askvol3");
            return (Criteria) this;
        }

        public Criteria andAskvol3LessThan(Integer value) {
            addCriterion("askvol3 <", value, "askvol3");
            return (Criteria) this;
        }

        public Criteria andAskvol3LessThanOrEqualTo(Integer value) {
            addCriterion("askvol3 <=", value, "askvol3");
            return (Criteria) this;
        }

        public Criteria andAskvol3In(List<Integer> values) {
            addCriterion("askvol3 in", values, "askvol3");
            return (Criteria) this;
        }

        public Criteria andAskvol3NotIn(List<Integer> values) {
            addCriterion("askvol3 not in", values, "askvol3");
            return (Criteria) this;
        }

        public Criteria andAskvol3Between(Integer value1, Integer value2) {
            addCriterion("askvol3 between", value1, value2, "askvol3");
            return (Criteria) this;
        }

        public Criteria andAskvol3NotBetween(Integer value1, Integer value2) {
            addCriterion("askvol3 not between", value1, value2, "askvol3");
            return (Criteria) this;
        }

        public Criteria andAsk4IsNull() {
            addCriterion("ask4 is null");
            return (Criteria) this;
        }

        public Criteria andAsk4IsNotNull() {
            addCriterion("ask4 is not null");
            return (Criteria) this;
        }

        public Criteria andAsk4EqualTo(Integer value) {
            addCriterion("ask4 =", value, "ask4");
            return (Criteria) this;
        }

        public Criteria andAsk4NotEqualTo(Integer value) {
            addCriterion("ask4 <>", value, "ask4");
            return (Criteria) this;
        }

        public Criteria andAsk4GreaterThan(Integer value) {
            addCriterion("ask4 >", value, "ask4");
            return (Criteria) this;
        }

        public Criteria andAsk4GreaterThanOrEqualTo(Integer value) {
            addCriterion("ask4 >=", value, "ask4");
            return (Criteria) this;
        }

        public Criteria andAsk4LessThan(Integer value) {
            addCriterion("ask4 <", value, "ask4");
            return (Criteria) this;
        }

        public Criteria andAsk4LessThanOrEqualTo(Integer value) {
            addCriterion("ask4 <=", value, "ask4");
            return (Criteria) this;
        }

        public Criteria andAsk4In(List<Integer> values) {
            addCriterion("ask4 in", values, "ask4");
            return (Criteria) this;
        }

        public Criteria andAsk4NotIn(List<Integer> values) {
            addCriterion("ask4 not in", values, "ask4");
            return (Criteria) this;
        }

        public Criteria andAsk4Between(Integer value1, Integer value2) {
            addCriterion("ask4 between", value1, value2, "ask4");
            return (Criteria) this;
        }

        public Criteria andAsk4NotBetween(Integer value1, Integer value2) {
            addCriterion("ask4 not between", value1, value2, "ask4");
            return (Criteria) this;
        }

        public Criteria andAskvol4IsNull() {
            addCriterion("askvol4 is null");
            return (Criteria) this;
        }

        public Criteria andAskvol4IsNotNull() {
            addCriterion("askvol4 is not null");
            return (Criteria) this;
        }

        public Criteria andAskvol4EqualTo(Integer value) {
            addCriterion("askvol4 =", value, "askvol4");
            return (Criteria) this;
        }

        public Criteria andAskvol4NotEqualTo(Integer value) {
            addCriterion("askvol4 <>", value, "askvol4");
            return (Criteria) this;
        }

        public Criteria andAskvol4GreaterThan(Integer value) {
            addCriterion("askvol4 >", value, "askvol4");
            return (Criteria) this;
        }

        public Criteria andAskvol4GreaterThanOrEqualTo(Integer value) {
            addCriterion("askvol4 >=", value, "askvol4");
            return (Criteria) this;
        }

        public Criteria andAskvol4LessThan(Integer value) {
            addCriterion("askvol4 <", value, "askvol4");
            return (Criteria) this;
        }

        public Criteria andAskvol4LessThanOrEqualTo(Integer value) {
            addCriterion("askvol4 <=", value, "askvol4");
            return (Criteria) this;
        }

        public Criteria andAskvol4In(List<Integer> values) {
            addCriterion("askvol4 in", values, "askvol4");
            return (Criteria) this;
        }

        public Criteria andAskvol4NotIn(List<Integer> values) {
            addCriterion("askvol4 not in", values, "askvol4");
            return (Criteria) this;
        }

        public Criteria andAskvol4Between(Integer value1, Integer value2) {
            addCriterion("askvol4 between", value1, value2, "askvol4");
            return (Criteria) this;
        }

        public Criteria andAskvol4NotBetween(Integer value1, Integer value2) {
            addCriterion("askvol4 not between", value1, value2, "askvol4");
            return (Criteria) this;
        }

        public Criteria andAsk5IsNull() {
            addCriterion("ask5 is null");
            return (Criteria) this;
        }

        public Criteria andAsk5IsNotNull() {
            addCriterion("ask5 is not null");
            return (Criteria) this;
        }

        public Criteria andAsk5EqualTo(Integer value) {
            addCriterion("ask5 =", value, "ask5");
            return (Criteria) this;
        }

        public Criteria andAsk5NotEqualTo(Integer value) {
            addCriterion("ask5 <>", value, "ask5");
            return (Criteria) this;
        }

        public Criteria andAsk5GreaterThan(Integer value) {
            addCriterion("ask5 >", value, "ask5");
            return (Criteria) this;
        }

        public Criteria andAsk5GreaterThanOrEqualTo(Integer value) {
            addCriterion("ask5 >=", value, "ask5");
            return (Criteria) this;
        }

        public Criteria andAsk5LessThan(Integer value) {
            addCriterion("ask5 <", value, "ask5");
            return (Criteria) this;
        }

        public Criteria andAsk5LessThanOrEqualTo(Integer value) {
            addCriterion("ask5 <=", value, "ask5");
            return (Criteria) this;
        }

        public Criteria andAsk5In(List<Integer> values) {
            addCriterion("ask5 in", values, "ask5");
            return (Criteria) this;
        }

        public Criteria andAsk5NotIn(List<Integer> values) {
            addCriterion("ask5 not in", values, "ask5");
            return (Criteria) this;
        }

        public Criteria andAsk5Between(Integer value1, Integer value2) {
            addCriterion("ask5 between", value1, value2, "ask5");
            return (Criteria) this;
        }

        public Criteria andAsk5NotBetween(Integer value1, Integer value2) {
            addCriterion("ask5 not between", value1, value2, "ask5");
            return (Criteria) this;
        }

        public Criteria andAskvol5IsNull() {
            addCriterion("askvol5 is null");
            return (Criteria) this;
        }

        public Criteria andAskvol5IsNotNull() {
            addCriterion("askvol5 is not null");
            return (Criteria) this;
        }

        public Criteria andAskvol5EqualTo(Integer value) {
            addCriterion("askvol5 =", value, "askvol5");
            return (Criteria) this;
        }

        public Criteria andAskvol5NotEqualTo(Integer value) {
            addCriterion("askvol5 <>", value, "askvol5");
            return (Criteria) this;
        }

        public Criteria andAskvol5GreaterThan(Integer value) {
            addCriterion("askvol5 >", value, "askvol5");
            return (Criteria) this;
        }

        public Criteria andAskvol5GreaterThanOrEqualTo(Integer value) {
            addCriterion("askvol5 >=", value, "askvol5");
            return (Criteria) this;
        }

        public Criteria andAskvol5LessThan(Integer value) {
            addCriterion("askvol5 <", value, "askvol5");
            return (Criteria) this;
        }

        public Criteria andAskvol5LessThanOrEqualTo(Integer value) {
            addCriterion("askvol5 <=", value, "askvol5");
            return (Criteria) this;
        }

        public Criteria andAskvol5In(List<Integer> values) {
            addCriterion("askvol5 in", values, "askvol5");
            return (Criteria) this;
        }

        public Criteria andAskvol5NotIn(List<Integer> values) {
            addCriterion("askvol5 not in", values, "askvol5");
            return (Criteria) this;
        }

        public Criteria andAskvol5Between(Integer value1, Integer value2) {
            addCriterion("askvol5 between", value1, value2, "askvol5");
            return (Criteria) this;
        }

        public Criteria andAskvol5NotBetween(Integer value1, Integer value2) {
            addCriterion("askvol5 not between", value1, value2, "askvol5");
            return (Criteria) this;
        }

        public Criteria andDateTimestampIsNull() {
            addCriterion("date_timestamp is null");
            return (Criteria) this;
        }

        public Criteria andDateTimestampIsNotNull() {
            addCriterion("date_timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andDateTimestampEqualTo(Long value) {
            addCriterion("date_timestamp =", value, "dateTimestamp");
            return (Criteria) this;
        }

        public Criteria andDateTimestampNotEqualTo(Long value) {
            addCriterion("date_timestamp <>", value, "dateTimestamp");
            return (Criteria) this;
        }

        public Criteria andDateTimestampGreaterThan(Long value) {
            addCriterion("date_timestamp >", value, "dateTimestamp");
            return (Criteria) this;
        }

        public Criteria andDateTimestampGreaterThanOrEqualTo(Long value) {
            addCriterion("date_timestamp >=", value, "dateTimestamp");
            return (Criteria) this;
        }

        public Criteria andDateTimestampLessThan(Long value) {
            addCriterion("date_timestamp <", value, "dateTimestamp");
            return (Criteria) this;
        }

        public Criteria andDateTimestampLessThanOrEqualTo(Long value) {
            addCriterion("date_timestamp <=", value, "dateTimestamp");
            return (Criteria) this;
        }

        public Criteria andDateTimestampIn(List<Long> values) {
            addCriterion("date_timestamp in", values, "dateTimestamp");
            return (Criteria) this;
        }

        public Criteria andDateTimestampNotIn(List<Long> values) {
            addCriterion("date_timestamp not in", values, "dateTimestamp");
            return (Criteria) this;
        }

        public Criteria andDateTimestampBetween(Long value1, Long value2) {
            addCriterion("date_timestamp between", value1, value2, "dateTimestamp");
            return (Criteria) this;
        }

        public Criteria andDateTimestampNotBetween(Long value1, Long value2) {
            addCriterion("date_timestamp not between", value1, value2, "dateTimestamp");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}