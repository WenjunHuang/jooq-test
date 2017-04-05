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
import org.jooq.example.gradle.db.performance_schema.tables.records.SessionVariablesRecord;
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
public class SessionVariables extends TableImpl<SessionVariablesRecord> {

    private static final long serialVersionUID = 647856332;

    /**
     * The reference instance of <code>performance_schema.session_variables</code>
     */
    public static final SessionVariables SESSION_VARIABLES = new SessionVariables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SessionVariablesRecord> getRecordType() {
        return SessionVariablesRecord.class;
    }

    /**
     * The column <code>performance_schema.session_variables.VARIABLE_NAME</code>.
     */
    public final TableField<SessionVariablesRecord, String> VARIABLE_NAME = createField("VARIABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.session_variables.VARIABLE_VALUE</code>.
     */
    public final TableField<SessionVariablesRecord, String> VARIABLE_VALUE = createField("VARIABLE_VALUE", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * Create a <code>performance_schema.session_variables</code> table reference
     */
    public SessionVariables() {
        this("session_variables", null);
    }

    /**
     * Create an aliased <code>performance_schema.session_variables</code> table reference
     */
    public SessionVariables(String alias) {
        this(alias, SESSION_VARIABLES);
    }

    private SessionVariables(String alias, Table<SessionVariablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private SessionVariables(String alias, Table<SessionVariablesRecord> aliased, Field<?>[] parameters) {
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
    public SessionVariables as(String alias) {
        return new SessionVariables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SessionVariables rename(String name) {
        return new SessionVariables(name, null);
    }
}
