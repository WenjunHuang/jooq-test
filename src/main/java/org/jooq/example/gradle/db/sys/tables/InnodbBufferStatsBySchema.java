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
import org.jooq.example.gradle.db.sys.tables.records.InnodbBufferStatsBySchemaRecord;
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
public class InnodbBufferStatsBySchema extends TableImpl<InnodbBufferStatsBySchemaRecord> {

    private static final long serialVersionUID = -1352484708;

    /**
     * The reference instance of <code>sys.innodb_buffer_stats_by_schema</code>
     */
    public static final InnodbBufferStatsBySchema INNODB_BUFFER_STATS_BY_SCHEMA = new InnodbBufferStatsBySchema();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbBufferStatsBySchemaRecord> getRecordType() {
        return InnodbBufferStatsBySchemaRecord.class;
    }

    /**
     * The column <code>sys.innodb_buffer_stats_by_schema.object_schema</code>.
     */
    public final TableField<InnodbBufferStatsBySchemaRecord, String> OBJECT_SCHEMA = createField("object_schema", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.innodb_buffer_stats_by_schema.allocated</code>.
     */
    public final TableField<InnodbBufferStatsBySchemaRecord, String> ALLOCATED = createField("allocated", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.innodb_buffer_stats_by_schema.data</code>.
     */
    public final TableField<InnodbBufferStatsBySchemaRecord, String> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.innodb_buffer_stats_by_schema.pages</code>.
     */
    public final TableField<InnodbBufferStatsBySchemaRecord, Long> PAGES = createField("pages", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>sys.innodb_buffer_stats_by_schema.pages_hashed</code>.
     */
    public final TableField<InnodbBufferStatsBySchemaRecord, Long> PAGES_HASHED = createField("pages_hashed", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>sys.innodb_buffer_stats_by_schema.pages_old</code>.
     */
    public final TableField<InnodbBufferStatsBySchemaRecord, Long> PAGES_OLD = createField("pages_old", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>sys.innodb_buffer_stats_by_schema.rows_cached</code>.
     */
    public final TableField<InnodbBufferStatsBySchemaRecord, BigInteger> ROWS_CACHED = createField("rows_cached", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(44), this, "");

    /**
     * Create a <code>sys.innodb_buffer_stats_by_schema</code> table reference
     */
    public InnodbBufferStatsBySchema() {
        this("innodb_buffer_stats_by_schema", null);
    }

    /**
     * Create an aliased <code>sys.innodb_buffer_stats_by_schema</code> table reference
     */
    public InnodbBufferStatsBySchema(String alias) {
        this(alias, INNODB_BUFFER_STATS_BY_SCHEMA);
    }

    private InnodbBufferStatsBySchema(String alias, Table<InnodbBufferStatsBySchemaRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbBufferStatsBySchema(String alias, Table<InnodbBufferStatsBySchemaRecord> aliased, Field<?>[] parameters) {
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
    public InnodbBufferStatsBySchema as(String alias) {
        return new InnodbBufferStatsBySchema(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbBufferStatsBySchema rename(String name) {
        return new InnodbBufferStatsBySchema(name, null);
    }
}
