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
import org.jooq.example.gradle.db.sys.tables.records.MemoryGlobalByCurrentBytesRecord;
import org.jooq.impl.TableImpl;


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
public class MemoryGlobalByCurrentBytes extends TableImpl<MemoryGlobalByCurrentBytesRecord> {

    private static final long serialVersionUID = 2002383671;

    /**
     * The reference instance of <code>sys.memory_global_by_current_bytes</code>
     */
    public static final MemoryGlobalByCurrentBytes MEMORY_GLOBAL_BY_CURRENT_BYTES = new MemoryGlobalByCurrentBytes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MemoryGlobalByCurrentBytesRecord> getRecordType() {
        return MemoryGlobalByCurrentBytesRecord.class;
    }

    /**
     * The column <code>sys.memory_global_by_current_bytes.event_name</code>.
     */
    public final TableField<MemoryGlobalByCurrentBytesRecord, String> EVENT_NAME = createField("event_name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>sys.memory_global_by_current_bytes.current_count</code>.
     */
    public final TableField<MemoryGlobalByCurrentBytesRecord, Long> CURRENT_COUNT = createField("current_count", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>sys.memory_global_by_current_bytes.current_alloc</code>.
     */
    public final TableField<MemoryGlobalByCurrentBytesRecord, String> CURRENT_ALLOC = createField("current_alloc", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.memory_global_by_current_bytes.current_avg_alloc</code>.
     */
    public final TableField<MemoryGlobalByCurrentBytesRecord, String> CURRENT_AVG_ALLOC = createField("current_avg_alloc", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.memory_global_by_current_bytes.high_count</code>.
     */
    public final TableField<MemoryGlobalByCurrentBytesRecord, Long> HIGH_COUNT = createField("high_count", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>sys.memory_global_by_current_bytes.high_alloc</code>.
     */
    public final TableField<MemoryGlobalByCurrentBytesRecord, String> HIGH_ALLOC = createField("high_alloc", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.memory_global_by_current_bytes.high_avg_alloc</code>.
     */
    public final TableField<MemoryGlobalByCurrentBytesRecord, String> HIGH_AVG_ALLOC = createField("high_avg_alloc", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>sys.memory_global_by_current_bytes</code> table reference
     */
    public MemoryGlobalByCurrentBytes() {
        this("memory_global_by_current_bytes", null);
    }

    /**
     * Create an aliased <code>sys.memory_global_by_current_bytes</code> table reference
     */
    public MemoryGlobalByCurrentBytes(String alias) {
        this(alias, MEMORY_GLOBAL_BY_CURRENT_BYTES);
    }

    private MemoryGlobalByCurrentBytes(String alias, Table<MemoryGlobalByCurrentBytesRecord> aliased) {
        this(alias, aliased, null);
    }

    private MemoryGlobalByCurrentBytes(String alias, Table<MemoryGlobalByCurrentBytesRecord> aliased, Field<?>[] parameters) {
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
    public MemoryGlobalByCurrentBytes as(String alias) {
        return new MemoryGlobalByCurrentBytes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MemoryGlobalByCurrentBytes rename(String name) {
        return new MemoryGlobalByCurrentBytes(name, null);
    }
}
