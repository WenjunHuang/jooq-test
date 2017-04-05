/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.mysql.tables.records;


import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.example.gradle.db.mysql.tables.SlaveMasterInfo;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * Master Information
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SlaveMasterInfoRecord extends UpdatableRecordImpl<SlaveMasterInfoRecord> {

    private static final long serialVersionUID = -2017639656;

    /**
     * Setter for <code>mysql.slave_master_info.Number_of_lines</code>. Number of lines in the file.
     */
    public void setNumberOfLines(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>mysql.slave_master_info.Number_of_lines</code>. Number of lines in the file.
     */
    public UInteger getNumberOfLines() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>mysql.slave_master_info.Master_log_name</code>. The name of the master binary log currently being read from the master.
     */
    public void setMasterLogName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mysql.slave_master_info.Master_log_name</code>. The name of the master binary log currently being read from the master.
     */
    public String getMasterLogName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mysql.slave_master_info.Master_log_pos</code>. The master log position of the last read event.
     */
    public void setMasterLogPos(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>mysql.slave_master_info.Master_log_pos</code>. The master log position of the last read event.
     */
    public ULong getMasterLogPos() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>mysql.slave_master_info.Host</code>. The host name of the master.
     */
    public void setHost(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mysql.slave_master_info.Host</code>. The host name of the master.
     */
    public String getHost() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mysql.slave_master_info.User_name</code>. The user name used to connect to the master.
     */
    public void setUserName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mysql.slave_master_info.User_name</code>. The user name used to connect to the master.
     */
    public String getUserName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mysql.slave_master_info.User_password</code>. The password used to connect to the master.
     */
    public void setUserPassword(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mysql.slave_master_info.User_password</code>. The password used to connect to the master.
     */
    public String getUserPassword() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mysql.slave_master_info.Port</code>. The network port used to connect to the master.
     */
    public void setPort(UInteger value) {
        set(6, value);
    }

    /**
     * Getter for <code>mysql.slave_master_info.Port</code>. The network port used to connect to the master.
     */
    public UInteger getPort() {
        return (UInteger) get(6);
    }

    /**
     * Setter for <code>mysql.slave_master_info.Connect_retry</code>. The period (in seconds) that the slave will wait before trying to reconnect to the master.
     */
    public void setConnectRetry(UInteger value) {
        set(7, value);
    }

    /**
     * Getter for <code>mysql.slave_master_info.Connect_retry</code>. The period (in seconds) that the slave will wait before trying to reconnect to the master.
     */
    public UInteger getConnectRetry() {
        return (UInteger) get(7);
    }

    /**
     * Setter for <code>mysql.slave_master_info.Enabled_ssl</code>. Indicates whether the server supports SSL connections.
     */
    public void setEnabledSsl(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>mysql.slave_master_info.Enabled_ssl</code>. Indicates whether the server supports SSL connections.
     */
    public Byte getEnabledSsl() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>mysql.slave_master_info.Ssl_ca</code>. The file used for the Certificate Authority (CA) certificate.
     */
    public void setSslCa(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mysql.slave_master_info.Ssl_ca</code>. The file used for the Certificate Authority (CA) certificate.
     */
    public String getSslCa() {
        return (String) get(9);
    }

    /**
     * Setter for <code>mysql.slave_master_info.Ssl_capath</code>. The path to the Certificate Authority (CA) certificates.
     */
    public void setSslCapath(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mysql.slave_master_info.Ssl_capath</code>. The path to the Certificate Authority (CA) certificates.
     */
    public String getSslCapath() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mysql.slave_master_info.Ssl_cert</code>. The name of the SSL certificate file.
     */
    public void setSslCert(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>mysql.slave_master_info.Ssl_cert</code>. The name of the SSL certificate file.
     */
    public String getSslCert() {
        return (String) get(11);
    }

    /**
     * Setter for <code>mysql.slave_master_info.Ssl_cipher</code>. The name of the cipher in use for the SSL connection.
     */
    public void setSslCipher(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>mysql.slave_master_info.Ssl_cipher</code>. The name of the cipher in use for the SSL connection.
     */
    public String getSslCipher() {
        return (String) get(12);
    }

    /**
     * Setter for <code>mysql.slave_master_info.Ssl_key</code>. The name of the SSL key file.
     */
    public void setSslKey(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>mysql.slave_master_info.Ssl_key</code>. The name of the SSL key file.
     */
    public String getSslKey() {
        return (String) get(13);
    }

    /**
     * Setter for <code>mysql.slave_master_info.Ssl_verify_server_cert</code>. Whether to verify the server certificate.
     */
    public void setSslVerifyServerCert(Byte value) {
        set(14, value);
    }

    /**
     * Getter for <code>mysql.slave_master_info.Ssl_verify_server_cert</code>. Whether to verify the server certificate.
     */
    public Byte getSslVerifyServerCert() {
        return (Byte) get(14);
    }

    /**
     * Setter for <code>mysql.slave_master_info.Heartbeat</code>.
     */
    public void setHeartbeat(Double value) {
        set(15, value);
    }

    /**
     * Getter for <code>mysql.slave_master_info.Heartbeat</code>.
     */
    public Double getHeartbeat() {
        return (Double) get(15);
    }

    /**
     * Setter for <code>mysql.slave_master_info.Bind</code>. Displays which interface is employed when connecting to the MySQL server
     */
    public void setBind(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>mysql.slave_master_info.Bind</code>. Displays which interface is employed when connecting to the MySQL server
     */
    public String getBind() {
        return (String) get(16);
    }

    /**
     * Setter for <code>mysql.slave_master_info.Ignored_server_ids</code>. The number of server IDs to be ignored, followed by the actual server IDs
     */
    public void setIgnoredServerIds(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>mysql.slave_master_info.Ignored_server_ids</code>. The number of server IDs to be ignored, followed by the actual server IDs
     */
    public String getIgnoredServerIds() {
        return (String) get(17);
    }

    /**
     * Setter for <code>mysql.slave_master_info.Uuid</code>. The master server uuid.
     */
    public void setUuid(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>mysql.slave_master_info.Uuid</code>. The master server uuid.
     */
    public String getUuid() {
        return (String) get(18);
    }

    /**
     * Setter for <code>mysql.slave_master_info.Retry_count</code>. Number of reconnect attempts, to the master, before giving up.
     */
    public void setRetryCount(ULong value) {
        set(19, value);
    }

    /**
     * Getter for <code>mysql.slave_master_info.Retry_count</code>. Number of reconnect attempts, to the master, before giving up.
     */
    public ULong getRetryCount() {
        return (ULong) get(19);
    }

    /**
     * Setter for <code>mysql.slave_master_info.Ssl_crl</code>. The file used for the Certificate Revocation List (CRL)
     */
    public void setSslCrl(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>mysql.slave_master_info.Ssl_crl</code>. The file used for the Certificate Revocation List (CRL)
     */
    public String getSslCrl() {
        return (String) get(20);
    }

    /**
     * Setter for <code>mysql.slave_master_info.Ssl_crlpath</code>. The path used for Certificate Revocation List (CRL) files
     */
    public void setSslCrlpath(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>mysql.slave_master_info.Ssl_crlpath</code>. The path used for Certificate Revocation List (CRL) files
     */
    public String getSslCrlpath() {
        return (String) get(21);
    }

    /**
     * Setter for <code>mysql.slave_master_info.Enabled_auto_position</code>. Indicates whether GTIDs will be used to retrieve events from the master.
     */
    public void setEnabledAutoPosition(Byte value) {
        set(22, value);
    }

    /**
     * Getter for <code>mysql.slave_master_info.Enabled_auto_position</code>. Indicates whether GTIDs will be used to retrieve events from the master.
     */
    public Byte getEnabledAutoPosition() {
        return (Byte) get(22);
    }

    /**
     * Setter for <code>mysql.slave_master_info.Channel_name</code>. The channel on which the slave is connected to a source. Used in Multisource Replication
     */
    public void setChannelName(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>mysql.slave_master_info.Channel_name</code>. The channel on which the slave is connected to a source. Used in Multisource Replication
     */
    public String getChannelName() {
        return (String) get(23);
    }

    /**
     * Setter for <code>mysql.slave_master_info.Tls_version</code>. Tls version
     */
    public void setTlsVersion(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>mysql.slave_master_info.Tls_version</code>. Tls version
     */
    public String getTlsVersion() {
        return (String) get(24);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SlaveMasterInfoRecord
     */
    public SlaveMasterInfoRecord() {
        super(SlaveMasterInfo.SLAVE_MASTER_INFO);
    }

    /**
     * Create a detached, initialised SlaveMasterInfoRecord
     */
    public SlaveMasterInfoRecord(UInteger numberOfLines, String masterLogName, ULong masterLogPos, String host, String userName, String userPassword, UInteger port, UInteger connectRetry, Byte enabledSsl, String sslCa, String sslCapath, String sslCert, String sslCipher, String sslKey, Byte sslVerifyServerCert, Double heartbeat, String bind, String ignoredServerIds, String uuid, ULong retryCount, String sslCrl, String sslCrlpath, Byte enabledAutoPosition, String channelName, String tlsVersion) {
        super(SlaveMasterInfo.SLAVE_MASTER_INFO);

        set(0, numberOfLines);
        set(1, masterLogName);
        set(2, masterLogPos);
        set(3, host);
        set(4, userName);
        set(5, userPassword);
        set(6, port);
        set(7, connectRetry);
        set(8, enabledSsl);
        set(9, sslCa);
        set(10, sslCapath);
        set(11, sslCert);
        set(12, sslCipher);
        set(13, sslKey);
        set(14, sslVerifyServerCert);
        set(15, heartbeat);
        set(16, bind);
        set(17, ignoredServerIds);
        set(18, uuid);
        set(19, retryCount);
        set(20, sslCrl);
        set(21, sslCrlpath);
        set(22, enabledAutoPosition);
        set(23, channelName);
        set(24, tlsVersion);
    }
}
