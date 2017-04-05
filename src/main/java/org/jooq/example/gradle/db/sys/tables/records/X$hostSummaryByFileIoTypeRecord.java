/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.sys.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.example.gradle.db.sys.tables.X$hostSummaryByFileIoType;
import org.jooq.impl.TableRecordImpl;
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
public class X$hostSummaryByFileIoTypeRecord extends TableRecordImpl<X$hostSummaryByFileIoTypeRecord> implements Record5<String, String, ULong, ULong, ULong> {

    private static final long serialVersionUID = -439836060;

    /**
     * Setter for <code>sys.x$host_summary_by_file_io_type.host</code>.
     */
    public void setHost(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.x$host_summary_by_file_io_type.host</code>.
     */
    public String getHost() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.x$host_summary_by_file_io_type.event_name</code>.
     */
    public void setEventName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.x$host_summary_by_file_io_type.event_name</code>.
     */
    public String getEventName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.x$host_summary_by_file_io_type.total</code>.
     */
    public void setTotal(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.x$host_summary_by_file_io_type.total</code>.
     */
    public ULong getTotal() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>sys.x$host_summary_by_file_io_type.total_latency</code>.
     */
    public void setTotalLatency(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.x$host_summary_by_file_io_type.total_latency</code>.
     */
    public ULong getTotalLatency() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>sys.x$host_summary_by_file_io_type.max_latency</code>.
     */
    public void setMaxLatency(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.x$host_summary_by_file_io_type.max_latency</code>.
     */
    public ULong getMaxLatency() {
        return (ULong) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, ULong, ULong, ULong> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, ULong, ULong, ULong> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return X$hostSummaryByFileIoType.X$HOST_SUMMARY_BY_FILE_IO_TYPE.HOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return X$hostSummaryByFileIoType.X$HOST_SUMMARY_BY_FILE_IO_TYPE.EVENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return X$hostSummaryByFileIoType.X$HOST_SUMMARY_BY_FILE_IO_TYPE.TOTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return X$hostSummaryByFileIoType.X$HOST_SUMMARY_BY_FILE_IO_TYPE.TOTAL_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return X$hostSummaryByFileIoType.X$HOST_SUMMARY_BY_FILE_IO_TYPE.MAX_LATENCY;
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
        return getEventName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value3() {
        return getTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value4() {
        return getTotalLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getMaxLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$hostSummaryByFileIoTypeRecord value1(String value) {
        setHost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$hostSummaryByFileIoTypeRecord value2(String value) {
        setEventName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$hostSummaryByFileIoTypeRecord value3(ULong value) {
        setTotal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$hostSummaryByFileIoTypeRecord value4(ULong value) {
        setTotalLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$hostSummaryByFileIoTypeRecord value5(ULong value) {
        setMaxLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$hostSummaryByFileIoTypeRecord values(String value1, String value2, ULong value3, ULong value4, ULong value5) {
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
     * Create a detached X$hostSummaryByFileIoTypeRecord
     */
    public X$hostSummaryByFileIoTypeRecord() {
        super(X$hostSummaryByFileIoType.X$HOST_SUMMARY_BY_FILE_IO_TYPE);
    }

    /**
     * Create a detached, initialised X$hostSummaryByFileIoTypeRecord
     */
    public X$hostSummaryByFileIoTypeRecord(String host, String eventName, ULong total, ULong totalLatency, ULong maxLatency) {
        super(X$hostSummaryByFileIoType.X$HOST_SUMMARY_BY_FILE_IO_TYPE);

        set(0, host);
        set(1, eventName);
        set(2, total);
        set(3, totalLatency);
        set(4, maxLatency);
    }
}
