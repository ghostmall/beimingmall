package cn.ptms.tike.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubOrderFormExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubOrderFormExample() {
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

        public Criteria andOrderproIsNull() {
            addCriterion("orderpro is null");
            return (Criteria) this;
        }

        public Criteria andOrderproIsNotNull() {
            addCriterion("orderpro is not null");
            return (Criteria) this;
        }

        public Criteria andOrderproEqualTo(String value) {
            addCriterion("orderpro =", value, "orderpro");
            return (Criteria) this;
        }

        public Criteria andOrderproNotEqualTo(String value) {
            addCriterion("orderpro <>", value, "orderpro");
            return (Criteria) this;
        }

        public Criteria andOrderproGreaterThan(String value) {
            addCriterion("orderpro >", value, "orderpro");
            return (Criteria) this;
        }

        public Criteria andOrderproGreaterThanOrEqualTo(String value) {
            addCriterion("orderpro >=", value, "orderpro");
            return (Criteria) this;
        }

        public Criteria andOrderproLessThan(String value) {
            addCriterion("orderpro <", value, "orderpro");
            return (Criteria) this;
        }

        public Criteria andOrderproLessThanOrEqualTo(String value) {
            addCriterion("orderpro <=", value, "orderpro");
            return (Criteria) this;
        }

        public Criteria andOrderproLike(String value) {
            addCriterion("orderpro like", value, "orderpro");
            return (Criteria) this;
        }

        public Criteria andOrderproNotLike(String value) {
            addCriterion("orderpro not like", value, "orderpro");
            return (Criteria) this;
        }

        public Criteria andOrderproIn(List<String> values) {
            addCriterion("orderpro in", values, "orderpro");
            return (Criteria) this;
        }

        public Criteria andOrderproNotIn(List<String> values) {
            addCriterion("orderpro not in", values, "orderpro");
            return (Criteria) this;
        }

        public Criteria andOrderproBetween(String value1, String value2) {
            addCriterion("orderpro between", value1, value2, "orderpro");
            return (Criteria) this;
        }

        public Criteria andOrderproNotBetween(String value1, String value2) {
            addCriterion("orderpro not between", value1, value2, "orderpro");
            return (Criteria) this;
        }

        public Criteria andOrdertakIsNull() {
            addCriterion("ordertak is null");
            return (Criteria) this;
        }

        public Criteria andOrdertakIsNotNull() {
            addCriterion("ordertak is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertakEqualTo(String value) {
            addCriterion("ordertak =", value, "ordertak");
            return (Criteria) this;
        }

        public Criteria andOrdertakNotEqualTo(String value) {
            addCriterion("ordertak <>", value, "ordertak");
            return (Criteria) this;
        }

        public Criteria andOrdertakGreaterThan(String value) {
            addCriterion("ordertak >", value, "ordertak");
            return (Criteria) this;
        }

        public Criteria andOrdertakGreaterThanOrEqualTo(String value) {
            addCriterion("ordertak >=", value, "ordertak");
            return (Criteria) this;
        }

        public Criteria andOrdertakLessThan(String value) {
            addCriterion("ordertak <", value, "ordertak");
            return (Criteria) this;
        }

        public Criteria andOrdertakLessThanOrEqualTo(String value) {
            addCriterion("ordertak <=", value, "ordertak");
            return (Criteria) this;
        }

        public Criteria andOrdertakLike(String value) {
            addCriterion("ordertak like", value, "ordertak");
            return (Criteria) this;
        }

        public Criteria andOrdertakNotLike(String value) {
            addCriterion("ordertak not like", value, "ordertak");
            return (Criteria) this;
        }

        public Criteria andOrdertakIn(List<String> values) {
            addCriterion("ordertak in", values, "ordertak");
            return (Criteria) this;
        }

        public Criteria andOrdertakNotIn(List<String> values) {
            addCriterion("ordertak not in", values, "ordertak");
            return (Criteria) this;
        }

        public Criteria andOrdertakBetween(String value1, String value2) {
            addCriterion("ordertak between", value1, value2, "ordertak");
            return (Criteria) this;
        }

        public Criteria andOrdertakNotBetween(String value1, String value2) {
            addCriterion("ordertak not between", value1, value2, "ordertak");
            return (Criteria) this;
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

        public Criteria andBytimeIsNull() {
            addCriterion("bytime is null");
            return (Criteria) this;
        }

        public Criteria andBytimeIsNotNull() {
            addCriterion("bytime is not null");
            return (Criteria) this;
        }

        public Criteria andBytimeEqualTo(Date value) {
            addCriterion("bytime =", value, "bytime");
            return (Criteria) this;
        }

        public Criteria andBytimeNotEqualTo(Date value) {
            addCriterion("bytime <>", value, "bytime");
            return (Criteria) this;
        }

        public Criteria andBytimeGreaterThan(Date value) {
            addCriterion("bytime >", value, "bytime");
            return (Criteria) this;
        }

        public Criteria andBytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bytime >=", value, "bytime");
            return (Criteria) this;
        }

        public Criteria andBytimeLessThan(Date value) {
            addCriterion("bytime <", value, "bytime");
            return (Criteria) this;
        }

        public Criteria andBytimeLessThanOrEqualTo(Date value) {
            addCriterion("bytime <=", value, "bytime");
            return (Criteria) this;
        }

        public Criteria andBytimeIn(List<Date> values) {
            addCriterion("bytime in", values, "bytime");
            return (Criteria) this;
        }

        public Criteria andBytimeNotIn(List<Date> values) {
            addCriterion("bytime not in", values, "bytime");
            return (Criteria) this;
        }

        public Criteria andBytimeBetween(Date value1, Date value2) {
            addCriterion("bytime between", value1, value2, "bytime");
            return (Criteria) this;
        }

        public Criteria andBytimeNotBetween(Date value1, Date value2) {
            addCriterion("bytime not between", value1, value2, "bytime");
            return (Criteria) this;
        }

        public Criteria andClassstarttimeIsNull() {
            addCriterion("classstarttime is null");
            return (Criteria) this;
        }

        public Criteria andClassstarttimeIsNotNull() {
            addCriterion("classstarttime is not null");
            return (Criteria) this;
        }

        public Criteria andClassstarttimeEqualTo(Date value) {
            addCriterion("classstarttime =", value, "classstarttime");
            return (Criteria) this;
        }

        public Criteria andClassstarttimeNotEqualTo(Date value) {
            addCriterion("classstarttime <>", value, "classstarttime");
            return (Criteria) this;
        }

        public Criteria andClassstarttimeGreaterThan(Date value) {
            addCriterion("classstarttime >", value, "classstarttime");
            return (Criteria) this;
        }

        public Criteria andClassstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("classstarttime >=", value, "classstarttime");
            return (Criteria) this;
        }

        public Criteria andClassstarttimeLessThan(Date value) {
            addCriterion("classstarttime <", value, "classstarttime");
            return (Criteria) this;
        }

        public Criteria andClassstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("classstarttime <=", value, "classstarttime");
            return (Criteria) this;
        }

        public Criteria andClassstarttimeIn(List<Date> values) {
            addCriterion("classstarttime in", values, "classstarttime");
            return (Criteria) this;
        }

        public Criteria andClassstarttimeNotIn(List<Date> values) {
            addCriterion("classstarttime not in", values, "classstarttime");
            return (Criteria) this;
        }

        public Criteria andClassstarttimeBetween(Date value1, Date value2) {
            addCriterion("classstarttime between", value1, value2, "classstarttime");
            return (Criteria) this;
        }

        public Criteria andClassstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("classstarttime not between", value1, value2, "classstarttime");
            return (Criteria) this;
        }

        public Criteria andClassendtimeIsNull() {
            addCriterion("classendtime is null");
            return (Criteria) this;
        }

        public Criteria andClassendtimeIsNotNull() {
            addCriterion("classendtime is not null");
            return (Criteria) this;
        }

        public Criteria andClassendtimeEqualTo(Date value) {
            addCriterion("classendtime =", value, "classendtime");
            return (Criteria) this;
        }

        public Criteria andClassendtimeNotEqualTo(Date value) {
            addCriterion("classendtime <>", value, "classendtime");
            return (Criteria) this;
        }

        public Criteria andClassendtimeGreaterThan(Date value) {
            addCriterion("classendtime >", value, "classendtime");
            return (Criteria) this;
        }

        public Criteria andClassendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("classendtime >=", value, "classendtime");
            return (Criteria) this;
        }

        public Criteria andClassendtimeLessThan(Date value) {
            addCriterion("classendtime <", value, "classendtime");
            return (Criteria) this;
        }

        public Criteria andClassendtimeLessThanOrEqualTo(Date value) {
            addCriterion("classendtime <=", value, "classendtime");
            return (Criteria) this;
        }

        public Criteria andClassendtimeIn(List<Date> values) {
            addCriterion("classendtime in", values, "classendtime");
            return (Criteria) this;
        }

        public Criteria andClassendtimeNotIn(List<Date> values) {
            addCriterion("classendtime not in", values, "classendtime");
            return (Criteria) this;
        }

        public Criteria andClassendtimeBetween(Date value1, Date value2) {
            addCriterion("classendtime between", value1, value2, "classendtime");
            return (Criteria) this;
        }

        public Criteria andClassendtimeNotBetween(Date value1, Date value2) {
            addCriterion("classendtime not between", value1, value2, "classendtime");
            return (Criteria) this;
        }

        public Criteria andClassinfIsNull() {
            addCriterion("classinf is null");
            return (Criteria) this;
        }

        public Criteria andClassinfIsNotNull() {
            addCriterion("classinf is not null");
            return (Criteria) this;
        }

        public Criteria andClassinfEqualTo(String value) {
            addCriterion("classinf =", value, "classinf");
            return (Criteria) this;
        }

        public Criteria andClassinfNotEqualTo(String value) {
            addCriterion("classinf <>", value, "classinf");
            return (Criteria) this;
        }

        public Criteria andClassinfGreaterThan(String value) {
            addCriterion("classinf >", value, "classinf");
            return (Criteria) this;
        }

        public Criteria andClassinfGreaterThanOrEqualTo(String value) {
            addCriterion("classinf >=", value, "classinf");
            return (Criteria) this;
        }

        public Criteria andClassinfLessThan(String value) {
            addCriterion("classinf <", value, "classinf");
            return (Criteria) this;
        }

        public Criteria andClassinfLessThanOrEqualTo(String value) {
            addCriterion("classinf <=", value, "classinf");
            return (Criteria) this;
        }

        public Criteria andClassinfLike(String value) {
            addCriterion("classinf like", value, "classinf");
            return (Criteria) this;
        }

        public Criteria andClassinfNotLike(String value) {
            addCriterion("classinf not like", value, "classinf");
            return (Criteria) this;
        }

        public Criteria andClassinfIn(List<String> values) {
            addCriterion("classinf in", values, "classinf");
            return (Criteria) this;
        }

        public Criteria andClassinfNotIn(List<String> values) {
            addCriterion("classinf not in", values, "classinf");
            return (Criteria) this;
        }

        public Criteria andClassinfBetween(String value1, String value2) {
            addCriterion("classinf between", value1, value2, "classinf");
            return (Criteria) this;
        }

        public Criteria andClassinfNotBetween(String value1, String value2) {
            addCriterion("classinf not between", value1, value2, "classinf");
            return (Criteria) this;
        }

        public Criteria andAsbtsIsNull() {
            addCriterion("asbts is null");
            return (Criteria) this;
        }

        public Criteria andAsbtsIsNotNull() {
            addCriterion("asbts is not null");
            return (Criteria) this;
        }

        public Criteria andAsbtsEqualTo(Double value) {
            addCriterion("asbts =", value, "asbts");
            return (Criteria) this;
        }

        public Criteria andAsbtsNotEqualTo(Double value) {
            addCriterion("asbts <>", value, "asbts");
            return (Criteria) this;
        }

        public Criteria andAsbtsGreaterThan(Double value) {
            addCriterion("asbts >", value, "asbts");
            return (Criteria) this;
        }

        public Criteria andAsbtsGreaterThanOrEqualTo(Double value) {
            addCriterion("asbts >=", value, "asbts");
            return (Criteria) this;
        }

        public Criteria andAsbtsLessThan(Double value) {
            addCriterion("asbts <", value, "asbts");
            return (Criteria) this;
        }

        public Criteria andAsbtsLessThanOrEqualTo(Double value) {
            addCriterion("asbts <=", value, "asbts");
            return (Criteria) this;
        }

        public Criteria andAsbtsIn(List<Double> values) {
            addCriterion("asbts in", values, "asbts");
            return (Criteria) this;
        }

        public Criteria andAsbtsNotIn(List<Double> values) {
            addCriterion("asbts not in", values, "asbts");
            return (Criteria) this;
        }

        public Criteria andAsbtsBetween(Double value1, Double value2) {
            addCriterion("asbts between", value1, value2, "asbts");
            return (Criteria) this;
        }

        public Criteria andAsbtsNotBetween(Double value1, Double value2) {
            addCriterion("asbts not between", value1, value2, "asbts");
            return (Criteria) this;
        }

        public Criteria andPayeeIsNull() {
            addCriterion("payee is null");
            return (Criteria) this;
        }

        public Criteria andPayeeIsNotNull() {
            addCriterion("payee is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeEqualTo(Double value) {
            addCriterion("payee =", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotEqualTo(Double value) {
            addCriterion("payee <>", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeGreaterThan(Double value) {
            addCriterion("payee >", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeGreaterThanOrEqualTo(Double value) {
            addCriterion("payee >=", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLessThan(Double value) {
            addCriterion("payee <", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLessThanOrEqualTo(Double value) {
            addCriterion("payee <=", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeIn(List<Double> values) {
            addCriterion("payee in", values, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotIn(List<Double> values) {
            addCriterion("payee not in", values, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeBetween(Double value1, Double value2) {
            addCriterion("payee between", value1, value2, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotBetween(Double value1, Double value2) {
            addCriterion("payee not between", value1, value2, "payee");
            return (Criteria) this;
        }

        public Criteria andPlaamoIsNull() {
            addCriterion("plaamo is null");
            return (Criteria) this;
        }

        public Criteria andPlaamoIsNotNull() {
            addCriterion("plaamo is not null");
            return (Criteria) this;
        }

        public Criteria andPlaamoEqualTo(Double value) {
            addCriterion("plaamo =", value, "plaamo");
            return (Criteria) this;
        }

        public Criteria andPlaamoNotEqualTo(Double value) {
            addCriterion("plaamo <>", value, "plaamo");
            return (Criteria) this;
        }

        public Criteria andPlaamoGreaterThan(Double value) {
            addCriterion("plaamo >", value, "plaamo");
            return (Criteria) this;
        }

        public Criteria andPlaamoGreaterThanOrEqualTo(Double value) {
            addCriterion("plaamo >=", value, "plaamo");
            return (Criteria) this;
        }

        public Criteria andPlaamoLessThan(Double value) {
            addCriterion("plaamo <", value, "plaamo");
            return (Criteria) this;
        }

        public Criteria andPlaamoLessThanOrEqualTo(Double value) {
            addCriterion("plaamo <=", value, "plaamo");
            return (Criteria) this;
        }

        public Criteria andPlaamoIn(List<Double> values) {
            addCriterion("plaamo in", values, "plaamo");
            return (Criteria) this;
        }

        public Criteria andPlaamoNotIn(List<Double> values) {
            addCriterion("plaamo not in", values, "plaamo");
            return (Criteria) this;
        }

        public Criteria andPlaamoBetween(Double value1, Double value2) {
            addCriterion("plaamo between", value1, value2, "plaamo");
            return (Criteria) this;
        }

        public Criteria andPlaamoNotBetween(Double value1, Double value2) {
            addCriterion("plaamo not between", value1, value2, "plaamo");
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