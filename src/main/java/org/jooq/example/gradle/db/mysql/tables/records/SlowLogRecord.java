/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.mysql.tables.records;


import java.sql.Time;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.example.gradle.db.mysql.tables.SlowLog;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * Slow log
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SlowLogRecord extends TableRecordImpl<SlowLogRecord> implements Record12<Timestamp, String, Time, Time, Integer, Integer, String, Integer, Integer, UInteger, byte[], ULong> {

    private static final long serialVersionUID = 1735656363;

    /**
     * Setter for <code>mysql.slow_log.start_time</code>.
     */
    public void setStartTime(Timestamp value) {
        set(0, value);
    }

    /**
     * Getter for <code>mysql.slow_log.start_time</code>.
     */
    public Timestamp getStartTime() {
        return (Timestamp) get(0);
    }

    /**
     * Setter for <code>mysql.slow_log.user_host</code>.
     */
    public void setUserHost(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mysql.slow_log.user_host</code>.
     */
    public String getUserHost() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mysql.slow_log.query_time</code>.
     */
    public void setQueryTime(Time value) {
        set(2, value);
    }

    /**
     * Getter for <code>mysql.slow_log.query_time</code>.
     */
    public Time getQueryTime() {
        return (Time) get(2);
    }

    /**
     * Setter for <code>mysql.slow_log.lock_time</code>.
     */
    public void setLockTime(Time value) {
        set(3, value);
    }

    /**
     * Getter for <code>mysql.slow_log.lock_time</code>.
     */
    public Time getLockTime() {
        return (Time) get(3);
    }

    /**
     * Setter for <code>mysql.slow_log.rows_sent</code>.
     */
    public void setRowsSent(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mysql.slow_log.rows_sent</code>.
     */
    public Integer getRowsSent() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mysql.slow_log.rows_examined</code>.
     */
    public void setRowsExamined(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>mysql.slow_log.rows_examined</code>.
     */
    public Integer getRowsExamined() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>mysql.slow_log.db</code>.
     */
    public void setDb(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mysql.slow_log.db</code>.
     */
    public String getDb() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mysql.slow_log.last_insert_id</code>.
     */
    public void setLastInsertId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>mysql.slow_log.last_insert_id</code>.
     */
    public Integer getLastInsertId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>mysql.slow_log.insert_id</code>.
     */
    public void setInsertId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>mysql.slow_log.insert_id</code>.
     */
    public Integer getInsertId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>mysql.slow_log.server_id</code>.
     */
    public void setServerId(UInteger value) {
        set(9, value);
    }

    /**
     * Getter for <code>mysql.slow_log.server_id</code>.
     */
    public UInteger getServerId() {
        return (UInteger) get(9);
    }

    /**
     * Setter for <code>mysql.slow_log.sql_text</code>.
     */
    public void setSqlText(byte... value) {
        set(10, value);
    }

    /**
     * Getter for <code>mysql.slow_log.sql_text</code>.
     */
    public byte[] getSqlText() {
        return (byte[]) get(10);
    }

    /**
     * Setter for <code>mysql.slow_log.thread_id</code>.
     */
    public void setThreadId(ULong value) {
        set(11, value);
    }

    /**
     * Getter for <code>mysql.slow_log.thread_id</code>.
     */
    public ULong getThreadId() {
        return (ULong) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Timestamp, String, Time, Time, Integer, Integer, String, Integer, Integer, UInteger, byte[], ULong> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Timestamp, String, Time, Time, Integer, Integer, String, Integer, Integer, UInteger, byte[], ULong> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field1() {
        return SlowLog.SLOW_LOG.START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SlowLog.SLOW_LOG.USER_HOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Time> field3() {
        return SlowLog.SLOW_LOG.QUERY_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Time> field4() {
        return SlowLog.SLOW_LOG.LOCK_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return SlowLog.SLOW_LOG.ROWS_SENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return SlowLog.SLOW_LOG.ROWS_EXAMINED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return SlowLog.SLOW_LOG.DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return SlowLog.SLOW_LOG.LAST_INSERT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return SlowLog.SLOW_LOG.INSERT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field10() {
        return SlowLog.SLOW_LOG.SERVER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field11() {
        return SlowLog.SLOW_LOG.SQL_TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field12() {
        return SlowLog.SLOW_LOG.THREAD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value1() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUserHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Time value3() {
        return getQueryTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Time value4() {
        return getLockTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getRowsSent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getRowsExamined();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getLastInsertId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getInsertId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value10() {
        return getServerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value11() {
        return getSqlText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value12() {
        return getThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SlowLogRecord value1(Timestamp value) {
        setStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SlowLogRecord value2(String value) {
        setUserHost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SlowLogRecord value3(Time value) {
        setQueryTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SlowLogRecord value4(Time value) {
        setLockTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SlowLogRecord value5(Integer value) {
        setRowsSent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SlowLogRecord value6(Integer value) {
        setRowsExamined(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SlowLogRecord value7(String value) {
        setDb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SlowLogRecord value8(Integer value) {
        setLastInsertId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SlowLogRecord value9(Integer value) {
        setInsertId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SlowLogRecord value10(UInteger value) {
        setServerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SlowLogRecord value11(byte... value) {
        setSqlText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SlowLogRecord value12(ULong value) {
        setThreadId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SlowLogRecord values(Timestamp value1, String value2, Time value3, Time value4, Integer value5, Integer value6, String value7, Integer value8, Integer value9, UInteger value10, byte[] value11, ULong value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SlowLogRecord
     */
    public SlowLogRecord() {
        super(SlowLog.SLOW_LOG);
    }

    /**
     * Create a detached, initialised SlowLogRecord
     */
    public SlowLogRecord(Timestamp startTime, String userHost, Time queryTime, Time lockTime, Integer rowsSent, Integer rowsExamined, String db, Integer lastInsertId, Integer insertId, UInteger serverId, byte[] sqlText, ULong threadId) {
        super(SlowLog.SLOW_LOG);

        set(0, startTime);
        set(1, userHost);
        set(2, queryTime);
        set(3, lockTime);
        set(4, rowsSent);
        set(5, rowsExamined);
        set(6, db);
        set(7, lastInsertId);
        set(8, insertId);
        set(9, serverId);
        set(10, sqlText);
        set(11, threadId);
    }
}
