/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.performance_schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.example.gradle.db.performance_schema.enums.ReplicationConnectionConfigurationAutoPosition;
import org.jooq.example.gradle.db.performance_schema.enums.ReplicationConnectionConfigurationSslAllowed;
import org.jooq.example.gradle.db.performance_schema.enums.ReplicationConnectionConfigurationSslVerifyServerCertificate;
import org.jooq.example.gradle.db.performance_schema.tables.ReplicationConnectionConfiguration;
import org.jooq.impl.TableRecordImpl;
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
public class ReplicationConnectionConfigurationRecord extends TableRecordImpl<ReplicationConnectionConfigurationRecord> implements Record19<String, String, Integer, String, String, ReplicationConnectionConfigurationAutoPosition, ReplicationConnectionConfigurationSslAllowed, String, String, String, String, String, ReplicationConnectionConfigurationSslVerifyServerCertificate, String, String, Integer, ULong, Double, String> {

    private static final long serialVersionUID = -2050994234;

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.CHANNEL_NAME</code>.
     */
    public void setChannelName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.CHANNEL_NAME</code>.
     */
    public String getChannelName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.HOST</code>.
     */
    public void setHost(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.HOST</code>.
     */
    public String getHost() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.PORT</code>.
     */
    public void setPort(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.PORT</code>.
     */
    public Integer getPort() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.USER</code>.
     */
    public void setUser(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.USER</code>.
     */
    public String getUser() {
        return (String) get(3);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.NETWORK_INTERFACE</code>.
     */
    public void setNetworkInterface(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.NETWORK_INTERFACE</code>.
     */
    public String getNetworkInterface() {
        return (String) get(4);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.AUTO_POSITION</code>.
     */
    public void setAutoPosition(ReplicationConnectionConfigurationAutoPosition value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.AUTO_POSITION</code>.
     */
    public ReplicationConnectionConfigurationAutoPosition getAutoPosition() {
        return (ReplicationConnectionConfigurationAutoPosition) get(5);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.SSL_ALLOWED</code>.
     */
    public void setSslAllowed(ReplicationConnectionConfigurationSslAllowed value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.SSL_ALLOWED</code>.
     */
    public ReplicationConnectionConfigurationSslAllowed getSslAllowed() {
        return (ReplicationConnectionConfigurationSslAllowed) get(6);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.SSL_CA_FILE</code>.
     */
    public void setSslCaFile(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.SSL_CA_FILE</code>.
     */
    public String getSslCaFile() {
        return (String) get(7);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.SSL_CA_PATH</code>.
     */
    public void setSslCaPath(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.SSL_CA_PATH</code>.
     */
    public String getSslCaPath() {
        return (String) get(8);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.SSL_CERTIFICATE</code>.
     */
    public void setSslCertificate(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.SSL_CERTIFICATE</code>.
     */
    public String getSslCertificate() {
        return (String) get(9);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.SSL_CIPHER</code>.
     */
    public void setSslCipher(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.SSL_CIPHER</code>.
     */
    public String getSslCipher() {
        return (String) get(10);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.SSL_KEY</code>.
     */
    public void setSslKey(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.SSL_KEY</code>.
     */
    public String getSslKey() {
        return (String) get(11);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.SSL_VERIFY_SERVER_CERTIFICATE</code>.
     */
    public void setSslVerifyServerCertificate(ReplicationConnectionConfigurationSslVerifyServerCertificate value) {
        set(12, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.SSL_VERIFY_SERVER_CERTIFICATE</code>.
     */
    public ReplicationConnectionConfigurationSslVerifyServerCertificate getSslVerifyServerCertificate() {
        return (ReplicationConnectionConfigurationSslVerifyServerCertificate) get(12);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.SSL_CRL_FILE</code>.
     */
    public void setSslCrlFile(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.SSL_CRL_FILE</code>.
     */
    public String getSslCrlFile() {
        return (String) get(13);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.SSL_CRL_PATH</code>.
     */
    public void setSslCrlPath(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.SSL_CRL_PATH</code>.
     */
    public String getSslCrlPath() {
        return (String) get(14);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.CONNECTION_RETRY_INTERVAL</code>.
     */
    public void setConnectionRetryInterval(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.CONNECTION_RETRY_INTERVAL</code>.
     */
    public Integer getConnectionRetryInterval() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.CONNECTION_RETRY_COUNT</code>.
     */
    public void setConnectionRetryCount(ULong value) {
        set(16, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.CONNECTION_RETRY_COUNT</code>.
     */
    public ULong getConnectionRetryCount() {
        return (ULong) get(16);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.HEARTBEAT_INTERVAL</code>. Number of seconds after which a heartbeat will be sent .
     */
    public void setHeartbeatInterval(Double value) {
        set(17, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.HEARTBEAT_INTERVAL</code>. Number of seconds after which a heartbeat will be sent .
     */
    public Double getHeartbeatInterval() {
        return (Double) get(17);
    }

    /**
     * Setter for <code>performance_schema.replication_connection_configuration.TLS_VERSION</code>.
     */
    public void setTlsVersion(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>performance_schema.replication_connection_configuration.TLS_VERSION</code>.
     */
    public String getTlsVersion() {
        return (String) get(18);
    }

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<String, String, Integer, String, String, ReplicationConnectionConfigurationAutoPosition, ReplicationConnectionConfigurationSslAllowed, String, String, String, String, String, ReplicationConnectionConfigurationSslVerifyServerCertificate, String, String, Integer, ULong, Double, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<String, String, Integer, String, String, ReplicationConnectionConfigurationAutoPosition, ReplicationConnectionConfigurationSslAllowed, String, String, String, String, String, ReplicationConnectionConfigurationSslVerifyServerCertificate, String, String, Integer, ULong, Double, String> valuesRow() {
        return (Row19) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION.CHANNEL_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION.HOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION.PORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION.USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION.NETWORK_INTERFACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ReplicationConnectionConfigurationAutoPosition> field6() {
        return ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION.AUTO_POSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ReplicationConnectionConfigurationSslAllowed> field7() {
        return ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION.SSL_ALLOWED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION.SSL_CA_FILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION.SSL_CA_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION.SSL_CERTIFICATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION.SSL_CIPHER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION.SSL_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ReplicationConnectionConfigurationSslVerifyServerCertificate> field13() {
        return ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION.SSL_VERIFY_SERVER_CERTIFICATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION.SSL_CRL_FILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION.SSL_CRL_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field16() {
        return ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION.CONNECTION_RETRY_INTERVAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field17() {
        return ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION.CONNECTION_RETRY_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field18() {
        return ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION.HEARTBEAT_INTERVAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION.TLS_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getChannelName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getPort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getNetworkInterface();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationConnectionConfigurationAutoPosition value6() {
        return getAutoPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationConnectionConfigurationSslAllowed value7() {
        return getSslAllowed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getSslCaFile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getSslCaPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getSslCertificate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getSslCipher();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getSslKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationConnectionConfigurationSslVerifyServerCertificate value13() {
        return getSslVerifyServerCertificate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getSslCrlFile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getSslCrlPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value16() {
        return getConnectionRetryInterval();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value17() {
        return getConnectionRetryCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value18() {
        return getHeartbeatInterval();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getTlsVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationConnectionConfigurationRecord value1(String value) {
        setChannelName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationConnectionConfigurationRecord value2(String value) {
        setHost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationConnectionConfigurationRecord value3(Integer value) {
        setPort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationConnectionConfigurationRecord value4(String value) {
        setUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationConnectionConfigurationRecord value5(String value) {
        setNetworkInterface(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationConnectionConfigurationRecord value6(ReplicationConnectionConfigurationAutoPosition value) {
        setAutoPosition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationConnectionConfigurationRecord value7(ReplicationConnectionConfigurationSslAllowed value) {
        setSslAllowed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationConnectionConfigurationRecord value8(String value) {
        setSslCaFile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationConnectionConfigurationRecord value9(String value) {
        setSslCaPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationConnectionConfigurationRecord value10(String value) {
        setSslCertificate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationConnectionConfigurationRecord value11(String value) {
        setSslCipher(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationConnectionConfigurationRecord value12(String value) {
        setSslKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationConnectionConfigurationRecord value13(ReplicationConnectionConfigurationSslVerifyServerCertificate value) {
        setSslVerifyServerCertificate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationConnectionConfigurationRecord value14(String value) {
        setSslCrlFile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationConnectionConfigurationRecord value15(String value) {
        setSslCrlPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationConnectionConfigurationRecord value16(Integer value) {
        setConnectionRetryInterval(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationConnectionConfigurationRecord value17(ULong value) {
        setConnectionRetryCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationConnectionConfigurationRecord value18(Double value) {
        setHeartbeatInterval(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationConnectionConfigurationRecord value19(String value) {
        setTlsVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationConnectionConfigurationRecord values(String value1, String value2, Integer value3, String value4, String value5, ReplicationConnectionConfigurationAutoPosition value6, ReplicationConnectionConfigurationSslAllowed value7, String value8, String value9, String value10, String value11, String value12, ReplicationConnectionConfigurationSslVerifyServerCertificate value13, String value14, String value15, Integer value16, ULong value17, Double value18, String value19) {
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
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReplicationConnectionConfigurationRecord
     */
    public ReplicationConnectionConfigurationRecord() {
        super(ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION);
    }

    /**
     * Create a detached, initialised ReplicationConnectionConfigurationRecord
     */
    public ReplicationConnectionConfigurationRecord(String channelName, String host, Integer port, String user, String networkInterface, ReplicationConnectionConfigurationAutoPosition autoPosition, ReplicationConnectionConfigurationSslAllowed sslAllowed, String sslCaFile, String sslCaPath, String sslCertificate, String sslCipher, String sslKey, ReplicationConnectionConfigurationSslVerifyServerCertificate sslVerifyServerCertificate, String sslCrlFile, String sslCrlPath, Integer connectionRetryInterval, ULong connectionRetryCount, Double heartbeatInterval, String tlsVersion) {
        super(ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION);

        set(0, channelName);
        set(1, host);
        set(2, port);
        set(3, user);
        set(4, networkInterface);
        set(5, autoPosition);
        set(6, sslAllowed);
        set(7, sslCaFile);
        set(8, sslCaPath);
        set(9, sslCertificate);
        set(10, sslCipher);
        set(11, sslKey);
        set(12, sslVerifyServerCertificate);
        set(13, sslCrlFile);
        set(14, sslCrlPath);
        set(15, connectionRetryInterval);
        set(16, connectionRetryCount);
        set(17, heartbeatInterval);
        set(18, tlsVersion);
    }
}
