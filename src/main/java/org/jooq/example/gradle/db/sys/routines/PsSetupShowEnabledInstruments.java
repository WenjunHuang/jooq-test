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
 *  Shows all currently enabled instruments.
 *  
 *  Parameters
 *  
 *  None
 *  
 *  Example
 *  
 *  mysql&gt; CALL sys.ps_setup_show_enabled_instruments();
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
public class PsSetupShowEnabledInstruments extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -42632926;

    /**
     * Create a new routine call instance
     */
    public PsSetupShowEnabledInstruments() {
        super("ps_setup_show_enabled_instruments", Sys.SYS);
    }
}