/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.sys.routines;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.example.gradle.db.sys.Sys;
import org.jooq.impl.AbstractRoutine;


/**
 * 
 *  Description
 *  
 *  Enables instruments within Performance Schema 
 *  matching the input pattern.
 *  
 *  Parameters
 *  
 *  in_pattern (VARCHAR(128)):
 *  A LIKE pattern match (using "%in_pattern%") of events to enable
 *  
 *  Example
 *  
 *  To enable all mutex instruments:
 *  
 *  mysql&gt; CALL sys.ps_setup_enable_instrument('wait/synch/mutex');
 *  +-------------------------+
 *  | summary                 |
 *  +-------------------------+
 *  | Enabled 155 instruments |
 *  +-------------------------+
 *  1 row in set (0.02 sec)
 *  
 *  Query OK, 0 rows affected (0.02 sec)
 *  
 *  To enable just a specific TCP/IP based network IO instrument:
 *  
 *  mysql&gt; CALL sys.ps_setup_enable_instrument('wait/io/socket/sql/server_tcpip_socket');
 *  +-----------------------+
 *  | summary               |
 *  +-----------------------+
 *  | Enabled 1 instruments |
 *  +-----------------------+
 *  1 row in set (0.00 sec)
 *  
 *  Query OK, 0 rows affected (0.00 sec)
 *  
 *  To enable all instruments:
 *  
 *  mysql&gt; CALL sys.ps_setup_enable_instrument('');
 *  +-------------------------+
 *  | summary                 |
 *  +-------------------------+
 *  | Enabled 547 instruments |
 *  +-------------------------+
 *  1 row in set (0.01 sec)
 *  
 *  Query OK, 0 rows affected (0.01 sec)
 *  
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PsSetupEnableInstrument extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -1073726634;

    /**
     * The parameter <code>sys.ps_setup_enable_instrument.in_pattern</code>.
     */
    public static final Parameter<String> IN_PATTERN = createParameter("in_pattern", org.jooq.impl.SQLDataType.VARCHAR.length(128), false, false);

    /**
     * Create a new routine call instance
     */
    public PsSetupEnableInstrument() {
        super("ps_setup_enable_instrument", Sys.SYS);

        addInParameter(IN_PATTERN);
    }

    /**
     * Set the <code>in_pattern</code> parameter IN value to the routine
     */
    public void setInPattern(String value) {
        setValue(IN_PATTERN, value);
    }
}
