/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.performance_schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.example.gradle.db.performance_schema.tables.EventsTransactionsSummaryByUserByEventName;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


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
public class EventsTransactionsSummaryByUserByEventNameRecord extends TableRecordImpl<EventsTransactionsSummaryByUserByEventNameRecord> implements Record17<String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> {

    private static final long serialVersionUID = -586526483;

    /**
     * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.USER</code>.
     */
    public void setUser(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.USER</code>.
     */
    public String getUser() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.EVENT_NAME</code>.
     */
    public void setEventName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.EVENT_NAME</code>.
     */
    public String getEventName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.COUNT_STAR</code>.
     */
    public void setCountStar(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.COUNT_STAR</code>.
     */
    public ULong getCountStar() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public void setSumTimerWait(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public ULong getSumTimerWait() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public void setMinTimerWait(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public ULong getMinTimerWait() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public void setAvgTimerWait(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public ULong getAvgTimerWait() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public void setMaxTimerWait(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public ULong getMaxTimerWait() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.COUNT_READ_WRITE</code>.
     */
    public void setCountReadWrite(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.COUNT_READ_WRITE</code>.
     */
    public ULong getCountReadWrite() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.SUM_TIMER_READ_WRITE</code>.
     */
    public void setSumTimerReadWrite(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.SUM_TIMER_READ_WRITE</code>.
     */
    public ULong getSumTimerReadWrite() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.MIN_TIMER_READ_WRITE</code>.
     */
    public void setMinTimerReadWrite(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.MIN_TIMER_READ_WRITE</code>.
     */
    public ULong getMinTimerReadWrite() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.AVG_TIMER_READ_WRITE</code>.
     */
    public void setAvgTimerReadWrite(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.AVG_TIMER_READ_WRITE</code>.
     */
    public ULong getAvgTimerReadWrite() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.MAX_TIMER_READ_WRITE</code>.
     */
    public void setMaxTimerReadWrite(ULong value) {
        set(11, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.MAX_TIMER_READ_WRITE</code>.
     */
    public ULong getMaxTimerReadWrite() {
        return (ULong) get(11);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.COUNT_READ_ONLY</code>.
     */
    public void setCountReadOnly(ULong value) {
        set(12, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.COUNT_READ_ONLY</code>.
     */
    public ULong getCountReadOnly() {
        return (ULong) get(12);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.SUM_TIMER_READ_ONLY</code>.
     */
    public void setSumTimerReadOnly(ULong value) {
        set(13, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.SUM_TIMER_READ_ONLY</code>.
     */
    public ULong getSumTimerReadOnly() {
        return (ULong) get(13);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.MIN_TIMER_READ_ONLY</code>.
     */
    public void setMinTimerReadOnly(ULong value) {
        set(14, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.MIN_TIMER_READ_ONLY</code>.
     */
    public ULong getMinTimerReadOnly() {
        return (ULong) get(14);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.AVG_TIMER_READ_ONLY</code>.
     */
    public void setAvgTimerReadOnly(ULong value) {
        set(15, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.AVG_TIMER_READ_ONLY</code>.
     */
    public ULong getAvgTimerReadOnly() {
        return (ULong) get(15);
    }

    /**
     * Setter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.MAX_TIMER_READ_ONLY</code>.
     */
    public void setMaxTimerReadOnly(ULong value) {
        set(16, value);
    }

    /**
     * Getter for <code>performance_schema.events_transactions_summary_by_user_by_event_name.MAX_TIMER_READ_ONLY</code>.
     */
    public ULong getMaxTimerReadOnly() {
        return (ULong) get(16);
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.EVENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.COUNT_STAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.SUM_TIMER_WAIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.MIN_TIMER_WAIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.AVG_TIMER_WAIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field7() {
        return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.MAX_TIMER_WAIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field8() {
        return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.COUNT_READ_WRITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field9() {
        return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.SUM_TIMER_READ_WRITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field10() {
        return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.MIN_TIMER_READ_WRITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field11() {
        return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.AVG_TIMER_READ_WRITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field12() {
        return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.MAX_TIMER_READ_WRITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field13() {
        return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.COUNT_READ_ONLY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field14() {
        return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.SUM_TIMER_READ_ONLY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field15() {
        return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.MIN_TIMER_READ_ONLY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field16() {
        return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.AVG_TIMER_READ_ONLY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field17() {
        return EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME.MAX_TIMER_READ_ONLY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getEventName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value3() {
        return getCountStar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value4() {
        return getSumTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getMinTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value6() {
        return getAvgTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value7() {
        return getMaxTimerWait();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value8() {
        return getCountReadWrite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value9() {
        return getSumTimerReadWrite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value10() {
        return getMinTimerReadWrite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value11() {
        return getAvgTimerReadWrite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value12() {
        return getMaxTimerReadWrite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value13() {
        return getCountReadOnly();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value14() {
        return getSumTimerReadOnly();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value15() {
        return getMinTimerReadOnly();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value16() {
        return getAvgTimerReadOnly();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value17() {
        return getMaxTimerReadOnly();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryByUserByEventNameRecord value1(String value) {
        setUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryByUserByEventNameRecord value2(String value) {
        setEventName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryByUserByEventNameRecord value3(ULong value) {
        setCountStar(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryByUserByEventNameRecord value4(ULong value) {
        setSumTimerWait(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryByUserByEventNameRecord value5(ULong value) {
        setMinTimerWait(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryByUserByEventNameRecord value6(ULong value) {
        setAvgTimerWait(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryByUserByEventNameRecord value7(ULong value) {
        setMaxTimerWait(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryByUserByEventNameRecord value8(ULong value) {
        setCountReadWrite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryByUserByEventNameRecord value9(ULong value) {
        setSumTimerReadWrite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryByUserByEventNameRecord value10(ULong value) {
        setMinTimerReadWrite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryByUserByEventNameRecord value11(ULong value) {
        setAvgTimerReadWrite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryByUserByEventNameRecord value12(ULong value) {
        setMaxTimerReadWrite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryByUserByEventNameRecord value13(ULong value) {
        setCountReadOnly(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryByUserByEventNameRecord value14(ULong value) {
        setSumTimerReadOnly(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryByUserByEventNameRecord value15(ULong value) {
        setMinTimerReadOnly(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryByUserByEventNameRecord value16(ULong value) {
        setAvgTimerReadOnly(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryByUserByEventNameRecord value17(ULong value) {
        setMaxTimerReadOnly(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsSummaryByUserByEventNameRecord values(String value1, String value2, ULong value3, ULong value4, ULong value5, ULong value6, ULong value7, ULong value8, ULong value9, ULong value10, ULong value11, ULong value12, ULong value13, ULong value14, ULong value15, ULong value16, ULong value17) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventsTransactionsSummaryByUserByEventNameRecord
     */
    public EventsTransactionsSummaryByUserByEventNameRecord() {
        super(EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME);
    }

    /**
     * Create a detached, initialised EventsTransactionsSummaryByUserByEventNameRecord
     */
    public EventsTransactionsSummaryByUserByEventNameRecord(String user, String eventName, ULong countStar, ULong sumTimerWait, ULong minTimerWait, ULong avgTimerWait, ULong maxTimerWait, ULong countReadWrite, ULong sumTimerReadWrite, ULong minTimerReadWrite, ULong avgTimerReadWrite, ULong maxTimerReadWrite, ULong countReadOnly, ULong sumTimerReadOnly, ULong minTimerReadOnly, ULong avgTimerReadOnly, ULong maxTimerReadOnly) {
        super(EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME);

        set(0, user);
        set(1, eventName);
        set(2, countStar);
        set(3, sumTimerWait);
        set(4, minTimerWait);
        set(5, avgTimerWait);
        set(6, maxTimerWait);
        set(7, countReadWrite);
        set(8, sumTimerReadWrite);
        set(9, minTimerReadWrite);
        set(10, avgTimerReadWrite);
        set(11, maxTimerReadWrite);
        set(12, countReadOnly);
        set(13, sumTimerReadOnly);
        set(14, minTimerReadOnly);
        set(15, avgTimerReadOnly);
        set(16, maxTimerReadOnly);
    }
}
