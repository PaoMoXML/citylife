package com.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InfoExample() {
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

        public Criteria andInfotypeIsNull() {
            addCriterion("infotype is null");
            return (Criteria) this;
        }

        public Criteria andInfotypeIsNotNull() {
            addCriterion("infotype is not null");
            return (Criteria) this;
        }

        public Criteria andInfotypeEqualTo(Integer value) {
            addCriterion("infotype =", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeNotEqualTo(Integer value) {
            addCriterion("infotype <>", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeGreaterThan(Integer value) {
            addCriterion("infotype >", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("infotype >=", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeLessThan(Integer value) {
            addCriterion("infotype <", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeLessThanOrEqualTo(Integer value) {
            addCriterion("infotype <=", value, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeIn(List<Integer> values) {
            addCriterion("infotype in", values, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeNotIn(List<Integer> values) {
            addCriterion("infotype not in", values, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeBetween(Integer value1, Integer value2) {
            addCriterion("infotype between", value1, value2, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotypeNotBetween(Integer value1, Integer value2) {
            addCriterion("infotype not between", value1, value2, "infotype");
            return (Criteria) this;
        }

        public Criteria andInfotitleIsNull() {
            addCriterion("infotitle is null");
            return (Criteria) this;
        }

        public Criteria andInfotitleIsNotNull() {
            addCriterion("infotitle is not null");
            return (Criteria) this;
        }

        public Criteria andInfotitleEqualTo(String value) {
            addCriterion("infotitle =", value, "infotitle");
            return (Criteria) this;
        }

        public Criteria andInfotitleNotEqualTo(String value) {
            addCriterion("infotitle <>", value, "infotitle");
            return (Criteria) this;
        }

        public Criteria andInfotitleGreaterThan(String value) {
            addCriterion("infotitle >", value, "infotitle");
            return (Criteria) this;
        }

        public Criteria andInfotitleGreaterThanOrEqualTo(String value) {
            addCriterion("infotitle >=", value, "infotitle");
            return (Criteria) this;
        }

        public Criteria andInfotitleLessThan(String value) {
            addCriterion("infotitle <", value, "infotitle");
            return (Criteria) this;
        }

        public Criteria andInfotitleLessThanOrEqualTo(String value) {
            addCriterion("infotitle <=", value, "infotitle");
            return (Criteria) this;
        }

        public Criteria andInfotitleLike(String value) {
            addCriterion("infotitle like", value, "infotitle");
            return (Criteria) this;
        }

        public Criteria andInfotitleNotLike(String value) {
            addCriterion("infotitle not like", value, "infotitle");
            return (Criteria) this;
        }

        public Criteria andInfotitleIn(List<String> values) {
            addCriterion("infotitle in", values, "infotitle");
            return (Criteria) this;
        }

        public Criteria andInfotitleNotIn(List<String> values) {
            addCriterion("infotitle not in", values, "infotitle");
            return (Criteria) this;
        }

        public Criteria andInfotitleBetween(String value1, String value2) {
            addCriterion("infotitle between", value1, value2, "infotitle");
            return (Criteria) this;
        }

        public Criteria andInfotitleNotBetween(String value1, String value2) {
            addCriterion("infotitle not between", value1, value2, "infotitle");
            return (Criteria) this;
        }

        public Criteria andInfocontentIsNull() {
            addCriterion("infocontent is null");
            return (Criteria) this;
        }

        public Criteria andInfocontentIsNotNull() {
            addCriterion("infocontent is not null");
            return (Criteria) this;
        }

        public Criteria andInfocontentEqualTo(String value) {
            addCriterion("infocontent =", value, "infocontent");
            return (Criteria) this;
        }

        public Criteria andInfocontentNotEqualTo(String value) {
            addCriterion("infocontent <>", value, "infocontent");
            return (Criteria) this;
        }

        public Criteria andInfocontentGreaterThan(String value) {
            addCriterion("infocontent >", value, "infocontent");
            return (Criteria) this;
        }

        public Criteria andInfocontentGreaterThanOrEqualTo(String value) {
            addCriterion("infocontent >=", value, "infocontent");
            return (Criteria) this;
        }

        public Criteria andInfocontentLessThan(String value) {
            addCriterion("infocontent <", value, "infocontent");
            return (Criteria) this;
        }

        public Criteria andInfocontentLessThanOrEqualTo(String value) {
            addCriterion("infocontent <=", value, "infocontent");
            return (Criteria) this;
        }

        public Criteria andInfocontentLike(String value) {
            addCriterion("infocontent like", value, "infocontent");
            return (Criteria) this;
        }

        public Criteria andInfocontentNotLike(String value) {
            addCriterion("infocontent not like", value, "infocontent");
            return (Criteria) this;
        }

        public Criteria andInfocontentIn(List<String> values) {
            addCriterion("infocontent in", values, "infocontent");
            return (Criteria) this;
        }

        public Criteria andInfocontentNotIn(List<String> values) {
            addCriterion("infocontent not in", values, "infocontent");
            return (Criteria) this;
        }

        public Criteria andInfocontentBetween(String value1, String value2) {
            addCriterion("infocontent between", value1, value2, "infocontent");
            return (Criteria) this;
        }

        public Criteria andInfocontentNotBetween(String value1, String value2) {
            addCriterion("infocontent not between", value1, value2, "infocontent");
            return (Criteria) this;
        }

        public Criteria andInfolinkmanIsNull() {
            addCriterion("infolinkman is null");
            return (Criteria) this;
        }

        public Criteria andInfolinkmanIsNotNull() {
            addCriterion("infolinkman is not null");
            return (Criteria) this;
        }

        public Criteria andInfolinkmanEqualTo(String value) {
            addCriterion("infolinkman =", value, "infolinkman");
            return (Criteria) this;
        }

        public Criteria andInfolinkmanNotEqualTo(String value) {
            addCriterion("infolinkman <>", value, "infolinkman");
            return (Criteria) this;
        }

        public Criteria andInfolinkmanGreaterThan(String value) {
            addCriterion("infolinkman >", value, "infolinkman");
            return (Criteria) this;
        }

        public Criteria andInfolinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("infolinkman >=", value, "infolinkman");
            return (Criteria) this;
        }

        public Criteria andInfolinkmanLessThan(String value) {
            addCriterion("infolinkman <", value, "infolinkman");
            return (Criteria) this;
        }

        public Criteria andInfolinkmanLessThanOrEqualTo(String value) {
            addCriterion("infolinkman <=", value, "infolinkman");
            return (Criteria) this;
        }

        public Criteria andInfolinkmanLike(String value) {
            addCriterion("infolinkman like", value, "infolinkman");
            return (Criteria) this;
        }

        public Criteria andInfolinkmanNotLike(String value) {
            addCriterion("infolinkman not like", value, "infolinkman");
            return (Criteria) this;
        }

        public Criteria andInfolinkmanIn(List<String> values) {
            addCriterion("infolinkman in", values, "infolinkman");
            return (Criteria) this;
        }

        public Criteria andInfolinkmanNotIn(List<String> values) {
            addCriterion("infolinkman not in", values, "infolinkman");
            return (Criteria) this;
        }

        public Criteria andInfolinkmanBetween(String value1, String value2) {
            addCriterion("infolinkman between", value1, value2, "infolinkman");
            return (Criteria) this;
        }

        public Criteria andInfolinkmanNotBetween(String value1, String value2) {
            addCriterion("infolinkman not between", value1, value2, "infolinkman");
            return (Criteria) this;
        }

        public Criteria andInfophoneIsNull() {
            addCriterion("infophone is null");
            return (Criteria) this;
        }

        public Criteria andInfophoneIsNotNull() {
            addCriterion("infophone is not null");
            return (Criteria) this;
        }

        public Criteria andInfophoneEqualTo(String value) {
            addCriterion("infophone =", value, "infophone");
            return (Criteria) this;
        }

        public Criteria andInfophoneNotEqualTo(String value) {
            addCriterion("infophone <>", value, "infophone");
            return (Criteria) this;
        }

        public Criteria andInfophoneGreaterThan(String value) {
            addCriterion("infophone >", value, "infophone");
            return (Criteria) this;
        }

        public Criteria andInfophoneGreaterThanOrEqualTo(String value) {
            addCriterion("infophone >=", value, "infophone");
            return (Criteria) this;
        }

        public Criteria andInfophoneLessThan(String value) {
            addCriterion("infophone <", value, "infophone");
            return (Criteria) this;
        }

        public Criteria andInfophoneLessThanOrEqualTo(String value) {
            addCriterion("infophone <=", value, "infophone");
            return (Criteria) this;
        }

        public Criteria andInfophoneLike(String value) {
            addCriterion("infophone like", value, "infophone");
            return (Criteria) this;
        }

        public Criteria andInfophoneNotLike(String value) {
            addCriterion("infophone not like", value, "infophone");
            return (Criteria) this;
        }

        public Criteria andInfophoneIn(List<String> values) {
            addCriterion("infophone in", values, "infophone");
            return (Criteria) this;
        }

        public Criteria andInfophoneNotIn(List<String> values) {
            addCriterion("infophone not in", values, "infophone");
            return (Criteria) this;
        }

        public Criteria andInfophoneBetween(String value1, String value2) {
            addCriterion("infophone between", value1, value2, "infophone");
            return (Criteria) this;
        }

        public Criteria andInfophoneNotBetween(String value1, String value2) {
            addCriterion("infophone not between", value1, value2, "infophone");
            return (Criteria) this;
        }

        public Criteria andInfoemailIsNull() {
            addCriterion("infoemail is null");
            return (Criteria) this;
        }

        public Criteria andInfoemailIsNotNull() {
            addCriterion("infoemail is not null");
            return (Criteria) this;
        }

        public Criteria andInfoemailEqualTo(String value) {
            addCriterion("infoemail =", value, "infoemail");
            return (Criteria) this;
        }

        public Criteria andInfoemailNotEqualTo(String value) {
            addCriterion("infoemail <>", value, "infoemail");
            return (Criteria) this;
        }

        public Criteria andInfoemailGreaterThan(String value) {
            addCriterion("infoemail >", value, "infoemail");
            return (Criteria) this;
        }

        public Criteria andInfoemailGreaterThanOrEqualTo(String value) {
            addCriterion("infoemail >=", value, "infoemail");
            return (Criteria) this;
        }

        public Criteria andInfoemailLessThan(String value) {
            addCriterion("infoemail <", value, "infoemail");
            return (Criteria) this;
        }

        public Criteria andInfoemailLessThanOrEqualTo(String value) {
            addCriterion("infoemail <=", value, "infoemail");
            return (Criteria) this;
        }

        public Criteria andInfoemailLike(String value) {
            addCriterion("infoemail like", value, "infoemail");
            return (Criteria) this;
        }

        public Criteria andInfoemailNotLike(String value) {
            addCriterion("infoemail not like", value, "infoemail");
            return (Criteria) this;
        }

        public Criteria andInfoemailIn(List<String> values) {
            addCriterion("infoemail in", values, "infoemail");
            return (Criteria) this;
        }

        public Criteria andInfoemailNotIn(List<String> values) {
            addCriterion("infoemail not in", values, "infoemail");
            return (Criteria) this;
        }

        public Criteria andInfoemailBetween(String value1, String value2) {
            addCriterion("infoemail between", value1, value2, "infoemail");
            return (Criteria) this;
        }

        public Criteria andInfoemailNotBetween(String value1, String value2) {
            addCriterion("infoemail not between", value1, value2, "infoemail");
            return (Criteria) this;
        }

        public Criteria andInfodateIsNull() {
            addCriterion("infodate is null");
            return (Criteria) this;
        }

        public Criteria andInfodateIsNotNull() {
            addCriterion("infodate is not null");
            return (Criteria) this;
        }

        public Criteria andInfodateEqualTo(Date value) {
            addCriterion("infodate =", value, "infodate");
            return (Criteria) this;
        }

        public Criteria andInfodateNotEqualTo(Date value) {
            addCriterion("infodate <>", value, "infodate");
            return (Criteria) this;
        }

        public Criteria andInfodateGreaterThan(Date value) {
            addCriterion("infodate >", value, "infodate");
            return (Criteria) this;
        }

        public Criteria andInfodateGreaterThanOrEqualTo(Date value) {
            addCriterion("infodate >=", value, "infodate");
            return (Criteria) this;
        }

        public Criteria andInfodateLessThan(Date value) {
            addCriterion("infodate <", value, "infodate");
            return (Criteria) this;
        }

        public Criteria andInfodateLessThanOrEqualTo(Date value) {
            addCriterion("infodate <=", value, "infodate");
            return (Criteria) this;
        }

        public Criteria andInfodateIn(List<Date> values) {
            addCriterion("infodate in", values, "infodate");
            return (Criteria) this;
        }

        public Criteria andInfodateNotIn(List<Date> values) {
            addCriterion("infodate not in", values, "infodate");
            return (Criteria) this;
        }

        public Criteria andInfodateBetween(Date value1, Date value2) {
            addCriterion("infodate between", value1, value2, "infodate");
            return (Criteria) this;
        }

        public Criteria andInfodateNotBetween(Date value1, Date value2) {
            addCriterion("infodate not between", value1, value2, "infodate");
            return (Criteria) this;
        }

        public Criteria andInfocheckIsNull() {
            addCriterion("infocheck is null");
            return (Criteria) this;
        }

        public Criteria andInfocheckIsNotNull() {
            addCriterion("infocheck is not null");
            return (Criteria) this;
        }

        public Criteria andInfocheckEqualTo(String value) {
            addCriterion("infocheck =", value, "infocheck");
            return (Criteria) this;
        }

        public Criteria andInfocheckNotEqualTo(String value) {
            addCriterion("infocheck <>", value, "infocheck");
            return (Criteria) this;
        }

        public Criteria andInfocheckGreaterThan(String value) {
            addCriterion("infocheck >", value, "infocheck");
            return (Criteria) this;
        }

        public Criteria andInfocheckGreaterThanOrEqualTo(String value) {
            addCriterion("infocheck >=", value, "infocheck");
            return (Criteria) this;
        }

        public Criteria andInfocheckLessThan(String value) {
            addCriterion("infocheck <", value, "infocheck");
            return (Criteria) this;
        }

        public Criteria andInfocheckLessThanOrEqualTo(String value) {
            addCriterion("infocheck <=", value, "infocheck");
            return (Criteria) this;
        }

        public Criteria andInfocheckLike(String value) {
            addCriterion("infocheck like", value, "infocheck");
            return (Criteria) this;
        }

        public Criteria andInfocheckNotLike(String value) {
            addCriterion("infocheck not like", value, "infocheck");
            return (Criteria) this;
        }

        public Criteria andInfocheckIn(List<String> values) {
            addCriterion("infocheck in", values, "infocheck");
            return (Criteria) this;
        }

        public Criteria andInfocheckNotIn(List<String> values) {
            addCriterion("infocheck not in", values, "infocheck");
            return (Criteria) this;
        }

        public Criteria andInfocheckBetween(String value1, String value2) {
            addCriterion("infocheck between", value1, value2, "infocheck");
            return (Criteria) this;
        }

        public Criteria andInfocheckNotBetween(String value1, String value2) {
            addCriterion("infocheck not between", value1, value2, "infocheck");
            return (Criteria) this;
        }

        public Criteria andInfopayforIsNull() {
            addCriterion("infopayfor is null");
            return (Criteria) this;
        }

        public Criteria andInfopayforIsNotNull() {
            addCriterion("infopayfor is not null");
            return (Criteria) this;
        }

        public Criteria andInfopayforEqualTo(String value) {
            addCriterion("infopayfor =", value, "infopayfor");
            return (Criteria) this;
        }

        public Criteria andInfopayforNotEqualTo(String value) {
            addCriterion("infopayfor <>", value, "infopayfor");
            return (Criteria) this;
        }

        public Criteria andInfopayforGreaterThan(String value) {
            addCriterion("infopayfor >", value, "infopayfor");
            return (Criteria) this;
        }

        public Criteria andInfopayforGreaterThanOrEqualTo(String value) {
            addCriterion("infopayfor >=", value, "infopayfor");
            return (Criteria) this;
        }

        public Criteria andInfopayforLessThan(String value) {
            addCriterion("infopayfor <", value, "infopayfor");
            return (Criteria) this;
        }

        public Criteria andInfopayforLessThanOrEqualTo(String value) {
            addCriterion("infopayfor <=", value, "infopayfor");
            return (Criteria) this;
        }

        public Criteria andInfopayforLike(String value) {
            addCriterion("infopayfor like", value, "infopayfor");
            return (Criteria) this;
        }

        public Criteria andInfopayforNotLike(String value) {
            addCriterion("infopayfor not like", value, "infopayfor");
            return (Criteria) this;
        }

        public Criteria andInfopayforIn(List<String> values) {
            addCriterion("infopayfor in", values, "infopayfor");
            return (Criteria) this;
        }

        public Criteria andInfopayforNotIn(List<String> values) {
            addCriterion("infopayfor not in", values, "infopayfor");
            return (Criteria) this;
        }

        public Criteria andInfopayforBetween(String value1, String value2) {
            addCriterion("infopayfor between", value1, value2, "infopayfor");
            return (Criteria) this;
        }

        public Criteria andInfopayforNotBetween(String value1, String value2) {
            addCriterion("infopayfor not between", value1, value2, "infopayfor");
            return (Criteria) this;
        }

        public Criteria andInfostatusIsNull() {
            addCriterion("infostatus is null");
            return (Criteria) this;
        }

        public Criteria andInfostatusIsNotNull() {
            addCriterion("infostatus is not null");
            return (Criteria) this;
        }

        public Criteria andInfostatusEqualTo(String value) {
            addCriterion("infostatus =", value, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusNotEqualTo(String value) {
            addCriterion("infostatus <>", value, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusGreaterThan(String value) {
            addCriterion("infostatus >", value, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusGreaterThanOrEqualTo(String value) {
            addCriterion("infostatus >=", value, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusLessThan(String value) {
            addCriterion("infostatus <", value, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusLessThanOrEqualTo(String value) {
            addCriterion("infostatus <=", value, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusLike(String value) {
            addCriterion("infostatus like", value, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusNotLike(String value) {
            addCriterion("infostatus not like", value, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusIn(List<String> values) {
            addCriterion("infostatus in", values, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusNotIn(List<String> values) {
            addCriterion("infostatus not in", values, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusBetween(String value1, String value2) {
            addCriterion("infostatus between", value1, value2, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusNotBetween(String value1, String value2) {
            addCriterion("infostatus not between", value1, value2, "infostatus");
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