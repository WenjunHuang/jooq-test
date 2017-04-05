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
import org.jooq.example.gradle.db.sys.tables.records.X$ioGlobalByFileByLatencyRecord;
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
public class X$ioGlobalByFileByLatency extends TableImpl<X$ioGlobalByFileByLatencyRecord> {

    private static final long serialVersionUID = 1579467145;

    /**
     * The reference instance of <code>sys.x$io_global_by_file_by_latency</code>
     */
    public static final X$ioGlobalByFileByLatency X$IO_GLOBAL_BY_FILE_BY_LATENCY = new X$ioGlobalByFileByLatency();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$ioGlobalByFileByLatencyRecord> getRecordType() {
        return X$ioGlobalByFileByLatencyRecord.class;
    }

    /**
     * The column <code>sys.x$io_global_by_file_by_latency.file</code>.
     */
    public final TableField<X$ioGlobalByFileByLatencyRecord, String> FILE = createField("file", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_file_by_latency.total</code>.
     */
    public final TableField<X$ioGlobalByFileByLatencyRecord, ULong> TOTAL = createField("total", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_file_by_latency.total_latency</code>.
     */
    public final TableField<X$ioGlobalByFileByLatencyRecord, ULong> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_file_by_latency.count_read</code>.
     */
    public final TableField<X$ioGlobalByFileByLatencyRecord, ULong> COUNT_READ = createField("count_read", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_file_by_latency.read_latency</code>.
     */
    public final TableField<X$ioGlobalByFileByLatencyRecord, ULong> READ_LATENCY = createField("read_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_file_by_latency.count_write</code>.
     */
    public final TableField<X$ioGlobalByFileByLatencyRecord, ULong> COUNT_WRITE = createField("count_write", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_file_by_latency.write_latency</code>.
     */
    public final TableField<X$ioGlobalByFileByLatencyRecord, ULong> WRITE_LATENCY = createField("write_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_file_by_latency.count_misc</code>.
     */
    public final TableField<X$ioGlobalByFileByLatencyRecord, ULong> COUNT_MISC = createField("count_misc", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_file_by_latency.misc_latency</code>.
     */
    public final TableField<X$ioGlobalByFileByLatencyRecord, ULong> MISC_LATENCY = createField("misc_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>sys.x$io_global_by_file_by_latency</code> table reference
     */
    public X$ioGlobalByFileByLatency() {
        this("x$io_global_by_file_by_latency", null);
    }

    /**
     * Create an aliased <code>sys.x$io_global_by_file_by_latency</code> table reference
     */
    public X$ioGlobalByFileByLatency(String alias) {
        this(alias, X$IO_GLOBAL_BY_FILE_BY_LATENCY);
    }

    private X$ioGlobalByFileByLatency(String alias, Table<X$ioGlobalByFileByLatencyRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$ioGlobalByFileByLatency(String alias, Table<X$ioGlobalByFileByLatencyRecord> aliased, Field<?>[] parameters) {
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
    public X$ioGlobalByFileByLatency as(String alias) {
        return new X$ioGlobalByFileByLatency(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$ioGlobalByFileByLatency rename(String name) {
        return new X$ioGlobalByFileByLatency(name, null);
    }
}
