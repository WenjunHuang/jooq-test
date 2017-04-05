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
import org.jooq.example.gradle.db.sys.tables.records.X$schemaTableStatisticsRecord;
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
public class X$schemaTableStatistics extends TableImpl<X$schemaTableStatisticsRecord> {

    private static final long serialVersionUID = -465741659;

    /**
     * The reference instance of <code>sys.x$schema_table_statistics</code>
     */
    public static final X$schemaTableStatistics X$SCHEMA_TABLE_STATISTICS = new X$schemaTableStatistics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$schemaTableStatisticsRecord> getRecordType() {
        return X$schemaTableStatisticsRecord.class;
    }

    /**
     * The column <code>sys.x$schema_table_statistics.table_schema</code>.
     */
    public final TableField<X$schemaTableStatisticsRecord, String> TABLE_SCHEMA = createField("table_schema", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics.table_name</code>.
     */
    public final TableField<X$schemaTableStatisticsRecord, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics.total_latency</code>.
     */
    public final TableField<X$schemaTableStatisticsRecord, ULong> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics.rows_fetched</code>.
     */
    public final TableField<X$schemaTableStatisticsRecord, ULong> ROWS_FETCHED = createField("rows_fetched", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics.fetch_latency</code>.
     */
    public final TableField<X$schemaTableStatisticsRecord, ULong> FETCH_LATENCY = createField("fetch_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics.rows_inserted</code>.
     */
    public final TableField<X$schemaTableStatisticsRecord, ULong> ROWS_INSERTED = createField("rows_inserted", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics.insert_latency</code>.
     */
    public final TableField<X$schemaTableStatisticsRecord, ULong> INSERT_LATENCY = createField("insert_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics.rows_updated</code>.
     */
    public final TableField<X$schemaTableStatisticsRecord, ULong> ROWS_UPDATED = createField("rows_updated", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics.update_latency</code>.
     */
    public final TableField<X$schemaTableStatisticsRecord, ULong> UPDATE_LATENCY = createField("update_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics.rows_deleted</code>.
     */
    public final TableField<X$schemaTableStatisticsRecord, ULong> ROWS_DELETED = createField("rows_deleted", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics.delete_latency</code>.
     */
    public final TableField<X$schemaTableStatisticsRecord, ULong> DELETE_LATENCY = createField("delete_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics.io_read_requests</code>.
     */
    public final TableField<X$schemaTableStatisticsRecord, BigInteger> IO_READ_REQUESTS = createField("io_read_requests", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics.io_read</code>.
     */
    public final TableField<X$schemaTableStatisticsRecord, BigInteger> IO_READ = createField("io_read", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(41), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics.io_read_latency</code>.
     */
    public final TableField<X$schemaTableStatisticsRecord, BigInteger> IO_READ_LATENCY = createField("io_read_latency", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics.io_write_requests</code>.
     */
    public final TableField<X$schemaTableStatisticsRecord, BigInteger> IO_WRITE_REQUESTS = createField("io_write_requests", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics.io_write</code>.
     */
    public final TableField<X$schemaTableStatisticsRecord, BigInteger> IO_WRITE = createField("io_write", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(41), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics.io_write_latency</code>.
     */
    public final TableField<X$schemaTableStatisticsRecord, BigInteger> IO_WRITE_LATENCY = createField("io_write_latency", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics.io_misc_requests</code>.
     */
    public final TableField<X$schemaTableStatisticsRecord, BigInteger> IO_MISC_REQUESTS = createField("io_misc_requests", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * The column <code>sys.x$schema_table_statistics.io_misc_latency</code>.
     */
    public final TableField<X$schemaTableStatisticsRecord, BigInteger> IO_MISC_LATENCY = createField("io_misc_latency", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * Create a <code>sys.x$schema_table_statistics</code> table reference
     */
    public X$schemaTableStatistics() {
        this("x$schema_table_statistics", null);
    }

    /**
     * Create an aliased <code>sys.x$schema_table_statistics</code> table reference
     */
    public X$schemaTableStatistics(String alias) {
        this(alias, X$SCHEMA_TABLE_STATISTICS);
    }

    private X$schemaTableStatistics(String alias, Table<X$schemaTableStatisticsRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$schemaTableStatistics(String alias, Table<X$schemaTableStatisticsRecord> aliased, Field<?>[] parameters) {
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
    public X$schemaTableStatistics as(String alias) {
        return new X$schemaTableStatistics(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$schemaTableStatistics rename(String name) {
        return new X$schemaTableStatistics(name, null);
    }
}
