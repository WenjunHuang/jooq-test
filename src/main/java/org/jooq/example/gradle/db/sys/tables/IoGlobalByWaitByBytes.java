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
import org.jooq.example.gradle.db.sys.tables.records.IoGlobalByWaitByBytesRecord;
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
public class IoGlobalByWaitByBytes extends TableImpl<IoGlobalByWaitByBytesRecord> {

    private static final long serialVersionUID = -2093400548;

    /**
     * The reference instance of <code>sys.io_global_by_wait_by_bytes</code>
     */
    public static final IoGlobalByWaitByBytes IO_GLOBAL_BY_WAIT_BY_BYTES = new IoGlobalByWaitByBytes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IoGlobalByWaitByBytesRecord> getRecordType() {
        return IoGlobalByWaitByBytesRecord.class;
    }

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.event_name</code>.
     */
    public final TableField<IoGlobalByWaitByBytesRecord, String> EVENT_NAME = createField("event_name", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.total</code>.
     */
    public final TableField<IoGlobalByWaitByBytesRecord, ULong> TOTAL = createField("total", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.total_latency</code>.
     */
    public final TableField<IoGlobalByWaitByBytesRecord, String> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.min_latency</code>.
     */
    public final TableField<IoGlobalByWaitByBytesRecord, String> MIN_LATENCY = createField("min_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.avg_latency</code>.
     */
    public final TableField<IoGlobalByWaitByBytesRecord, String> AVG_LATENCY = createField("avg_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.max_latency</code>.
     */
    public final TableField<IoGlobalByWaitByBytesRecord, String> MAX_LATENCY = createField("max_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.count_read</code>.
     */
    public final TableField<IoGlobalByWaitByBytesRecord, ULong> COUNT_READ = createField("count_read", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.total_read</code>.
     */
    public final TableField<IoGlobalByWaitByBytesRecord, String> TOTAL_READ = createField("total_read", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.avg_read</code>.
     */
    public final TableField<IoGlobalByWaitByBytesRecord, String> AVG_READ = createField("avg_read", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.count_write</code>.
     */
    public final TableField<IoGlobalByWaitByBytesRecord, ULong> COUNT_WRITE = createField("count_write", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.total_written</code>.
     */
    public final TableField<IoGlobalByWaitByBytesRecord, String> TOTAL_WRITTEN = createField("total_written", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.avg_written</code>.
     */
    public final TableField<IoGlobalByWaitByBytesRecord, String> AVG_WRITTEN = createField("avg_written", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.io_global_by_wait_by_bytes.total_requested</code>.
     */
    public final TableField<IoGlobalByWaitByBytesRecord, String> TOTAL_REQUESTED = createField("total_requested", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>sys.io_global_by_wait_by_bytes</code> table reference
     */
    public IoGlobalByWaitByBytes() {
        this("io_global_by_wait_by_bytes", null);
    }

    /**
     * Create an aliased <code>sys.io_global_by_wait_by_bytes</code> table reference
     */
    public IoGlobalByWaitByBytes(String alias) {
        this(alias, IO_GLOBAL_BY_WAIT_BY_BYTES);
    }

    private IoGlobalByWaitByBytes(String alias, Table<IoGlobalByWaitByBytesRecord> aliased) {
        this(alias, aliased, null);
    }

    private IoGlobalByWaitByBytes(String alias, Table<IoGlobalByWaitByBytesRecord> aliased, Field<?>[] parameters) {
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
    public IoGlobalByWaitByBytes as(String alias) {
        return new IoGlobalByWaitByBytes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IoGlobalByWaitByBytes rename(String name) {
        return new IoGlobalByWaitByBytes(name, null);
    }
}
