/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.sys.tables.records;


import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.example.gradle.db.sys.tables.IoByThreadByLatency;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IoByThreadByLatencyRecord extends TableRecordImpl<IoByThreadByLatencyRecord> implements Record8<String, BigInteger, String, String, String, String, ULong, ULong> {

    private static final long serialVersionUID = 2118337226;

    /**
     * Setter for <code>sys.io_by_thread_by_latency.user</code>.
     */
    public void setUser(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.io_by_thread_by_latency.user</code>.
     */
    public String getUser() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.io_by_thread_by_latency.total</code>.
     */
    public void setTotal(BigInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.io_by_thread_by_latency.total</code>.
     */
    public BigInteger getTotal() {
        return (BigInteger) get(1);
    }

    /**
     * Setter for <code>sys.io_by_thread_by_latency.total_latency</code>.
     */
    public void setTotalLatency(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.io_by_thread_by_latency.total_latency</code>.
     */
    public String getTotalLatency() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sys.io_by_thread_by_latency.min_latency</code>.
     */
    public void setMinLatency(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.io_by_thread_by_latency.min_latency</code>.
     */
    public String getMinLatency() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sys.io_by_thread_by_latency.avg_latency</code>.
     */
    public void setAvgLatency(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.io_by_thread_by_latency.avg_latency</code>.
     */
    public String getAvgLatency() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sys.io_by_thread_by_latency.max_latency</code>.
     */
    public void setMaxLatency(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.io_by_thread_by_latency.max_latency</code>.
     */
    public String getMaxLatency() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sys.io_by_thread_by_latency.thread_id</code>.
     */
    public void setThreadId(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.io_by_thread_by_latency.thread_id</code>.
     */
    public ULong getThreadId() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>sys.io_by_thread_by_latency.processlist_id</code>.
     */
    public void setProcesslistId(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>sys.io_by_thread_by_latency.processlist_id</code>.
     */
    public ULong getProcesslistId() {
        return (ULong) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, BigInteger, String, String, String, String, ULong, ULong> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, BigInteger, String, String, String, String, ULong, ULong> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return IoByThreadByLatency.IO_BY_THREAD_BY_LATENCY.USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field2() {
        return IoByThreadByLatency.IO_BY_THREAD_BY_LATENCY.TOTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return IoByThreadByLatency.IO_BY_THREAD_BY_LATENCY.TOTAL_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return IoByThreadByLatency.IO_BY_THREAD_BY_LATENCY.MIN_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return IoByThreadByLatency.IO_BY_THREAD_BY_LATENCY.AVG_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return IoByThreadByLatency.IO_BY_THREAD_BY_LATENCY.MAX_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field7() {
        return IoByThreadByLatency.IO_BY_THREAD_BY_LATENCY.THREAD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field8() {
        return IoByThreadByLatency.IO_BY_THREAD_BY_LATENCY.PROCESSLIST_ID;
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
    public BigInteger value2() {
        return getTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTotalLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMinLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getAvgLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getMaxLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value7() {
        return getThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value8() {
        return getProcesslistId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IoByThreadByLatencyRecord value1(String value) {
        setUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IoByThreadByLatencyRecord value2(BigInteger value) {
        setTotal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IoByThreadByLatencyRecord value3(String value) {
        setTotalLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IoByThreadByLatencyRecord value4(String value) {
        setMinLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IoByThreadByLatencyRecord value5(String value) {
        setAvgLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IoByThreadByLatencyRecord value6(String value) {
        setMaxLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IoByThreadByLatencyRecord value7(ULong value) {
        setThreadId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IoByThreadByLatencyRecord value8(ULong value) {
        setProcesslistId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IoByThreadByLatencyRecord values(String value1, BigInteger value2, String value3, String value4, String value5, String value6, ULong value7, ULong value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IoByThreadByLatencyRecord
     */
    public IoByThreadByLatencyRecord() {
        super(IoByThreadByLatency.IO_BY_THREAD_BY_LATENCY);
    }

    /**
     * Create a detached, initialised IoByThreadByLatencyRecord
     */
    public IoByThreadByLatencyRecord(String user, BigInteger total, String totalLatency, String minLatency, String avgLatency, String maxLatency, ULong threadId, ULong processlistId) {
        super(IoByThreadByLatency.IO_BY_THREAD_BY_LATENCY);

        set(0, user);
        set(1, total);
        set(2, totalLatency);
        set(3, minLatency);
        set(4, avgLatency);
        set(5, maxLatency);
        set(6, threadId);
        set(7, processlistId);
    }
}
