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
import org.jooq.example.gradle.db.sys.tables.records.X$hostSummaryByStatementTypeRecord;
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
public class X$hostSummaryByStatementType extends TableImpl<X$hostSummaryByStatementTypeRecord> {

    private static final long serialVersionUID = 1624172893;

    /**
     * The reference instance of <code>sys.x$host_summary_by_statement_type</code>
     */
    public static final X$hostSummaryByStatementType X$HOST_SUMMARY_BY_STATEMENT_TYPE = new X$hostSummaryByStatementType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$hostSummaryByStatementTypeRecord> getRecordType() {
        return X$hostSummaryByStatementTypeRecord.class;
    }

    /**
     * The column <code>sys.x$host_summary_by_statement_type.host</code>.
     */
    public final TableField<X$hostSummaryByStatementTypeRecord, String> HOST = createField("host", org.jooq.impl.SQLDataType.VARCHAR.length(60), this, "");

    /**
     * The column <code>sys.x$host_summary_by_statement_type.statement</code>.
     */
    public final TableField<X$hostSummaryByStatementTypeRecord, String> STATEMENT = createField("statement", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>sys.x$host_summary_by_statement_type.total</code>.
     */
    public final TableField<X$hostSummaryByStatementTypeRecord, ULong> TOTAL = createField("total", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$host_summary_by_statement_type.total_latency</code>.
     */
    public final TableField<X$hostSummaryByStatementTypeRecord, ULong> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$host_summary_by_statement_type.max_latency</code>.
     */
    public final TableField<X$hostSummaryByStatementTypeRecord, ULong> MAX_LATENCY = createField("max_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$host_summary_by_statement_type.lock_latency</code>.
     */
    public final TableField<X$hostSummaryByStatementTypeRecord, ULong> LOCK_LATENCY = createField("lock_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$host_summary_by_statement_type.rows_sent</code>.
     */
    public final TableField<X$hostSummaryByStatementTypeRecord, ULong> ROWS_SENT = createField("rows_sent", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$host_summary_by_statement_type.rows_examined</code>.
     */
    public final TableField<X$hostSummaryByStatementTypeRecord, ULong> ROWS_EXAMINED = createField("rows_examined", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$host_summary_by_statement_type.rows_affected</code>.
     */
    public final TableField<X$hostSummaryByStatementTypeRecord, ULong> ROWS_AFFECTED = createField("rows_affected", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$host_summary_by_statement_type.full_scans</code>.
     */
    public final TableField<X$hostSummaryByStatementTypeRecord, ULong> FULL_SCANS = createField("full_scans", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>sys.x$host_summary_by_statement_type</code> table reference
     */
    public X$hostSummaryByStatementType() {
        this("x$host_summary_by_statement_type", null);
    }

    /**
     * Create an aliased <code>sys.x$host_summary_by_statement_type</code> table reference
     */
    public X$hostSummaryByStatementType(String alias) {
        this(alias, X$HOST_SUMMARY_BY_STATEMENT_TYPE);
    }

    private X$hostSummaryByStatementType(String alias, Table<X$hostSummaryByStatementTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$hostSummaryByStatementType(String alias, Table<X$hostSummaryByStatementTypeRecord> aliased, Field<?>[] parameters) {
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
    public X$hostSummaryByStatementType as(String alias) {
        return new X$hostSummaryByStatementType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$hostSummaryByStatementType rename(String name) {
        return new X$hostSummaryByStatementType(name, null);
    }
}
