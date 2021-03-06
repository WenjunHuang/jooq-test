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
import org.jooq.example.gradle.db.sys.tables.records.X$hostSummaryByFileIoTypeRecord;
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
public class X$hostSummaryByFileIoType extends TableImpl<X$hostSummaryByFileIoTypeRecord> {

    private static final long serialVersionUID = -1863519581;

    /**
     * The reference instance of <code>sys.x$host_summary_by_file_io_type</code>
     */
    public static final X$hostSummaryByFileIoType X$HOST_SUMMARY_BY_FILE_IO_TYPE = new X$hostSummaryByFileIoType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$hostSummaryByFileIoTypeRecord> getRecordType() {
        return X$hostSummaryByFileIoTypeRecord.class;
    }

    /**
     * The column <code>sys.x$host_summary_by_file_io_type.host</code>.
     */
    public final TableField<X$hostSummaryByFileIoTypeRecord, String> HOST = createField("host", org.jooq.impl.SQLDataType.VARCHAR.length(60), this, "");

    /**
     * The column <code>sys.x$host_summary_by_file_io_type.event_name</code>.
     */
    public final TableField<X$hostSummaryByFileIoTypeRecord, String> EVENT_NAME = createField("event_name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>sys.x$host_summary_by_file_io_type.total</code>.
     */
    public final TableField<X$hostSummaryByFileIoTypeRecord, ULong> TOTAL = createField("total", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$host_summary_by_file_io_type.total_latency</code>.
     */
    public final TableField<X$hostSummaryByFileIoTypeRecord, ULong> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$host_summary_by_file_io_type.max_latency</code>.
     */
    public final TableField<X$hostSummaryByFileIoTypeRecord, ULong> MAX_LATENCY = createField("max_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>sys.x$host_summary_by_file_io_type</code> table reference
     */
    public X$hostSummaryByFileIoType() {
        this("x$host_summary_by_file_io_type", null);
    }

    /**
     * Create an aliased <code>sys.x$host_summary_by_file_io_type</code> table reference
     */
    public X$hostSummaryByFileIoType(String alias) {
        this(alias, X$HOST_SUMMARY_BY_FILE_IO_TYPE);
    }

    private X$hostSummaryByFileIoType(String alias, Table<X$hostSummaryByFileIoTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$hostSummaryByFileIoType(String alias, Table<X$hostSummaryByFileIoTypeRecord> aliased, Field<?>[] parameters) {
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
    public X$hostSummaryByFileIoType as(String alias) {
        return new X$hostSummaryByFileIoType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$hostSummaryByFileIoType rename(String name) {
        return new X$hostSummaryByFileIoType(name, null);
    }
}
