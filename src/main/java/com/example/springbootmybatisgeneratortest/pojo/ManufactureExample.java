package com.example.springbootmybatisgeneratortest.pojo;

import java.util.ArrayList;
import java.util.List;

public class ManufactureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManufactureExample() {
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

        public Criteria andManufactureIdIsNull() {
            addCriterion("manufacture_id is null");
            return (Criteria) this;
        }

        public Criteria andManufactureIdIsNotNull() {
            addCriterion("manufacture_id is not null");
            return (Criteria) this;
        }

        public Criteria andManufactureIdEqualTo(Integer value) {
            addCriterion("manufacture_id =", value, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdNotEqualTo(Integer value) {
            addCriterion("manufacture_id <>", value, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdGreaterThan(Integer value) {
            addCriterion("manufacture_id >", value, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("manufacture_id >=", value, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdLessThan(Integer value) {
            addCriterion("manufacture_id <", value, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdLessThanOrEqualTo(Integer value) {
            addCriterion("manufacture_id <=", value, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdIn(List<Integer> values) {
            addCriterion("manufacture_id in", values, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdNotIn(List<Integer> values) {
            addCriterion("manufacture_id not in", values, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdBetween(Integer value1, Integer value2) {
            addCriterion("manufacture_id between", value1, value2, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andManufactureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("manufacture_id not between", value1, value2, "manufactureId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
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

        public Criteria andManufactureDateIsNull() {
            addCriterion("manufacture_date is null");
            return (Criteria) this;
        }

        public Criteria andManufactureDateIsNotNull() {
            addCriterion("manufacture_date is not null");
            return (Criteria) this;
        }

        public Criteria andManufactureDateEqualTo(String value) {
            addCriterion("manufacture_date =", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateNotEqualTo(String value) {
            addCriterion("manufacture_date <>", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateGreaterThan(String value) {
            addCriterion("manufacture_date >", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateGreaterThanOrEqualTo(String value) {
            addCriterion("manufacture_date >=", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateLessThan(String value) {
            addCriterion("manufacture_date <", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateLessThanOrEqualTo(String value) {
            addCriterion("manufacture_date <=", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateLike(String value) {
            addCriterion("manufacture_date like", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateNotLike(String value) {
            addCriterion("manufacture_date not like", value, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateIn(List<String> values) {
            addCriterion("manufacture_date in", values, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateNotIn(List<String> values) {
            addCriterion("manufacture_date not in", values, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateBetween(String value1, String value2) {
            addCriterion("manufacture_date between", value1, value2, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andManufactureDateNotBetween(String value1, String value2) {
            addCriterion("manufacture_date not between", value1, value2, "manufactureDate");
            return (Criteria) this;
        }

        public Criteria andValidityDateIsNull() {
            addCriterion("validity_date is null");
            return (Criteria) this;
        }

        public Criteria andValidityDateIsNotNull() {
            addCriterion("validity_date is not null");
            return (Criteria) this;
        }

        public Criteria andValidityDateEqualTo(String value) {
            addCriterion("validity_date =", value, "validityDate");
            return (Criteria) this;
        }

        public Criteria andValidityDateNotEqualTo(String value) {
            addCriterion("validity_date <>", value, "validityDate");
            return (Criteria) this;
        }

        public Criteria andValidityDateGreaterThan(String value) {
            addCriterion("validity_date >", value, "validityDate");
            return (Criteria) this;
        }

        public Criteria andValidityDateGreaterThanOrEqualTo(String value) {
            addCriterion("validity_date >=", value, "validityDate");
            return (Criteria) this;
        }

        public Criteria andValidityDateLessThan(String value) {
            addCriterion("validity_date <", value, "validityDate");
            return (Criteria) this;
        }

        public Criteria andValidityDateLessThanOrEqualTo(String value) {
            addCriterion("validity_date <=", value, "validityDate");
            return (Criteria) this;
        }

        public Criteria andValidityDateLike(String value) {
            addCriterion("validity_date like", value, "validityDate");
            return (Criteria) this;
        }

        public Criteria andValidityDateNotLike(String value) {
            addCriterion("validity_date not like", value, "validityDate");
            return (Criteria) this;
        }

        public Criteria andValidityDateIn(List<String> values) {
            addCriterion("validity_date in", values, "validityDate");
            return (Criteria) this;
        }

        public Criteria andValidityDateNotIn(List<String> values) {
            addCriterion("validity_date not in", values, "validityDate");
            return (Criteria) this;
        }

        public Criteria andValidityDateBetween(String value1, String value2) {
            addCriterion("validity_date between", value1, value2, "validityDate");
            return (Criteria) this;
        }

        public Criteria andValidityDateNotBetween(String value1, String value2) {
            addCriterion("validity_date not between", value1, value2, "validityDate");
            return (Criteria) this;
        }

        public Criteria andSiteIsNull() {
            addCriterion("site is null");
            return (Criteria) this;
        }

        public Criteria andSiteIsNotNull() {
            addCriterion("site is not null");
            return (Criteria) this;
        }

        public Criteria andSiteEqualTo(String value) {
            addCriterion("site =", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotEqualTo(String value) {
            addCriterion("site <>", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThan(String value) {
            addCriterion("site >", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThanOrEqualTo(String value) {
            addCriterion("site >=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThan(String value) {
            addCriterion("site <", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThanOrEqualTo(String value) {
            addCriterion("site <=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLike(String value) {
            addCriterion("site like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotLike(String value) {
            addCriterion("site not like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteIn(List<String> values) {
            addCriterion("site in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotIn(List<String> values) {
            addCriterion("site not in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteBetween(String value1, String value2) {
            addCriterion("site between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotBetween(String value1, String value2) {
            addCriterion("site not between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andMethodIsNull() {
            addCriterion("method is null");
            return (Criteria) this;
        }

        public Criteria andMethodIsNotNull() {
            addCriterion("method is not null");
            return (Criteria) this;
        }

        public Criteria andMethodEqualTo(String value) {
            addCriterion("method =", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotEqualTo(String value) {
            addCriterion("method <>", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThan(String value) {
            addCriterion("method >", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThanOrEqualTo(String value) {
            addCriterion("method >=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThan(String value) {
            addCriterion("method <", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThanOrEqualTo(String value) {
            addCriterion("method <=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLike(String value) {
            addCriterion("method like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotLike(String value) {
            addCriterion("method not like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodIn(List<String> values) {
            addCriterion("method in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotIn(List<String> values) {
            addCriterion("method not in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodBetween(String value1, String value2) {
            addCriterion("method between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotBetween(String value1, String value2) {
            addCriterion("method not between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andChargeIdIsNull() {
            addCriterion("charge_id is null");
            return (Criteria) this;
        }

        public Criteria andChargeIdIsNotNull() {
            addCriterion("charge_id is not null");
            return (Criteria) this;
        }

        public Criteria andChargeIdEqualTo(String value) {
            addCriterion("charge_id =", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotEqualTo(String value) {
            addCriterion("charge_id <>", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdGreaterThan(String value) {
            addCriterion("charge_id >", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdGreaterThanOrEqualTo(String value) {
            addCriterion("charge_id >=", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLessThan(String value) {
            addCriterion("charge_id <", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLessThanOrEqualTo(String value) {
            addCriterion("charge_id <=", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLike(String value) {
            addCriterion("charge_id like", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotLike(String value) {
            addCriterion("charge_id not like", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdIn(List<String> values) {
            addCriterion("charge_id in", values, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotIn(List<String> values) {
            addCriterion("charge_id not in", values, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdBetween(String value1, String value2) {
            addCriterion("charge_id between", value1, value2, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotBetween(String value1, String value2) {
            addCriterion("charge_id not between", value1, value2, "chargeId");
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

        public Criteria andChargeNameIsNull() {
            addCriterion("charge_name is null");
            return (Criteria) this;
        }

        public Criteria andChargeNameIsNotNull() {
            addCriterion("charge_name is not null");
            return (Criteria) this;
        }

        public Criteria andChargeNameEqualTo(String value) {
            addCriterion("charge_name =", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameNotEqualTo(String value) {
            addCriterion("charge_name <>", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameGreaterThan(String value) {
            addCriterion("charge_name >", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameGreaterThanOrEqualTo(String value) {
            addCriterion("charge_name >=", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameLessThan(String value) {
            addCriterion("charge_name <", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameLessThanOrEqualTo(String value) {
            addCriterion("charge_name <=", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameLike(String value) {
            addCriterion("charge_name like", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameNotLike(String value) {
            addCriterion("charge_name not like", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameIn(List<String> values) {
            addCriterion("charge_name in", values, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameNotIn(List<String> values) {
            addCriterion("charge_name not in", values, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameBetween(String value1, String value2) {
            addCriterion("charge_name between", value1, value2, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameNotBetween(String value1, String value2) {
            addCriterion("charge_name not between", value1, value2, "chargeName");
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