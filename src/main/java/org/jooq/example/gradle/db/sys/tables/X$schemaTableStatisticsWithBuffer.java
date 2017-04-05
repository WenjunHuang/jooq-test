/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.sys.tables;


import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.example.gradle.db.sys.Sys;
import org.jooq.example.gradle.db.sys.tables.records.X$schemaTableStatisticsWithBufferRecord;
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
public class X$schemaTableStatisticsWithBuffer extends TableImpl<X$schemaTableStatisticsWithBufferRecord> {

    private static final long serialVersionUID = -1167600901;

    /**
     * The reference instance of <code>sys.x$schema_table_statistics_with_buffer</code>
     */
    public static final X$schemaTableStatisticsWithBuffer X$SCHEMA_TABLE_STATISTICS_WITH_BUFFER = new X$schemaTableStatisticsWithBuffer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$schemaTableStatisticsWithBufferRecord> getRecordType() {
        return X$schemaTableStatisticsWithBufferRecord.class;
    }

    /**
     * The column <code>sys.x$schema_table_statistics_with_buffer.table_schema</code>.
     */
    public final TableField<X$schemaTableStatisticsWithBufferRecord, String> TABLE_SCHEMA = createField("table_schema", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics_with_buffer.table_name</code>.
     */
    public final TableField<X$schemaTableStatisticsWithBufferRecord, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics_with_buffer.rows_fetched</code>.
     */
    public final TableField<X$schemaTableStatisticsWithBufferRecord, ULong> ROWS_FETCHED = createField("rows_fetched", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics_with_buffer.fetch_latency</code>.
     */
    public final TableField<X$schemaTableStatisticsWithBufferRecord, ULong> FETCH_LATENCY = createField("fetch_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics_with_buffer.rows_inserted</code>.
     */
    public final TableField<X$schemaTableStatisticsWithBufferRecord, ULong> ROWS_INSERTED = createField("rows_inserted", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics_with_buffer.insert_latency</code>.
     */
    public final TableField<X$schemaTableStatisticsWithBufferRecord, ULong> INSERT_LATENCY = createField("insert_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics_with_buffer.rows_updated</code>.
     */
    public final TableField<X$schemaTableStatisticsWithBufferRecord, ULong> ROWS_UPDATED = createField("rows_updated", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics_with_buffer.update_latency</code>.
     */
    public final TableField<X$schemaTableStatisticsWithBufferRecord, ULong> UPDATE_LATENCY = createField("update_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics_with_buffer.rows_deleted</code>.
     */
    public final TableField<X$schemaTableStatisticsWithBufferRecord, ULong> ROWS_DELETED = createField("rows_deleted", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics_with_buffer.delete_latency</code>.
     */
    public final TableField<X$schemaTableStatisticsWithBufferRecord, ULong> DELETE_LATENCY = createField("delete_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics_with_buffer.io_read_requests</code>.
     */
    public final TableField<X$schemaTableStatisticsWithBufferRecord, BigInteger> IO_READ_REQUESTS = createField("io_read_requests", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics_with_buffer.io_read</code>.
     */
    public final TableField<X$schemaTableStatisticsWithBufferRecord, BigInteger> IO_READ = createField("io_read", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(41), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics_with_buffer.io_read_latency</code>.
     */
    public final TableField<X$schemaTableStatisticsWithBufferRecord, BigInteger> IO_READ_LATENCY = createField("io_read_latency", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics_with_buffer.io_write_requests</code>.
     */
    public final TableField<X$schemaTableStatisticsWithBufferRecord, BigInteger> IO_WRITE_REQUESTS = createField("io_write_requests", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics_with_buffer.io_write</code>.
     */
    public final TableField<X$schemaTableStatisticsWithBufferRecord, BigInteger> IO_WRITE = createField("io_write", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(41), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics_with_buffer.io_write_latency</code>.
     */
    public final TableField<X$schemaTableStatisticsWithBufferRecord, BigInteger> IO_WRITE_LATENCY = createField("io_write_latency", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics_with_buffer.io_misc_requests</code>.
     */
    public final TableField<X$schemaTableStatisticsWithBufferRecord, BigInteger> IO_MISC_REQUESTS = createField("io_misc_requests", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics_with_buffer.io_misc_latency</code>.
     */
    public final TableField<X$schemaTableStatisticsWithBufferRecord, BigInteger> IO_MISC_LATENCY = createField("io_misc_latency", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_allocated</code>.
     */
    public final TableField<X$schemaTableStatisticsWithBufferRecord, BigInteger> INNODB_BUFFER_ALLOCATED = createField("innodb_buffer_allocated", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(43), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_data</code>.
     */
    public final TableField<X$schemaTableStatisticsWithBufferRecord, BigInteger> INNODB_BUFFER_DATA = createField("innodb_buffer_data", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(43), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_free</code>.
     */
    public final TableField<X$schemaTableStatisticsWithBufferRecord, BigInteger> INNODB_BUFFER_FREE = createField("innodb_buffer_free", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(44), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_pages</code>.
     */
    public final TableField<X$schemaTableStatisticsWithBufferRecord, Long> INNODB_BUFFER_PAGES = createField("innodb_buffer_pages", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_pages_hashed</code>.
     */
    public final TableField<X$schemaTableStatisticsWithBufferRecord, Long> INNODB_BUFFER_PAGES_HASHED = createField("innodb_buffer_pages_hashed", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_pages_old</code>.
     */
    public final TableField<X$schemaTableStatisticsWithBufferRecord, Long> INNODB_BUFFER_PAGES_OLD = createField("innodb_buffer_pages_old", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_rows_cached</code>.
     */
    public final TableField<X$schemaTableStatisticsWithBufferRecord, BigInteger> INNODB_BUFFER_ROWS_CACHED = createField("innodb_buffer_rows_cached", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(44).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.DECIMAL_INTEGER)), this, "");

    /**
     * Create a <code>sys.x$schema_table_statistics_with_buffer</code> table reference
     */
    public X$schemaTableStatisticsWithBuffer() {
        this("x$schema_table_statistics_with_buffer", null);
    }

    /**
     * Create an aliased <code>sys.x$schema_table_statistics_with_buffer</code> table reference
     */
    public X$schemaTableStatisticsWithBuffer(String alias) {
        this(alias, X$SCHEMA_TABLE_STATISTICS_WITH_BUFFER);
    }

    private X$schemaTableStatisticsWithBuffer(String alias, Table<X$schemaTableStatisticsWithBufferRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$schemaTableStatisticsWithBuffer(String alias, Table<X$schemaTableStatisticsWithBufferRecord> aliased, Field<?>[] parameters) {
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
    public X$schemaTableStatisticsWithBuffer as(String alias) {
        return new X$schemaTableStatisticsWithBuffer(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$schemaTableStatisticsWithBuffer rename(String name) {
        return new X$schemaTableStatisticsWithBuffer(name, null);
    }
}
