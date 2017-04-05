/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.sys.tables;


import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.example.gradle.db.sys.Sys;
import org.jooq.example.gradle.db.sys.tables.records.MemoryByThreadByCurrentBytesRecord;
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
public class MemoryByThreadByCurrentBytes extends TableImpl<MemoryByThreadByCurrentBytesRecord> {

    private static final long serialVersionUID = -1044752086;

    /**
     * The reference instance of <code>sys.memory_by_thread_by_current_bytes</code>
     */
    public static final MemoryByThreadByCurrentBytes MEMORY_BY_THREAD_BY_CURRENT_BYTES = new MemoryByThreadByCurrentBytes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MemoryByThreadByCurrentBytesRecord> getRecordType() {
        return MemoryByThreadByCurrentBytesRecord.class;
    }

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.thread_id</code>.
     */
    public final TableField<MemoryByThreadByCurrentBytesRecord, ULong> THREAD_ID = createField("thread_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.user</code>.
     */
    public final TableField<MemoryByThreadByCurrentBytesRecord, String> USER = createField("user", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.current_count_used</code>.
     */
    public final TableField<MemoryByThreadByCurrentBytesRecord, BigInteger> CURRENT_COUNT_USED = createField("current_count_used", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(41), this, "");

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.current_allocated</code>.
     */
    public final TableField<MemoryByThreadByCurrentBytesRecord, String> CURRENT_ALLOCATED = createField("current_allocated", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.current_avg_alloc</code>.
     */
    public final TableField<MemoryByThreadByCurrentBytesRecord, String> CURRENT_AVG_ALLOC = createField("current_avg_alloc", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.current_max_alloc</code>.
     */
    public final TableField<MemoryByThreadByCurrentBytesRecord, String> CURRENT_MAX_ALLOC = createField("current_max_alloc", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.memory_by_thread_by_current_bytes.total_allocated</code>.
     */
    public final TableField<MemoryByThreadByCurrentBytesRecord, String> TOTAL_ALLOCATED = createField("total_allocated", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>sys.memory_by_thread_by_current_bytes</code> table reference
     */
    public MemoryByThreadByCurrentBytes() {
        this("memory_by_thread_by_current_bytes", null);
    }

    /**
     * Create an aliased <code>sys.memory_by_thread_by_current_bytes</code> table reference
     */
    public MemoryByThreadByCurrentBytes(String alias) {
        this(alias, MEMORY_BY_THREAD_BY_CURRENT_BYTES);
    }

    private MemoryByThreadByCurrentBytes(String alias, Table<MemoryByThreadByCurrentBytesRecord> aliased) {
        this(alias, aliased, null);
    }

    private MemoryByThreadByCurrentBytes(String alias, Table<MemoryByThreadByCurrentBytesRecord> aliased, Field<?>[] parameters) {
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
    public MemoryByThreadByCurrentBytes as(String alias) {
        return new MemoryByThreadByCurrentBytes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MemoryByThreadByCurrentBytes rename(String name) {
        return new MemoryByThreadByCurrentBytes(name, null);
    }
}