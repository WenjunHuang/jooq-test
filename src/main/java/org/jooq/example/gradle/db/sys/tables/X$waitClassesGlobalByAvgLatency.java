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
import org.jooq.example.gradle.db.sys.tables.records.X$waitClassesGlobalByAvgLatencyRecord;
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
public class X$waitClassesGlobalByAvgLatency extends TableImpl<X$waitClassesGlobalByAvgLatencyRecord> {

    private static final long serialVersionUID = 1210309164;

    /**
     * The reference instance of <code>sys.x$wait_classes_global_by_avg_latency</code>
     */
    public static final X$waitClassesGlobalByAvgLatency X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY = new X$waitClassesGlobalByAvgLatency();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$waitClassesGlobalByAvgLatencyRecord> getRecordType() {
        return X$waitClassesGlobalByAvgLatencyRecord.class;
    }

    /**
     * The column <code>sys.x$wait_classes_global_by_avg_latency.event_class</code>.
     */
    public final TableField<X$waitClassesGlobalByAvgLatencyRecord, String> EVENT_CLASS = createField("event_class", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>sys.x$wait_classes_global_by_avg_latency.total</code>.
     */
    public final TableField<X$waitClassesGlobalByAvgLatencyRecord, BigInteger> TOTAL = createField("total", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * The column <code>sys.x$wait_classes_global_by_avg_latency.total_latency</code>.
     */
    public final TableField<X$waitClassesGlobalByAvgLatencyRecord, BigInteger> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * The column <code>sys.x$wait_classes_global_by_avg_latency.min_latency</code>.
     */
    public final TableField<X$waitClassesGlobalByAvgLatencyRecord, ULong> MIN_LATENCY = createField("min_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.x$wait_classes_global_by_avg_latency.avg_latency</code>.
     */
    public final TableField<X$waitClassesGlobalByAvgLatencyRecord, BigDecimal> AVG_LATENCY = createField("avg_latency", org.jooq.impl.SQLDataType.DECIMAL.precision(46, 4).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>sys.x$wait_classes_global_by_avg_latency.max_latency</code>.
     */
    public final TableField<X$waitClassesGlobalByAvgLatencyRecord, ULong> MAX_LATENCY = createField("max_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * Create a <code>sys.x$wait_classes_global_by_avg_latency</code> table reference
     */
    public X$waitClassesGlobalByAvgLatency() {
        this("x$wait_classes_global_by_avg_latency", null);
    }

    /**
     * Create an aliased <code>sys.x$wait_classes_global_by_avg_latency</code> table reference
     */
    public X$waitClassesGlobalByAvgLatency(String alias) {
        this(alias, X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY);
    }

    private X$waitClassesGlobalByAvgLatency(String alias, Table<X$waitClassesGlobalByAvgLatencyRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$waitClassesGlobalByAvgLatency(String alias, Table<X$waitClassesGlobalByAvgLatencyRecord> aliased, Field<?>[] parameters) {
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
    public X$waitClassesGlobalByAvgLatency as(String alias) {
        return new X$waitClassesGlobalByAvgLatency(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$waitClassesGlobalByAvgLatency rename(String name) {
        return new X$waitClassesGlobalByAvgLatency(name, null);
    }
}