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
import org.jooq.example.gradle.db.sys.tables.records.HostSummaryByStagesRecord;
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
public class HostSummaryByStages extends TableImpl<HostSummaryByStagesRecord> {

    private static final long serialVersionUID = 1350076666;

    /**
     * The reference instance of <code>sys.host_summary_by_stages</code>
     */
    public static final HostSummaryByStages HOST_SUMMARY_BY_STAGES = new HostSummaryByStages();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HostSummaryByStagesRecord> getRecordType() {
        return HostSummaryByStagesRecord.class;
    }

    /**
     * The column <code>sys.host_summary_by_stages.host</code>.
     */
    public final TableField<HostSummaryByStagesRecord, String> HOST = createField("host", org.jooq.impl.SQLDataType.VARCHAR.length(60), this, "");

    /**
     * The column <code>sys.host_summary_by_stages.event_name</code>.
     */
    public final TableField<HostSummaryByStagesRecord, String> EVENT_NAME = createField("event_name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>sys.host_summary_by_stages.total</code>.
     */
    public final TableField<HostSummaryByStagesRecord, ULong> TOTAL = createField("total", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.host_summary_by_stages.total_latency</code>.
     */
    public final TableField<HostSummaryByStagesRecord, String> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.host_summary_by_stages.avg_latency</code>.
     */
    public final TableField<HostSummaryByStagesRecord, String> AVG_LATENCY = createField("avg_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>sys.host_summary_by_stages</code> table reference
     */
    public HostSummaryByStages() {
        this("host_summary_by_stages", null);
    }

    /**
     * Create an aliased <code>sys.host_summary_by_stages</code> table reference
     */
    public HostSummaryByStages(String alias) {
        this(alias, HOST_SUMMARY_BY_STAGES);
    }

    private HostSummaryByStages(String alias, Table<HostSummaryByStagesRecord> aliased) {
        this(alias, aliased, null);
    }

    private HostSummaryByStages(String alias, Table<HostSummaryByStagesRecord> aliased, Field<?>[] parameters) {
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
    public HostSummaryByStages as(String alias) {
        return new HostSummaryByStages(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HostSummaryByStages rename(String name) {
        return new HostSummaryByStages(name, null);
    }
}
