/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.performance_schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.example.gradle.db.performance_schema.enums.PerformanceTimersTimerName;
import org.jooq.example.gradle.db.performance_schema.tables.PerformanceTimers;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PerformanceTimersRecord extends TableRecordImpl<PerformanceTimersRecord> implements Record4<PerformanceTimersTimerName, Long, Long, Long> {

    private static final long serialVersionUID = -645945051;

    /**
     * Setter for <code>performance_schema.performance_timers.TIMER_NAME</code>.
     */
    public void setTimerName(PerformanceTimersTimerName value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.performance_timers.TIMER_NAME</code>.
     */
    public PerformanceTimersTimerName getTimerName() {
        return (PerformanceTimersTimerName) get(0);
    }

    /**
     * Setter for <code>performance_schema.performance_timers.TIMER_FREQUENCY</code>.
     */
    public void setTimerFrequency(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.performance_timers.TIMER_FREQUENCY</code>.
     */
    public Long getTimerFrequency() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>performance_schema.performance_timers.TIMER_RESOLUTION</code>.
     */
    public void setTimerResolution(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.performance_timers.TIMER_RESOLUTION</code>.
     */
    public Long getTimerResolution() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>performance_schema.performance_timers.TIMER_OVERHEAD</code>.
     */
    public void setTimerOverhead(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.performance_timers.TIMER_OVERHEAD</code>.
     */
    public Long getTimerOverhead() {
        return (Long) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<PerformanceTimersTimerName, Long, Long, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<PerformanceTimersTimerName, Long, Long, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<PerformanceTimersTimerName> field1() {
        return PerformanceTimers.PERFORMANCE_TIMERS.TIMER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PerformanceTimers.PERFORMANCE_TIMERS.TIMER_FREQUENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return PerformanceTimers.PERFORMANCE_TIMERS.TIMER_RESOLUTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return PerformanceTimers.PERFORMANCE_TIMERS.TIMER_OVERHEAD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PerformanceTimersTimerName value1() {
        return getTimerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getTimerFrequency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getTimerResolution();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getTimerOverhead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PerformanceTimersRecord value1(PerformanceTimersTimerName value) {
        setTimerName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PerformanceTimersRecord value2(Long value) {
        setTimerFrequency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PerformanceTimersRecord value3(Long value) {
        setTimerResolution(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PerformanceTimersRecord value4(Long value) {
        setTimerOverhead(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PerformanceTimersRecord values(PerformanceTimersTimerName value1, Long value2, Long value3, Long value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PerformanceTimersRecord
     */
    public PerformanceTimersRecord() {
        super(PerformanceTimers.PERFORMANCE_TIMERS);
    }

    /**
     * Create a detached, initialised PerformanceTimersRecord
     */
    public PerformanceTimersRecord(PerformanceTimersTimerName timerName, Long timerFrequency, Long timerResolution, Long timerOverhead) {
        super(PerformanceTimers.PERFORMANCE_TIMERS);

        set(0, timerName);
        set(1, timerFrequency);
        set(2, timerResolution);
        set(3, timerOverhead);
    }
}