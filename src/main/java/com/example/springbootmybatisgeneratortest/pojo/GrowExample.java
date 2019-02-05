package com.example.springbootmybatisgeneratortest.pojo;

import java.util.ArrayList;
import java.util.List;

public class GrowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GrowExample() {
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

        public Criteria andGrowerIdIsNull() {
            addCriterion("grower_id is null");
            return (Criteria) this;
        }

        public Criteria andGrowerIdIsNotNull() {
            addCriterion("grower_id is not null");
            return (Criteria) this;
        }

        public Criteria andGrowerIdEqualTo(Integer value) {
            addCriterion("grower_id =", value, "growerId");
            return (Criteria) this;
        }

        public Criteria andGrowerIdNotEqualTo(Integer value) {
            addCriterion("grower_id <>", value, "growerId");
            return (Criteria) this;
        }

        public Criteria andGrowerIdGreaterThan(Integer value) {
            addCriterion("grower_id >", value, "growerId");
            return (Criteria) this;
        }

        public Criteria andGrowerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grower_id >=", value, "growerId");
            return (Criteria) this;
        }

        public Criteria andGrowerIdLessThan(Integer value) {
            addCriterion("grower_id <", value, "growerId");
            return (Criteria) this;
        }

        public Criteria andGrowerIdLessThanOrEqualTo(Integer value) {
            addCriterion("grower_id <=", value, "growerId");
            return (Criteria) this;
        }

        public Criteria andGrowerIdIn(List<Integer> values) {
            addCriterion("grower_id in", values, "growerId");
            return (Criteria) this;
        }

        public Criteria andGrowerIdNotIn(List<Integer> values) {
            addCriterion("grower_id not in", values, "growerId");
            return (Criteria) this;
        }

        public Criteria andGrowerIdBetween(Integer value1, Integer value2) {
            addCriterion("grower_id between", value1, value2, "growerId");
            return (Criteria) this;
        }

        public Criteria andGrowerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grower_id not between", value1, value2, "growerId");
            return (Criteria) this;
        }

        public Criteria andGrowerTimeIsNull() {
            addCriterion("grower_time is null");
            return (Criteria) this;
        }

        public Criteria andGrowerTimeIsNotNull() {
            addCriterion("grower_time is not null");
            return (Criteria) this;
        }

        public Criteria andGrowerTimeEqualTo(String value) {
            addCriterion("grower_time =", value, "growerTime");
            return (Criteria) this;
        }

        public Criteria andGrowerTimeNotEqualTo(String value) {
            addCriterion("grower_time <>", value, "growerTime");
            return (Criteria) this;
        }

        public Criteria andGrowerTimeGreaterThan(String value) {
            addCriterion("grower_time >", value, "growerTime");
            return (Criteria) this;
        }

        public Criteria andGrowerTimeGreaterThanOrEqualTo(String value) {
            addCriterion("grower_time >=", value, "growerTime");
            return (Criteria) this;
        }

        public Criteria andGrowerTimeLessThan(String value) {
            addCriterion("grower_time <", value, "growerTime");
            return (Criteria) this;
        }

        public Criteria andGrowerTimeLessThanOrEqualTo(String value) {
            addCriterion("grower_time <=", value, "growerTime");
            return (Criteria) this;
        }

        public Criteria andGrowerTimeLike(String value) {
            addCriterion("grower_time like", value, "growerTime");
            return (Criteria) this;
        }

        public Criteria andGrowerTimeNotLike(String value) {
            addCriterion("grower_time not like", value, "growerTime");
            return (Criteria) this;
        }

        public Criteria andGrowerTimeIn(List<String> values) {
            addCriterion("grower_time in", values, "growerTime");
            return (Criteria) this;
        }

        public Criteria andGrowerTimeNotIn(List<String> values) {
            addCriterion("grower_time not in", values, "growerTime");
            return (Criteria) this;
        }

        public Criteria andGrowerTimeBetween(String value1, String value2) {
            addCriterion("grower_time between", value1, value2, "growerTime");
            return (Criteria) this;
        }

        public Criteria andGrowerTimeNotBetween(String value1, String value2) {
            addCriterion("grower_time not between", value1, value2, "growerTime");
            return (Criteria) this;
        }

        public Criteria andHarvestTimeIsNull() {
            addCriterion("harvest_time is null");
            return (Criteria) this;
        }

        public Criteria andHarvestTimeIsNotNull() {
            addCriterion("harvest_time is not null");
            return (Criteria) this;
        }

        public Criteria andHarvestTimeEqualTo(String value) {
            addCriterion("harvest_time =", value, "harvestTime");
            return (Criteria) this;
        }

        public Criteria andHarvestTimeNotEqualTo(String value) {
            addCriterion("harvest_time <>", value, "harvestTime");
            return (Criteria) this;
        }

        public Criteria andHarvestTimeGreaterThan(String value) {
            addCriterion("harvest_time >", value, "harvestTime");
            return (Criteria) this;
        }

        public Criteria andHarvestTimeGreaterThanOrEqualTo(String value) {
            addCriterion("harvest_time >=", value, "harvestTime");
            return (Criteria) this;
        }

        public Criteria andHarvestTimeLessThan(String value) {
            addCriterion("harvest_time <", value, "harvestTime");
            return (Criteria) this;
        }

        public Criteria andHarvestTimeLessThanOrEqualTo(String value) {
            addCriterion("harvest_time <=", value, "harvestTime");
            return (Criteria) this;
        }

        public Criteria andHarvestTimeLike(String value) {
            addCriterion("harvest_time like", value, "harvestTime");
            return (Criteria) this;
        }

        public Criteria andHarvestTimeNotLike(String value) {
            addCriterion("harvest_time not like", value, "harvestTime");
            return (Criteria) this;
        }

        public Criteria andHarvestTimeIn(List<String> values) {
            addCriterion("harvest_time in", values, "harvestTime");
            return (Criteria) this;
        }

        public Criteria andHarvestTimeNotIn(List<String> values) {
            addCriterion("harvest_time not in", values, "harvestTime");
            return (Criteria) this;
        }

        public Criteria andHarvestTimeBetween(String value1, String value2) {
            addCriterion("harvest_time between", value1, value2, "harvestTime");
            return (Criteria) this;
        }

        public Criteria andHarvestTimeNotBetween(String value1, String value2) {
            addCriterion("harvest_time not between", value1, value2, "harvestTime");
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

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Double value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Double value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Double value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Double value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Double value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Double> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Double> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Double value1, Double value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Double value1, Double value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
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