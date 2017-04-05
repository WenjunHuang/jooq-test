/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.sys.tables;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.example.gradle.db.sys.Sys;
import org.jooq.example.gradle.db.sys.tables.records.X$memoryGlobalByCurrentBytesRecord;
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
public class X$memoryGlobalByCurrentBytes extends TableImpl<X$memoryGlobalByCurrentBytesRecord> {

    private static final long serialVersionUID = -820475012;

    /**
     * The reference instance of <code>sys.x$memory_global_by_current_bytes</code>
     */
    public static final X$memoryGlobalByCurrentBytes X$MEMORY_GLOBAL_BY_CURRENT_BYTES = new X$memoryGlobalByCurrentBytes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$memoryGlobalByCurrentBytesRecord> getRecordType() {
        return X$memoryGlobalByCurrentBytesRecord.class;
    }

    /**
     * The column <code>sys.x$memory_global_by_current_bytes.event_name</code>.
     */
    public final TableField<X$memoryGlobalByCurrentBytesRecord, String> EVENT_NAME = createField("event_name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>sys.x$memory_global_by_current_bytes.current_count</code>.
     */
    public final TableField<X$memoryGlobalByCurrentBytesRecord, Long> CURRENT_COUNT = createField("current_count", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>sys.x$memory_global_by_current_bytes.current_alloc</code>.
     */
    public final TableField<X$memoryGlobalByCurrentBytesRecord, Long> CURRENT_ALLOC = createField("current_alloc", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>sys.x$memory_global_by_current_bytes.current_avg_alloc</code>.
     */
    public final TableField<X$memoryGlobalByCurrentBytesRecord, BigDecimal> CURRENT_AVG_ALLOC = createField("current_avg_alloc", org.jooq.impl.SQLDataType.DECIMAL.precision(23, 4).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>sys.x$memory_global_by_current_bytes.high_count</code>.
     */
    public final TableField<X$memoryGlobalByCurrentBytesRecord, Long> HIGH_COUNT = createField("high_count", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>sys.x$memory_global_by_current_bytes.high_alloc</code>.
     */
    public final TableField<X$memoryGlobalByCurrentBytesRecord, Long> HIGH_ALLOC = createField("high_alloc", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>sys.x$memory_global_by_current_bytes.high_avg_alloc</code>.
     */
    public final TableField<X$memoryGlobalByCurrentBytesRecord, BigDecimal> HIGH_AVG_ALLOC = createField("high_avg_alloc", org.jooq.impl.SQLDataType.DECIMAL.precision(23, 4).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * Create a <code>sys.x$memory_global_by_current_bytes</code> table reference
     */
    public X$memoryGlobalByCurrentBytes() {
        this("x$memory_global_by_current_bytes", null);
    }

    /**
     * Create an aliased <code>sys.x$memory_global_by_current_bytes</code> table reference
     */
    public X$memoryGlobalByCurrentBytes(String alias) {
        this(alias, X$MEMORY_GLOBAL_BY_CURRENT_BYTES);
    }

    private X$memoryGlobalByCurrentBytes(String alias, Table<X$memoryGlobalByCurrentBytesRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$memoryGlobalByCurrentBytes(String alias, Table<X$memoryGlobalByCurrentBytesRecord> aliased, Field<?>[] parameters) {
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
    public X$memoryGlobalByCurrentBytes as(String alias) {
        return new X$memoryGlobalByCurrentBytes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$memoryGlobalByCurrentBytes rename(String name) {
        return new X$memoryGlobalByCurrentBytes(name, null);
    }
}
