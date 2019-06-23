package org.mypro.entity;

import java.util.ArrayList;
import java.util.List;

public class PingjiaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PingjiaExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNeirongIsNull() {
            addCriterion("neirong is null");
            return (Criteria) this;
        }

        public Criteria andNeirongIsNotNull() {
            addCriterion("neirong is not null");
            return (Criteria) this;
        }

        public Criteria andNeirongEqualTo(String value) {
            addCriterion("neirong =", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongNotEqualTo(String value) {
            addCriterion("neirong <>", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongGreaterThan(String value) {
            addCriterion("neirong >", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongGreaterThanOrEqualTo(String value) {
            addCriterion("neirong >=", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongLessThan(String value) {
            addCriterion("neirong <", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongLessThanOrEqualTo(String value) {
            addCriterion("neirong <=", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongLike(String value) {
            addCriterion("neirong like", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongNotLike(String value) {
            addCriterion("neirong not like", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongIn(List<String> values) {
            addCriterion("neirong in", values, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongNotIn(List<String> values) {
            addCriterion("neirong not in", values, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongBetween(String value1, String value2) {
            addCriterion("neirong between", value1, value2, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongNotBetween(String value1, String value2) {
            addCriterion("neirong not between", value1, value2, "neirong");
            return (Criteria) this;
        }

        public Criteria andPingjiaIsNull() {
            addCriterion("pingjia is null");
            return (Criteria) this;
        }

        public Criteria andPingjiaIsNotNull() {
            addCriterion("pingjia is not null");
            return (Criteria) this;
        }

        public Criteria andPingjiaEqualTo(String value) {
            addCriterion("pingjia =", value, "pingjia");
            return (Criteria) this;
        }

        public Criteria andPingjiaNotEqualTo(String value) {
            addCriterion("pingjia <>", value, "pingjia");
            return (Criteria) this;
        }

        public Criteria andPingjiaGreaterThan(String value) {
            addCriterion("pingjia >", value, "pingjia");
            return (Criteria) this;
        }

        public Criteria andPingjiaGreaterThanOrEqualTo(String value) {
            addCriterion("pingjia >=", value, "pingjia");
            return (Criteria) this;
        }

        public Criteria andPingjiaLessThan(String value) {
            addCriterion("pingjia <", value, "pingjia");
            return (Criteria) this;
        }

        public Criteria andPingjiaLessThanOrEqualTo(String value) {
            addCriterion("pingjia <=", value, "pingjia");
            return (Criteria) this;
        }

        public Criteria andPingjiaLike(String value) {
            addCriterion("pingjia like", value, "pingjia");
            return (Criteria) this;
        }

        public Criteria andPingjiaNotLike(String value) {
            addCriterion("pingjia not like", value, "pingjia");
            return (Criteria) this;
        }

        public Criteria andPingjiaIn(List<String> values) {
            addCriterion("pingjia in", values, "pingjia");
            return (Criteria) this;
        }

        public Criteria andPingjiaNotIn(List<String> values) {
            addCriterion("pingjia not in", values, "pingjia");
            return (Criteria) this;
        }

        public Criteria andPingjiaBetween(String value1, String value2) {
            addCriterion("pingjia between", value1, value2, "pingjia");
            return (Criteria) this;
        }

        public Criteria andPingjiaNotBetween(String value1, String value2) {
            addCriterion("pingjia not between", value1, value2, "pingjia");
            return (Criteria) this;
        }

        public Criteria andYonghuIsNull() {
            addCriterion("yonghu is null");
            return (Criteria) this;
        }

        public Criteria andYonghuIsNotNull() {
            addCriterion("yonghu is not null");
            return (Criteria) this;
        }

        public Criteria andYonghuEqualTo(String value) {
            addCriterion("yonghu =", value, "yonghu");
            return (Criteria) this;
        }

        public Criteria andYonghuNotEqualTo(String value) {
            addCriterion("yonghu <>", value, "yonghu");
            return (Criteria) this;
        }

        public Criteria andYonghuGreaterThan(String value) {
            addCriterion("yonghu >", value, "yonghu");
            return (Criteria) this;
        }

        public Criteria andYonghuGreaterThanOrEqualTo(String value) {
            addCriterion("yonghu >=", value, "yonghu");
            return (Criteria) this;
        }

        public Criteria andYonghuLessThan(String value) {
            addCriterion("yonghu <", value, "yonghu");
            return (Criteria) this;
        }

        public Criteria andYonghuLessThanOrEqualTo(String value) {
            addCriterion("yonghu <=", value, "yonghu");
            return (Criteria) this;
        }

        public Criteria andYonghuLike(String value) {
            addCriterion("yonghu like", value, "yonghu");
            return (Criteria) this;
        }

        public Criteria andYonghuNotLike(String value) {
            addCriterion("yonghu not like", value, "yonghu");
            return (Criteria) this;
        }

        public Criteria andYonghuIn(List<String> values) {
            addCriterion("yonghu in", values, "yonghu");
            return (Criteria) this;
        }

        public Criteria andYonghuNotIn(List<String> values) {
            addCriterion("yonghu not in", values, "yonghu");
            return (Criteria) this;
        }

        public Criteria andYonghuBetween(String value1, String value2) {
            addCriterion("yonghu between", value1, value2, "yonghu");
            return (Criteria) this;
        }

        public Criteria andYonghuNotBetween(String value1, String value2) {
            addCriterion("yonghu not between", value1, value2, "yonghu");
            return (Criteria) this;
        }

        public Criteria andYonghuidIsNull() {
            addCriterion("yonghuid is null");
            return (Criteria) this;
        }

        public Criteria andYonghuidIsNotNull() {
            addCriterion("yonghuid is not null");
            return (Criteria) this;
        }

        public Criteria andYonghuidEqualTo(Integer value) {
            addCriterion("yonghuid =", value, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidNotEqualTo(Integer value) {
            addCriterion("yonghuid <>", value, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidGreaterThan(Integer value) {
            addCriterion("yonghuid >", value, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("yonghuid >=", value, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidLessThan(Integer value) {
            addCriterion("yonghuid <", value, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidLessThanOrEqualTo(Integer value) {
            addCriterion("yonghuid <=", value, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidIn(List<Integer> values) {
            addCriterion("yonghuid in", values, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidNotIn(List<Integer> values) {
            addCriterion("yonghuid not in", values, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidBetween(Integer value1, Integer value2) {
            addCriterion("yonghuid between", value1, value2, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidNotBetween(Integer value1, Integer value2) {
            addCriterion("yonghuid not between", value1, value2, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andShangpingIsNull() {
            addCriterion("shangping is null");
            return (Criteria) this;
        }

        public Criteria andShangpingIsNotNull() {
            addCriterion("shangping is not null");
            return (Criteria) this;
        }

        public Criteria andShangpingEqualTo(String value) {
            addCriterion("shangping =", value, "shangping");
            return (Criteria) this;
        }

        public Criteria andShangpingNotEqualTo(String value) {
            addCriterion("shangping <>", value, "shangping");
            return (Criteria) this;
        }

        public Criteria andShangpingGreaterThan(String value) {
            addCriterion("shangping >", value, "shangping");
            return (Criteria) this;
        }

        public Criteria andShangpingGreaterThanOrEqualTo(String value) {
            addCriterion("shangping >=", value, "shangping");
            return (Criteria) this;
        }

        public Criteria andShangpingLessThan(String value) {
            addCriterion("shangping <", value, "shangping");
            return (Criteria) this;
        }

        public Criteria andShangpingLessThanOrEqualTo(String value) {
            addCriterion("shangping <=", value, "shangping");
            return (Criteria) this;
        }

        public Criteria andShangpingLike(String value) {
            addCriterion("shangping like", value, "shangping");
            return (Criteria) this;
        }

        public Criteria andShangpingNotLike(String value) {
            addCriterion("shangping not like", value, "shangping");
            return (Criteria) this;
        }

        public Criteria andShangpingIn(List<String> values) {
            addCriterion("shangping in", values, "shangping");
            return (Criteria) this;
        }

        public Criteria andShangpingNotIn(List<String> values) {
            addCriterion("shangping not in", values, "shangping");
            return (Criteria) this;
        }

        public Criteria andShangpingBetween(String value1, String value2) {
            addCriterion("shangping between", value1, value2, "shangping");
            return (Criteria) this;
        }

        public Criteria andShangpingNotBetween(String value1, String value2) {
            addCriterion("shangping not between", value1, value2, "shangping");
            return (Criteria) this;
        }

        public Criteria andShangpingidIsNull() {
            addCriterion("shangpingid is null");
            return (Criteria) this;
        }

        public Criteria andShangpingidIsNotNull() {
            addCriterion("shangpingid is not null");
            return (Criteria) this;
        }

        public Criteria andShangpingidEqualTo(Integer value) {
            addCriterion("shangpingid =", value, "shangpingid");
            return (Criteria) this;
        }

        public Criteria andShangpingidNotEqualTo(Integer value) {
            addCriterion("shangpingid <>", value, "shangpingid");
            return (Criteria) this;
        }

        public Criteria andShangpingidGreaterThan(Integer value) {
            addCriterion("shangpingid >", value, "shangpingid");
            return (Criteria) this;
        }

        public Criteria andShangpingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shangpingid >=", value, "shangpingid");
            return (Criteria) this;
        }

        public Criteria andShangpingidLessThan(Integer value) {
            addCriterion("shangpingid <", value, "shangpingid");
            return (Criteria) this;
        }

        public Criteria andShangpingidLessThanOrEqualTo(Integer value) {
            addCriterion("shangpingid <=", value, "shangpingid");
            return (Criteria) this;
        }

        public Criteria andShangpingidIn(List<Integer> values) {
            addCriterion("shangpingid in", values, "shangpingid");
            return (Criteria) this;
        }

        public Criteria andShangpingidNotIn(List<Integer> values) {
            addCriterion("shangpingid not in", values, "shangpingid");
            return (Criteria) this;
        }

        public Criteria andShangpingidBetween(Integer value1, Integer value2) {
            addCriterion("shangpingid between", value1, value2, "shangpingid");
            return (Criteria) this;
        }

        public Criteria andShangpingidNotBetween(Integer value1, Integer value2) {
            addCriterion("shangpingid not between", value1, value2, "shangpingid");
            return (Criteria) this;
        }

        public Criteria andShanghuIsNull() {
            addCriterion("shanghu is null");
            return (Criteria) this;
        }

        public Criteria andShanghuIsNotNull() {
            addCriterion("shanghu is not null");
            return (Criteria) this;
        }

        public Criteria andShanghuEqualTo(String value) {
            addCriterion("shanghu =", value, "shanghu");
            return (Criteria) this;
        }

        public Criteria andShanghuNotEqualTo(String value) {
            addCriterion("shanghu <>", value, "shanghu");
            return (Criteria) this;
        }

        public Criteria andShanghuGreaterThan(String value) {
            addCriterion("shanghu >", value, "shanghu");
            return (Criteria) this;
        }

        public Criteria andShanghuGreaterThanOrEqualTo(String value) {
            addCriterion("shanghu >=", value, "shanghu");
            return (Criteria) this;
        }

        public Criteria andShanghuLessThan(String value) {
            addCriterion("shanghu <", value, "shanghu");
            return (Criteria) this;
        }

        public Criteria andShanghuLessThanOrEqualTo(String value) {
            addCriterion("shanghu <=", value, "shanghu");
            return (Criteria) this;
        }

        public Criteria andShanghuLike(String value) {
            addCriterion("shanghu like", value, "shanghu");
            return (Criteria) this;
        }

        public Criteria andShanghuNotLike(String value) {
            addCriterion("shanghu not like", value, "shanghu");
            return (Criteria) this;
        }

        public Criteria andShanghuIn(List<String> values) {
            addCriterion("shanghu in", values, "shanghu");
            return (Criteria) this;
        }

        public Criteria andShanghuNotIn(List<String> values) {
            addCriterion("shanghu not in", values, "shanghu");
            return (Criteria) this;
        }

        public Criteria andShanghuBetween(String value1, String value2) {
            addCriterion("shanghu between", value1, value2, "shanghu");
            return (Criteria) this;
        }

        public Criteria andShanghuNotBetween(String value1, String value2) {
            addCriterion("shanghu not between", value1, value2, "shanghu");
            return (Criteria) this;
        }

        public Criteria andShanghuidIsNull() {
            addCriterion("shanghuid is null");
            return (Criteria) this;
        }

        public Criteria andShanghuidIsNotNull() {
            addCriterion("shanghuid is not null");
            return (Criteria) this;
        }

        public Criteria andShanghuidEqualTo(Integer value) {
            addCriterion("shanghuid =", value, "shanghuid");
            return (Criteria) this;
        }

        public Criteria andShanghuidNotEqualTo(Integer value) {
            addCriterion("shanghuid <>", value, "shanghuid");
            return (Criteria) this;
        }

        public Criteria andShanghuidGreaterThan(Integer value) {
            addCriterion("shanghuid >", value, "shanghuid");
            return (Criteria) this;
        }

        public Criteria andShanghuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shanghuid >=", value, "shanghuid");
            return (Criteria) this;
        }

        public Criteria andShanghuidLessThan(Integer value) {
            addCriterion("shanghuid <", value, "shanghuid");
            return (Criteria) this;
        }

        public Criteria andShanghuidLessThanOrEqualTo(Integer value) {
            addCriterion("shanghuid <=", value, "shanghuid");
            return (Criteria) this;
        }

        public Criteria andShanghuidIn(List<Integer> values) {
            addCriterion("shanghuid in", values, "shanghuid");
            return (Criteria) this;
        }

        public Criteria andShanghuidNotIn(List<Integer> values) {
            addCriterion("shanghuid not in", values, "shanghuid");
            return (Criteria) this;
        }

        public Criteria andShanghuidBetween(Integer value1, Integer value2) {
            addCriterion("shanghuid between", value1, value2, "shanghuid");
            return (Criteria) this;
        }

        public Criteria andShanghuidNotBetween(Integer value1, Integer value2) {
            addCriterion("shanghuid not between", value1, value2, "shanghuid");
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