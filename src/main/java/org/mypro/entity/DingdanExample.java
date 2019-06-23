package org.mypro.entity;

import java.util.ArrayList;
import java.util.List;

public class DingdanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DingdanExample() {
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

        public Criteria andZhuangtaiIsNull() {
            addCriterion("zhuangtai is null");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiIsNotNull() {
            addCriterion("zhuangtai is not null");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiEqualTo(String value) {
            addCriterion("zhuangtai =", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotEqualTo(String value) {
            addCriterion("zhuangtai <>", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiGreaterThan(String value) {
            addCriterion("zhuangtai >", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiGreaterThanOrEqualTo(String value) {
            addCriterion("zhuangtai >=", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiLessThan(String value) {
            addCriterion("zhuangtai <", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiLessThanOrEqualTo(String value) {
            addCriterion("zhuangtai <=", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiLike(String value) {
            addCriterion("zhuangtai like", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotLike(String value) {
            addCriterion("zhuangtai not like", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiIn(List<String> values) {
            addCriterion("zhuangtai in", values, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotIn(List<String> values) {
            addCriterion("zhuangtai not in", values, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiBetween(String value1, String value2) {
            addCriterion("zhuangtai between", value1, value2, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotBetween(String value1, String value2) {
            addCriterion("zhuangtai not between", value1, value2, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andShijianIsNull() {
            addCriterion("shijian is null");
            return (Criteria) this;
        }

        public Criteria andShijianIsNotNull() {
            addCriterion("shijian is not null");
            return (Criteria) this;
        }

        public Criteria andShijianEqualTo(String value) {
            addCriterion("shijian =", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianNotEqualTo(String value) {
            addCriterion("shijian <>", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianGreaterThan(String value) {
            addCriterion("shijian >", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianGreaterThanOrEqualTo(String value) {
            addCriterion("shijian >=", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianLessThan(String value) {
            addCriterion("shijian <", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianLessThanOrEqualTo(String value) {
            addCriterion("shijian <=", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianLike(String value) {
            addCriterion("shijian like", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianNotLike(String value) {
            addCriterion("shijian not like", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianIn(List<String> values) {
            addCriterion("shijian in", values, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianNotIn(List<String> values) {
            addCriterion("shijian not in", values, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianBetween(String value1, String value2) {
            addCriterion("shijian between", value1, value2, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianNotBetween(String value1, String value2) {
            addCriterion("shijian not between", value1, value2, "shijian");
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