package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class TypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TypeExample() {
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

        public Criteria andTypesignIsNull() {
            addCriterion("typesign is null");
            return (Criteria) this;
        }

        public Criteria andTypesignIsNotNull() {
            addCriterion("typesign is not null");
            return (Criteria) this;
        }

        public Criteria andTypesignEqualTo(Integer value) {
            addCriterion("typesign =", value, "typesign");
            return (Criteria) this;
        }

        public Criteria andTypesignNotEqualTo(Integer value) {
            addCriterion("typesign <>", value, "typesign");
            return (Criteria) this;
        }

        public Criteria andTypesignGreaterThan(Integer value) {
            addCriterion("typesign >", value, "typesign");
            return (Criteria) this;
        }

        public Criteria andTypesignGreaterThanOrEqualTo(Integer value) {
            addCriterion("typesign >=", value, "typesign");
            return (Criteria) this;
        }

        public Criteria andTypesignLessThan(Integer value) {
            addCriterion("typesign <", value, "typesign");
            return (Criteria) this;
        }

        public Criteria andTypesignLessThanOrEqualTo(Integer value) {
            addCriterion("typesign <=", value, "typesign");
            return (Criteria) this;
        }

        public Criteria andTypesignIn(List<Integer> values) {
            addCriterion("typesign in", values, "typesign");
            return (Criteria) this;
        }

        public Criteria andTypesignNotIn(List<Integer> values) {
            addCriterion("typesign not in", values, "typesign");
            return (Criteria) this;
        }

        public Criteria andTypesignBetween(Integer value1, Integer value2) {
            addCriterion("typesign between", value1, value2, "typesign");
            return (Criteria) this;
        }

        public Criteria andTypesignNotBetween(Integer value1, Integer value2) {
            addCriterion("typesign not between", value1, value2, "typesign");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNull() {
            addCriterion("typename is null");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNotNull() {
            addCriterion("typename is not null");
            return (Criteria) this;
        }

        public Criteria andTypenameEqualTo(String value) {
            addCriterion("typename =", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotEqualTo(String value) {
            addCriterion("typename <>", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThan(String value) {
            addCriterion("typename >", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("typename >=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThan(String value) {
            addCriterion("typename <", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThanOrEqualTo(String value) {
            addCriterion("typename <=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLike(String value) {
            addCriterion("typename like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotLike(String value) {
            addCriterion("typename not like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameIn(List<String> values) {
            addCriterion("typename in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotIn(List<String> values) {
            addCriterion("typename not in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameBetween(String value1, String value2) {
            addCriterion("typename between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotBetween(String value1, String value2) {
            addCriterion("typename not between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andTypeintroIsNull() {
            addCriterion("typeintro is null");
            return (Criteria) this;
        }

        public Criteria andTypeintroIsNotNull() {
            addCriterion("typeintro is not null");
            return (Criteria) this;
        }

        public Criteria andTypeintroEqualTo(String value) {
            addCriterion("typeintro =", value, "typeintro");
            return (Criteria) this;
        }

        public Criteria andTypeintroNotEqualTo(String value) {
            addCriterion("typeintro <>", value, "typeintro");
            return (Criteria) this;
        }

        public Criteria andTypeintroGreaterThan(String value) {
            addCriterion("typeintro >", value, "typeintro");
            return (Criteria) this;
        }

        public Criteria andTypeintroGreaterThanOrEqualTo(String value) {
            addCriterion("typeintro >=", value, "typeintro");
            return (Criteria) this;
        }

        public Criteria andTypeintroLessThan(String value) {
            addCriterion("typeintro <", value, "typeintro");
            return (Criteria) this;
        }

        public Criteria andTypeintroLessThanOrEqualTo(String value) {
            addCriterion("typeintro <=", value, "typeintro");
            return (Criteria) this;
        }

        public Criteria andTypeintroLike(String value) {
            addCriterion("typeintro like", value, "typeintro");
            return (Criteria) this;
        }

        public Criteria andTypeintroNotLike(String value) {
            addCriterion("typeintro not like", value, "typeintro");
            return (Criteria) this;
        }

        public Criteria andTypeintroIn(List<String> values) {
            addCriterion("typeintro in", values, "typeintro");
            return (Criteria) this;
        }

        public Criteria andTypeintroNotIn(List<String> values) {
            addCriterion("typeintro not in", values, "typeintro");
            return (Criteria) this;
        }

        public Criteria andTypeintroBetween(String value1, String value2) {
            addCriterion("typeintro between", value1, value2, "typeintro");
            return (Criteria) this;
        }

        public Criteria andTypeintroNotBetween(String value1, String value2) {
            addCriterion("typeintro not between", value1, value2, "typeintro");
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