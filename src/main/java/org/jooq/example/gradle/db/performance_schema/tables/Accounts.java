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
import org.jooq.example.gradle.db.performance_schema.tables.records.AccountsRecord;
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
public class Accounts extends TableImpl<AccountsRecord> {

    private static final long serialVersionUID = 1308193754;

    /**
     * The reference instance of <code>performance_schema.accounts</code>
     */
    public static final Accounts ACCOUNTS = new Accounts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AccountsRecord> getRecordType() {
        return AccountsRecord.class;
    }

    /**
     * The column <code>performance_schema.accounts.USER</code>.
     */
    public final TableField<AccountsRecord, String> USER = createField("USER", org.jooq.impl.SQLDataType.CHAR.length(32), this, "");

    /**
     * The column <code>performance_schema.accounts.HOST</code>.
     */
    public final TableField<AccountsRecord, String> HOST = createField("HOST", org.jooq.impl.SQLDataType.CHAR.length(60), this, "");

    /**
     * The column <code>performance_schema.accounts.CURRENT_CONNECTIONS</code>.
     */
    public final TableField<AccountsRecord, Long> CURRENT_CONNECTIONS = createField("CURRENT_CONNECTIONS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>performance_schema.accounts.TOTAL_CONNECTIONS</code>.
     */
    public final TableField<AccountsRecord, Long> TOTAL_CONNECTIONS = createField("TOTAL_CONNECTIONS", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.accounts</code> table reference
     */
    public Accounts() {
        this("accounts", null);
    }

    /**
     * Create an aliased <code>performance_schema.accounts</code> table reference
     */
    public Accounts(String alias) {
        this(alias, ACCOUNTS);
    }

    private Accounts(String alias, Table<AccountsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Accounts(String alias, Table<AccountsRecord> aliased, Field<?>[] parameters) {
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
    public Accounts as(String alias) {
        return new Accounts(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Accounts rename(String name) {
        return new Accounts(name, null);
    }
}
