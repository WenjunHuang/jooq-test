/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.mysql.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.example.gradle.db.mysql.Keys;
import org.jooq.example.gradle.db.mysql.Mysql;
import org.jooq.example.gradle.db.mysql.tables.records.TimeZoneTransitionRecord;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * Time zone transitions
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimeZoneTransition extends TableImpl<TimeZoneTransitionRecord> {

    private static final long serialVersionUID = -1200045190;

    /**
     * The reference instance of <code>mysql.time_zone_transition</code>
     */
    public static final TimeZoneTransition TIME_ZONE_TRANSITION = new TimeZoneTransition();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TimeZoneTransitionRecord> getRecordType() {
        return TimeZoneTransitionRecord.class;
    }

    /**
     * The column <code>mysql.time_zone_transition.Time_zone_id</code>.
     */
    public final TableField<TimeZoneTransitionRecord, UInteger> TIME_ZONE_ID = createField("Time_zone_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.time_zone_transition.Transition_time</code>.
     */
    public final TableField<TimeZoneTransitionRecord, Long> TRANSITION_TIME = createField("Transition_time", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>mysql.time_zone_transition.Transition_type_id</code>.
     */
    public final TableField<TimeZoneTransitionRecord, UInteger> TRANSITION_TYPE_ID = createField("Transition_type_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>mysql.time_zone_transition</code> table reference
     */
    public TimeZoneTransition() {
        this("time_zone_transition", null);
    }

    /**
     * Create an aliased <code>mysql.time_zone_transition</code> table reference
     */
    public TimeZoneTransition(String alias) {
        this(alias, TIME_ZONE_TRANSITION);
    }

    private TimeZoneTransition(String alias, Table<TimeZoneTransitionRecord> aliased) {
        this(alias, aliased, null);
    }

    private TimeZoneTransition(String alias, Table<TimeZoneTransitionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Time zone transitions");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Mysql.MYSQL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TimeZoneTransitionRecord> getPrimaryKey() {
        return Keys.KEY_TIME_ZONE_TRANSITION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TimeZoneTransitionRecord>> getKeys() {
        return Arrays.<UniqueKey<TimeZoneTransitionRecord>>asList(Keys.KEY_TIME_ZONE_TRANSITION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TimeZoneTransition as(String alias) {
        return new TimeZoneTransition(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TimeZoneTransition rename(String name) {
        return new TimeZoneTransition(name, null);
    }
}
