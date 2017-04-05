/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.sys.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.example.gradle.db.sys.tables.SchemaTableLockWaits;
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
public class SchemaTableLockWaitsRecord extends TableRecordImpl<SchemaTableLockWaitsRecord> implements Record18<String, String, ULong, ULong, String, String, String, String, Long, ULong, ULong, ULong, ULong, String, String, String, String, String> {

    private static final long serialVersionUID = -64320237;

    /**
     * Setter for <code>sys.schema_table_lock_waits.object_schema</code>.
     */
    public void setObjectSchema(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.schema_table_lock_waits.object_schema</code>.
     */
    public String getObjectSchema() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.schema_table_lock_waits.object_name</code>.
     */
    public void setObjectName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.schema_table_lock_waits.object_name</code>.
     */
    public String getObjectName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.schema_table_lock_waits.waiting_thread_id</code>.
     */
    public void setWaitingThreadId(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.schema_table_lock_waits.waiting_thread_id</code>.
     */
    public ULong getWaitingThreadId() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>sys.schema_table_lock_waits.waiting_pid</code>.
     */
    public void setWaitingPid(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.schema_table_lock_waits.waiting_pid</code>.
     */
    public ULong getWaitingPid() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>sys.schema_table_lock_waits.waiting_account</code>.
     */
    public void setWaitingAccount(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.schema_table_lock_waits.waiting_account</code>.
     */
    public String getWaitingAccount() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sys.schema_table_lock_waits.waiting_lock_type</code>.
     */
    public void setWaitingLockType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.schema_table_lock_waits.waiting_lock_type</code>.
     */
    public String getWaitingLockType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sys.schema_table_lock_waits.waiting_lock_duration</code>.
     */
    public void setWaitingLockDuration(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.schema_table_lock_waits.waiting_lock_duration</code>.
     */
    public String getWaitingLockDuration() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sys.schema_table_lock_waits.waiting_query</code>.
     */
    public void setWaitingQuery(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>sys.schema_table_lock_waits.waiting_query</code>.
     */
    public String getWaitingQuery() {
        return (String) get(7);
    }

    /**
     * Setter for <code>sys.schema_table_lock_waits.waiting_query_secs</code>.
     */
    public void setWaitingQuerySecs(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>sys.schema_table_lock_waits.waiting_query_secs</code>.
     */
    public Long getWaitingQuerySecs() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>sys.schema_table_lock_waits.waiting_query_rows_affected</code>.
     */
    public void setWaitingQueryRowsAffected(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>sys.schema_table_lock_waits.waiting_query_rows_affected</code>.
     */
    public ULong getWaitingQueryRowsAffected() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>sys.schema_table_lock_waits.waiting_query_rows_examined</code>.
     */
    public void setWaitingQueryRowsExamined(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>sys.schema_table_lock_waits.waiting_query_rows_examined</code>.
     */
    public ULong getWaitingQueryRowsExamined() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>sys.schema_table_lock_waits.blocking_thread_id</code>.
     */
    public void setBlockingThreadId(ULong value) {
        set(11, value);
    }

    /**
     * Getter for <code>sys.schema_table_lock_waits.blocking_thread_id</code>.
     */
    public ULong getBlockingThreadId() {
        return (ULong) get(11);
    }

    /**
     * Setter for <code>sys.schema_table_lock_waits.blocking_pid</code>.
     */
    public void setBlockingPid(ULong value) {
        set(12, value);
    }

    /**
     * Getter for <code>sys.schema_table_lock_waits.blocking_pid</code>.
     */
    public ULong getBlockingPid() {
        return (ULong) get(12);
    }

    /**
     * Setter for <code>sys.schema_table_lock_waits.blocking_account</code>.
     */
    public void setBlockingAccount(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>sys.schema_table_lock_waits.blocking_account</code>.
     */
    public String getBlockingAccount() {
        return (String) get(13);
    }

    /**
     * Setter for <code>sys.schema_table_lock_waits.blocking_lock_type</code>.
     */
    public void setBlockingLockType(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>sys.schema_table_lock_waits.blocking_lock_type</code>.
     */
    public String getBlockingLockType() {
        return (String) get(14);
    }

    /**
     * Setter for <code>sys.schema_table_lock_waits.blocking_lock_duration</code>.
     */
    public void setBlockingLockDuration(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>sys.schema_table_lock_waits.blocking_lock_duration</code>.
     */
    public String getBlockingLockDuration() {
        return (String) get(15);
    }

    /**
     * Setter for <code>sys.schema_table_lock_waits.sql_kill_blocking_query</code>.
     */
    public void setSqlKillBlockingQuery(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>sys.schema_table_lock_waits.sql_kill_blocking_query</code>.
     */
    public String getSqlKillBlockingQuery() {
        return (String) get(16);
    }

    /**
     * Setter for <code>sys.schema_table_lock_waits.sql_kill_blocking_connection</code>.
     */
    public void setSqlKillBlockingConnection(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>sys.schema_table_lock_waits.sql_kill_blocking_connection</code>.
     */
    public String getSqlKillBlockingConnection() {
        return (String) get(17);
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<String, String, ULong, ULong, String, String, String, String, Long, ULong, ULong, ULong, ULong, String, String, String, String, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<String, String, ULong, ULong, String, String, String, String, Long, ULong, ULong, ULong, ULong, String, String, String, String, String> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SchemaTableLockWaits.SCHEMA_TABLE_LOCK_WAITS.OBJECT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SchemaTableLockWaits.SCHEMA_TABLE_LOCK_WAITS.OBJECT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return SchemaTableLockWaits.SCHEMA_TABLE_LOCK_WAITS.WAITING_THREAD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return SchemaTableLockWaits.SCHEMA_TABLE_LOCK_WAITS.WAITING_PID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SchemaTableLockWaits.SCHEMA_TABLE_LOCK_WAITS.WAITING_ACCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SchemaTableLockWaits.SCHEMA_TABLE_LOCK_WAITS.WAITING_LOCK_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return SchemaTableLockWaits.SCHEMA_TABLE_LOCK_WAITS.WAITING_LOCK_DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return SchemaTableLockWaits.SCHEMA_TABLE_LOCK_WAITS.WAITING_QUERY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return SchemaTableLockWaits.SCHEMA_TABLE_LOCK_WAITS.WAITING_QUERY_SECS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field10() {
        return SchemaTableLockWaits.SCHEMA_TABLE_LOCK_WAITS.WAITING_QUERY_ROWS_AFFECTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field11() {
        return SchemaTableLockWaits.SCHEMA_TABLE_LOCK_WAITS.WAITING_QUERY_ROWS_EXAMINED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field12() {
        return SchemaTableLockWaits.SCHEMA_TABLE_LOCK_WAITS.BLOCKING_THREAD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field13() {
        return SchemaTableLockWaits.SCHEMA_TABLE_LOCK_WAITS.BLOCKING_PID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return SchemaTableLockWaits.SCHEMA_TABLE_LOCK_WAITS.BLOCKING_ACCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return SchemaTableLockWaits.SCHEMA_TABLE_LOCK_WAITS.BLOCKING_LOCK_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return SchemaTableLockWaits.SCHEMA_TABLE_LOCK_WAITS.BLOCKING_LOCK_DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return SchemaTableLockWaits.SCHEMA_TABLE_LOCK_WAITS.SQL_KILL_BLOCKING_QUERY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return SchemaTableLockWaits.SCHEMA_TABLE_LOCK_WAITS.SQL_KILL_BLOCKING_CONNECTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getObjectSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getObjectName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value3() {
        return getWaitingThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value4() {
        return getWaitingPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getWaitingAccount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getWaitingLockType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getWaitingLockDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getWaitingQuery();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getWaitingQuerySecs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value10() {
        return getWaitingQueryRowsAffected();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value11() {
        return getWaitingQueryRowsExamined();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value12() {
        return getBlockingThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value13() {
        return getBlockingPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getBlockingAccount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getBlockingLockType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getBlockingLockDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getSqlKillBlockingQuery();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getSqlKillBlockingConnection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaTableLockWaitsRecord value1(String value) {
        setObjectSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaTableLockWaitsRecord value2(String value) {
        setObjectName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaTableLockWaitsRecord value3(ULong value) {
        setWaitingThreadId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaTableLockWaitsRecord value4(ULong value) {
        setWaitingPid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaTableLockWaitsRecord value5(String value) {
        setWaitingAccount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaTableLockWaitsRecord value6(String value) {
        setWaitingLockType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaTableLockWaitsRecord value7(String value) {
        setWaitingLockDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaTableLockWaitsRecord value8(String value) {
        setWaitingQuery(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaTableLockWaitsRecord value9(Long value) {
        setWaitingQuerySecs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaTableLockWaitsRecord value10(ULong value) {
        setWaitingQueryRowsAffected(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaTableLockWaitsRecord value11(ULong value) {
        setWaitingQueryRowsExamined(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaTableLockWaitsRecord value12(ULong value) {
        setBlockingThreadId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaTableLockWaitsRecord value13(ULong value) {
        setBlockingPid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaTableLockWaitsRecord value14(String value) {
        setBlockingAccount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaTableLockWaitsRecord value15(String value) {
        setBlockingLockType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaTableLockWaitsRecord value16(String value) {
        setBlockingLockDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaTableLockWaitsRecord value17(String value) {
        setSqlKillBlockingQuery(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaTableLockWaitsRecord value18(String value) {
        setSqlKillBlockingConnection(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaTableLockWaitsRecord values(String value1, String value2, ULong value3, ULong value4, String value5, String value6, String value7, String value8, Long value9, ULong value10, ULong value11, ULong value12, ULong value13, String value14, String value15, String value16, String value17, String value18) {
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
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SchemaTableLockWaitsRecord
     */
    public SchemaTableLockWaitsRecord() {
        super(SchemaTableLockWaits.SCHEMA_TABLE_LOCK_WAITS);
    }

    /**
     * Create a detached, initialised SchemaTableLockWaitsRecord
     */
    public SchemaTableLockWaitsRecord(String objectSchema, String objectName, ULong waitingThreadId, ULong waitingPid, String waitingAccount, String waitingLockType, String waitingLockDuration, String waitingQuery, Long waitingQuerySecs, ULong waitingQueryRowsAffected, ULong waitingQueryRowsExamined, ULong blockingThreadId, ULong blockingPid, String blockingAccount, String blockingLockType, String blockingLockDuration, String sqlKillBlockingQuery, String sqlKillBlockingConnection) {
        super(SchemaTableLockWaits.SCHEMA_TABLE_LOCK_WAITS);

        set(0, objectSchema);
        set(1, objectName);
        set(2, waitingThreadId);
        set(3, waitingPid);
        set(4, waitingAccount);
        set(5, waitingLockType);
        set(6, waitingLockDuration);
        set(7, waitingQuery);
        set(8, waitingQuerySecs);
        set(9, waitingQueryRowsAffected);
        set(10, waitingQueryRowsExamined);
        set(11, blockingThreadId);
        set(12, blockingPid);
        set(13, blockingAccount);
        set(14, blockingLockType);
        set(15, blockingLockDuration);
        set(16, sqlKillBlockingQuery);
        set(17, sqlKillBlockingConnection);
    }
}
