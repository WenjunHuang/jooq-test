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
import org.jooq.example.gradle.db.performance_schema.enums.EventsWaitsHistoryLongNestingEventType;
import org.jooq.example.gradle.db.performance_schema.tables.records.EventsWaitsHistoryLongRecord;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
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
public class EventsWaitsHistoryLong extends TableImpl<EventsWaitsHistoryLongRecord> {

    private static final long serialVersionUID = 665195847;

    /**
     * The reference instance of <code>performance_schema.events_waits_history_long</code>
     */
    public static final EventsWaitsHistoryLong EVENTS_WAITS_HISTORY_LONG = new EventsWaitsHistoryLong();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsWaitsHistoryLongRecord> getRecordType() {
        return EventsWaitsHistoryLongRecord.class;
    }

    /**
     * The column <code>performance_schema.events_waits_history_long.THREAD_ID</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, ULong> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.EVENT_ID</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, ULong> EVENT_ID = createField("EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.END_EVENT_ID</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, ULong> END_EVENT_ID = createField("END_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.EVENT_NAME</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.SOURCE</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, String> SOURCE = createField("SOURCE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.TIMER_START</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, ULong> TIMER_START = createField("TIMER_START", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.TIMER_END</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, ULong> TIMER_END = createField("TIMER_END", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, ULong> TIMER_WAIT = createField("TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.SPINS</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, UInteger> SPINS = createField("SPINS", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.OBJECT_SCHEMA</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, String> OBJECT_SCHEMA = createField("OBJECT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.OBJECT_NAME</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, String> OBJECT_NAME = createField("OBJECT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.INDEX_NAME</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, String> INDEX_NAME = createField("INDEX_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.OBJECT_TYPE</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, String> OBJECT_TYPE = createField("OBJECT_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, ULong> OBJECT_INSTANCE_BEGIN = createField("OBJECT_INSTANCE_BEGIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.NESTING_EVENT_ID</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, ULong> NESTING_EVENT_ID = createField("NESTING_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.NESTING_EVENT_TYPE</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, EventsWaitsHistoryLongNestingEventType> NESTING_EVENT_TYPE = createField("NESTING_EVENT_TYPE", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.jooq.example.gradle.db.performance_schema.enums.EventsWaitsHistoryLongNestingEventType.class), this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.OPERATION</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, String> OPERATION = createField("OPERATION", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.NUMBER_OF_BYTES</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, Long> NUMBER_OF_BYTES = createField("NUMBER_OF_BYTES", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>performance_schema.events_waits_history_long.FLAGS</code>.
     */
    public final TableField<EventsWaitsHistoryLongRecord, UInteger> FLAGS = createField("FLAGS", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * Create a <code>performance_schema.events_waits_history_long</code> table reference
     */
    public EventsWaitsHistoryLong() {
        this("events_waits_history_long", null);
    }

    /**
     * Create an aliased <code>performance_schema.events_waits_history_long</code> table reference
     */
    public EventsWaitsHistoryLong(String alias) {
        this(alias, EVENTS_WAITS_HISTORY_LONG);
    }

    private EventsWaitsHistoryLong(String alias, Table<EventsWaitsHistoryLongRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsWaitsHistoryLong(String alias, Table<EventsWaitsHistoryLongRecord> aliased, Field<?>[] parameters) {
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
    public EventsWaitsHistoryLong as(String alias) {
        return new EventsWaitsHistoryLong(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsWaitsHistoryLong rename(String name) {
        return new EventsWaitsHistoryLong(name, null);
    }
}
