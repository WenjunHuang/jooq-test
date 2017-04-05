/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.sys.tables;


import java.math.BigDecimal;
import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.example.gradle.db.sys.Sys;
import org.jooq.example.gradle.db.sys.tables.records.X$memoryByHostByCurrentBytesRecord;
import org.jooq.impl.TableImpl;


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
public class X$memoryByHostByCurrentBytes extends TableImpl<X$memoryByHostByCurrentBytesRecord> {

    private static final long serialVersionUID = 283849924;

    /**
     * The reference instance of <code>sys.x$memory_by_host_by_current_bytes</code>
     */
    public static final X$memoryByHostByCurrentBytes X$MEMORY_BY_HOST_BY_CURRENT_BYTES = new X$memoryByHostByCurrentBytes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$memoryByHostByCurrentBytesRecord> getRecordType() {
        return X$memoryByHostByCurrentBytesRecord.class;
    }

    /**
     * The column <code>sys.x$memory_by_host_by_current_bytes.host</code>.
     */
    public final TableField<X$memoryByHostByCurrentBytesRecord, String> HOST = createField("host", org.jooq.impl.SQLDataType.VARCHAR.length(60), this, "");

    /**
     * The column <code>sys.x$memory_by_host_by_current_bytes.current_count_used</code>.
     */
    public final TableField<X$memoryByHostByCurrentBytesRecord, BigInteger> CURRENT_COUNT_USED = createField("current_count_used", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(41), this, "");

    /**
     * The column <code>sys.x$memory_by_host_by_current_bytes.current_allocated</code>.
     */
    public final TableField<X$memoryByHostByCurrentBytesRecord, BigInteger> CURRENT_ALLOCATED = createField("current_allocated", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(41), this, "");

    /**
     * The column <code>sys.x$memory_by_host_by_current_bytes.current_avg_alloc</code>.
     */
    public final TableField<X$memoryByHostByCurrentBytesRecord, BigDecimal> CURRENT_AVG_ALLOC = createField("current_avg_alloc", org.jooq.impl.SQLDataType.DECIMAL.precision(45, 4).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>sys.x$memory_by_host_by_current_bytes.current_max_alloc</code>.
     */
    public final TableField<X$memoryByHostByCurrentBytesRecord, Long> CURRENT_MAX_ALLOC = createField("current_max_alloc", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>sys.x$memory_by_host_by_current_bytes.total_allocated</code>.
     */
    public final TableField<X$memoryByHostByCurrentBytesRecord, BigInteger> TOTAL_ALLOCATED = createField("total_allocated", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * Create a <code>sys.x$memory_by_host_by_current_bytes</code> table reference
     */
    public X$memoryByHostByCurrentBytes() {
        this("x$memory_by_host_by_current_bytes", null);
    }

    /**
     * Create an aliased <code>sys.x$memory_by_host_by_current_bytes</code> table reference
     */
    public X$memoryByHostByCurrentBytes(String alias) {
        this(alias, X$MEMORY_BY_HOST_BY_CURRENT_BYTES);
    }

    private X$memoryByHostByCurrentBytes(String alias, Table<X$memoryByHostByCurrentBytesRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$memoryByHostByCurrentBytes(String alias, Table<X$memoryByHostByCurrentBytesRecord> aliased, Field<?>[] parameters) {
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
    public X$memoryByHostByCurrentBytes as(String alias) {
        return new X$memoryByHostByCurrentBytes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$memoryByHostByCurrentBytes rename(String name) {
        return new X$memoryByHostByCurrentBytes(name, null);
    }
}
