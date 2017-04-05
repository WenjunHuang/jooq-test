/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.performance_schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.example.gradle.db.performance_schema.enums.SetupActorsEnabled;
import org.jooq.example.gradle.db.performance_schema.enums.SetupActorsHistory;
import org.jooq.example.gradle.db.performance_schema.tables.SetupActors;
import org.jooq.impl.TableRecordImpl;


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
public class SetupActorsRecord extends TableRecordImpl<SetupActorsRecord> implements Record5<String, String, String, SetupActorsEnabled, SetupActorsHistory> {

    private static final long serialVersionUID = -2133794459;

    /**
     * Setter for <code>performance_schema.setup_actors.HOST</code>.
     */
    public void setHost(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.setup_actors.HOST</code>.
     */
    public String getHost() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.setup_actors.USER</code>.
     */
    public void setUser(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.setup_actors.USER</code>.
     */
    public String getUser() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.setup_actors.ROLE</code>.
     */
    public void setRole(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.setup_actors.ROLE</code>.
     */
    public String getRole() {
        return (String) get(2);
    }

    /**
     * Setter for <code>performance_schema.setup_actors.ENABLED</code>.
     */
    public void setEnabled(SetupActorsEnabled value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.setup_actors.ENABLED</code>.
     */
    public SetupActorsEnabled getEnabled() {
        return (SetupActorsEnabled) get(3);
    }

    /**
     * Setter for <code>performance_schema.setup_actors.HISTORY</code>.
     */
    public void setHistory(SetupActorsHistory value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.setup_actors.HISTORY</code>.
     */
    public SetupActorsHistory getHistory() {
        return (SetupActorsHistory) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, SetupActorsEnabled, SetupActorsHistory> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, SetupActorsEnabled, SetupActorsHistory> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SetupActors.SETUP_ACTORS.HOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SetupActors.SETUP_ACTORS.USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SetupActors.SETUP_ACTORS.ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<SetupActorsEnabled> field4() {
        return SetupActors.SETUP_ACTORS.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<SetupActorsHistory> field5() {
        return SetupActors.SETUP_ACTORS.HISTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupActorsEnabled value4() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupActorsHistory value5() {
        return getHistory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupActorsRecord value1(String value) {
        setHost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupActorsRecord value2(String value) {
        setUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupActorsRecord value3(String value) {
        setRole(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupActorsRecord value4(SetupActorsEnabled value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupActorsRecord value5(SetupActorsHistory value) {
        setHistory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupActorsRecord values(String value1, String value2, String value3, SetupActorsEnabled value4, SetupActorsHistory value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SetupActorsRecord
     */
    public SetupActorsRecord() {
        super(SetupActors.SETUP_ACTORS);
    }

    /**
     * Create a detached, initialised SetupActorsRecord
     */
    public SetupActorsRecord(String host, String user, String role, SetupActorsEnabled enabled, SetupActorsHistory history) {
        super(SetupActors.SETUP_ACTORS);

        set(0, host);
        set(1, user);
        set(2, role);
        set(3, enabled);
        set(4, history);
    }
}
