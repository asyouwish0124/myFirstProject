package com.xin.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsPurchaseOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsPurchaseOrderExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNoIsNull() {
            addCriterion("no is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("no is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(String value) {
            addCriterion("no =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(String value) {
            addCriterion("no <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(String value) {
            addCriterion("no >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(String value) {
            addCriterion("no >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(String value) {
            addCriterion("no <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(String value) {
            addCriterion("no <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLike(String value) {
            addCriterion("no like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotLike(String value) {
            addCriterion("no not like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<String> values) {
            addCriterion("no in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<String> values) {
            addCriterion("no not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(String value1, String value2) {
            addCriterion("no between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(String value1, String value2) {
            addCriterion("no not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNull() {
            addCriterion("supplierid is null");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNotNull() {
            addCriterion("supplierid is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieridEqualTo(Long value) {
            addCriterion("supplierid =", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotEqualTo(Long value) {
            addCriterion("supplierid <>", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThan(Long value) {
            addCriterion("supplierid >", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThanOrEqualTo(Long value) {
            addCriterion("supplierid >=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThan(Long value) {
            addCriterion("supplierid <", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThanOrEqualTo(Long value) {
            addCriterion("supplierid <=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridIn(List<Long> values) {
            addCriterion("supplierid in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotIn(List<Long> values) {
            addCriterion("supplierid not in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridBetween(Long value1, Long value2) {
            addCriterion("supplierid between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotBetween(Long value1, Long value2) {
            addCriterion("supplierid not between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoIsNull() {
            addCriterion("customer_order_no is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoIsNotNull() {
            addCriterion("customer_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoEqualTo(String value) {
            addCriterion("customer_order_no =", value, "customerOrderNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoNotEqualTo(String value) {
            addCriterion("customer_order_no <>", value, "customerOrderNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoGreaterThan(String value) {
            addCriterion("customer_order_no >", value, "customerOrderNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("customer_order_no >=", value, "customerOrderNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoLessThan(String value) {
            addCriterion("customer_order_no <", value, "customerOrderNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoLessThanOrEqualTo(String value) {
            addCriterion("customer_order_no <=", value, "customerOrderNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoLike(String value) {
            addCriterion("customer_order_no like", value, "customerOrderNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoNotLike(String value) {
            addCriterion("customer_order_no not like", value, "customerOrderNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoIn(List<String> values) {
            addCriterion("customer_order_no in", values, "customerOrderNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoNotIn(List<String> values) {
            addCriterion("customer_order_no not in", values, "customerOrderNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoBetween(String value1, String value2) {
            addCriterion("customer_order_no between", value1, value2, "customerOrderNo");
            return (Criteria) this;
        }

        public Criteria andCustomerOrderNoNotBetween(String value1, String value2) {
            addCriterion("customer_order_no not between", value1, value2, "customerOrderNo");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andTaxInclusiveAmountIsNull() {
            addCriterion("tax_inclusive_amount is null");
            return (Criteria) this;
        }

        public Criteria andTaxInclusiveAmountIsNotNull() {
            addCriterion("tax_inclusive_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTaxInclusiveAmountEqualTo(BigDecimal value) {
            addCriterion("tax_inclusive_amount =", value, "taxInclusiveAmount");
            return (Criteria) this;
        }

        public Criteria andTaxInclusiveAmountNotEqualTo(BigDecimal value) {
            addCriterion("tax_inclusive_amount <>", value, "taxInclusiveAmount");
            return (Criteria) this;
        }

        public Criteria andTaxInclusiveAmountGreaterThan(BigDecimal value) {
            addCriterion("tax_inclusive_amount >", value, "taxInclusiveAmount");
            return (Criteria) this;
        }

        public Criteria andTaxInclusiveAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_inclusive_amount >=", value, "taxInclusiveAmount");
            return (Criteria) this;
        }

        public Criteria andTaxInclusiveAmountLessThan(BigDecimal value) {
            addCriterion("tax_inclusive_amount <", value, "taxInclusiveAmount");
            return (Criteria) this;
        }

        public Criteria andTaxInclusiveAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_inclusive_amount <=", value, "taxInclusiveAmount");
            return (Criteria) this;
        }

        public Criteria andTaxInclusiveAmountIn(List<BigDecimal> values) {
            addCriterion("tax_inclusive_amount in", values, "taxInclusiveAmount");
            return (Criteria) this;
        }

        public Criteria andTaxInclusiveAmountNotIn(List<BigDecimal> values) {
            addCriterion("tax_inclusive_amount not in", values, "taxInclusiveAmount");
            return (Criteria) this;
        }

        public Criteria andTaxInclusiveAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_inclusive_amount between", value1, value2, "taxInclusiveAmount");
            return (Criteria) this;
        }

        public Criteria andTaxInclusiveAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_inclusive_amount not between", value1, value2, "taxInclusiveAmount");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("paytype is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("paytype is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(Long value) {
            addCriterion("paytype =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(Long value) {
            addCriterion("paytype <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(Long value) {
            addCriterion("paytype >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(Long value) {
            addCriterion("paytype >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(Long value) {
            addCriterion("paytype <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(Long value) {
            addCriterion("paytype <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<Long> values) {
            addCriterion("paytype in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<Long> values) {
            addCriterion("paytype not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(Long value1, Long value2) {
            addCriterion("paytype between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(Long value1, Long value2) {
            addCriterion("paytype not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNull() {
            addCriterion("order_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNotNull() {
            addCriterion("order_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDateEqualTo(String value) {
            addCriterion("order_date =", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotEqualTo(String value) {
            addCriterion("order_date <>", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThan(String value) {
            addCriterion("order_date >", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThanOrEqualTo(String value) {
            addCriterion("order_date >=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThan(String value) {
            addCriterion("order_date <", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThanOrEqualTo(String value) {
            addCriterion("order_date <=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLike(String value) {
            addCriterion("order_date like", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotLike(String value) {
            addCriterion("order_date not like", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateIn(List<String> values) {
            addCriterion("order_date in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotIn(List<String> values) {
            addCriterion("order_date not in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateBetween(String value1, String value2) {
            addCriterion("order_date between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotBetween(String value1, String value2) {
            addCriterion("order_date not between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andPushStateIsNull() {
            addCriterion("push_state is null");
            return (Criteria) this;
        }

        public Criteria andPushStateIsNotNull() {
            addCriterion("push_state is not null");
            return (Criteria) this;
        }

        public Criteria andPushStateEqualTo(Integer value) {
            addCriterion("push_state =", value, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateNotEqualTo(Integer value) {
            addCriterion("push_state <>", value, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateGreaterThan(Integer value) {
            addCriterion("push_state >", value, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("push_state >=", value, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateLessThan(Integer value) {
            addCriterion("push_state <", value, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateLessThanOrEqualTo(Integer value) {
            addCriterion("push_state <=", value, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateIn(List<Integer> values) {
            addCriterion("push_state in", values, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateNotIn(List<Integer> values) {
            addCriterion("push_state not in", values, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateBetween(Integer value1, Integer value2) {
            addCriterion("push_state between", value1, value2, "pushState");
            return (Criteria) this;
        }

        public Criteria andPushStateNotBetween(Integer value1, Integer value2) {
            addCriterion("push_state not between", value1, value2, "pushState");
            return (Criteria) this;
        }

        public Criteria andSettleStartTypeIsNull() {
            addCriterion("settle_start_type is null");
            return (Criteria) this;
        }

        public Criteria andSettleStartTypeIsNotNull() {
            addCriterion("settle_start_type is not null");
            return (Criteria) this;
        }

        public Criteria andSettleStartTypeEqualTo(Integer value) {
            addCriterion("settle_start_type =", value, "settleStartType");
            return (Criteria) this;
        }

        public Criteria andSettleStartTypeNotEqualTo(Integer value) {
            addCriterion("settle_start_type <>", value, "settleStartType");
            return (Criteria) this;
        }

        public Criteria andSettleStartTypeGreaterThan(Integer value) {
            addCriterion("settle_start_type >", value, "settleStartType");
            return (Criteria) this;
        }

        public Criteria andSettleStartTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("settle_start_type >=", value, "settleStartType");
            return (Criteria) this;
        }

        public Criteria andSettleStartTypeLessThan(Integer value) {
            addCriterion("settle_start_type <", value, "settleStartType");
            return (Criteria) this;
        }

        public Criteria andSettleStartTypeLessThanOrEqualTo(Integer value) {
            addCriterion("settle_start_type <=", value, "settleStartType");
            return (Criteria) this;
        }

        public Criteria andSettleStartTypeIn(List<Integer> values) {
            addCriterion("settle_start_type in", values, "settleStartType");
            return (Criteria) this;
        }

        public Criteria andSettleStartTypeNotIn(List<Integer> values) {
            addCriterion("settle_start_type not in", values, "settleStartType");
            return (Criteria) this;
        }

        public Criteria andSettleStartTypeBetween(Integer value1, Integer value2) {
            addCriterion("settle_start_type between", value1, value2, "settleStartType");
            return (Criteria) this;
        }

        public Criteria andSettleStartTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("settle_start_type not between", value1, value2, "settleStartType");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIsNull() {
            addCriterion("delivery_date is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIsNotNull() {
            addCriterion("delivery_date is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateEqualTo(String value) {
            addCriterion("delivery_date =", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotEqualTo(String value) {
            addCriterion("delivery_date <>", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateGreaterThan(String value) {
            addCriterion("delivery_date >", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_date >=", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLessThan(String value) {
            addCriterion("delivery_date <", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLessThanOrEqualTo(String value) {
            addCriterion("delivery_date <=", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLike(String value) {
            addCriterion("delivery_date like", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotLike(String value) {
            addCriterion("delivery_date not like", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIn(List<String> values) {
            addCriterion("delivery_date in", values, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotIn(List<String> values) {
            addCriterion("delivery_date not in", values, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateBetween(String value1, String value2) {
            addCriterion("delivery_date between", value1, value2, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotBetween(String value1, String value2) {
            addCriterion("delivery_date not between", value1, value2, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andAuditoridIsNull() {
            addCriterion("auditorid is null");
            return (Criteria) this;
        }

        public Criteria andAuditoridIsNotNull() {
            addCriterion("auditorid is not null");
            return (Criteria) this;
        }

        public Criteria andAuditoridEqualTo(Long value) {
            addCriterion("auditorid =", value, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridNotEqualTo(Long value) {
            addCriterion("auditorid <>", value, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridGreaterThan(Long value) {
            addCriterion("auditorid >", value, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridGreaterThanOrEqualTo(Long value) {
            addCriterion("auditorid >=", value, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridLessThan(Long value) {
            addCriterion("auditorid <", value, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridLessThanOrEqualTo(Long value) {
            addCriterion("auditorid <=", value, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridIn(List<Long> values) {
            addCriterion("auditorid in", values, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridNotIn(List<Long> values) {
            addCriterion("auditorid not in", values, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridBetween(Long value1, Long value2) {
            addCriterion("auditorid between", value1, value2, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditoridNotBetween(Long value1, Long value2) {
            addCriterion("auditorid not between", value1, value2, "auditorid");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNull() {
            addCriterion("audit_remark is null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNotNull() {
            addCriterion("audit_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkEqualTo(String value) {
            addCriterion("audit_remark =", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotEqualTo(String value) {
            addCriterion("audit_remark <>", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThan(String value) {
            addCriterion("audit_remark >", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("audit_remark >=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThan(String value) {
            addCriterion("audit_remark <", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThanOrEqualTo(String value) {
            addCriterion("audit_remark <=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLike(String value) {
            addCriterion("audit_remark like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotLike(String value) {
            addCriterion("audit_remark not like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIn(List<String> values) {
            addCriterion("audit_remark in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotIn(List<String> values) {
            addCriterion("audit_remark not in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkBetween(String value1, String value2) {
            addCriterion("audit_remark between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotBetween(String value1, String value2) {
            addCriterion("audit_remark not between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andTakeridIsNull() {
            addCriterion("takerid is null");
            return (Criteria) this;
        }

        public Criteria andTakeridIsNotNull() {
            addCriterion("takerid is not null");
            return (Criteria) this;
        }

        public Criteria andTakeridEqualTo(Long value) {
            addCriterion("takerid =", value, "takerid");
            return (Criteria) this;
        }

        public Criteria andTakeridNotEqualTo(Long value) {
            addCriterion("takerid <>", value, "takerid");
            return (Criteria) this;
        }

        public Criteria andTakeridGreaterThan(Long value) {
            addCriterion("takerid >", value, "takerid");
            return (Criteria) this;
        }

        public Criteria andTakeridGreaterThanOrEqualTo(Long value) {
            addCriterion("takerid >=", value, "takerid");
            return (Criteria) this;
        }

        public Criteria andTakeridLessThan(Long value) {
            addCriterion("takerid <", value, "takerid");
            return (Criteria) this;
        }

        public Criteria andTakeridLessThanOrEqualTo(Long value) {
            addCriterion("takerid <=", value, "takerid");
            return (Criteria) this;
        }

        public Criteria andTakeridIn(List<Long> values) {
            addCriterion("takerid in", values, "takerid");
            return (Criteria) this;
        }

        public Criteria andTakeridNotIn(List<Long> values) {
            addCriterion("takerid not in", values, "takerid");
            return (Criteria) this;
        }

        public Criteria andTakeridBetween(Long value1, Long value2) {
            addCriterion("takerid between", value1, value2, "takerid");
            return (Criteria) this;
        }

        public Criteria andTakeridNotBetween(Long value1, Long value2) {
            addCriterion("takerid not between", value1, value2, "takerid");
            return (Criteria) this;
        }

        public Criteria andTakerIsNull() {
            addCriterion("taker is null");
            return (Criteria) this;
        }

        public Criteria andTakerIsNotNull() {
            addCriterion("taker is not null");
            return (Criteria) this;
        }

        public Criteria andTakerEqualTo(String value) {
            addCriterion("taker =", value, "taker");
            return (Criteria) this;
        }

        public Criteria andTakerNotEqualTo(String value) {
            addCriterion("taker <>", value, "taker");
            return (Criteria) this;
        }

        public Criteria andTakerGreaterThan(String value) {
            addCriterion("taker >", value, "taker");
            return (Criteria) this;
        }

        public Criteria andTakerGreaterThanOrEqualTo(String value) {
            addCriterion("taker >=", value, "taker");
            return (Criteria) this;
        }

        public Criteria andTakerLessThan(String value) {
            addCriterion("taker <", value, "taker");
            return (Criteria) this;
        }

        public Criteria andTakerLessThanOrEqualTo(String value) {
            addCriterion("taker <=", value, "taker");
            return (Criteria) this;
        }

        public Criteria andTakerLike(String value) {
            addCriterion("taker like", value, "taker");
            return (Criteria) this;
        }

        public Criteria andTakerNotLike(String value) {
            addCriterion("taker not like", value, "taker");
            return (Criteria) this;
        }

        public Criteria andTakerIn(List<String> values) {
            addCriterion("taker in", values, "taker");
            return (Criteria) this;
        }

        public Criteria andTakerNotIn(List<String> values) {
            addCriterion("taker not in", values, "taker");
            return (Criteria) this;
        }

        public Criteria andTakerBetween(String value1, String value2) {
            addCriterion("taker between", value1, value2, "taker");
            return (Criteria) this;
        }

        public Criteria andTakerNotBetween(String value1, String value2) {
            addCriterion("taker not between", value1, value2, "taker");
            return (Criteria) this;
        }

        public Criteria andSourceCustomerIdIsNull() {
            addCriterion("source_customer_id is null");
            return (Criteria) this;
        }

        public Criteria andSourceCustomerIdIsNotNull() {
            addCriterion("source_customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andSourceCustomerIdEqualTo(Long value) {
            addCriterion("source_customer_id =", value, "sourceCustomerId");
            return (Criteria) this;
        }

        public Criteria andSourceCustomerIdNotEqualTo(Long value) {
            addCriterion("source_customer_id <>", value, "sourceCustomerId");
            return (Criteria) this;
        }

        public Criteria andSourceCustomerIdGreaterThan(Long value) {
            addCriterion("source_customer_id >", value, "sourceCustomerId");
            return (Criteria) this;
        }

        public Criteria andSourceCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("source_customer_id >=", value, "sourceCustomerId");
            return (Criteria) this;
        }

        public Criteria andSourceCustomerIdLessThan(Long value) {
            addCriterion("source_customer_id <", value, "sourceCustomerId");
            return (Criteria) this;
        }

        public Criteria andSourceCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("source_customer_id <=", value, "sourceCustomerId");
            return (Criteria) this;
        }

        public Criteria andSourceCustomerIdIn(List<Long> values) {
            addCriterion("source_customer_id in", values, "sourceCustomerId");
            return (Criteria) this;
        }

        public Criteria andSourceCustomerIdNotIn(List<Long> values) {
            addCriterion("source_customer_id not in", values, "sourceCustomerId");
            return (Criteria) this;
        }

        public Criteria andSourceCustomerIdBetween(Long value1, Long value2) {
            addCriterion("source_customer_id between", value1, value2, "sourceCustomerId");
            return (Criteria) this;
        }

        public Criteria andSourceCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("source_customer_id not between", value1, value2, "sourceCustomerId");
            return (Criteria) this;
        }

        public Criteria andSourceCustomerNameIsNull() {
            addCriterion("source_customer_name is null");
            return (Criteria) this;
        }

        public Criteria andSourceCustomerNameIsNotNull() {
            addCriterion("source_customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andSourceCustomerNameEqualTo(String value) {
            addCriterion("source_customer_name =", value, "sourceCustomerName");
            return (Criteria) this;
        }

        public Criteria andSourceCustomerNameNotEqualTo(String value) {
            addCriterion("source_customer_name <>", value, "sourceCustomerName");
            return (Criteria) this;
        }

        public Criteria andSourceCustomerNameGreaterThan(String value) {
            addCriterion("source_customer_name >", value, "sourceCustomerName");
            return (Criteria) this;
        }

        public Criteria andSourceCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("source_customer_name >=", value, "sourceCustomerName");
            return (Criteria) this;
        }

        public Criteria andSourceCustomerNameLessThan(String value) {
            addCriterion("source_customer_name <", value, "sourceCustomerName");
            return (Criteria) this;
        }

        public Criteria andSourceCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("source_customer_name <=", value, "sourceCustomerName");
            return (Criteria) this;
        }

        public Criteria andSourceCustomerNameLike(String value) {
            addCriterion("source_customer_name like", value, "sourceCustomerName");
            return (Criteria) this;
        }

        public Criteria andSourceCustomerNameNotLike(String value) {
            addCriterion("source_customer_name not like", value, "sourceCustomerName");
            return (Criteria) this;
        }

        public Criteria andSourceCustomerNameIn(List<String> values) {
            addCriterion("source_customer_name in", values, "sourceCustomerName");
            return (Criteria) this;
        }

        public Criteria andSourceCustomerNameNotIn(List<String> values) {
            addCriterion("source_customer_name not in", values, "sourceCustomerName");
            return (Criteria) this;
        }

        public Criteria andSourceCustomerNameBetween(String value1, String value2) {
            addCriterion("source_customer_name between", value1, value2, "sourceCustomerName");
            return (Criteria) this;
        }

        public Criteria andSourceCustomerNameNotBetween(String value1, String value2) {
            addCriterion("source_customer_name not between", value1, value2, "sourceCustomerName");
            return (Criteria) this;
        }

        public Criteria andSourceTakerIdIsNull() {
            addCriterion("source_taker_id is null");
            return (Criteria) this;
        }

        public Criteria andSourceTakerIdIsNotNull() {
            addCriterion("source_taker_id is not null");
            return (Criteria) this;
        }

        public Criteria andSourceTakerIdEqualTo(Long value) {
            addCriterion("source_taker_id =", value, "sourceTakerId");
            return (Criteria) this;
        }

        public Criteria andSourceTakerIdNotEqualTo(Long value) {
            addCriterion("source_taker_id <>", value, "sourceTakerId");
            return (Criteria) this;
        }

        public Criteria andSourceTakerIdGreaterThan(Long value) {
            addCriterion("source_taker_id >", value, "sourceTakerId");
            return (Criteria) this;
        }

        public Criteria andSourceTakerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("source_taker_id >=", value, "sourceTakerId");
            return (Criteria) this;
        }

        public Criteria andSourceTakerIdLessThan(Long value) {
            addCriterion("source_taker_id <", value, "sourceTakerId");
            return (Criteria) this;
        }

        public Criteria andSourceTakerIdLessThanOrEqualTo(Long value) {
            addCriterion("source_taker_id <=", value, "sourceTakerId");
            return (Criteria) this;
        }

        public Criteria andSourceTakerIdIn(List<Long> values) {
            addCriterion("source_taker_id in", values, "sourceTakerId");
            return (Criteria) this;
        }

        public Criteria andSourceTakerIdNotIn(List<Long> values) {
            addCriterion("source_taker_id not in", values, "sourceTakerId");
            return (Criteria) this;
        }

        public Criteria andSourceTakerIdBetween(Long value1, Long value2) {
            addCriterion("source_taker_id between", value1, value2, "sourceTakerId");
            return (Criteria) this;
        }

        public Criteria andSourceTakerIdNotBetween(Long value1, Long value2) {
            addCriterion("source_taker_id not between", value1, value2, "sourceTakerId");
            return (Criteria) this;
        }

        public Criteria andSourceTakerIsNull() {
            addCriterion("source_taker is null");
            return (Criteria) this;
        }

        public Criteria andSourceTakerIsNotNull() {
            addCriterion("source_taker is not null");
            return (Criteria) this;
        }

        public Criteria andSourceTakerEqualTo(String value) {
            addCriterion("source_taker =", value, "sourceTaker");
            return (Criteria) this;
        }

        public Criteria andSourceTakerNotEqualTo(String value) {
            addCriterion("source_taker <>", value, "sourceTaker");
            return (Criteria) this;
        }

        public Criteria andSourceTakerGreaterThan(String value) {
            addCriterion("source_taker >", value, "sourceTaker");
            return (Criteria) this;
        }

        public Criteria andSourceTakerGreaterThanOrEqualTo(String value) {
            addCriterion("source_taker >=", value, "sourceTaker");
            return (Criteria) this;
        }

        public Criteria andSourceTakerLessThan(String value) {
            addCriterion("source_taker <", value, "sourceTaker");
            return (Criteria) this;
        }

        public Criteria andSourceTakerLessThanOrEqualTo(String value) {
            addCriterion("source_taker <=", value, "sourceTaker");
            return (Criteria) this;
        }

        public Criteria andSourceTakerLike(String value) {
            addCriterion("source_taker like", value, "sourceTaker");
            return (Criteria) this;
        }

        public Criteria andSourceTakerNotLike(String value) {
            addCriterion("source_taker not like", value, "sourceTaker");
            return (Criteria) this;
        }

        public Criteria andSourceTakerIn(List<String> values) {
            addCriterion("source_taker in", values, "sourceTaker");
            return (Criteria) this;
        }

        public Criteria andSourceTakerNotIn(List<String> values) {
            addCriterion("source_taker not in", values, "sourceTaker");
            return (Criteria) this;
        }

        public Criteria andSourceTakerBetween(String value1, String value2) {
            addCriterion("source_taker between", value1, value2, "sourceTaker");
            return (Criteria) this;
        }

        public Criteria andSourceTakerNotBetween(String value1, String value2) {
            addCriterion("source_taker not between", value1, value2, "sourceTaker");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Boolean value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Boolean value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Boolean value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Boolean value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Boolean> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Boolean> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andContactidIsNull() {
            addCriterion("contactid is null");
            return (Criteria) this;
        }

        public Criteria andContactidIsNotNull() {
            addCriterion("contactid is not null");
            return (Criteria) this;
        }

        public Criteria andContactidEqualTo(Long value) {
            addCriterion("contactid =", value, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidNotEqualTo(Long value) {
            addCriterion("contactid <>", value, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidGreaterThan(Long value) {
            addCriterion("contactid >", value, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidGreaterThanOrEqualTo(Long value) {
            addCriterion("contactid >=", value, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidLessThan(Long value) {
            addCriterion("contactid <", value, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidLessThanOrEqualTo(Long value) {
            addCriterion("contactid <=", value, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidIn(List<Long> values) {
            addCriterion("contactid in", values, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidNotIn(List<Long> values) {
            addCriterion("contactid not in", values, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidBetween(Long value1, Long value2) {
            addCriterion("contactid between", value1, value2, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidNotBetween(Long value1, Long value2) {
            addCriterion("contactid not between", value1, value2, "contactid");
            return (Criteria) this;
        }

        public Criteria andTaxidIsNull() {
            addCriterion("taxid is null");
            return (Criteria) this;
        }

        public Criteria andTaxidIsNotNull() {
            addCriterion("taxid is not null");
            return (Criteria) this;
        }

        public Criteria andTaxidEqualTo(Long value) {
            addCriterion("taxid =", value, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidNotEqualTo(Long value) {
            addCriterion("taxid <>", value, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidGreaterThan(Long value) {
            addCriterion("taxid >", value, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidGreaterThanOrEqualTo(Long value) {
            addCriterion("taxid >=", value, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidLessThan(Long value) {
            addCriterion("taxid <", value, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidLessThanOrEqualTo(Long value) {
            addCriterion("taxid <=", value, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidIn(List<Long> values) {
            addCriterion("taxid in", values, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidNotIn(List<Long> values) {
            addCriterion("taxid not in", values, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidBetween(Long value1, Long value2) {
            addCriterion("taxid between", value1, value2, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxidNotBetween(Long value1, Long value2) {
            addCriterion("taxid not between", value1, value2, "taxid");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNull() {
            addCriterion("tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNotNull() {
            addCriterion("tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateEqualTo(BigDecimal value) {
            addCriterion("tax_rate =", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotEqualTo(BigDecimal value) {
            addCriterion("tax_rate <>", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThan(BigDecimal value) {
            addCriterion("tax_rate >", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_rate >=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThan(BigDecimal value) {
            addCriterion("tax_rate <", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_rate <=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateIn(List<BigDecimal> values) {
            addCriterion("tax_rate in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotIn(List<BigDecimal> values) {
            addCriterion("tax_rate not in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_rate between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_rate not between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andCreatoridIsNull() {
            addCriterion("creatorid is null");
            return (Criteria) this;
        }

        public Criteria andCreatoridIsNotNull() {
            addCriterion("creatorid is not null");
            return (Criteria) this;
        }

        public Criteria andCreatoridEqualTo(Long value) {
            addCriterion("creatorid =", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotEqualTo(Long value) {
            addCriterion("creatorid <>", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridGreaterThan(Long value) {
            addCriterion("creatorid >", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridGreaterThanOrEqualTo(Long value) {
            addCriterion("creatorid >=", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLessThan(Long value) {
            addCriterion("creatorid <", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLessThanOrEqualTo(Long value) {
            addCriterion("creatorid <=", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridIn(List<Long> values) {
            addCriterion("creatorid in", values, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotIn(List<Long> values) {
            addCriterion("creatorid not in", values, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridBetween(Long value1, Long value2) {
            addCriterion("creatorid between", value1, value2, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotBetween(Long value1, Long value2) {
            addCriterion("creatorid not between", value1, value2, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatoridIsNull() {
            addCriterion("updatorid is null");
            return (Criteria) this;
        }

        public Criteria andUpdatoridIsNotNull() {
            addCriterion("updatorid is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatoridEqualTo(Long value) {
            addCriterion("updatorid =", value, "updatorid");
            return (Criteria) this;
        }

        public Criteria andUpdatoridNotEqualTo(Long value) {
            addCriterion("updatorid <>", value, "updatorid");
            return (Criteria) this;
        }

        public Criteria andUpdatoridGreaterThan(Long value) {
            addCriterion("updatorid >", value, "updatorid");
            return (Criteria) this;
        }

        public Criteria andUpdatoridGreaterThanOrEqualTo(Long value) {
            addCriterion("updatorid >=", value, "updatorid");
            return (Criteria) this;
        }

        public Criteria andUpdatoridLessThan(Long value) {
            addCriterion("updatorid <", value, "updatorid");
            return (Criteria) this;
        }

        public Criteria andUpdatoridLessThanOrEqualTo(Long value) {
            addCriterion("updatorid <=", value, "updatorid");
            return (Criteria) this;
        }

        public Criteria andUpdatoridIn(List<Long> values) {
            addCriterion("updatorid in", values, "updatorid");
            return (Criteria) this;
        }

        public Criteria andUpdatoridNotIn(List<Long> values) {
            addCriterion("updatorid not in", values, "updatorid");
            return (Criteria) this;
        }

        public Criteria andUpdatoridBetween(Long value1, Long value2) {
            addCriterion("updatorid between", value1, value2, "updatorid");
            return (Criteria) this;
        }

        public Criteria andUpdatoridNotBetween(Long value1, Long value2) {
            addCriterion("updatorid not between", value1, value2, "updatorid");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("tax is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("tax is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(BigDecimal value) {
            addCriterion("tax =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(BigDecimal value) {
            addCriterion("tax <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(BigDecimal value) {
            addCriterion("tax >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(BigDecimal value) {
            addCriterion("tax <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<BigDecimal> values) {
            addCriterion("tax in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<BigDecimal> values) {
            addCriterion("tax not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andInWarehouseIdIsNull() {
            addCriterion("in_warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andInWarehouseIdIsNotNull() {
            addCriterion("in_warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andInWarehouseIdEqualTo(Long value) {
            addCriterion("in_warehouse_id =", value, "inWarehouseId");
            return (Criteria) this;
        }

        public Criteria andInWarehouseIdNotEqualTo(Long value) {
            addCriterion("in_warehouse_id <>", value, "inWarehouseId");
            return (Criteria) this;
        }

        public Criteria andInWarehouseIdGreaterThan(Long value) {
            addCriterion("in_warehouse_id >", value, "inWarehouseId");
            return (Criteria) this;
        }

        public Criteria andInWarehouseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("in_warehouse_id >=", value, "inWarehouseId");
            return (Criteria) this;
        }

        public Criteria andInWarehouseIdLessThan(Long value) {
            addCriterion("in_warehouse_id <", value, "inWarehouseId");
            return (Criteria) this;
        }

        public Criteria andInWarehouseIdLessThanOrEqualTo(Long value) {
            addCriterion("in_warehouse_id <=", value, "inWarehouseId");
            return (Criteria) this;
        }

        public Criteria andInWarehouseIdIn(List<Long> values) {
            addCriterion("in_warehouse_id in", values, "inWarehouseId");
            return (Criteria) this;
        }

        public Criteria andInWarehouseIdNotIn(List<Long> values) {
            addCriterion("in_warehouse_id not in", values, "inWarehouseId");
            return (Criteria) this;
        }

        public Criteria andInWarehouseIdBetween(Long value1, Long value2) {
            addCriterion("in_warehouse_id between", value1, value2, "inWarehouseId");
            return (Criteria) this;
        }

        public Criteria andInWarehouseIdNotBetween(Long value1, Long value2) {
            addCriterion("in_warehouse_id not between", value1, value2, "inWarehouseId");
            return (Criteria) this;
        }

        public Criteria andSourceNoIsNull() {
            addCriterion("source_no is null");
            return (Criteria) this;
        }

        public Criteria andSourceNoIsNotNull() {
            addCriterion("source_no is not null");
            return (Criteria) this;
        }

        public Criteria andSourceNoEqualTo(String value) {
            addCriterion("source_no =", value, "sourceNo");
            return (Criteria) this;
        }

        public Criteria andSourceNoNotEqualTo(String value) {
            addCriterion("source_no <>", value, "sourceNo");
            return (Criteria) this;
        }

        public Criteria andSourceNoGreaterThan(String value) {
            addCriterion("source_no >", value, "sourceNo");
            return (Criteria) this;
        }

        public Criteria andSourceNoGreaterThanOrEqualTo(String value) {
            addCriterion("source_no >=", value, "sourceNo");
            return (Criteria) this;
        }

        public Criteria andSourceNoLessThan(String value) {
            addCriterion("source_no <", value, "sourceNo");
            return (Criteria) this;
        }

        public Criteria andSourceNoLessThanOrEqualTo(String value) {
            addCriterion("source_no <=", value, "sourceNo");
            return (Criteria) this;
        }

        public Criteria andSourceNoLike(String value) {
            addCriterion("source_no like", value, "sourceNo");
            return (Criteria) this;
        }

        public Criteria andSourceNoNotLike(String value) {
            addCriterion("source_no not like", value, "sourceNo");
            return (Criteria) this;
        }

        public Criteria andSourceNoIn(List<String> values) {
            addCriterion("source_no in", values, "sourceNo");
            return (Criteria) this;
        }

        public Criteria andSourceNoNotIn(List<String> values) {
            addCriterion("source_no not in", values, "sourceNo");
            return (Criteria) this;
        }

        public Criteria andSourceNoBetween(String value1, String value2) {
            addCriterion("source_no between", value1, value2, "sourceNo");
            return (Criteria) this;
        }

        public Criteria andSourceNoNotBetween(String value1, String value2) {
            addCriterion("source_no not between", value1, value2, "sourceNo");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNull() {
            addCriterion("source_type is null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNotNull() {
            addCriterion("source_type is not null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeEqualTo(Integer value) {
            addCriterion("source_type =", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotEqualTo(Integer value) {
            addCriterion("source_type <>", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThan(Integer value) {
            addCriterion("source_type >", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_type >=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThan(Integer value) {
            addCriterion("source_type <", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("source_type <=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIn(List<Integer> values) {
            addCriterion("source_type in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotIn(List<Integer> values) {
            addCriterion("source_type not in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeBetween(Integer value1, Integer value2) {
            addCriterion("source_type between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("source_type not between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andItemCountIsNull() {
            addCriterion("item_count is null");
            return (Criteria) this;
        }

        public Criteria andItemCountIsNotNull() {
            addCriterion("item_count is not null");
            return (Criteria) this;
        }

        public Criteria andItemCountEqualTo(Integer value) {
            addCriterion("item_count =", value, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountNotEqualTo(Integer value) {
            addCriterion("item_count <>", value, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountGreaterThan(Integer value) {
            addCriterion("item_count >", value, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_count >=", value, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountLessThan(Integer value) {
            addCriterion("item_count <", value, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountLessThanOrEqualTo(Integer value) {
            addCriterion("item_count <=", value, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountIn(List<Integer> values) {
            addCriterion("item_count in", values, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountNotIn(List<Integer> values) {
            addCriterion("item_count not in", values, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountBetween(Integer value1, Integer value2) {
            addCriterion("item_count between", value1, value2, "itemCount");
            return (Criteria) this;
        }

        public Criteria andItemCountNotBetween(Integer value1, Integer value2) {
            addCriterion("item_count not between", value1, value2, "itemCount");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(BigDecimal value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(BigDecimal value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(BigDecimal value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(BigDecimal value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<BigDecimal> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<BigDecimal> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Long value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Long value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Long value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Long value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Long value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Long value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Long> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Long> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Long value1, Long value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Long value1, Long value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIsNull() {
            addCriterion("currency_id is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIsNotNull() {
            addCriterion("currency_id is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdEqualTo(Long value) {
            addCriterion("currency_id =", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotEqualTo(Long value) {
            addCriterion("currency_id <>", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdGreaterThan(Long value) {
            addCriterion("currency_id >", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("currency_id >=", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLessThan(Long value) {
            addCriterion("currency_id <", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdLessThanOrEqualTo(Long value) {
            addCriterion("currency_id <=", value, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdIn(List<Long> values) {
            addCriterion("currency_id in", values, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotIn(List<Long> values) {
            addCriterion("currency_id not in", values, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdBetween(Long value1, Long value2) {
            addCriterion("currency_id between", value1, value2, "currencyId");
            return (Criteria) this;
        }

        public Criteria andCurrencyIdNotBetween(Long value1, Long value2) {
            addCriterion("currency_id not between", value1, value2, "currencyId");
            return (Criteria) this;
        }

        public Criteria andExchangeRateIsNull() {
            addCriterion("exchange_rate is null");
            return (Criteria) this;
        }

        public Criteria andExchangeRateIsNotNull() {
            addCriterion("exchange_rate is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeRateEqualTo(BigDecimal value) {
            addCriterion("exchange_rate =", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotEqualTo(BigDecimal value) {
            addCriterion("exchange_rate <>", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateGreaterThan(BigDecimal value) {
            addCriterion("exchange_rate >", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_rate >=", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateLessThan(BigDecimal value) {
            addCriterion("exchange_rate <", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_rate <=", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateIn(List<BigDecimal> values) {
            addCriterion("exchange_rate in", values, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotIn(List<BigDecimal> values) {
            addCriterion("exchange_rate not in", values, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_rate between", value1, value2, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_rate not between", value1, value2, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andPayTypeTypeIsNull() {
            addCriterion("pay_type_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeTypeIsNotNull() {
            addCriterion("pay_type_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeTypeEqualTo(Integer value) {
            addCriterion("pay_type_type =", value, "payTypeType");
            return (Criteria) this;
        }

        public Criteria andPayTypeTypeNotEqualTo(Integer value) {
            addCriterion("pay_type_type <>", value, "payTypeType");
            return (Criteria) this;
        }

        public Criteria andPayTypeTypeGreaterThan(Integer value) {
            addCriterion("pay_type_type >", value, "payTypeType");
            return (Criteria) this;
        }

        public Criteria andPayTypeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_type_type >=", value, "payTypeType");
            return (Criteria) this;
        }

        public Criteria andPayTypeTypeLessThan(Integer value) {
            addCriterion("pay_type_type <", value, "payTypeType");
            return (Criteria) this;
        }

        public Criteria andPayTypeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_type_type <=", value, "payTypeType");
            return (Criteria) this;
        }

        public Criteria andPayTypeTypeIn(List<Integer> values) {
            addCriterion("pay_type_type in", values, "payTypeType");
            return (Criteria) this;
        }

        public Criteria andPayTypeTypeNotIn(List<Integer> values) {
            addCriterion("pay_type_type not in", values, "payTypeType");
            return (Criteria) this;
        }

        public Criteria andPayTypeTypeBetween(Integer value1, Integer value2) {
            addCriterion("pay_type_type between", value1, value2, "payTypeType");
            return (Criteria) this;
        }

        public Criteria andPayTypeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_type_type not between", value1, value2, "payTypeType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNameIsNull() {
            addCriterion("pay_type_name is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeNameIsNotNull() {
            addCriterion("pay_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeNameEqualTo(String value) {
            addCriterion("pay_type_name =", value, "payTypeName");
            return (Criteria) this;
        }

        public Criteria andPayTypeNameNotEqualTo(String value) {
            addCriterion("pay_type_name <>", value, "payTypeName");
            return (Criteria) this;
        }

        public Criteria andPayTypeNameGreaterThan(String value) {
            addCriterion("pay_type_name >", value, "payTypeName");
            return (Criteria) this;
        }

        public Criteria andPayTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("pay_type_name >=", value, "payTypeName");
            return (Criteria) this;
        }

        public Criteria andPayTypeNameLessThan(String value) {
            addCriterion("pay_type_name <", value, "payTypeName");
            return (Criteria) this;
        }

        public Criteria andPayTypeNameLessThanOrEqualTo(String value) {
            addCriterion("pay_type_name <=", value, "payTypeName");
            return (Criteria) this;
        }

        public Criteria andPayTypeNameLike(String value) {
            addCriterion("pay_type_name like", value, "payTypeName");
            return (Criteria) this;
        }

        public Criteria andPayTypeNameNotLike(String value) {
            addCriterion("pay_type_name not like", value, "payTypeName");
            return (Criteria) this;
        }

        public Criteria andPayTypeNameIn(List<String> values) {
            addCriterion("pay_type_name in", values, "payTypeName");
            return (Criteria) this;
        }

        public Criteria andPayTypeNameNotIn(List<String> values) {
            addCriterion("pay_type_name not in", values, "payTypeName");
            return (Criteria) this;
        }

        public Criteria andPayTypeNameBetween(String value1, String value2) {
            addCriterion("pay_type_name between", value1, value2, "payTypeName");
            return (Criteria) this;
        }

        public Criteria andPayTypeNameNotBetween(String value1, String value2) {
            addCriterion("pay_type_name not between", value1, value2, "payTypeName");
            return (Criteria) this;
        }

        public Criteria andPayTypeInitValueIsNull() {
            addCriterion("pay_type_init_value is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeInitValueIsNotNull() {
            addCriterion("pay_type_init_value is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeInitValueEqualTo(Integer value) {
            addCriterion("pay_type_init_value =", value, "payTypeInitValue");
            return (Criteria) this;
        }

        public Criteria andPayTypeInitValueNotEqualTo(Integer value) {
            addCriterion("pay_type_init_value <>", value, "payTypeInitValue");
            return (Criteria) this;
        }

        public Criteria andPayTypeInitValueGreaterThan(Integer value) {
            addCriterion("pay_type_init_value >", value, "payTypeInitValue");
            return (Criteria) this;
        }

        public Criteria andPayTypeInitValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_type_init_value >=", value, "payTypeInitValue");
            return (Criteria) this;
        }

        public Criteria andPayTypeInitValueLessThan(Integer value) {
            addCriterion("pay_type_init_value <", value, "payTypeInitValue");
            return (Criteria) this;
        }

        public Criteria andPayTypeInitValueLessThanOrEqualTo(Integer value) {
            addCriterion("pay_type_init_value <=", value, "payTypeInitValue");
            return (Criteria) this;
        }

        public Criteria andPayTypeInitValueIn(List<Integer> values) {
            addCriterion("pay_type_init_value in", values, "payTypeInitValue");
            return (Criteria) this;
        }

        public Criteria andPayTypeInitValueNotIn(List<Integer> values) {
            addCriterion("pay_type_init_value not in", values, "payTypeInitValue");
            return (Criteria) this;
        }

        public Criteria andPayTypeInitValueBetween(Integer value1, Integer value2) {
            addCriterion("pay_type_init_value between", value1, value2, "payTypeInitValue");
            return (Criteria) this;
        }

        public Criteria andPayTypeInitValueNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_type_init_value not between", value1, value2, "payTypeInitValue");
            return (Criteria) this;
        }

        public Criteria andLockRuleIdIsNull() {
            addCriterion("lock_rule_id is null");
            return (Criteria) this;
        }

        public Criteria andLockRuleIdIsNotNull() {
            addCriterion("lock_rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andLockRuleIdEqualTo(Long value) {
            addCriterion("lock_rule_id =", value, "lockRuleId");
            return (Criteria) this;
        }

        public Criteria andLockRuleIdNotEqualTo(Long value) {
            addCriterion("lock_rule_id <>", value, "lockRuleId");
            return (Criteria) this;
        }

        public Criteria andLockRuleIdGreaterThan(Long value) {
            addCriterion("lock_rule_id >", value, "lockRuleId");
            return (Criteria) this;
        }

        public Criteria andLockRuleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("lock_rule_id >=", value, "lockRuleId");
            return (Criteria) this;
        }

        public Criteria andLockRuleIdLessThan(Long value) {
            addCriterion("lock_rule_id <", value, "lockRuleId");
            return (Criteria) this;
        }

        public Criteria andLockRuleIdLessThanOrEqualTo(Long value) {
            addCriterion("lock_rule_id <=", value, "lockRuleId");
            return (Criteria) this;
        }

        public Criteria andLockRuleIdIn(List<Long> values) {
            addCriterion("lock_rule_id in", values, "lockRuleId");
            return (Criteria) this;
        }

        public Criteria andLockRuleIdNotIn(List<Long> values) {
            addCriterion("lock_rule_id not in", values, "lockRuleId");
            return (Criteria) this;
        }

        public Criteria andLockRuleIdBetween(Long value1, Long value2) {
            addCriterion("lock_rule_id between", value1, value2, "lockRuleId");
            return (Criteria) this;
        }

        public Criteria andLockRuleIdNotBetween(Long value1, Long value2) {
            addCriterion("lock_rule_id not between", value1, value2, "lockRuleId");
            return (Criteria) this;
        }

        public Criteria andLockStateIsNull() {
            addCriterion("lock_state is null");
            return (Criteria) this;
        }

        public Criteria andLockStateIsNotNull() {
            addCriterion("lock_state is not null");
            return (Criteria) this;
        }

        public Criteria andLockStateEqualTo(Short value) {
            addCriterion("lock_state =", value, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateNotEqualTo(Short value) {
            addCriterion("lock_state <>", value, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateGreaterThan(Short value) {
            addCriterion("lock_state >", value, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateGreaterThanOrEqualTo(Short value) {
            addCriterion("lock_state >=", value, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateLessThan(Short value) {
            addCriterion("lock_state <", value, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateLessThanOrEqualTo(Short value) {
            addCriterion("lock_state <=", value, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateIn(List<Short> values) {
            addCriterion("lock_state in", values, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateNotIn(List<Short> values) {
            addCriterion("lock_state not in", values, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateBetween(Short value1, Short value2) {
            addCriterion("lock_state between", value1, value2, "lockState");
            return (Criteria) this;
        }

        public Criteria andLockStateNotBetween(Short value1, Short value2) {
            addCriterion("lock_state not between", value1, value2, "lockState");
            return (Criteria) this;
        }

        public Criteria andLastLockTimeIsNull() {
            addCriterion("last_lock_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLockTimeIsNotNull() {
            addCriterion("last_lock_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLockTimeEqualTo(Date value) {
            addCriterion("last_lock_time =", value, "lastLockTime");
            return (Criteria) this;
        }

        public Criteria andLastLockTimeNotEqualTo(Date value) {
            addCriterion("last_lock_time <>", value, "lastLockTime");
            return (Criteria) this;
        }

        public Criteria andLastLockTimeGreaterThan(Date value) {
            addCriterion("last_lock_time >", value, "lastLockTime");
            return (Criteria) this;
        }

        public Criteria andLastLockTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_lock_time >=", value, "lastLockTime");
            return (Criteria) this;
        }

        public Criteria andLastLockTimeLessThan(Date value) {
            addCriterion("last_lock_time <", value, "lastLockTime");
            return (Criteria) this;
        }

        public Criteria andLastLockTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_lock_time <=", value, "lastLockTime");
            return (Criteria) this;
        }

        public Criteria andLastLockTimeIn(List<Date> values) {
            addCriterion("last_lock_time in", values, "lastLockTime");
            return (Criteria) this;
        }

        public Criteria andLastLockTimeNotIn(List<Date> values) {
            addCriterion("last_lock_time not in", values, "lastLockTime");
            return (Criteria) this;
        }

        public Criteria andLastLockTimeBetween(Date value1, Date value2) {
            addCriterion("last_lock_time between", value1, value2, "lastLockTime");
            return (Criteria) this;
        }

        public Criteria andLastLockTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_lock_time not between", value1, value2, "lastLockTime");
            return (Criteria) this;
        }

        public Criteria andLastUnlockTimeIsNull() {
            addCriterion("last_unlock_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUnlockTimeIsNotNull() {
            addCriterion("last_unlock_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUnlockTimeEqualTo(Date value) {
            addCriterion("last_unlock_time =", value, "lastUnlockTime");
            return (Criteria) this;
        }

        public Criteria andLastUnlockTimeNotEqualTo(Date value) {
            addCriterion("last_unlock_time <>", value, "lastUnlockTime");
            return (Criteria) this;
        }

        public Criteria andLastUnlockTimeGreaterThan(Date value) {
            addCriterion("last_unlock_time >", value, "lastUnlockTime");
            return (Criteria) this;
        }

        public Criteria andLastUnlockTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_unlock_time >=", value, "lastUnlockTime");
            return (Criteria) this;
        }

        public Criteria andLastUnlockTimeLessThan(Date value) {
            addCriterion("last_unlock_time <", value, "lastUnlockTime");
            return (Criteria) this;
        }

        public Criteria andLastUnlockTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_unlock_time <=", value, "lastUnlockTime");
            return (Criteria) this;
        }

        public Criteria andLastUnlockTimeIn(List<Date> values) {
            addCriterion("last_unlock_time in", values, "lastUnlockTime");
            return (Criteria) this;
        }

        public Criteria andLastUnlockTimeNotIn(List<Date> values) {
            addCriterion("last_unlock_time not in", values, "lastUnlockTime");
            return (Criteria) this;
        }

        public Criteria andLastUnlockTimeBetween(Date value1, Date value2) {
            addCriterion("last_unlock_time between", value1, value2, "lastUnlockTime");
            return (Criteria) this;
        }

        public Criteria andLastUnlockTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_unlock_time not between", value1, value2, "lastUnlockTime");
            return (Criteria) this;
        }

        public Criteria andLockCountIsNull() {
            addCriterion("lock_count is null");
            return (Criteria) this;
        }

        public Criteria andLockCountIsNotNull() {
            addCriterion("lock_count is not null");
            return (Criteria) this;
        }

        public Criteria andLockCountEqualTo(Integer value) {
            addCriterion("lock_count =", value, "lockCount");
            return (Criteria) this;
        }

        public Criteria andLockCountNotEqualTo(Integer value) {
            addCriterion("lock_count <>", value, "lockCount");
            return (Criteria) this;
        }

        public Criteria andLockCountGreaterThan(Integer value) {
            addCriterion("lock_count >", value, "lockCount");
            return (Criteria) this;
        }

        public Criteria andLockCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("lock_count >=", value, "lockCount");
            return (Criteria) this;
        }

        public Criteria andLockCountLessThan(Integer value) {
            addCriterion("lock_count <", value, "lockCount");
            return (Criteria) this;
        }

        public Criteria andLockCountLessThanOrEqualTo(Integer value) {
            addCriterion("lock_count <=", value, "lockCount");
            return (Criteria) this;
        }

        public Criteria andLockCountIn(List<Integer> values) {
            addCriterion("lock_count in", values, "lockCount");
            return (Criteria) this;
        }

        public Criteria andLockCountNotIn(List<Integer> values) {
            addCriterion("lock_count not in", values, "lockCount");
            return (Criteria) this;
        }

        public Criteria andLockCountBetween(Integer value1, Integer value2) {
            addCriterion("lock_count between", value1, value2, "lockCount");
            return (Criteria) this;
        }

        public Criteria andLockCountNotBetween(Integer value1, Integer value2) {
            addCriterion("lock_count not between", value1, value2, "lockCount");
            return (Criteria) this;
        }

        public Criteria andStandardTaxIsNull() {
            addCriterion("standard_tax is null");
            return (Criteria) this;
        }

        public Criteria andStandardTaxIsNotNull() {
            addCriterion("standard_tax is not null");
            return (Criteria) this;
        }

        public Criteria andStandardTaxEqualTo(BigDecimal value) {
            addCriterion("standard_tax =", value, "standardTax");
            return (Criteria) this;
        }

        public Criteria andStandardTaxNotEqualTo(BigDecimal value) {
            addCriterion("standard_tax <>", value, "standardTax");
            return (Criteria) this;
        }

        public Criteria andStandardTaxGreaterThan(BigDecimal value) {
            addCriterion("standard_tax >", value, "standardTax");
            return (Criteria) this;
        }

        public Criteria andStandardTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("standard_tax >=", value, "standardTax");
            return (Criteria) this;
        }

        public Criteria andStandardTaxLessThan(BigDecimal value) {
            addCriterion("standard_tax <", value, "standardTax");
            return (Criteria) this;
        }

        public Criteria andStandardTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("standard_tax <=", value, "standardTax");
            return (Criteria) this;
        }

        public Criteria andStandardTaxIn(List<BigDecimal> values) {
            addCriterion("standard_tax in", values, "standardTax");
            return (Criteria) this;
        }

        public Criteria andStandardTaxNotIn(List<BigDecimal> values) {
            addCriterion("standard_tax not in", values, "standardTax");
            return (Criteria) this;
        }

        public Criteria andStandardTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("standard_tax between", value1, value2, "standardTax");
            return (Criteria) this;
        }

        public Criteria andStandardTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("standard_tax not between", value1, value2, "standardTax");
            return (Criteria) this;
        }

        public Criteria andStandardTaxInclusiveAmountIsNull() {
            addCriterion("standard_tax_inclusive_amount is null");
            return (Criteria) this;
        }

        public Criteria andStandardTaxInclusiveAmountIsNotNull() {
            addCriterion("standard_tax_inclusive_amount is not null");
            return (Criteria) this;
        }

        public Criteria andStandardTaxInclusiveAmountEqualTo(BigDecimal value) {
            addCriterion("standard_tax_inclusive_amount =", value, "standardTaxInclusiveAmount");
            return (Criteria) this;
        }

        public Criteria andStandardTaxInclusiveAmountNotEqualTo(BigDecimal value) {
            addCriterion("standard_tax_inclusive_amount <>", value, "standardTaxInclusiveAmount");
            return (Criteria) this;
        }

        public Criteria andStandardTaxInclusiveAmountGreaterThan(BigDecimal value) {
            addCriterion("standard_tax_inclusive_amount >", value, "standardTaxInclusiveAmount");
            return (Criteria) this;
        }

        public Criteria andStandardTaxInclusiveAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("standard_tax_inclusive_amount >=", value, "standardTaxInclusiveAmount");
            return (Criteria) this;
        }

        public Criteria andStandardTaxInclusiveAmountLessThan(BigDecimal value) {
            addCriterion("standard_tax_inclusive_amount <", value, "standardTaxInclusiveAmount");
            return (Criteria) this;
        }

        public Criteria andStandardTaxInclusiveAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("standard_tax_inclusive_amount <=", value, "standardTaxInclusiveAmount");
            return (Criteria) this;
        }

        public Criteria andStandardTaxInclusiveAmountIn(List<BigDecimal> values) {
            addCriterion("standard_tax_inclusive_amount in", values, "standardTaxInclusiveAmount");
            return (Criteria) this;
        }

        public Criteria andStandardTaxInclusiveAmountNotIn(List<BigDecimal> values) {
            addCriterion("standard_tax_inclusive_amount not in", values, "standardTaxInclusiveAmount");
            return (Criteria) this;
        }

        public Criteria andStandardTaxInclusiveAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("standard_tax_inclusive_amount between", value1, value2, "standardTaxInclusiveAmount");
            return (Criteria) this;
        }

        public Criteria andStandardTaxInclusiveAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("standard_tax_inclusive_amount not between", value1, value2, "standardTaxInclusiveAmount");
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