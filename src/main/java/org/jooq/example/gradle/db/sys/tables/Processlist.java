/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.sys.tables;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.example.gradle.db.sys.Sys;
import org.jooq.example.gradle.db.sys.enums.ProcesslistTrxAutocommit;
import org.jooq.example.gradle.db.sys.enums.ProcesslistTrxState;
import org.jooq.example.gradle.db.sys.tables.records.ProcesslistRecord;
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
public class Processlist extends TableImpl<ProcesslistRecord> {

    private static final long serialVersionUID = 1770794481;

    /**
     * The reference instance of <code>sys.processlist</code>
     */
    public static final Processlist PROCESSLIST = new Processlist();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProcesslistRecord> getRecordType() {
        return ProcesslistRecord.class;
    }

    /**
     * The column <code>sys.processlist.thd_id</code>.
     */
    public final TableField<ProcesslistRecord, ULong> THD_ID = createField("thd_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.processlist.conn_id</code>.
     */
    public final TableField<ProcesslistRecord, ULong> CONN_ID = createField("conn_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.processlist.user</code>.
     */
    public final TableField<ProcesslistRecord, String> USER = createField("user", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>sys.processlist.db</code>.
     */
    public final TableField<ProcesslistRecord, String> DB = createField("db", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>sys.processlist.command</code>.
     */
    public final TableField<ProcesslistRecord, String> COMMAND = createField("command", org.jooq.impl.SQLDataType.VARCHAR.length(16), this, "");

    /**
     * The column <code>sys.processlist.state</code>.
     */
    public final TableField<ProcesslistRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>sys.processlist.time</code>.
     */
    public final TableField<ProcesslistRecord, Long> TIME = createField("time", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>sys.processlist.current_statement</code>.
     */
    public final TableField<ProcesslistRecord, String> CURRENT_STATEMENT = createField("current_statement", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.processlist.statement_latency</code>.
     */
    public final TableField<ProcesslistRecord, String> STATEMENT_LATENCY = createField("statement_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.processlist.progress</code>.
     */
    public final TableField<ProcesslistRecord, BigDecimal> PROGRESS = createField("progress", org.jooq.impl.SQLDataType.DECIMAL.precision(26, 2), this, "");

    /**
     * The column <code>sys.processlist.lock_latency</code>.
     */
    public final TableField<ProcesslistRecord, String> LOCK_LATENCY = createField("lock_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.processlist.rows_examined</code>.
     */
    public final TableField<ProcesslistRecord, ULong> ROWS_EXAMINED = createField("rows_examined", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.processlist.rows_sent</code>.
     */
    public final TableField<ProcesslistRecord, ULong> ROWS_SENT = createField("rows_sent", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.processlist.rows_affected</code>.
     */
    public final TableField<ProcesslistRecord, ULong> ROWS_AFFECTED = createField("rows_affected", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.processlist.tmp_tables</code>.
     */
    public final TableField<ProcesslistRecord, ULong> TMP_TABLES = createField("tmp_tables", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.processlist.tmp_disk_tables</code>.
     */
    public final TableField<ProcesslistRecord, ULong> TMP_DISK_TABLES = createField("tmp_disk_tables", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.processlist.full_scan</code>.
     */
    public final TableField<ProcesslistRecord, String> FULL_SCAN = createField("full_scan", org.jooq.impl.SQLDataType.VARCHAR.length(3).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sys.processlist.last_statement</code>.
     */
    public final TableField<ProcesslistRecord, String> LAST_STATEMENT = createField("last_statement", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.processlist.last_statement_latency</code>.
     */
    public final TableField<ProcesslistRecord, String> LAST_STATEMENT_LATENCY = createField("last_statement_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.processlist.current_memory</code>.
     */
    public final TableField<ProcesslistRecord, String> CURRENT_MEMORY = createField("current_memory", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.processlist.last_wait</code>.
     */
    public final TableField<ProcesslistRecord, String> LAST_WAIT = createField("last_wait", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>sys.processlist.last_wait_latency</code>.
     */
    public final TableField<ProcesslistRecord, String> LAST_WAIT_LATENCY = createField("last_wait_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.processlist.source</code>.
     */
    public final TableField<ProcesslistRecord, String> SOURCE = createField("source", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>sys.processlist.trx_latency</code>.
     */
    public final TableField<ProcesslistRecord, String> TRX_LATENCY = createField("trx_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.processlist.trx_state</code>.
     */
    public final TableField<ProcesslistRecord, ProcesslistTrxState> TRX_STATE = createField("trx_state", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.jooq.example.gradle.db.sys.enums.ProcesslistTrxState.class), this, "");

    /**
     * The column <code>sys.processlist.trx_autocommit</code>.
     */
    public final TableField<ProcesslistRecord, ProcesslistTrxAutocommit> TRX_AUTOCOMMIT = createField("trx_autocommit", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.jooq.example.gradle.db.sys.enums.ProcesslistTrxAutocommit.class), this, "");

    /**
     * The column <code>sys.processlist.pid</code>.
     */
    public final TableField<ProcesslistRecord, String> PID = createField("pid", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * The column <code>sys.processlist.program_name</code>.
     */
    public final TableField<ProcesslistRecord, String> PROGRAM_NAME = createField("program_name", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * Create a <code>sys.processlist</code> table reference
     */
    public Processlist() {
        this("processlist", null);
    }

    /**
     * Create an aliased <code>sys.processlist</code> table reference
     */
    public Processlist(String alias) {
        this(alias, PROCESSLIST);
    }

    private Processlist(String alias, Table<ProcesslistRecord> aliased) {
        this(alias, aliased, null);
    }

    private Processlist(String alias, Table<ProcesslistRecord> aliased, Field<?>[] parameters) {
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
    public Processlist as(String alias) {
        return new Processlist(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Processlist rename(String name) {
        return new Processlist(name, null);
    }
}