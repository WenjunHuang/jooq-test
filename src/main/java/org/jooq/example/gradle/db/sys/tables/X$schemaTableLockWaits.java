/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.sys.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.example.gradle.db.sys.Sys;
import org.jooq.example.gradle.db.sys.tables.records.X$schemaTableLockWaitsRecord;
import org.jooq.impl.TableImpl;
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
public class X$schemaTableLockWaits extends TableImpl<X$schemaTableLockWaitsRecord> {

    private static final long serialVersionUID = -1990788293;

    /**
     * The reference instance of <code>sys.x$schema_table_lock_waits</code>
     */
    public static final X$schemaTableLockWaits X$SCHEMA_TABLE_LOCK_WAITS = new X$schemaTableLockWaits();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$schemaTableLockWaitsRecord> getRecordType() {
        return X$schemaTableLockWaitsRecord.class;
    }

    /**
     * The column <code>sys.x$schema_table_lock_waits.object_schema</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, String> OBJECT_SCHEMA = createField("object_schema", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.object_name</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, String> OBJECT_NAME = createField("object_name", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.waiting_thread_id</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, ULong> WAITING_THREAD_ID = createField("waiting_thread_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.waiting_pid</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, ULong> WAITING_PID = createField("waiting_pid", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.waiting_account</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, String> WAITING_ACCOUNT = createField("waiting_account", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.waiting_lock_type</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, String> WAITING_LOCK_TYPE = createField("waiting_lock_type", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.waiting_lock_duration</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, String> WAITING_LOCK_DURATION = createField("waiting_lock_duration", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.waiting_query</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, String> WAITING_QUERY = createField("waiting_query", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.waiting_query_secs</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, Long> WAITING_QUERY_SECS = createField("waiting_query_secs", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.waiting_query_rows_affected</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, ULong> WAITING_QUERY_ROWS_AFFECTED = createField("waiting_query_rows_affected", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.waiting_query_rows_examined</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, ULong> WAITING_QUERY_ROWS_EXAMINED = createField("waiting_query_rows_examined", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.blocking_thread_id</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, ULong> BLOCKING_THREAD_ID = createField("blocking_thread_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.blocking_pid</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, ULong> BLOCKING_PID = createField("blocking_pid", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.blocking_account</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, String> BLOCKING_ACCOUNT = createField("blocking_account", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.blocking_lock_type</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, String> BLOCKING_LOCK_TYPE = createField("blocking_lock_type", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.blocking_lock_duration</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, String> BLOCKING_LOCK_DURATION = createField("blocking_lock_duration", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.sql_kill_blocking_query</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, String> SQL_KILL_BLOCKING_QUERY = createField("sql_kill_blocking_query", org.jooq.impl.SQLDataType.VARCHAR.length(31), this, "");

    /**
     * The column <code>sys.x$schema_table_lock_waits.sql_kill_blocking_connection</code>.
     */
    public final TableField<X$schemaTableLockWaitsRecord, String> SQL_KILL_BLOCKING_CONNECTION = createField("sql_kill_blocking_connection", org.jooq.impl.SQLDataType.VARCHAR.length(25), this, "");

    /**
     * Create a <code>sys.x$schema_table_lock_waits</code> table reference
     */
    public X$schemaTableLockWaits() {
        this("x$schema_table_lock_waits", null);
    }

    /**
     * Create an aliased <code>sys.x$schema_table_lock_waits</code> table reference
     */
    public X$schemaTableLockWaits(String alias) {
        this(alias, X$SCHEMA_TABLE_LOCK_WAITS);
    }

    private X$schemaTableLockWaits(String alias, Table<X$schemaTableLockWaitsRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$schemaTableLockWaits(String alias, Table<X$schemaTableLockWaitsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "VIEW");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$schemaTableLockWaits as(String alias) {
        return new X$schemaTableLockWaits(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$schemaTableLockWaits rename(String name) {
        return new X$schemaTableLockWaits(name, null);
    }
}
