/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.sys.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.example.gradle.db.sys.tables.Version;
import org.jooq.impl.TableRecordImpl;


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
public class VersionRecord extends TableRecordImpl<VersionRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 1226443872;

    /**
     * Setter for <code>sys.version.sys_version</code>.
     */
    public void setSysVersion(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.version.sys_version</code>.
     */
    public String getSysVersion() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.version.mysql_version</code>.
     */
    public void setMysqlVersion(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.version.mysql_version</code>.
     */
    public String getMysqlVersion() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Version.VERSION.SYS_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Version.VERSION.MYSQL_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getSysVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getMysqlVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VersionRecord value1(String value) {
        setSysVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VersionRecord value2(String value) {
        setMysqlVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VersionRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VersionRecord
     */
    public VersionRecord() {
        super(Version.VERSION);
    }

    /**
     * Create a detached, initialised VersionRecord
     */
    public VersionRecord(String sysVersion, String mysqlVersion) {
        super(Version.VERSION);

        set(0, sysVersion);
        set(1, mysqlVersion);
    }
}