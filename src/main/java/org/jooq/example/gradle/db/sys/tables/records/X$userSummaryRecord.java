/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.sys.tables.records;


import java.math.BigDecimal;
import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.example.gradle.db.sys.tables.X$userSummary;
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
public class X$userSummaryRecord extends TableRecordImpl<X$userSummaryRecord> implements Record12<String, BigInteger, BigInteger, BigDecimal, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, Long, BigInteger, BigInteger> {

    private static final long serialVersionUID = 957879231;

    /**
     * Setter for <code>sys.x$user_summary.user</code>.
     */
    public void setUser(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.x$user_summary.user</code>.
     */
    public String getUser() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.x$user_summary.statements</code>.
     */
    public void setStatements(BigInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.x$user_summary.statements</code>.
     */
    public BigInteger getStatements() {
        return (BigInteger) get(1);
    }

    /**
     * Setter for <code>sys.x$user_summary.statement_latency</code>.
     */
    public void setStatementLatency(BigInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.x$user_summary.statement_latency</code>.
     */
    public BigInteger getStatementLatency() {
        return (BigInteger) get(2);
    }

    /**
     * Setter for <code>sys.x$user_summary.statement_avg_latency</code>.
     */
    public void setStatementAvgLatency(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.x$user_summary.statement_avg_latency</code>.
     */
    public BigDecimal getStatementAvgLatency() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>sys.x$user_summary.table_scans</code>.
     */
    public void setTableScans(BigInteger value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.x$user_summary.table_scans</code>.
     */
    public BigInteger getTableScans() {
        return (BigInteger) get(4);
    }

    /**
     * Setter for <code>sys.x$user_summary.file_ios</code>.
     */
    public void setFileIos(BigInteger value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.x$user_summary.file_ios</code>.
     */
    public BigInteger getFileIos() {
        return (BigInteger) get(5);
    }

    /**
     * Setter for <code>sys.x$user_summary.file_io_latency</code>.
     */
    public void setFileIoLatency(BigInteger value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.x$user_summary.file_io_latency</code>.
     */
    public BigInteger getFileIoLatency() {
        return (BigInteger) get(6);
    }

    /**
     * Setter for <code>sys.x$user_summary.current_connections</code>.
     */
    public void setCurrentConnections(BigInteger value) {
        set(7, value);
    }

    /**
     * Getter for <code>sys.x$user_summary.current_connections</code>.
     */
    public BigInteger getCurrentConnections() {
        return (BigInteger) get(7);
    }

    /**
     * Setter for <code>sys.x$user_summary.total_connections</code>.
     */
    public void setTotalConnections(BigInteger value) {
        set(8, value);
    }

    /**
     * Getter for <code>sys.x$user_summary.total_connections</code>.
     */
    public BigInteger getTotalConnections() {
        return (BigInteger) get(8);
    }

    /**
     * Setter for <code>sys.x$user_summary.unique_hosts</code>.
     */
    public void setUniqueHosts(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>sys.x$user_summary.unique_hosts</code>.
     */
    public Long getUniqueHosts() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>sys.x$user_summary.current_memory</code>.
     */
    public void setCurrentMemory(BigInteger value) {
        set(10, value);
    }

    /**
     * Getter for <code>sys.x$user_summary.current_memory</code>.
     */
    public BigInteger getCurrentMemory() {
        return (BigInteger) get(10);
    }

    /**
     * Setter for <code>sys.x$user_summary.total_memory_allocated</code>.
     */
    public void setTotalMemoryAllocated(BigInteger value) {
        set(11, value);
    }

    /**
     * Getter for <code>sys.x$user_summary.total_memory_allocated</code>.
     */
    public BigInteger getTotalMemoryAllocated() {
        return (BigInteger) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<String, BigInteger, BigInteger, BigDecimal, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, Long, BigInteger, BigInteger> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<String, BigInteger, BigInteger, BigDecimal, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, Long, BigInteger, BigInteger> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return X$userSummary.X$USER_SUMMARY.USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field2() {
        return X$userSummary.X$USER_SUMMARY.STATEMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field3() {
        return X$userSummary.X$USER_SUMMARY.STATEMENT_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return X$userSummary.X$USER_SUMMARY.STATEMENT_AVG_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field5() {
        return X$userSummary.X$USER_SUMMARY.TABLE_SCANS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field6() {
        return X$userSummary.X$USER_SUMMARY.FILE_IOS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field7() {
        return X$userSummary.X$USER_SUMMARY.FILE_IO_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field8() {
        return X$userSummary.X$USER_SUMMARY.CURRENT_CONNECTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field9() {
        return X$userSummary.X$USER_SUMMARY.TOTAL_CONNECTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return X$userSummary.X$USER_SUMMARY.UNIQUE_HOSTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field11() {
        return X$userSummary.X$USER_SUMMARY.CURRENT_MEMORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field12() {
        return X$userSummary.X$USER_SUMMARY.TOTAL_MEMORY_ALLOCATED;
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
    public BigInteger value2() {
        return getStatements();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value3() {
        return getStatementLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getStatementAvgLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value5() {
        return getTableScans();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value6() {
        return getFileIos();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value7() {
        return getFileIoLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value8() {
        return getCurrentConnections();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value9() {
        return getTotalConnections();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getUniqueHosts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value11() {
        return getCurrentMemory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value12() {
        return getTotalMemoryAllocated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$userSummaryRecord value1(String value) {
        setUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$userSummaryRecord value2(BigInteger value) {
        setStatements(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$userSummaryRecord value3(BigInteger value) {
        setStatementLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$userSummaryRecord value4(BigDecimal value) {
        setStatementAvgLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$userSummaryRecord value5(BigInteger value) {
        setTableScans(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$userSummaryRecord value6(BigInteger value) {
        setFileIos(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$userSummaryRecord value7(BigInteger value) {
        setFileIoLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$userSummaryRecord value8(BigInteger value) {
        setCurrentConnections(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$userSummaryRecord value9(BigInteger value) {
        setTotalConnections(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$userSummaryRecord value10(Long value) {
        setUniqueHosts(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$userSummaryRecord value11(BigInteger value) {
        setCurrentMemory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$userSummaryRecord value12(BigInteger value) {
        setTotalMemoryAllocated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$userSummaryRecord values(String value1, BigInteger value2, BigInteger value3, BigDecimal value4, BigInteger value5, BigInteger value6, BigInteger value7, BigInteger value8, BigInteger value9, Long value10, BigInteger value11, BigInteger value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached X$userSummaryRecord
     */
    public X$userSummaryRecord() {
        super(X$userSummary.X$USER_SUMMARY);
    }

    /**
     * Create a detached, initialised X$userSummaryRecord
     */
    public X$userSummaryRecord(String user, BigInteger statements, BigInteger statementLatency, BigDecimal statementAvgLatency, BigInteger tableScans, BigInteger fileIos, BigInteger fileIoLatency, BigInteger currentConnections, BigInteger totalConnections, Long uniqueHosts, BigInteger currentMemory, BigInteger totalMemoryAllocated) {
        super(X$userSummary.X$USER_SUMMARY);

        set(0, user);
        set(1, statements);
        set(2, statementLatency);
        set(3, statementAvgLatency);
        set(4, tableScans);
        set(5, fileIos);
        set(6, fileIoLatency);
        set(7, currentConnections);
        set(8, totalConnections);
        set(9, uniqueHosts);
        set(10, currentMemory);
        set(11, totalMemoryAllocated);
    }
}
