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
import org.jooq.example.gradle.db.performance_schema.enums.SetupActorsEnabled;
import org.jooq.example.gradle.db.performance_schema.enums.SetupActorsHistory;
import org.jooq.example.gradle.db.performance_schema.tables.records.SetupActorsRecord;
import org.jooq.impl.TableImpl;


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
public class SetupActors extends TableImpl<SetupActorsRecord> {

    private static final long serialVersionUID = -1591434414;

    /**
     * The reference instance of <code>performance_schema.setup_actors</code>
     */
    public static final SetupActors SETUP_ACTORS = new SetupActors();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SetupActorsRecord> getRecordType() {
        return SetupActorsRecord.class;
    }

    /**
     * The column <code>performance_schema.setup_actors.HOST</code>.
     */
    public final TableField<SetupActorsRecord, String> HOST = createField("HOST", org.jooq.impl.SQLDataType.CHAR.length(60).nullable(false).defaultValue(org.jooq.impl.DSL.inline("%", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>performance_schema.setup_actors.USER</code>.
     */
    public final TableField<SetupActorsRecord, String> USER = createField("USER", org.jooq.impl.SQLDataType.CHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("%", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>performance_schema.setup_actors.ROLE</code>.
     */
    public final TableField<SetupActorsRecord, String> ROLE = createField("ROLE", org.jooq.impl.SQLDataType.CHAR.length(16).nullable(false).defaultValue(org.jooq.impl.DSL.inline("%", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>performance_schema.setup_actors.ENABLED</code>.
     */
    public final TableField<SetupActorsRecord, SetupActorsEnabled> ENABLED = createField("ENABLED", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.jooq.example.gradle.db.performance_schema.enums.SetupActorsEnabled.class), this, "");

    /**
     * The column <code>performance_schema.setup_actors.HISTORY</code>.
     */
    public final TableField<SetupActorsRecord, SetupActorsHistory> HISTORY = createField("HISTORY", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.jooq.example.gradle.db.performance_schema.enums.SetupActorsHistory.class), this, "");

    /**
     * Create a <code>performance_schema.setup_actors</code> table reference
     */
    public SetupActors() {
        this("setup_actors", null);
    }

    /**
     * Create an aliased <code>performance_schema.setup_actors</code> table reference
     */
    public SetupActors(String alias) {
        this(alias, SETUP_ACTORS);
    }

    private SetupActors(String alias, Table<SetupActorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private SetupActors(String alias, Table<SetupActorsRecord> aliased, Field<?>[] parameters) {
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
    public SetupActors as(String alias) {
        return new SetupActors(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SetupActors rename(String name) {
        return new SetupActors(name, null);
    }
}
