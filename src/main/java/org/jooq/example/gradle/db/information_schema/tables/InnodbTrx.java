/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.information_schema.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.example.gradle.db.information_schema.InformationSchema;
import org.jooq.example.gradle.db.information_schema.tables.records.InnodbTrxRecord;
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
public class InnodbTrx extends TableImpl<InnodbTrxRecord> {

    private static final long serialVersionUID = -127582112;

    /**
     * The reference instance of <code>information_schema.INNODB_TRX</code>
     */
    public static final InnodbTrx INNODB_TRX = new InnodbTrx();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbTrxRecord> getRecordType() {
        return InnodbTrxRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_TRX.trx_id</code>.
     */
    public final TableField<InnodbTrxRecord, String> TRX_ID = createField("trx_id", org.jooq.impl.SQLDataType.VARCHAR.length(18).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_TRX.trx_state</code>.
     */
    public final TableField<InnodbTrxRecord, String> TRX_STATE = createField("trx_state", org.jooq.impl.SQLDataType.VARCHAR.length(13).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_TRX.trx_started</code>.
     */
    public final TableField<InnodbTrxRecord, Timestamp> TRX_STARTED = createField("trx_started", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>information_schema.INNODB_TRX.trx_requested_lock_id</code>.
     */
    public final TableField<InnodbTrxRecord, String> TRX_REQUESTED_LOCK_ID = createField("trx_requested_lock_id", org.jooq.impl.SQLDataType.VARCHAR.length(81), this, "");

    /**
     * The column <code>information_schema.INNODB_TRX.trx_wait_started</code>.
     */
    public final TableField<InnodbTrxRecord, Timestamp> TRX_WAIT_STARTED = createField("trx_wait_started", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>information_schema.INNODB_TRX.trx_weight</code>.
     */
    public final TableField<InnodbTrxRecord, ULong> TRX_WEIGHT = createField("trx_weight", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TRX.trx_mysql_thread_id</code>.
     */
    public final TableField<InnodbTrxRecord, ULong> TRX_MYSQL_THREAD_ID = createField("trx_mysql_thread_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TRX.trx_query</code>.
     */
    public final TableField<InnodbTrxRecord, String> TRX_QUERY = createField("trx_query", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * The column <code>information_schema.INNODB_TRX.trx_operation_state</code>.
     */
    public final TableField<InnodbTrxRecord, String> TRX_OPERATION_STATE = createField("trx_operation_state", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>information_schema.INNODB_TRX.trx_tables_in_use</code>.
     */
    public final TableField<InnodbTrxRecord, ULong> TRX_TABLES_IN_USE = createField("trx_tables_in_use", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TRX.trx_tables_locked</code>.
     */
    public final TableField<InnodbTrxRecord, ULong> TRX_TABLES_LOCKED = createField("trx_tables_locked", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TRX.trx_lock_structs</code>.
     */
    public final TableField<InnodbTrxRecord, ULong> TRX_LOCK_STRUCTS = createField("trx_lock_structs", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TRX.trx_lock_memory_bytes</code>.
     */
    public final TableField<InnodbTrxRecord, ULong> TRX_LOCK_MEMORY_BYTES = createField("trx_lock_memory_bytes", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TRX.trx_rows_locked</code>.
     */
    public final TableField<InnodbTrxRecord, ULong> TRX_ROWS_LOCKED = createField("trx_rows_locked", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TRX.trx_rows_modified</code>.
     */
    public final TableField<InnodbTrxRecord, ULong> TRX_ROWS_MODIFIED = createField("trx_rows_modified", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TRX.trx_concurrency_tickets</code>.
     */
    public final TableField<InnodbTrxRecord, ULong> TRX_CONCURRENCY_TICKETS = createField("trx_concurrency_tickets", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TRX.trx_isolation_level</code>.
     */
    public final TableField<InnodbTrxRecord, String> TRX_ISOLATION_LEVEL = createField("trx_isolation_level", org.jooq.impl.SQLDataType.VARCHAR.length(16).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_TRX.trx_unique_checks</code>.
     */
    public final TableField<InnodbTrxRecord, Integer> TRX_UNIQUE_CHECKS = createField("trx_unique_checks", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_TRX.trx_foreign_key_checks</code>.
     */
    public final TableField<InnodbTrxRecord, Integer> TRX_FOREIGN_KEY_CHECKS = createField("trx_foreign_key_checks", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_TRX.trx_last_foreign_key_error</code>.
     */
    public final TableField<InnodbTrxRecord, String> TRX_LAST_FOREIGN_KEY_ERROR = createField("trx_last_foreign_key_error", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "");

    /**
     * The column <code>information_schema.INNODB_TRX.trx_adaptive_hash_latched</code>.
     */
    public final TableField<InnodbTrxRecord, Integer> TRX_ADAPTIVE_HASH_LATCHED = createField("trx_adaptive_hash_latched", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_TRX.trx_adaptive_hash_timeout</code>.
     */
    public final TableField<InnodbTrxRecord, ULong> TRX_ADAPTIVE_HASH_TIMEOUT = createField("trx_adaptive_hash_timeout", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TRX.trx_is_read_only</code>.
     */
    public final TableField<InnodbTrxRecord, Integer> TRX_IS_READ_ONLY = createField("trx_is_read_only", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_TRX.trx_autocommit_non_locking</code>.
     */
    public final TableField<InnodbTrxRecord, Integer> TRX_AUTOCOMMIT_NON_LOCKING = createField("trx_autocommit_non_locking", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>information_schema.INNODB_TRX</code> table reference
     */
    public InnodbTrx() {
        this("INNODB_TRX", null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_TRX</code> table reference
     */
    public InnodbTrx(String alias) {
        this(alias, INNODB_TRX);
    }

    private InnodbTrx(String alias, Table<InnodbTrxRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbTrx(String alias, Table<InnodbTrxRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbTrx as(String alias) {
        return new InnodbTrx(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbTrx rename(String name) {
        return new InnodbTrx(name, null);
    }
}
