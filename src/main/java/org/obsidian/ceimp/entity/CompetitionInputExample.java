package org.obsidian.ceimp.entity;

import java.util.ArrayList;
import java.util.List;

public class CompetitionInputExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompetitionInputExample() {
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

        public Criteria andInputIdIsNull() {
            addCriterion("input_id is null");
            return (Criteria) this;
        }

        public Criteria andInputIdIsNotNull() {
            addCriterion("input_id is not null");
            return (Criteria) this;
        }

        public Criteria andInputIdEqualTo(Integer value) {
            addCriterion("input_id =", value, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdNotEqualTo(Integer value) {
            addCriterion("input_id <>", value, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdGreaterThan(Integer value) {
            addCriterion("input_id >", value, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("input_id >=", value, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdLessThan(Integer value) {
            addCriterion("input_id <", value, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdLessThanOrEqualTo(Integer value) {
            addCriterion("input_id <=", value, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdIn(List<Integer> values) {
            addCriterion("input_id in", values, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdNotIn(List<Integer> values) {
            addCriterion("input_id not in", values, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdBetween(Integer value1, Integer value2) {
            addCriterion("input_id between", value1, value2, "inputId");
            return (Criteria) this;
        }

        public Criteria andInputIdNotBetween(Integer value1, Integer value2) {
            addCriterion("input_id not between", value1, value2, "inputId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdIsNull() {
            addCriterion("competition_id is null");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdIsNotNull() {
            addCriterion("competition_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdEqualTo(Integer value) {
            addCriterion("competition_id =", value, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdNotEqualTo(Integer value) {
            addCriterion("competition_id <>", value, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdGreaterThan(Integer value) {
            addCriterion("competition_id >", value, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("competition_id >=", value, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdLessThan(Integer value) {
            addCriterion("competition_id <", value, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdLessThanOrEqualTo(Integer value) {
            addCriterion("competition_id <=", value, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdIn(List<Integer> values) {
            addCriterion("competition_id in", values, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdNotIn(List<Integer> values) {
            addCriterion("competition_id not in", values, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdBetween(Integer value1, Integer value2) {
            addCriterion("competition_id between", value1, value2, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("competition_id not between", value1, value2, "competitionId");
            return (Criteria) this;
        }

        public Criteria andEvidenceIsNull() {
            addCriterion("evidence is null");
            return (Criteria) this;
        }

        public Criteria andEvidenceIsNotNull() {
            addCriterion("evidence is not null");
            return (Criteria) this;
        }

        public Criteria andEvidenceEqualTo(String value) {
            addCriterion("evidence =", value, "evidence");
            return (Criteria) this;
        }

        public Criteria andEvidenceNotEqualTo(String value) {
            addCriterion("evidence <>", value, "evidence");
            return (Criteria) this;
        }

        public Criteria andEvidenceGreaterThan(String value) {
            addCriterion("evidence >", value, "evidence");
            return (Criteria) this;
        }

        public Criteria andEvidenceGreaterThanOrEqualTo(String value) {
            addCriterion("evidence >=", value, "evidence");
            return (Criteria) this;
        }

        public Criteria andEvidenceLessThan(String value) {
            addCriterion("evidence <", value, "evidence");
            return (Criteria) this;
        }

        public Criteria andEvidenceLessThanOrEqualTo(String value) {
            addCriterion("evidence <=", value, "evidence");
            return (Criteria) this;
        }

        public Criteria andEvidenceLike(String value) {
            addCriterion("evidence like", value, "evidence");
            return (Criteria) this;
        }

        public Criteria andEvidenceNotLike(String value) {
            addCriterion("evidence not like", value, "evidence");
            return (Criteria) this;
        }

        public Criteria andEvidenceIn(List<String> values) {
            addCriterion("evidence in", values, "evidence");
            return (Criteria) this;
        }

        public Criteria andEvidenceNotIn(List<String> values) {
            addCriterion("evidence not in", values, "evidence");
            return (Criteria) this;
        }

        public Criteria andEvidenceBetween(String value1, String value2) {
            addCriterion("evidence between", value1, value2, "evidence");
            return (Criteria) this;
        }

        public Criteria andEvidenceNotBetween(String value1, String value2) {
            addCriterion("evidence not between", value1, value2, "evidence");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdIsNull() {
            addCriterion("competition_level_id is null");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdIsNotNull() {
            addCriterion("competition_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdEqualTo(Integer value) {
            addCriterion("competition_level_id =", value, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdNotEqualTo(Integer value) {
            addCriterion("competition_level_id <>", value, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdGreaterThan(Integer value) {
            addCriterion("competition_level_id >", value, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("competition_level_id >=", value, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdLessThan(Integer value) {
            addCriterion("competition_level_id <", value, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("competition_level_id <=", value, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdIn(List<Integer> values) {
            addCriterion("competition_level_id in", values, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdNotIn(List<Integer> values) {
            addCriterion("competition_level_id not in", values, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("competition_level_id between", value1, value2, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("competition_level_id not between", value1, value2, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andAwardLevelIdIsNull() {
            addCriterion("award_level_id is null");
            return (Criteria) this;
        }

        public Criteria andAwardLevelIdIsNotNull() {
            addCriterion("award_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andAwardLevelIdEqualTo(Integer value) {
            addCriterion("award_level_id =", value, "awardLevelId");
            return (Criteria) this;
        }

        public Criteria andAwardLevelIdNotEqualTo(Integer value) {
            addCriterion("award_level_id <>", value, "awardLevelId");
            return (Criteria) this;
        }

        public Criteria andAwardLevelIdGreaterThan(Integer value) {
            addCriterion("award_level_id >", value, "awardLevelId");
            return (Criteria) this;
        }

        public Criteria andAwardLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("award_level_id >=", value, "awardLevelId");
            return (Criteria) this;
        }

        public Criteria andAwardLevelIdLessThan(Integer value) {
            addCriterion("award_level_id <", value, "awardLevelId");
            return (Criteria) this;
        }

        public Criteria andAwardLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("award_level_id <=", value, "awardLevelId");
            return (Criteria) this;
        }

        public Criteria andAwardLevelIdIn(List<Integer> values) {
            addCriterion("award_level_id in", values, "awardLevelId");
            return (Criteria) this;
        }

        public Criteria andAwardLevelIdNotIn(List<Integer> values) {
            addCriterion("award_level_id not in", values, "awardLevelId");
            return (Criteria) this;
        }

        public Criteria andAwardLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("award_level_id between", value1, value2, "awardLevelId");
            return (Criteria) this;
        }

        public Criteria andAwardLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("award_level_id not between", value1, value2, "awardLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionTypeIsNull() {
            addCriterion("competition_type is null");
            return (Criteria) this;
        }

        public Criteria andCompetitionTypeIsNotNull() {
            addCriterion("competition_type is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitionTypeEqualTo(Integer value) {
            addCriterion("competition_type =", value, "competitionType");
            return (Criteria) this;
        }

        public Criteria andCompetitionTypeNotEqualTo(Integer value) {
            addCriterion("competition_type <>", value, "competitionType");
            return (Criteria) this;
        }

        public Criteria andCompetitionTypeGreaterThan(Integer value) {
            addCriterion("competition_type >", value, "competitionType");
            return (Criteria) this;
        }

        public Criteria andCompetitionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("competition_type >=", value, "competitionType");
            return (Criteria) this;
        }

        public Criteria andCompetitionTypeLessThan(Integer value) {
            addCriterion("competition_type <", value, "competitionType");
            return (Criteria) this;
        }

        public Criteria andCompetitionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("competition_type <=", value, "competitionType");
            return (Criteria) this;
        }

        public Criteria andCompetitionTypeIn(List<Integer> values) {
            addCriterion("competition_type in", values, "competitionType");
            return (Criteria) this;
        }

        public Criteria andCompetitionTypeNotIn(List<Integer> values) {
            addCriterion("competition_type not in", values, "competitionType");
            return (Criteria) this;
        }

        public Criteria andCompetitionTypeBetween(Integer value1, Integer value2) {
            addCriterion("competition_type between", value1, value2, "competitionType");
            return (Criteria) this;
        }

        public Criteria andCompetitionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("competition_type not between", value1, value2, "competitionType");
            return (Criteria) this;
        }

        public Criteria andYearScopeIsNull() {
            addCriterion("year_scope is null");
            return (Criteria) this;
        }

        public Criteria andYearScopeIsNotNull() {
            addCriterion("year_scope is not null");
            return (Criteria) this;
        }

        public Criteria andYearScopeEqualTo(Integer value) {
            addCriterion("year_scope =", value, "yearScope");
            return (Criteria) this;
        }

        public Criteria andYearScopeNotEqualTo(Integer value) {
            addCriterion("year_scope <>", value, "yearScope");
            return (Criteria) this;
        }

        public Criteria andYearScopeGreaterThan(Integer value) {
            addCriterion("year_scope >", value, "yearScope");
            return (Criteria) this;
        }

        public Criteria andYearScopeGreaterThanOrEqualTo(Integer value) {
            addCriterion("year_scope >=", value, "yearScope");
            return (Criteria) this;
        }

        public Criteria andYearScopeLessThan(Integer value) {
            addCriterion("year_scope <", value, "yearScope");
            return (Criteria) this;
        }

        public Criteria andYearScopeLessThanOrEqualTo(Integer value) {
            addCriterion("year_scope <=", value, "yearScope");
            return (Criteria) this;
        }

        public Criteria andYearScopeIn(List<Integer> values) {
            addCriterion("year_scope in", values, "yearScope");
            return (Criteria) this;
        }

        public Criteria andYearScopeNotIn(List<Integer> values) {
            addCriterion("year_scope not in", values, "yearScope");
            return (Criteria) this;
        }

        public Criteria andYearScopeBetween(Integer value1, Integer value2) {
            addCriterion("year_scope between", value1, value2, "yearScope");
            return (Criteria) this;
        }

        public Criteria andYearScopeNotBetween(Integer value1, Integer value2) {
            addCriterion("year_scope not between", value1, value2, "yearScope");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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