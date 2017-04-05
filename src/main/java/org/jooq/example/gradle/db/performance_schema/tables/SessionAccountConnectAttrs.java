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
import org.jooq.example.gradle.db.performance_schema.tables.records.SessionAccountConnectAttrsRecord;
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
public class SessionAccountConnectAttrs extends TableImpl<SessionAccountConnectAttrsRecord> {

    private static final long serialVersionUID = -1445722746;

    /**
     * The reference instance of <code>performance_schema.session_account_connect_attrs</code>
     */
    public static final SessionAccountConnectAttrs SESSION_ACCOUNT_CONNECT_ATTRS = new SessionAccountConnectAttrs();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SessionAccountConnectAttrsRecord> getRecordType() {
        return SessionAccountConnectAttrsRecord.class;
    }

    /**
     * The column <code>performance_schema.session_account_connect_attrs.PROCESSLIST_ID</code>.
     */
    public final TableField<SessionAccountConnectAttrsRecord, Integer> PROCESSLIST_ID = createField("PROCESSLIST_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>performance_schema.session_account_connect_attrs.ATTR_NAME</code>.
     */
    public final TableField<SessionAccountConnectAttrsRecord, String> ATTR_NAME = createField("ATTR_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>performance_schema.session_account_connect_attrs.ATTR_VALUE</code>.
     */
    public final TableField<SessionAccountConnectAttrsRecord, String> ATTR_VALUE = createField("ATTR_VALUE", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * The column <code>performance_schema.session_account_connect_attrs.ORDINAL_POSITION</code>.
     */
    public final TableField<SessionAccountConnectAttrsRecord, Integer> ORDINAL_POSITION = createField("ORDINAL_POSITION", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>performance_schema.session_account_connect_attrs</code> table reference
     */
    public SessionAccountConnectAttrs() {
        this("session_account_connect_attrs", null);
    }

    /**
     * Create an aliased <code>performance_schema.session_account_connect_attrs</code> table reference
     */
    public SessionAccountConnectAttrs(String alias) {
        this(alias, SESSION_ACCOUNT_CONNECT_ATTRS);
    }

    private SessionAccountConnectAttrs(String alias, Table<SessionAccountConnectAttrsRecord> aliased) {
        this(alias, aliased, null);
    }

    private SessionAccountConnectAttrs(String alias, Table<SessionAccountConnectAttrsRecord> aliased, Field<?>[] parameters) {
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
    public SessionAccountConnectAttrs as(String alias) {
        return new SessionAccountConnectAttrs(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SessionAccountConnectAttrs rename(String name) {
        return new SessionAccountConnectAttrs(name, null);
    }
}