package org.mypro.entity;

import java.util.ArrayList;
import java.util.List;

public class ShangpingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShangpingExample() {
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

        public Criteria andLeixingIsNull() {
            addCriterion("leixing is null");
            return (Criteria) this;
        }

        public Criteria andLeixingIsNotNull() {
            addCriterion("leixing is not null");
            return (Criteria) this;
        }

        public Criteria andLeixingEqualTo(String value) {
            addCriterion("leixing =", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotEqualTo(String value) {
            addCriterion("leixing <>", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingGreaterThan(String value) {
            addCriterion("leixing >", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingGreaterThanOrEqualTo(String value) {
            addCriterion("leixing >=", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingLessThan(String value) {
            addCriterion("leixing <", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingLessThanOrEqualTo(String value) {
            addCriterion("leixing <=", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingLike(String value) {
            addCriterion("leixing like", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotLike(String value) {
            addCriterion("leixing not like", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingIn(List<String> values) {
            addCriterion("leixing in", values, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotIn(List<String> values) {
            addCriterion("leixing not in", values, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingBetween(String value1, String value2) {
            addCriterion("leixing between", value1, value2, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotBetween(String value1, String value2) {
            addCriterion("leixing not between", value1, value2, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingidIsNull() {
            addCriterion("leixingid is null");
            return (Criteria) this;
        }

        public Criteria andLeixingidIsNotNull() {
            addCriterion("leixingid is not null");
            return (Criteria) this;
        }

        public Criteria andLeixingidEqualTo(Integer value) {
            addCriterion("leixingid =", value, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidNotEqualTo(Integer value) {
            addCriterion("leixingid <>", value, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidGreaterThan(Integer value) {
            addCriterion("leixingid >", value, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("leixingid >=", value, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidLessThan(Integer value) {
            addCriterion("leixingid <", value, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidLessThanOrEqualTo(Integer value) {
            addCriterion("leixingid <=", value, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidIn(List<Integer> values) {
            addCriterion("leixingid in", values, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidNotIn(List<Integer> values) {
            addCriterion("leixingid not in", values, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidBetween(Integer value1, Integer value2) {
            addCriterion("leixingid between", value1, value2, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidNotBetween(Integer value1, Integer value2) {
            addCriterion("leixingid not between", value1, value2, "leixingid");
            return (Criteria) this;
        }

        public Criteria andMiaoshuIsNull() {
            addCriterion("miaoshu is null");
            return (Criteria) this;
        }

        public Criteria andMiaoshuIsNotNull() {
            addCriterion("miaoshu is not null");
            return (Criteria) this;
        }

        public Criteria andMiaoshuEqualTo(String value) {
            addCriterion("miaoshu =", value, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuNotEqualTo(String value) {
            addCriterion("miaoshu <>", value, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuGreaterThan(String value) {
            addCriterion("miaoshu >", value, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuGreaterThanOrEqualTo(String value) {
            addCriterion("miaoshu >=", value, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuLessThan(String value) {
            addCriterion("miaoshu <", value, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuLessThanOrEqualTo(String value) {
            addCriterion("miaoshu <=", value, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuLike(String value) {
            addCriterion("miaoshu like", value, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuNotLike(String value) {
            addCriterion("miaoshu not like", value, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuIn(List<String> values) {
            addCriterion("miaoshu in", values, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuNotIn(List<String> values) {
            addCriterion("miaoshu not in", values, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuBetween(String value1, String value2) {
            addCriterion("miaoshu between", value1, value2, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andMiaoshuNotBetween(String value1, String value2) {
            addCriterion("miaoshu not between", value1, value2, "miaoshu");
            return (Criteria) this;
        }

        public Criteria andJiageIsNull() {
            addCriterion("jiage is null");
            return (Criteria) this;
        }

        public Criteria andJiageIsNotNull() {
            addCriterion("jiage is not null");
            return (Criteria) this;
        }

        public Criteria andJiageEqualTo(String value) {
            addCriterion("jiage =", value, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageNotEqualTo(String value) {
            addCriterion("jiage <>", value, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageGreaterThan(String value) {
            addCriterion("jiage >", value, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageGreaterThanOrEqualTo(String value) {
            addCriterion("jiage >=", value, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageLessThan(String value) {
            addCriterion("jiage <", value, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageLessThanOrEqualTo(String value) {
            addCriterion("jiage <=", value, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageLike(String value) {
            addCriterion("jiage like", value, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageNotLike(String value) {
            addCriterion("jiage not like", value, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageIn(List<String> values) {
            addCriterion("jiage in", values, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageNotIn(List<String> values) {
            addCriterion("jiage not in", values, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageBetween(String value1, String value2) {
            addCriterion("jiage between", value1, value2, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageNotBetween(String value1, String value2) {
            addCriterion("jiage not between", value1, value2, "jiage");
            return (Criteria) this;
        }

        public Criteria andShuliangIsNull() {
            addCriterion("shuliang is null");
            return (Criteria) this;
        }

        public Criteria andShuliangIsNotNull() {
            addCriterion("shuliang is not null");
            return (Criteria) this;
        }

        public Criteria andShuliangEqualTo(String value) {
            addCriterion("shuliang =", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangNotEqualTo(String value) {
            addCriterion("shuliang <>", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangGreaterThan(String value) {
            addCriterion("shuliang >", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangGreaterThanOrEqualTo(String value) {
            addCriterion("shuliang >=", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangLessThan(String value) {
            addCriterion("shuliang <", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangLessThanOrEqualTo(String value) {
            addCriterion("shuliang <=", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangLike(String value) {
            addCriterion("shuliang like", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangNotLike(String value) {
            addCriterion("shuliang not like", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangIn(List<String> values) {
            addCriterion("shuliang in", values, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangNotIn(List<String> values) {
            addCriterion("shuliang not in", values, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangBetween(String value1, String value2) {
            addCriterion("shuliang between", value1, value2, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangNotBetween(String value1, String value2) {
            addCriterion("shuliang not between", value1, value2, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShangjiaIsNull() {
            addCriterion("shangjia is null");
            return (Criteria) this;
        }

        public Criteria andShangjiaIsNotNull() {
            addCriterion("shangjia is not null");
            return (Criteria) this;
        }

        public Criteria andShangjiaEqualTo(String value) {
            addCriterion("shangjia =", value, "shangjia");
            return (Criteria) this;
        }

        public Criteria andShangjiaNotEqualTo(String value) {
            addCriterion("shangjia <>", value, "shangjia");
            return (Criteria) this;
        }

        public Criteria andShangjiaGreaterThan(String value) {
            addCriterion("shangjia >", value, "shangjia");
            return (Criteria) this;
        }

        public Criteria andShangjiaGreaterThanOrEqualTo(String value) {
            addCriterion("shangjia >=", value, "shangjia");
            return (Criteria) this;
        }

        public Criteria andShangjiaLessThan(String value) {
            addCriterion("shangjia <", value, "shangjia");
            return (Criteria) this;
        }

        public Criteria andShangjiaLessThanOrEqualTo(String value) {
            addCriterion("shangjia <=", value, "shangjia");
            return (Criteria) this;
        }

        public Criteria andShangjiaLike(String value) {
            addCriterion("shangjia like", value, "shangjia");
            return (Criteria) this;
        }

        public Criteria andShangjiaNotLike(String value) {
            addCriterion("shangjia not like", value, "shangjia");
            return (Criteria) this;
        }

        public Criteria andShangjiaIn(List<String> values) {
            addCriterion("shangjia in", values, "shangjia");
            return (Criteria) this;
        }

        public Criteria andShangjiaNotIn(List<String> values) {
            addCriterion("shangjia not in", values, "shangjia");
            return (Criteria) this;
        }

        public Criteria andShangjiaBetween(String value1, String value2) {
            addCriterion("shangjia between", value1, value2, "shangjia");
            return (Criteria) this;
        }

        public Criteria andShangjiaNotBetween(String value1, String value2) {
            addCriterion("shangjia not between", value1, value2, "shangjia");
            return (Criteria) this;
        }

        public Criteria andShangjiaidIsNull() {
            addCriterion("shangjiaid is null");
            return (Criteria) this;
        }

        public Criteria andShangjiaidIsNotNull() {
            addCriterion("shangjiaid is not null");
            return (Criteria) this;
        }

        public Criteria andShangjiaidEqualTo(Integer value) {
            addCriterion("shangjiaid =", value, "shangjiaid");
            return (Criteria) this;
        }

        public Criteria andShangjiaidNotEqualTo(Integer value) {
            addCriterion("shangjiaid <>", value, "shangjiaid");
            return (Criteria) this;
        }

        public Criteria andShangjiaidGreaterThan(Integer value) {
            addCriterion("shangjiaid >", value, "shangjiaid");
            return (Criteria) this;
        }

        public Criteria andShangjiaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shangjiaid >=", value, "shangjiaid");
            return (Criteria) this;
        }

        public Criteria andShangjiaidLessThan(Integer value) {
            addCriterion("shangjiaid <", value, "shangjiaid");
            return (Criteria) this;
        }

        public Criteria andShangjiaidLessThanOrEqualTo(Integer value) {
            addCriterion("shangjiaid <=", value, "shangjiaid");
            return (Criteria) this;
        }

        public Criteria andShangjiaidIn(List<Integer> values) {
            addCriterion("shangjiaid in", values, "shangjiaid");
            return (Criteria) this;
        }

        public Criteria andShangjiaidNotIn(List<Integer> values) {
            addCriterion("shangjiaid not in", values, "shangjiaid");
            return (Criteria) this;
        }

        public Criteria andShangjiaidBetween(Integer value1, Integer value2) {
            addCriterion("shangjiaid between", value1, value2, "shangjiaid");
            return (Criteria) this;
        }

        public Criteria andShangjiaidNotBetween(Integer value1, Integer value2) {
            addCriterion("shangjiaid not between", value1, value2, "shangjiaid");
            return (Criteria) this;
        }

        public Criteria andTupianIsNull() {
            addCriterion("tupian is null");
            return (Criteria) this;
        }

        public Criteria andTupianIsNotNull() {
            addCriterion("tupian is not null");
            return (Criteria) this;
        }

        public Criteria andTupianEqualTo(String value) {
            addCriterion("tupian =", value, "tupian");
            return (Criteria) this;
        }

        public Criteria andTupianNotEqualTo(String value) {
            addCriterion("tupian <>", value, "tupian");
            return (Criteria) this;
        }

        public Criteria andTupianGreaterThan(String value) {
            addCriterion("tupian >", value, "tupian");
            return (Criteria) this;
        }

        public Criteria andTupianGreaterThanOrEqualTo(String value) {
            addCriterion("tupian >=", value, "tupian");
            return (Criteria) this;
        }

        public Criteria andTupianLessThan(String value) {
            addCriterion("tupian <", value, "tupian");
            return (Criteria) this;
        }

        public Criteria andTupianLessThanOrEqualTo(String value) {
            addCriterion("tupian <=", value, "tupian");
            return (Criteria) this;
        }

        public Criteria andTupianLike(String value) {
            addCriterion("tupian like", value, "tupian");
            return (Criteria) this;
        }

        public Criteria andTupianNotLike(String value) {
            addCriterion("tupian not like", value, "tupian");
            return (Criteria) this;
        }

        public Criteria andTupianIn(List<String> values) {
            addCriterion("tupian in", values, "tupian");
            return (Criteria) this;
        }

        public Criteria andTupianNotIn(List<String> values) {
            addCriterion("tupian not in", values, "tupian");
            return (Criteria) this;
        }

        public Criteria andTupianBetween(String value1, String value2) {
            addCriterion("tupian between", value1, value2, "tupian");
            return (Criteria) this;
        }

        public Criteria andTupianNotBetween(String value1, String value2) {
            addCriterion("tupian not between", value1, value2, "tupian");
            return (Criteria) this;
        }

        public Criteria andXdcsIsNull() {
            addCriterion("xdcs is null");
            return (Criteria) this;
        }

        public Criteria andXdcsIsNotNull() {
            addCriterion("xdcs is not null");
            return (Criteria) this;
        }

        public Criteria andXdcsEqualTo(String value) {
            addCriterion("xdcs =", value, "xdcs");
            return (Criteria) this;
        }

        public Criteria andXdcsNotEqualTo(String value) {
            addCriterion("xdcs <>", value, "xdcs");
            return (Criteria) this;
        }

        public Criteria andXdcsGreaterThan(String value) {
            addCriterion("xdcs >", value, "xdcs");
            return (Criteria) this;
        }

        public Criteria andXdcsGreaterThanOrEqualTo(String value) {
            addCriterion("xdcs >=", value, "xdcs");
            return (Criteria) this;
        }

        public Criteria andXdcsLessThan(String value) {
            addCriterion("xdcs <", value, "xdcs");
            return (Criteria) this;
        }

        public Criteria andXdcsLessThanOrEqualTo(String value) {
            addCriterion("xdcs <=", value, "xdcs");
            return (Criteria) this;
        }

        public Criteria andXdcsLike(String value) {
            addCriterion("xdcs like", value, "xdcs");
            return (Criteria) this;
        }

        public Criteria andXdcsNotLike(String value) {
            addCriterion("xdcs not like", value, "xdcs");
            return (Criteria) this;
        }

        public Criteria andXdcsIn(List<String> values) {
            addCriterion("xdcs in", values, "xdcs");
            return (Criteria) this;
        }

        public Criteria andXdcsNotIn(List<String> values) {
            addCriterion("xdcs not in", values, "xdcs");
            return (Criteria) this;
        }

        public Criteria andXdcsBetween(String value1, String value2) {
            addCriterion("xdcs between", value1, value2, "xdcs");
            return (Criteria) this;
        }

        public Criteria andXdcsNotBetween(String value1, String value2) {
            addCriterion("xdcs not between", value1, value2, "xdcs");
            return (Criteria) this;
        }

        public Criteria andLlcsIsNull() {
            addCriterion("llcs is null");
            return (Criteria) this;
        }

        public Criteria andLlcsIsNotNull() {
            addCriterion("llcs is not null");
            return (Criteria) this;
        }

        public Criteria andLlcsEqualTo(String value) {
            addCriterion("llcs =", value, "llcs");
            return (Criteria) this;
        }

        public Criteria andLlcsNotEqualTo(String value) {
            addCriterion("llcs <>", value, "llcs");
            return (Criteria) this;
        }

        public Criteria andLlcsGreaterThan(String value) {
            addCriterion("llcs >", value, "llcs");
            return (Criteria) this;
        }

        public Criteria andLlcsGreaterThanOrEqualTo(String value) {
            addCriterion("llcs >=", value, "llcs");
            return (Criteria) this;
        }

        public Criteria andLlcsLessThan(String value) {
            addCriterion("llcs <", value, "llcs");
            return (Criteria) this;
        }

        public Criteria andLlcsLessThanOrEqualTo(String value) {
            addCriterion("llcs <=", value, "llcs");
            return (Criteria) this;
        }

        public Criteria andLlcsLike(String value) {
            addCriterion("llcs like", value, "llcs");
            return (Criteria) this;
        }

        public Criteria andLlcsNotLike(String value) {
            addCriterion("llcs not like", value, "llcs");
            return (Criteria) this;
        }

        public Criteria andLlcsIn(List<String> values) {
            addCriterion("llcs in", values, "llcs");
            return (Criteria) this;
        }

        public Criteria andLlcsNotIn(List<String> values) {
            addCriterion("llcs not in", values, "llcs");
            return (Criteria) this;
        }

        public Criteria andLlcsBetween(String value1, String value2) {
            addCriterion("llcs between", value1, value2, "llcs");
            return (Criteria) this;
        }

        public Criteria andLlcsNotBetween(String value1, String value2) {
            addCriterion("llcs not between", value1, value2, "llcs");
            return (Criteria) this;
        }

        public Criteria andJianjieIsNull() {
            addCriterion("jianjie is null");
            return (Criteria) this;
        }

        public Criteria andJianjieIsNotNull() {
            addCriterion("jianjie is not null");
            return (Criteria) this;
        }

        public Criteria andJianjieEqualTo(String value) {
            addCriterion("jianjie =", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieNotEqualTo(String value) {
            addCriterion("jianjie <>", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieGreaterThan(String value) {
            addCriterion("jianjie >", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieGreaterThanOrEqualTo(String value) {
            addCriterion("jianjie >=", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieLessThan(String value) {
            addCriterion("jianjie <", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieLessThanOrEqualTo(String value) {
            addCriterion("jianjie <=", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieLike(String value) {
            addCriterion("jianjie like", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieNotLike(String value) {
            addCriterion("jianjie not like", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieIn(List<String> values) {
            addCriterion("jianjie in", values, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieNotIn(List<String> values) {
            addCriterion("jianjie not in", values, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieBetween(String value1, String value2) {
            addCriterion("jianjie between", value1, value2, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieNotBetween(String value1, String value2) {
            addCriterion("jianjie not between", value1, value2, "jianjie");
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