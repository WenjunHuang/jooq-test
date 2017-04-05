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
import org.jooq.example.gradle.db.sys.tables.records.X$psDigestAvgLatencyDistributionRecord;
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
public class X$psDigestAvgLatencyDistribution extends TableImpl<X$psDigestAvgLatencyDistributionRecord> {

    private static final long serialVersionUID = 704296099;

    /**
     * The reference instance of <code>sys.x$ps_digest_avg_latency_distribution</code>
     */
    public static final X$psDigestAvgLatencyDistribution X$PS_DIGEST_AVG_LATENCY_DISTRIBUTION = new X$psDigestAvgLatencyDistribution();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$psDigestAvgLatencyDistributionRecord> getRecordType() {
        return X$psDigestAvgLatencyDistributionRecord.class;
    }

    /**
     * The column <code>sys.x$ps_digest_avg_latency_distribution.cnt</code>.
     */
    public final TableField<X$psDigestAvgLatencyDistributionRecord, Long> CNT = createField("cnt", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>sys.x$ps_digest_avg_latency_distribution.avg_us</code>.
     */
    public final TableField<X$psDigestAvgLatencyDistributionRecord, BigInteger> AVG_US = createField("avg_us", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(21), this, "");

    /**
     * Create a <code>sys.x$ps_digest_avg_latency_distribution</code> table reference
     */
    public X$psDigestAvgLatencyDistribution() {
        this("x$ps_digest_avg_latency_distribution", null);
    }

    /**
     * Create an aliased <code>sys.x$ps_digest_avg_latency_distribution</code> table reference
     */
    public X$psDigestAvgLatencyDistribution(String alias) {
        this(alias, X$PS_DIGEST_AVG_LATENCY_DISTRIBUTION);
    }

    private X$psDigestAvgLatencyDistribution(String alias, Table<X$psDigestAvgLatencyDistributionRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$psDigestAvgLatencyDistribution(String alias, Table<X$psDigestAvgLatencyDistributionRecord> aliased, Field<?>[] parameters) {
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
    public X$psDigestAvgLatencyDistribution as(String alias) {
        return new X$psDigestAvgLatencyDistribution(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$psDigestAvgLatencyDistribution rename(String name) {
        return new X$psDigestAvgLatencyDistribution(name, null);
    }
}