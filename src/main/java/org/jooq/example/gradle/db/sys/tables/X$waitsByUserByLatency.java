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
import org.jooq.example.gradle.db.sys.tables.records.X$waitsByUserByLatencyRecord;
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
public class X$waitsByUserByLatency extends TableImpl<X$waitsByUserByLatencyRecord> {

    private static final long serialVersionUID = -1217009986;

    /**
     * The reference instance of <code>sys.x$waits_by_user_by_latency</code>
     */
    public static final X$waitsByUserByLatency X$WAITS_BY_USER_BY_LATENCY = new X$waitsByUserByLatency();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$waitsByUserByLatencyRecord> getRecordType() {
        return X$waitsByUserByLatencyRecord.class;
    }

    /**
     * The column <code>sys.x$waits_by_user_by_latency.user</code>.
     */
    public final TableField<X$waitsByUserByLatencyRecord, String> USER = createField("user", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

    /**
     * The column <code>sys.x$waits_by_user_by_latency.event</code>.
     */
    public final TableField<X$waitsByUserByLatencyRecord, String> EVENT = createField("event", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>sys.x$waits_by_user_by_latency.total</code>.
     */
    public final TableField<X$waitsByUserByLatencyRecord, ULong> TOTAL = createField("total", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$waits_by_user_by_latency.total_latency</code>.
     */
    public final TableField<X$waitsByUserByLatencyRecord, ULong> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$waits_by_user_by_latency.avg_latency</code>.
     */
    public final TableField<X$waitsByUserByLatencyRecord, ULong> AVG_LATENCY = createField("avg_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$waits_by_user_by_latency.max_latency</code>.
     */
    public final TableField<X$waitsByUserByLatencyRecord, ULong> MAX_LATENCY = createField("max_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>sys.x$waits_by_user_by_latency</code> table reference
     */
    public X$waitsByUserByLatency() {
        this("x$waits_by_user_by_latency", null);
    }

    /**
     * Create an aliased <code>sys.x$waits_by_user_by_latency</code> table reference
     */
    public X$waitsByUserByLatency(String alias) {
        this(alias, X$WAITS_BY_USER_BY_LATENCY);
    }

    private X$waitsByUserByLatency(String alias, Table<X$waitsByUserByLatencyRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$waitsByUserByLatency(String alias, Table<X$waitsByUserByLatencyRecord> aliased, Field<?>[] parameters) {
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
    public X$waitsByUserByLatency as(String alias) {
        return new X$waitsByUserByLatency(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$waitsByUserByLatency rename(String name) {
        return new X$waitsByUserByLatency(name, null);
    }
}
