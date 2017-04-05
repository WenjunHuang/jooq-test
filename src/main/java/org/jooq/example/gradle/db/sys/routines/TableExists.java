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
 *  Tests whether the table specified in in_db and in_table exists either 
 * as a regular
 *  table, or as a temporary table. The returned value corresponds to the 
 * table that
 *  will be used, so if there's both a temporary and a permanent table with 
 * the given
 *  name, then 'TEMPORARY' will be returned.
 *  
 *  Parameters
 *  
 *  in_db (VARCHAR(64)):
 *  The database name to check for the existance of the table in.
 *  
 *  in_table (VARCHAR(64)):
 *  The name of the table to check the existance of.
 *  
 *  out_exists ENUM('', 'BASE TABLE', 'VIEW', 'TEMPORARY'):
 *  The return value: whether the table exists. The value is one of:
 *  * ''           - the table does not exist neither as a base table, view, 
 * nor temporary table.
 *  * 'BASE TABLE' - the table name exists as a permanent base table table.
 *  * 'VIEW'       - the table name exists as a view.
 *  * 'TEMPORARY'  - the table name exists as a temporary table.
 *  
 *  Example
 *  
 *  mysql&gt; CREATE DATABASE db1;
 *  Query OK, 1 row affected (0.07 sec)
 *  
 *  mysql&gt; use db1;
 *  Database changed
 *  mysql&gt; CREATE TABLE t1 (id INT PRIMARY KEY);
 *  Query OK, 0 rows affected (0.08 sec)
 *  
 *  mysql&gt; CREATE TABLE t2 (id INT PRIMARY KEY);
 *  Query OK, 0 rows affected (0.08 sec)
 *  
 *  mysql&gt; CREATE view v_t1 AS SELECT * FROM t1;
 *  Query OK, 0 rows affected (0.00 sec)
 *  
 *  mysql&gt; CREATE TEMPORARY TABLE t1 (id INT PRIMARY KEY);
 *  Query OK, 0 rows affected (0.00 sec)
 *  
 *  mysql&gt; CALL sys.table_exists('db1', 't1', @exists); SELECT @exists;
 *  Query OK, 0 rows affected (0.00 sec)
 *  
 *  +------------+
 *  | @exists    |
 *  +------------+
 *  | TEMPORARY  |
 *  +------------+
 *  1 row in set (0.00 sec)
 *  
 *  mysql&gt; CALL sys.table_exists('db1', 't2', @exists); SELECT @exists;
 *  Query OK, 0 rows affected (0.00 sec)
 *  
 *  +------------+
 *  | @exists    |
 *  +------------+
 *  | BASE TABLE |
 *  +------------+
 *  1 row in set (0.01 sec)
 *  
 *  mysql&gt; CALL sys.table_exists('db1', 'v_t1', @exists); SELECT @exists;
 *  Query OK, 0 rows affected (0.00 sec)
 *  
 *  +---------+
 *  | @exists |
 *  +---------+
 *  | VIEW    |
 *  +---------+
 *  1 row in set (0.00 sec)
 *  
 *  mysql&gt; CALL sys.table_exists('db1', 't3', @exists); SELECT @exists;
 *  Query OK, 0 rows affected (0.01 sec)
 *  
 *  +---------+
 *  | @exists |
 *  +---------+
 *  |         |
 *  +---------+
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
public class TableExists extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1604775308;

    /**
     * The parameter <code>sys.table_exists.in_db</code>.
     */
    public static final Parameter<String> IN_DB = createParameter("in_db", org.jooq.impl.SQLDataType.VARCHAR.length(64), false, false);

    /**
     * The parameter <code>sys.table_exists.in_table</code>.
     */
    public static final Parameter<String> IN_TABLE = createParameter("in_table", org.jooq.impl.SQLDataType.VARCHAR.length(64), false, false);

    /**
     * The parameter <code>sys.table_exists.out_exists</code>.
     */
    public static final Parameter<String> OUT_EXISTS = createParameter("out_exists", org.jooq.impl.SQLDataType.VARCHAR.length(10), false, false);

    /**
     * Create a new routine call instance
     */
    public TableExists() {
        super("table_exists", Sys.SYS);

        addInParameter(IN_DB);
        addInParameter(IN_TABLE);
        addOutParameter(OUT_EXISTS);
    }

    /**
     * Set the <code>in_db</code> parameter IN value to the routine
     */
    public void setInDb(String value) {
        setValue(IN_DB, value);
    }

    /**
     * Set the <code>in_table</code> parameter IN value to the routine
     */
    public void setInTable(String value) {
        setValue(IN_TABLE, value);
    }

    /**
     * Get the <code>out_exists</code> parameter OUT value from the routine
     */
    public String getOutExists() {
        return get(OUT_EXISTS);
    }
}
