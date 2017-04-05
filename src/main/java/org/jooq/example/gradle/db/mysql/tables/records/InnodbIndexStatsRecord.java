/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.mysql.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.example.gradle.db.mysql.tables.InnodbIndexStats;
import org.jooq.impl.UpdatableRecordImpl;
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
public class InnodbIndexStatsRecord extends UpdatableRecordImpl<InnodbIndexStatsRecord> implements Record8<String, String, String, Timestamp, String, ULong, ULong, String> {

    private static final long serialVersionUID = -276253386;

    /**
     * Setter for <code>mysql.innodb_index_stats.database_name</code>.
     */
    public void setDatabaseName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mysql.innodb_index_stats.database_name</code>.
     */
    public String getDatabaseName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mysql.innodb_index_stats.table_name</code>.
     */
    public void setTableName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mysql.innodb_index_stats.table_name</code>.
     */
    public String getTableName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mysql.innodb_index_stats.index_name</code>.
     */
    public void setIndexName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mysql.innodb_index_stats.index_name</code>.
     */
    public String getIndexName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mysql.innodb_index_stats.last_update</code>.
     */
    public void setLastUpdate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>mysql.innodb_index_stats.last_update</code>.
     */
    public Timestamp getLastUpdate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>mysql.innodb_index_stats.stat_name</code>.
     */
    public void setStatName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mysql.innodb_index_stats.stat_name</code>.
     */
    public String getStatName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mysql.innodb_index_stats.stat_value</code>.
     */
    public void setStatValue(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>mysql.innodb_index_stats.stat_value</code>.
     */
    public ULong getStatValue() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>mysql.innodb_index_stats.sample_size</code>.
     */
    public void setSampleSize(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>mysql.innodb_index_stats.sample_size</code>.
     */
    public ULong getSampleSize() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>mysql.innodb_index_stats.stat_description</code>.
     */
    public void setStatDescription(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mysql.innodb_index_stats.stat_description</code>.
     */
    public String getStatDescription() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record4<String, String, String, String> key() {
        return (Record4) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, Timestamp, String, ULong, ULong, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, Timestamp, String, ULong, ULong, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return InnodbIndexStats.INNODB_INDEX_STATS.DATABASE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return InnodbIndexStats.INNODB_INDEX_STATS.TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return InnodbIndexStats.INNODB_INDEX_STATS.INDEX_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return InnodbIndexStats.INNODB_INDEX_STATS.LAST_UPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return InnodbIndexStats.INNODB_INDEX_STATS.STAT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return InnodbIndexStats.INNODB_INDEX_STATS.STAT_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field7() {
        return InnodbIndexStats.INNODB_INDEX_STATS.SAMPLE_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return InnodbIndexStats.INNODB_INDEX_STATS.STAT_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getDatabaseName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getIndexName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getStatName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value6() {
        return getStatValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value7() {
        return getSampleSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getStatDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbIndexStatsRecord value1(String value) {
        setDatabaseName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbIndexStatsRecord value2(String value) {
        setTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbIndexStatsRecord value3(String value) {
        setIndexName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbIndexStatsRecord value4(Timestamp value) {
        setLastUpdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbIndexStatsRecord value5(String value) {
        setStatName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbIndexStatsRecord value6(ULong value) {
        setStatValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbIndexStatsRecord value7(ULong value) {
        setSampleSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbIndexStatsRecord value8(String value) {
        setStatDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbIndexStatsRecord values(String value1, String value2, String value3, Timestamp value4, String value5, ULong value6, ULong value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbIndexStatsRecord
     */
    public InnodbIndexStatsRecord() {
        super(InnodbIndexStats.INNODB_INDEX_STATS);
    }

    /**
     * Create a detached, initialised InnodbIndexStatsRecord
     */
    public InnodbIndexStatsRecord(String databaseName, String tableName, String indexName, Timestamp lastUpdate, String statName, ULong statValue, ULong sampleSize, String statDescription) {
        super(InnodbIndexStats.INNODB_INDEX_STATS);

        set(0, databaseName);
        set(1, tableName);
        set(2, indexName);
        set(3, lastUpdate);
        set(4, statName);
        set(5, statValue);
        set(6, sampleSize);
        set(7, statDescription);
    }
}