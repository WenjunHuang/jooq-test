/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.mysql.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.example.gradle.db.mysql.Keys;
import org.jooq.example.gradle.db.mysql.Mysql;
import org.jooq.example.gradle.db.mysql.tables.records.HelpTopicRecord;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.UShort;


/**
 * help topics
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HelpTopic extends TableImpl<HelpTopicRecord> {

    private static final long serialVersionUID = 1726046069;

    /**
     * The reference instance of <code>mysql.help_topic</code>
     */
    public static final HelpTopic HELP_TOPIC = new HelpTopic();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HelpTopicRecord> getRecordType() {
        return HelpTopicRecord.class;
    }

    /**
     * The column <code>mysql.help_topic.help_topic_id</code>.
     */
    public final TableField<HelpTopicRecord, UInteger> HELP_TOPIC_ID = createField("help_topic_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.help_topic.name</code>.
     */
    public final TableField<HelpTopicRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>mysql.help_topic.help_category_id</code>.
     */
    public final TableField<HelpTopicRecord, UShort> HELP_CATEGORY_ID = createField("help_category_id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.help_topic.description</code>.
     */
    public final TableField<HelpTopicRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>mysql.help_topic.example</code>.
     */
    public final TableField<HelpTopicRecord, String> EXAMPLE = createField("example", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>mysql.help_topic.url</code>.
     */
    public final TableField<HelpTopicRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>mysql.help_topic</code> table reference
     */
    public HelpTopic() {
        this("help_topic", null);
    }

    /**
     * Create an aliased <code>mysql.help_topic</code> table reference
     */
    public HelpTopic(String alias) {
        this(alias, HELP_TOPIC);
    }

    private HelpTopic(String alias, Table<HelpTopicRecord> aliased) {
        this(alias, aliased, null);
    }

    private HelpTopic(String alias, Table<HelpTopicRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "help topics");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Mysql.MYSQL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HelpTopicRecord> getPrimaryKey() {
        return Keys.KEY_HELP_TOPIC_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HelpTopicRecord>> getKeys() {
        return Arrays.<UniqueKey<HelpTopicRecord>>asList(Keys.KEY_HELP_TOPIC_PRIMARY, Keys.KEY_HELP_TOPIC_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HelpTopic as(String alias) {
        return new HelpTopic(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HelpTopic rename(String name) {
        return new HelpTopic(name, null);
    }
}
