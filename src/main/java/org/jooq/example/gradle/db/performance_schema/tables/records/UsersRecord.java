/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.performance_schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.example.gradle.db.performance_schema.tables.Users;
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
public class UsersRecord extends TableRecordImpl<UsersRecord> implements Record3<String, Long, Long> {

    private static final long serialVersionUID = 433073998;

    /**
     * Setter for <code>performance_schema.users.USER</code>.
     */
    public void setUser(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.users.USER</code>.
     */
    public String getUser() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.users.CURRENT_CONNECTIONS</code>.
     */
    public void setCurrentConnections(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.users.CURRENT_CONNECTIONS</code>.
     */
    public Long getCurrentConnections() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>performance_schema.users.TOTAL_CONNECTIONS</code>.
     */
    public void setTotalConnections(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.users.TOTAL_CONNECTIONS</code>.
     */
    public Long getTotalConnections() {
        return (Long) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, Long, Long> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Users.USERS.USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Users.USERS.CURRENT_CONNECTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Users.USERS.TOTAL_CONNECTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getCurrentConnections();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getTotalConnections();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value1(String value) {
        setUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value2(Long value) {
        setCurrentConnections(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value3(Long value) {
        setTotalConnections(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord values(String value1, Long value2, Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsersRecord
     */
    public UsersRecord() {
        super(Users.USERS);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(String user, Long currentConnections, Long totalConnections) {
        super(Users.USERS);

        set(0, user);
        set(1, currentConnections);
        set(2, totalConnections);
    }
}
