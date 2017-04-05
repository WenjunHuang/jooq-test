/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.sys.routines;


import javax.annotation.Generated;

import org.jooq.example.gradle.db.sys.Sys;
import org.jooq.impl.AbstractRoutine;


/**
 * 
 *  Description
 *  
 *  Disable all background thread instrumentation within Performance Schema.
 *  
 *  Parameters
 *  
 *  None.
 *  
 *  Example
 *  
 *  mysql&gt; CALL sys.ps_setup_disable_background_threads();
 *  +--------------------------------+
 *  | summary                        |
 *  +--------------------------------+
 *  | Disabled 18 background threads |
 *  +--------------------------------+
 *  1 row in set (0.00 sec)
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
public class PsSetupDisableBackgroundThreads extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -962101243;

    /**
     * Create a new routine call instance
     */
    public PsSetupDisableBackgroundThreads() {
        super("ps_setup_disable_background_threads", Sys.SYS);
    }
}
