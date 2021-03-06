/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.performance_schema.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.example.gradle.db.performance_schema.PerformanceSchema;
import org.jooq.example.gradle.db.performance_schema.tables.records.EventsWaitsSummaryByHostByEventNameRecord;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventsWaitsSummaryByHostByEventName extends TableImpl<EventsWaitsSummaryByHostByEventNameRecord> {

    private static final long serialVersionUID = -1383892079;

    /**
     * The reference instance of <code>performance_schema.events_waits_summary_by_host_by_event_name</code>
     */
    public static final EventsWaitsSummaryByHostByEventName EVENTS_WAITS_SUMMARY_BY_HOST_BY_EVENT_NAME = new EventsWaitsSummaryByHostByEventName();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsWaitsSummaryByHostByEventNameRecord> getRecordType() {
        return EventsWaitsSummaryByHostByEventNameRecord.class;
    }

    /**
     * The column <code>performance_schema.events_waits_summary_by_host_by_event_name.HOST</code>.
     */
    public final TableField<EventsWaitsSummaryByHostByEventNameRecord, String> HOST = createField("HOST", org.jooq.impl.SQLDataType.CHAR.length(60), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_by_host_by_event_name.EVENT_NAME</code>.
     */
    public final TableField<EventsWaitsSummaryByHostByEventNameRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_by_host_by_event_name.COUNT_STAR</code>.
     */
    public final TableField<EventsWaitsSummaryByHostByEventNameRecord, ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_by_host_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsSummaryByHostByEventNameRecord, ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_by_host_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsSummaryByHostByEventNameRecord, ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_by_host_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsSummaryByHostByEventNameRecord, ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_summary_by_host_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsSummaryByHostByEventNameRecord, ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.events_waits_summary_by_host_by_event_name</code> table reference
     */
    public EventsWaitsSummaryByHostByEventName() {
        this("events_waits_summary_by_host_by_event_name", null);
    }

    /**
     * Create an aliased <code>performance_schema.events_waits_summary_by_host_by_event_name</code> table reference
     */
    public EventsWaitsSummaryByHostByEventName(String alias) {
        this(alias, EVENTS_WAITS_SUMMARY_BY_HOST_BY_EVENT_NAME);
    }

    private EventsWaitsSummaryByHostByEventName(String alias, Table<EventsWaitsSummaryByHostByEventNameRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsWaitsSummaryByHostByEventName(String alias, Table<EventsWaitsSummaryByHostByEventNameRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsWaitsSummaryByHostByEventName as(String alias) {
        return new EventsWaitsSummaryByHostByEventName(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsWaitsSummaryByHostByEventName rename(String name) {
        return new EventsWaitsSummaryByHostByEventName(name, null);
    }
}
