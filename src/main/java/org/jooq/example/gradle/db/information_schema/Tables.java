/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.information_schema;


import javax.annotation.Generated;

import org.jooq.example.gradle.db.information_schema.tables.CharacterSets;
import org.jooq.example.gradle.db.information_schema.tables.CollationCharacterSetApplicability;
import org.jooq.example.gradle.db.information_schema.tables.Collations;
import org.jooq.example.gradle.db.information_schema.tables.ColumnPrivileges;
import org.jooq.example.gradle.db.information_schema.tables.Columns;
import org.jooq.example.gradle.db.information_schema.tables.Engines;
import org.jooq.example.gradle.db.information_schema.tables.Events;
import org.jooq.example.gradle.db.information_schema.tables.Files;
import org.jooq.example.gradle.db.information_schema.tables.GlobalStatus;
import org.jooq.example.gradle.db.information_schema.tables.GlobalVariables;
import org.jooq.example.gradle.db.information_schema.tables.InnodbBufferPage;
import org.jooq.example.gradle.db.information_schema.tables.InnodbBufferPageLru;
import org.jooq.example.gradle.db.information_schema.tables.InnodbBufferPoolStats;
import org.jooq.example.gradle.db.information_schema.tables.InnodbCmp;
import org.jooq.example.gradle.db.information_schema.tables.InnodbCmpPerIndex;
import org.jooq.example.gradle.db.information_schema.tables.InnodbCmpPerIndexReset;
import org.jooq.example.gradle.db.information_schema.tables.InnodbCmpReset;
import org.jooq.example.gradle.db.information_schema.tables.InnodbCmpmem;
import org.jooq.example.gradle.db.information_schema.tables.InnodbCmpmemReset;
import org.jooq.example.gradle.db.information_schema.tables.InnodbFtBeingDeleted;
import org.jooq.example.gradle.db.information_schema.tables.InnodbFtConfig;
import org.jooq.example.gradle.db.information_schema.tables.InnodbFtDefaultStopword;
import org.jooq.example.gradle.db.information_schema.tables.InnodbFtDeleted;
import org.jooq.example.gradle.db.information_schema.tables.InnodbFtIndexCache;
import org.jooq.example.gradle.db.information_schema.tables.InnodbFtIndexTable;
import org.jooq.example.gradle.db.information_schema.tables.InnodbLockWaits;
import org.jooq.example.gradle.db.information_schema.tables.InnodbLocks;
import org.jooq.example.gradle.db.information_schema.tables.InnodbMetrics;
import org.jooq.example.gradle.db.information_schema.tables.InnodbSysColumns;
import org.jooq.example.gradle.db.information_schema.tables.InnodbSysDatafiles;
import org.jooq.example.gradle.db.information_schema.tables.InnodbSysFields;
import org.jooq.example.gradle.db.information_schema.tables.InnodbSysForeign;
import org.jooq.example.gradle.db.information_schema.tables.InnodbSysForeignCols;
import org.jooq.example.gradle.db.information_schema.tables.InnodbSysIndexes;
import org.jooq.example.gradle.db.information_schema.tables.InnodbSysTables;
import org.jooq.example.gradle.db.information_schema.tables.InnodbSysTablespaces;
import org.jooq.example.gradle.db.information_schema.tables.InnodbSysTablestats;
import org.jooq.example.gradle.db.information_schema.tables.InnodbSysVirtual;
import org.jooq.example.gradle.db.information_schema.tables.InnodbTempTableInfo;
import org.jooq.example.gradle.db.information_schema.tables.InnodbTrx;
import org.jooq.example.gradle.db.information_schema.tables.KeyColumnUsage;
import org.jooq.example.gradle.db.information_schema.tables.OptimizerTrace;
import org.jooq.example.gradle.db.information_schema.tables.Parameters;
import org.jooq.example.gradle.db.information_schema.tables.Partitions;
import org.jooq.example.gradle.db.information_schema.tables.Plugins;
import org.jooq.example.gradle.db.information_schema.tables.Processlist;
import org.jooq.example.gradle.db.information_schema.tables.Profiling;
import org.jooq.example.gradle.db.information_schema.tables.ReferentialConstraints;
import org.jooq.example.gradle.db.information_schema.tables.Routines;
import org.jooq.example.gradle.db.information_schema.tables.SchemaPrivileges;
import org.jooq.example.gradle.db.information_schema.tables.Schemata;
import org.jooq.example.gradle.db.information_schema.tables.SessionStatus;
import org.jooq.example.gradle.db.information_schema.tables.SessionVariables;
import org.jooq.example.gradle.db.information_schema.tables.Statistics;
import org.jooq.example.gradle.db.information_schema.tables.TableConstraints;
import org.jooq.example.gradle.db.information_schema.tables.TablePrivileges;
import org.jooq.example.gradle.db.information_schema.tables.Tablespaces;
import org.jooq.example.gradle.db.information_schema.tables.Triggers;
import org.jooq.example.gradle.db.information_schema.tables.UserPrivileges;
import org.jooq.example.gradle.db.information_schema.tables.Views;


/**
 * Convenience access to all tables in information_schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>information_schema.CHARACTER_SETS</code>.
     */
    public static final CharacterSets CHARACTER_SETS = org.jooq.example.gradle.db.information_schema.tables.CharacterSets.CHARACTER_SETS;

    /**
     * The table <code>information_schema.COLLATIONS</code>.
     */
    public static final Collations COLLATIONS = org.jooq.example.gradle.db.information_schema.tables.Collations.COLLATIONS;

    /**
     * The table <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY</code>.
     */
    public static final CollationCharacterSetApplicability COLLATION_CHARACTER_SET_APPLICABILITY = org.jooq.example.gradle.db.information_schema.tables.CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY;

    /**
     * The table <code>information_schema.COLUMNS</code>.
     */
    public static final Columns COLUMNS = org.jooq.example.gradle.db.information_schema.tables.Columns.COLUMNS;

    /**
     * The table <code>information_schema.COLUMN_PRIVILEGES</code>.
     */
    public static final ColumnPrivileges COLUMN_PRIVILEGES = org.jooq.example.gradle.db.information_schema.tables.ColumnPrivileges.COLUMN_PRIVILEGES;

    /**
     * The table <code>information_schema.ENGINES</code>.
     */
    public static final Engines ENGINES = org.jooq.example.gradle.db.information_schema.tables.Engines.ENGINES;

    /**
     * The table <code>information_schema.EVENTS</code>.
     */
    public static final Events EVENTS = org.jooq.example.gradle.db.information_schema.tables.Events.EVENTS;

    /**
     * The table <code>information_schema.FILES</code>.
     */
    public static final Files FILES = org.jooq.example.gradle.db.information_schema.tables.Files.FILES;

    /**
     * The table <code>information_schema.GLOBAL_STATUS</code>.
     */
    public static final GlobalStatus GLOBAL_STATUS = org.jooq.example.gradle.db.information_schema.tables.GlobalStatus.GLOBAL_STATUS;

    /**
     * The table <code>information_schema.GLOBAL_VARIABLES</code>.
     */
    public static final GlobalVariables GLOBAL_VARIABLES = org.jooq.example.gradle.db.information_schema.tables.GlobalVariables.GLOBAL_VARIABLES;

    /**
     * The table <code>information_schema.INNODB_BUFFER_PAGE</code>.
     */
    public static final InnodbBufferPage INNODB_BUFFER_PAGE = org.jooq.example.gradle.db.information_schema.tables.InnodbBufferPage.INNODB_BUFFER_PAGE;

    /**
     * The table <code>information_schema.INNODB_BUFFER_PAGE_LRU</code>.
     */
    public static final InnodbBufferPageLru INNODB_BUFFER_PAGE_LRU = org.jooq.example.gradle.db.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU;

    /**
     * The table <code>information_schema.INNODB_BUFFER_POOL_STATS</code>.
     */
    public static final InnodbBufferPoolStats INNODB_BUFFER_POOL_STATS = org.jooq.example.gradle.db.information_schema.tables.InnodbBufferPoolStats.INNODB_BUFFER_POOL_STATS;

    /**
     * The table <code>information_schema.INNODB_CMP</code>.
     */
    public static final InnodbCmp INNODB_CMP = org.jooq.example.gradle.db.information_schema.tables.InnodbCmp.INNODB_CMP;

    /**
     * The table <code>information_schema.INNODB_CMPMEM</code>.
     */
    public static final InnodbCmpmem INNODB_CMPMEM = org.jooq.example.gradle.db.information_schema.tables.InnodbCmpmem.INNODB_CMPMEM;

    /**
     * The table <code>information_schema.INNODB_CMPMEM_RESET</code>.
     */
    public static final InnodbCmpmemReset INNODB_CMPMEM_RESET = org.jooq.example.gradle.db.information_schema.tables.InnodbCmpmemReset.INNODB_CMPMEM_RESET;

    /**
     * The table <code>information_schema.INNODB_CMP_PER_INDEX</code>.
     */
    public static final InnodbCmpPerIndex INNODB_CMP_PER_INDEX = org.jooq.example.gradle.db.information_schema.tables.InnodbCmpPerIndex.INNODB_CMP_PER_INDEX;

    /**
     * The table <code>information_schema.INNODB_CMP_PER_INDEX_RESET</code>.
     */
    public static final InnodbCmpPerIndexReset INNODB_CMP_PER_INDEX_RESET = org.jooq.example.gradle.db.information_schema.tables.InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET;

    /**
     * The table <code>information_schema.INNODB_CMP_RESET</code>.
     */
    public static final InnodbCmpReset INNODB_CMP_RESET = org.jooq.example.gradle.db.information_schema.tables.InnodbCmpReset.INNODB_CMP_RESET;

    /**
     * The table <code>information_schema.INNODB_FT_BEING_DELETED</code>.
     */
    public static final InnodbFtBeingDeleted INNODB_FT_BEING_DELETED = org.jooq.example.gradle.db.information_schema.tables.InnodbFtBeingDeleted.INNODB_FT_BEING_DELETED;

    /**
     * The table <code>information_schema.INNODB_FT_CONFIG</code>.
     */
    public static final InnodbFtConfig INNODB_FT_CONFIG = org.jooq.example.gradle.db.information_schema.tables.InnodbFtConfig.INNODB_FT_CONFIG;

    /**
     * The table <code>information_schema.INNODB_FT_DEFAULT_STOPWORD</code>.
     */
    public static final InnodbFtDefaultStopword INNODB_FT_DEFAULT_STOPWORD = org.jooq.example.gradle.db.information_schema.tables.InnodbFtDefaultStopword.INNODB_FT_DEFAULT_STOPWORD;

    /**
     * The table <code>information_schema.INNODB_FT_DELETED</code>.
     */
    public static final InnodbFtDeleted INNODB_FT_DELETED = org.jooq.example.gradle.db.information_schema.tables.InnodbFtDeleted.INNODB_FT_DELETED;

    /**
     * The table <code>information_schema.INNODB_FT_INDEX_CACHE</code>.
     */
    public static final InnodbFtIndexCache INNODB_FT_INDEX_CACHE = org.jooq.example.gradle.db.information_schema.tables.InnodbFtIndexCache.INNODB_FT_INDEX_CACHE;

    /**
     * The table <code>information_schema.INNODB_FT_INDEX_TABLE</code>.
     */
    public static final InnodbFtIndexTable INNODB_FT_INDEX_TABLE = org.jooq.example.gradle.db.information_schema.tables.InnodbFtIndexTable.INNODB_FT_INDEX_TABLE;

    /**
     * The table <code>information_schema.INNODB_LOCKS</code>.
     */
    public static final InnodbLocks INNODB_LOCKS = org.jooq.example.gradle.db.information_schema.tables.InnodbLocks.INNODB_LOCKS;

    /**
     * The table <code>information_schema.INNODB_LOCK_WAITS</code>.
     */
    public static final InnodbLockWaits INNODB_LOCK_WAITS = org.jooq.example.gradle.db.information_schema.tables.InnodbLockWaits.INNODB_LOCK_WAITS;

    /**
     * The table <code>information_schema.INNODB_METRICS</code>.
     */
    public static final InnodbMetrics INNODB_METRICS = org.jooq.example.gradle.db.information_schema.tables.InnodbMetrics.INNODB_METRICS;

    /**
     * The table <code>information_schema.INNODB_SYS_COLUMNS</code>.
     */
    public static final InnodbSysColumns INNODB_SYS_COLUMNS = org.jooq.example.gradle.db.information_schema.tables.InnodbSysColumns.INNODB_SYS_COLUMNS;

    /**
     * The table <code>information_schema.INNODB_SYS_DATAFILES</code>.
     */
    public static final InnodbSysDatafiles INNODB_SYS_DATAFILES = org.jooq.example.gradle.db.information_schema.tables.InnodbSysDatafiles.INNODB_SYS_DATAFILES;

    /**
     * The table <code>information_schema.INNODB_SYS_FIELDS</code>.
     */
    public static final InnodbSysFields INNODB_SYS_FIELDS = org.jooq.example.gradle.db.information_schema.tables.InnodbSysFields.INNODB_SYS_FIELDS;

    /**
     * The table <code>information_schema.INNODB_SYS_FOREIGN</code>.
     */
    public static final InnodbSysForeign INNODB_SYS_FOREIGN = org.jooq.example.gradle.db.information_schema.tables.InnodbSysForeign.INNODB_SYS_FOREIGN;

    /**
     * The table <code>information_schema.INNODB_SYS_FOREIGN_COLS</code>.
     */
    public static final InnodbSysForeignCols INNODB_SYS_FOREIGN_COLS = org.jooq.example.gradle.db.information_schema.tables.InnodbSysForeignCols.INNODB_SYS_FOREIGN_COLS;

    /**
     * The table <code>information_schema.INNODB_SYS_INDEXES</code>.
     */
    public static final InnodbSysIndexes INNODB_SYS_INDEXES = org.jooq.example.gradle.db.information_schema.tables.InnodbSysIndexes.INNODB_SYS_INDEXES;

    /**
     * The table <code>information_schema.INNODB_SYS_TABLES</code>.
     */
    public static final InnodbSysTables INNODB_SYS_TABLES = org.jooq.example.gradle.db.information_schema.tables.InnodbSysTables.INNODB_SYS_TABLES;

    /**
     * The table <code>information_schema.INNODB_SYS_TABLESPACES</code>.
     */
    public static final InnodbSysTablespaces INNODB_SYS_TABLESPACES = org.jooq.example.gradle.db.information_schema.tables.InnodbSysTablespaces.INNODB_SYS_TABLESPACES;

    /**
     * The table <code>information_schema.INNODB_SYS_TABLESTATS</code>.
     */
    public static final InnodbSysTablestats INNODB_SYS_TABLESTATS = org.jooq.example.gradle.db.information_schema.tables.InnodbSysTablestats.INNODB_SYS_TABLESTATS;

    /**
     * The table <code>information_schema.INNODB_SYS_VIRTUAL</code>.
     */
    public static final InnodbSysVirtual INNODB_SYS_VIRTUAL = org.jooq.example.gradle.db.information_schema.tables.InnodbSysVirtual.INNODB_SYS_VIRTUAL;

    /**
     * The table <code>information_schema.INNODB_TEMP_TABLE_INFO</code>.
     */
    public static final InnodbTempTableInfo INNODB_TEMP_TABLE_INFO = org.jooq.example.gradle.db.information_schema.tables.InnodbTempTableInfo.INNODB_TEMP_TABLE_INFO;

    /**
     * The table <code>information_schema.INNODB_TRX</code>.
     */
    public static final InnodbTrx INNODB_TRX = org.jooq.example.gradle.db.information_schema.tables.InnodbTrx.INNODB_TRX;

    /**
     * The table <code>information_schema.KEY_COLUMN_USAGE</code>.
     */
    public static final KeyColumnUsage KEY_COLUMN_USAGE = org.jooq.example.gradle.db.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE;

    /**
     * The table <code>information_schema.OPTIMIZER_TRACE</code>.
     */
    public static final OptimizerTrace OPTIMIZER_TRACE = org.jooq.example.gradle.db.information_schema.tables.OptimizerTrace.OPTIMIZER_TRACE;

    /**
     * The table <code>information_schema.PARAMETERS</code>.
     */
    public static final Parameters PARAMETERS = org.jooq.example.gradle.db.information_schema.tables.Parameters.PARAMETERS;

    /**
     * The table <code>information_schema.PARTITIONS</code>.
     */
    public static final Partitions PARTITIONS = org.jooq.example.gradle.db.information_schema.tables.Partitions.PARTITIONS;

    /**
     * The table <code>information_schema.PLUGINS</code>.
     */
    public static final Plugins PLUGINS = org.jooq.example.gradle.db.information_schema.tables.Plugins.PLUGINS;

    /**
     * The table <code>information_schema.PROCESSLIST</code>.
     */
    public static final Processlist PROCESSLIST = org.jooq.example.gradle.db.information_schema.tables.Processlist.PROCESSLIST;

    /**
     * The table <code>information_schema.PROFILING</code>.
     */
    public static final Profiling PROFILING = org.jooq.example.gradle.db.information_schema.tables.Profiling.PROFILING;

    /**
     * The table <code>information_schema.REFERENTIAL_CONSTRAINTS</code>.
     */
    public static final ReferentialConstraints REFERENTIAL_CONSTRAINTS = org.jooq.example.gradle.db.information_schema.tables.ReferentialConstraints.REFERENTIAL_CONSTRAINTS;

    /**
     * The table <code>information_schema.ROUTINES</code>.
     */
    public static final Routines ROUTINES = org.jooq.example.gradle.db.information_schema.tables.Routines.ROUTINES;

    /**
     * The table <code>information_schema.SCHEMATA</code>.
     */
    public static final Schemata SCHEMATA = org.jooq.example.gradle.db.information_schema.tables.Schemata.SCHEMATA;

    /**
     * The table <code>information_schema.SCHEMA_PRIVILEGES</code>.
     */
    public static final SchemaPrivileges SCHEMA_PRIVILEGES = org.jooq.example.gradle.db.information_schema.tables.SchemaPrivileges.SCHEMA_PRIVILEGES;

    /**
     * The table <code>information_schema.SESSION_STATUS</code>.
     */
    public static final SessionStatus SESSION_STATUS = org.jooq.example.gradle.db.information_schema.tables.SessionStatus.SESSION_STATUS;

    /**
     * The table <code>information_schema.SESSION_VARIABLES</code>.
     */
    public static final SessionVariables SESSION_VARIABLES = org.jooq.example.gradle.db.information_schema.tables.SessionVariables.SESSION_VARIABLES;

    /**
     * The table <code>information_schema.STATISTICS</code>.
     */
    public static final Statistics STATISTICS = org.jooq.example.gradle.db.information_schema.tables.Statistics.STATISTICS;

    /**
     * The table <code>information_schema.TABLES</code>.
     */
    public static final org.jooq.example.gradle.db.information_schema.tables.Tables TABLES = org.jooq.example.gradle.db.information_schema.tables.Tables.TABLES;

    /**
     * The table <code>information_schema.TABLESPACES</code>.
     */
    public static final Tablespaces TABLESPACES = org.jooq.example.gradle.db.information_schema.tables.Tablespaces.TABLESPACES;

    /**
     * The table <code>information_schema.TABLE_CONSTRAINTS</code>.
     */
    public static final TableConstraints TABLE_CONSTRAINTS = org.jooq.example.gradle.db.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS;

    /**
     * The table <code>information_schema.TABLE_PRIVILEGES</code>.
     */
    public static final TablePrivileges TABLE_PRIVILEGES = org.jooq.example.gradle.db.information_schema.tables.TablePrivileges.TABLE_PRIVILEGES;

    /**
     * The table <code>information_schema.TRIGGERS</code>.
     */
    public static final Triggers TRIGGERS = org.jooq.example.gradle.db.information_schema.tables.Triggers.TRIGGERS;

    /**
     * The table <code>information_schema.USER_PRIVILEGES</code>.
     */
    public static final UserPrivileges USER_PRIVILEGES = org.jooq.example.gradle.db.information_schema.tables.UserPrivileges.USER_PRIVILEGES;

    /**
     * The table <code>information_schema.VIEWS</code>.
     */
    public static final Views VIEWS = org.jooq.example.gradle.db.information_schema.tables.Views.VIEWS;
}
