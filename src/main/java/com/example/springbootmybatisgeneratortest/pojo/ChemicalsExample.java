package com.example.springbootmybatisgeneratortest.pojo;

import java.util.ArrayList;
import java.util.List;

public class ChemicalsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChemicalsExample() {
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

        public Criteria andChemicalsIdIsNull() {
            addCriterion("chemicals_id is null");
            return (Criteria) this;
        }

        public Criteria andChemicalsIdIsNotNull() {
            addCriterion("chemicals_id is not null");
            return (Criteria) this;
        }

        public Criteria andChemicalsIdEqualTo(Integer value) {
            addCriterion("chemicals_id =", value, "chemicalsId");
            return (Criteria) this;
        }

        public Criteria andChemicalsIdNotEqualTo(Integer value) {
            addCriterion("chemicals_id <>", value, "chemicalsId");
            return (Criteria) this;
        }

        public Criteria andChemicalsIdGreaterThan(Integer value) {
            addCriterion("chemicals_id >", value, "chemicalsId");
            return (Criteria) this;
        }

        public Criteria andChemicalsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chemicals_id >=", value, "chemicalsId");
            return (Criteria) this;
        }

        public Criteria andChemicalsIdLessThan(Integer value) {
            addCriterion("chemicals_id <", value, "chemicalsId");
            return (Criteria) this;
        }

        public Criteria andChemicalsIdLessThanOrEqualTo(Integer value) {
            addCriterion("chemicals_id <=", value, "chemicalsId");
            return (Criteria) this;
        }

        public Criteria andChemicalsIdIn(List<Integer> values) {
            addCriterion("chemicals_id in", values, "chemicalsId");
            return (Criteria) this;
        }

        public Criteria andChemicalsIdNotIn(List<Integer> values) {
            addCriterion("chemicals_id not in", values, "chemicalsId");
            return (Criteria) this;
        }

        public Criteria andChemicalsIdBetween(Integer value1, Integer value2) {
            addCriterion("chemicals_id between", value1, value2, "chemicalsId");
            return (Criteria) this;
        }

        public Criteria andChemicalsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chemicals_id not between", value1, value2, "chemicalsId");
            return (Criteria) this;
        }

        public Criteria andGrowIdIsNull() {
            addCriterion("grow_id is null");
            return (Criteria) this;
        }

        public Criteria andGrowIdIsNotNull() {
            addCriterion("grow_id is not null");
            return (Criteria) this;
        }

        public Criteria andGrowIdEqualTo(Integer value) {
            addCriterion("grow_id =", value, "growId");
            return (Criteria) this;
        }

        public Criteria andGrowIdNotEqualTo(Integer value) {
            addCriterion("grow_id <>", value, "growId");
            return (Criteria) this;
        }

        public Criteria andGrowIdGreaterThan(Integer value) {
            addCriterion("grow_id >", value, "growId");
            return (Criteria) this;
        }

        public Criteria andGrowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grow_id >=", value, "growId");
            return (Criteria) this;
        }

        public Criteria andGrowIdLessThan(Integer value) {
            addCriterion("grow_id <", value, "growId");
            return (Criteria) this;
        }

        public Criteria andGrowIdLessThanOrEqualTo(Integer value) {
            addCriterion("grow_id <=", value, "growId");
            return (Criteria) this;
        }

        public Criteria andGrowIdIn(List<Integer> values) {
            addCriterion("grow_id in", values, "growId");
            return (Criteria) this;
        }

        public Criteria andGrowIdNotIn(List<Integer> values) {
            addCriterion("grow_id not in", values, "growId");
            return (Criteria) this;
        }

        public Criteria andGrowIdBetween(Integer value1, Integer value2) {
            addCriterion("grow_id between", value1, value2, "growId");
            return (Criteria) this;
        }

        public Criteria andGrowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grow_id not between", value1, value2, "growId");
            return (Criteria) this;
        }

        public Criteria andUseDateIsNull() {
            addCriterion("use_date is null");
            return (Criteria) this;
        }

        public Criteria andUseDateIsNotNull() {
            addCriterion("use_date is not null");
            return (Criteria) this;
        }

        public Criteria andUseDateEqualTo(String value) {
            addCriterion("use_date =", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateNotEqualTo(String value) {
            addCriterion("use_date <>", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateGreaterThan(String value) {
            addCriterion("use_date >", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateGreaterThanOrEqualTo(String value) {
            addCriterion("use_date >=", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateLessThan(String value) {
            addCriterion("use_date <", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateLessThanOrEqualTo(String value) {
            addCriterion("use_date <=", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateLike(String value) {
            addCriterion("use_date like", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateNotLike(String value) {
            addCriterion("use_date not like", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateIn(List<String> values) {
            addCriterion("use_date in", values, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateNotIn(List<String> values) {
            addCriterion("use_date not in", values, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateBetween(String value1, String value2) {
            addCriterion("use_date between", value1, value2, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateNotBetween(String value1, String value2) {
            addCriterion("use_date not between", value1, value2, "useDate");
            return (Criteria) this;
        }

        public Criteria andFormulaIsNull() {
            addCriterion("formula is null");
            return (Criteria) this;
        }

        public Criteria andFormulaIsNotNull() {
            addCriterion("formula is not null");
            return (Criteria) this;
        }

        public Criteria andFormulaEqualTo(String value) {
            addCriterion("formula =", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaNotEqualTo(String value) {
            addCriterion("formula <>", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaGreaterThan(String value) {
            addCriterion("formula >", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaGreaterThanOrEqualTo(String value) {
            addCriterion("formula >=", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaLessThan(String value) {
            addCriterion("formula <", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaLessThanOrEqualTo(String value) {
            addCriterion("formula <=", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaLike(String value) {
            addCriterion("formula like", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaNotLike(String value) {
            addCriterion("formula not like", value, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaIn(List<String> values) {
            addCriterion("formula in", values, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaNotIn(List<String> values) {
            addCriterion("formula not in", values, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaBetween(String value1, String value2) {
            addCriterion("formula between", value1, value2, "formula");
            return (Criteria) this;
        }

        public Criteria andFormulaNotBetween(String value1, String value2) {
            addCriterion("formula not between", value1, value2, "formula");
            return (Criteria) this;
        }

        public Criteria andDosageIsNull() {
            addCriterion("dosage is null");
            return (Criteria) this;
        }

        public Criteria andDosageIsNotNull() {
            addCriterion("dosage is not null");
            return (Criteria) this;
        }

        public Criteria andDosageEqualTo(Double value) {
            addCriterion("dosage =", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotEqualTo(Double value) {
            addCriterion("dosage <>", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageGreaterThan(Double value) {
            addCriterion("dosage >", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageGreaterThanOrEqualTo(Double value) {
            addCriterion("dosage >=", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageLessThan(Double value) {
            addCriterion("dosage <", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageLessThanOrEqualTo(Double value) {
            addCriterion("dosage <=", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageIn(List<Double> values) {
            addCriterion("dosage in", values, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotIn(List<Double> values) {
            addCriterion("dosage not in", values, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageBetween(Double value1, Double value2) {
            addCriterion("dosage between", value1, value2, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotBetween(Double value1, Double value2) {
            addCriterion("dosage not between", value1, value2, "dosage");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("flag not between", value1, value2, "flag");
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