/*
 * This file is generated by jOOQ.
*/
package org.jooq.example.gradle.db.performance_schema;


import javax.annotation.Generated;

import org.jooq.example.gradle.db.performance_schema.tables.Accounts;
import org.jooq.example.gradle.db.performance_schema.tables.CondInstances;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStagesCurrent;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStagesHistory;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStagesHistoryLong;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStagesSummaryByAccountByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStagesSummaryByHostByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStagesSummaryByThreadByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStagesSummaryByUserByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStagesSummaryGlobalByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsCurrent;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsHistory;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsHistoryLong;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsSummaryByAccountByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsSummaryByDigest;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsSummaryByHostByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsSummaryByProgram;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsSummaryByThreadByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsSummaryByUserByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsSummaryGlobalByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsTransactionsCurrent;
import org.jooq.example.gradle.db.performance_schema.tables.EventsTransactionsHistory;
import org.jooq.example.gradle.db.performance_schema.tables.EventsTransactionsHistoryLong;
import org.jooq.example.gradle.db.performance_schema.tables.EventsTransactionsSummaryByAccountByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsTransactionsSummaryByHostByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsTransactionsSummaryByThreadByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsTransactionsSummaryByUserByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsTransactionsSummaryGlobalByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsCurrent;
import org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsHistory;
import org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsHistoryLong;
import org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsSummaryByAccountByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsSummaryByHostByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsSummaryByInstance;
import org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsSummaryByThreadByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsSummaryByUserByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsSummaryGlobalByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.FileInstances;
import org.jooq.example.gradle.db.performance_schema.tables.FileSummaryByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.FileSummaryByInstance;
import org.jooq.example.gradle.db.performance_schema.tables.GlobalStatus;
import org.jooq.example.gradle.db.performance_schema.tables.GlobalVariables;
import org.jooq.example.gradle.db.performance_schema.tables.HostCache;
import org.jooq.example.gradle.db.performance_schema.tables.Hosts;
import org.jooq.example.gradle.db.performance_schema.tables.MemorySummaryByAccountByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.MemorySummaryByHostByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.MemorySummaryByThreadByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.MemorySummaryByUserByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.MemorySummaryGlobalByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.MetadataLocks;
import org.jooq.example.gradle.db.performance_schema.tables.MutexInstances;
import org.jooq.example.gradle.db.performance_schema.tables.ObjectsSummaryGlobalByType;
import org.jooq.example.gradle.db.performance_schema.tables.PerformanceTimers;
import org.jooq.example.gradle.db.performance_schema.tables.PreparedStatementsInstances;
import org.jooq.example.gradle.db.performance_schema.tables.ReplicationApplierConfiguration;
import org.jooq.example.gradle.db.performance_schema.tables.ReplicationApplierStatus;
import org.jooq.example.gradle.db.performance_schema.tables.ReplicationApplierStatusByCoordinator;
import org.jooq.example.gradle.db.performance_schema.tables.ReplicationApplierStatusByWorker;
import org.jooq.example.gradle.db.performance_schema.tables.ReplicationConnectionConfiguration;
import org.jooq.example.gradle.db.performance_schema.tables.ReplicationConnectionStatus;
import org.jooq.example.gradle.db.performance_schema.tables.ReplicationGroupMemberStats;
import org.jooq.example.gradle.db.performance_schema.tables.ReplicationGroupMembers;
import org.jooq.example.gradle.db.performance_schema.tables.RwlockInstances;
import org.jooq.example.gradle.db.performance_schema.tables.SessionAccountConnectAttrs;
import org.jooq.example.gradle.db.performance_schema.tables.SessionConnectAttrs;
import org.jooq.example.gradle.db.performance_schema.tables.SessionStatus;
import org.jooq.example.gradle.db.performance_schema.tables.SessionVariables;
import org.jooq.example.gradle.db.performance_schema.tables.SetupActors;
import org.jooq.example.gradle.db.performance_schema.tables.SetupConsumers;
import org.jooq.example.gradle.db.performance_schema.tables.SetupInstruments;
import org.jooq.example.gradle.db.performance_schema.tables.SetupObjects;
import org.jooq.example.gradle.db.performance_schema.tables.SetupTimers;
import org.jooq.example.gradle.db.performance_schema.tables.SocketInstances;
import org.jooq.example.gradle.db.performance_schema.tables.SocketSummaryByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.SocketSummaryByInstance;
import org.jooq.example.gradle.db.performance_schema.tables.StatusByAccount;
import org.jooq.example.gradle.db.performance_schema.tables.StatusByHost;
import org.jooq.example.gradle.db.performance_schema.tables.StatusByThread;
import org.jooq.example.gradle.db.performance_schema.tables.StatusByUser;
import org.jooq.example.gradle.db.performance_schema.tables.TableHandles;
import org.jooq.example.gradle.db.performance_schema.tables.TableIoWaitsSummaryByIndexUsage;
import org.jooq.example.gradle.db.performance_schema.tables.TableIoWaitsSummaryByTable;
import org.jooq.example.gradle.db.performance_schema.tables.TableLockWaitsSummaryByTable;
import org.jooq.example.gradle.db.performance_schema.tables.Threads;
import org.jooq.example.gradle.db.performance_schema.tables.UserVariablesByThread;
import org.jooq.example.gradle.db.performance_schema.tables.Users;
import org.jooq.example.gradle.db.performance_schema.tables.VariablesByThread;


/**
 * Convenience access to all tables in performance_schema
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
     * The table <code>performance_schema.accounts</code>.
     */
    public static final Accounts ACCOUNTS = org.jooq.example.gradle.db.performance_schema.tables.Accounts.ACCOUNTS;

    /**
     * The table <code>performance_schema.cond_instances</code>.
     */
    public static final CondInstances COND_INSTANCES = org.jooq.example.gradle.db.performance_schema.tables.CondInstances.COND_INSTANCES;

    /**
     * The table <code>performance_schema.events_stages_current</code>.
     */
    public static final EventsStagesCurrent EVENTS_STAGES_CURRENT = org.jooq.example.gradle.db.performance_schema.tables.EventsStagesCurrent.EVENTS_STAGES_CURRENT;

    /**
     * The table <code>performance_schema.events_stages_history</code>.
     */
    public static final EventsStagesHistory EVENTS_STAGES_HISTORY = org.jooq.example.gradle.db.performance_schema.tables.EventsStagesHistory.EVENTS_STAGES_HISTORY;

    /**
     * The table <code>performance_schema.events_stages_history_long</code>.
     */
    public static final EventsStagesHistoryLong EVENTS_STAGES_HISTORY_LONG = org.jooq.example.gradle.db.performance_schema.tables.EventsStagesHistoryLong.EVENTS_STAGES_HISTORY_LONG;

    /**
     * The table <code>performance_schema.events_stages_summary_by_account_by_event_name</code>.
     */
    public static final EventsStagesSummaryByAccountByEventName EVENTS_STAGES_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.EventsStagesSummaryByAccountByEventName.EVENTS_STAGES_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_stages_summary_by_host_by_event_name</code>.
     */
    public static final EventsStagesSummaryByHostByEventName EVENTS_STAGES_SUMMARY_BY_HOST_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.EventsStagesSummaryByHostByEventName.EVENTS_STAGES_SUMMARY_BY_HOST_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_stages_summary_by_thread_by_event_name</code>.
     */
    public static final EventsStagesSummaryByThreadByEventName EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.EventsStagesSummaryByThreadByEventName.EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_stages_summary_by_user_by_event_name</code>.
     */
    public static final EventsStagesSummaryByUserByEventName EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.EventsStagesSummaryByUserByEventName.EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_stages_summary_global_by_event_name</code>.
     */
    public static final EventsStagesSummaryGlobalByEventName EVENTS_STAGES_SUMMARY_GLOBAL_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.EventsStagesSummaryGlobalByEventName.EVENTS_STAGES_SUMMARY_GLOBAL_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_statements_current</code>.
     */
    public static final EventsStatementsCurrent EVENTS_STATEMENTS_CURRENT = org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsCurrent.EVENTS_STATEMENTS_CURRENT;

    /**
     * The table <code>performance_schema.events_statements_history</code>.
     */
    public static final EventsStatementsHistory EVENTS_STATEMENTS_HISTORY = org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsHistory.EVENTS_STATEMENTS_HISTORY;

    /**
     * The table <code>performance_schema.events_statements_history_long</code>.
     */
    public static final EventsStatementsHistoryLong EVENTS_STATEMENTS_HISTORY_LONG = org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsHistoryLong.EVENTS_STATEMENTS_HISTORY_LONG;

    /**
     * The table <code>performance_schema.events_statements_summary_by_account_by_event_name</code>.
     */
    public static final EventsStatementsSummaryByAccountByEventName EVENTS_STATEMENTS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsSummaryByAccountByEventName.EVENTS_STATEMENTS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_statements_summary_by_digest</code>.
     */
    public static final EventsStatementsSummaryByDigest EVENTS_STATEMENTS_SUMMARY_BY_DIGEST = org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsSummaryByDigest.EVENTS_STATEMENTS_SUMMARY_BY_DIGEST;

    /**
     * The table <code>performance_schema.events_statements_summary_by_host_by_event_name</code>.
     */
    public static final EventsStatementsSummaryByHostByEventName EVENTS_STATEMENTS_SUMMARY_BY_HOST_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsSummaryByHostByEventName.EVENTS_STATEMENTS_SUMMARY_BY_HOST_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_statements_summary_by_program</code>.
     */
    public static final EventsStatementsSummaryByProgram EVENTS_STATEMENTS_SUMMARY_BY_PROGRAM = org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsSummaryByProgram.EVENTS_STATEMENTS_SUMMARY_BY_PROGRAM;

    /**
     * The table <code>performance_schema.events_statements_summary_by_thread_by_event_name</code>.
     */
    public static final EventsStatementsSummaryByThreadByEventName EVENTS_STATEMENTS_SUMMARY_BY_THREAD_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsSummaryByThreadByEventName.EVENTS_STATEMENTS_SUMMARY_BY_THREAD_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_statements_summary_by_user_by_event_name</code>.
     */
    public static final EventsStatementsSummaryByUserByEventName EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsSummaryByUserByEventName.EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_statements_summary_global_by_event_name</code>.
     */
    public static final EventsStatementsSummaryGlobalByEventName EVENTS_STATEMENTS_SUMMARY_GLOBAL_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsSummaryGlobalByEventName.EVENTS_STATEMENTS_SUMMARY_GLOBAL_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_transactions_current</code>.
     */
    public static final EventsTransactionsCurrent EVENTS_TRANSACTIONS_CURRENT = org.jooq.example.gradle.db.performance_schema.tables.EventsTransactionsCurrent.EVENTS_TRANSACTIONS_CURRENT;

    /**
     * The table <code>performance_schema.events_transactions_history</code>.
     */
    public static final EventsTransactionsHistory EVENTS_TRANSACTIONS_HISTORY = org.jooq.example.gradle.db.performance_schema.tables.EventsTransactionsHistory.EVENTS_TRANSACTIONS_HISTORY;

    /**
     * The table <code>performance_schema.events_transactions_history_long</code>.
     */
    public static final EventsTransactionsHistoryLong EVENTS_TRANSACTIONS_HISTORY_LONG = org.jooq.example.gradle.db.performance_schema.tables.EventsTransactionsHistoryLong.EVENTS_TRANSACTIONS_HISTORY_LONG;

    /**
     * The table <code>performance_schema.events_transactions_summary_by_account_by_event_name</code>.
     */
    public static final EventsTransactionsSummaryByAccountByEventName EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.EventsTransactionsSummaryByAccountByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_transactions_summary_by_host_by_event_name</code>.
     */
    public static final EventsTransactionsSummaryByHostByEventName EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_transactions_summary_by_thread_by_event_name</code>.
     */
    public static final EventsTransactionsSummaryByThreadByEventName EVENTS_TRANSACTIONS_SUMMARY_BY_THREAD_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.EventsTransactionsSummaryByThreadByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_THREAD_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_transactions_summary_by_user_by_event_name</code>.
     */
    public static final EventsTransactionsSummaryByUserByEventName EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_transactions_summary_global_by_event_name</code>.
     */
    public static final EventsTransactionsSummaryGlobalByEventName EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_waits_current</code>.
     */
    public static final EventsWaitsCurrent EVENTS_WAITS_CURRENT = org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsCurrent.EVENTS_WAITS_CURRENT;

    /**
     * The table <code>performance_schema.events_waits_history</code>.
     */
    public static final EventsWaitsHistory EVENTS_WAITS_HISTORY = org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsHistory.EVENTS_WAITS_HISTORY;

    /**
     * The table <code>performance_schema.events_waits_history_long</code>.
     */
    public static final EventsWaitsHistoryLong EVENTS_WAITS_HISTORY_LONG = org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsHistoryLong.EVENTS_WAITS_HISTORY_LONG;

    /**
     * The table <code>performance_schema.events_waits_summary_by_account_by_event_name</code>.
     */
    public static final EventsWaitsSummaryByAccountByEventName EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsSummaryByAccountByEventName.EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_waits_summary_by_host_by_event_name</code>.
     */
    public static final EventsWaitsSummaryByHostByEventName EVENTS_WAITS_SUMMARY_BY_HOST_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsSummaryByHostByEventName.EVENTS_WAITS_SUMMARY_BY_HOST_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_waits_summary_by_instance</code>.
     */
    public static final EventsWaitsSummaryByInstance EVENTS_WAITS_SUMMARY_BY_INSTANCE = org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsSummaryByInstance.EVENTS_WAITS_SUMMARY_BY_INSTANCE;

    /**
     * The table <code>performance_schema.events_waits_summary_by_thread_by_event_name</code>.
     */
    public static final EventsWaitsSummaryByThreadByEventName EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsSummaryByThreadByEventName.EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_waits_summary_by_user_by_event_name</code>.
     */
    public static final EventsWaitsSummaryByUserByEventName EVENTS_WAITS_SUMMARY_BY_USER_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsSummaryByUserByEventName.EVENTS_WAITS_SUMMARY_BY_USER_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_waits_summary_global_by_event_name</code>.
     */
    public static final EventsWaitsSummaryGlobalByEventName EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.file_instances</code>.
     */
    public static final FileInstances FILE_INSTANCES = org.jooq.example.gradle.db.performance_schema.tables.FileInstances.FILE_INSTANCES;

    /**
     * The table <code>performance_schema.file_summary_by_event_name</code>.
     */
    public static final FileSummaryByEventName FILE_SUMMARY_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.FileSummaryByEventName.FILE_SUMMARY_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.file_summary_by_instance</code>.
     */
    public static final FileSummaryByInstance FILE_SUMMARY_BY_INSTANCE = org.jooq.example.gradle.db.performance_schema.tables.FileSummaryByInstance.FILE_SUMMARY_BY_INSTANCE;

    /**
     * The table <code>performance_schema.global_status</code>.
     */
    public static final GlobalStatus GLOBAL_STATUS = org.jooq.example.gradle.db.performance_schema.tables.GlobalStatus.GLOBAL_STATUS;

    /**
     * The table <code>performance_schema.global_variables</code>.
     */
    public static final GlobalVariables GLOBAL_VARIABLES = org.jooq.example.gradle.db.performance_schema.tables.GlobalVariables.GLOBAL_VARIABLES;

    /**
     * The table <code>performance_schema.hosts</code>.
     */
    public static final Hosts HOSTS = org.jooq.example.gradle.db.performance_schema.tables.Hosts.HOSTS;

    /**
     * The table <code>performance_schema.host_cache</code>.
     */
    public static final HostCache HOST_CACHE = org.jooq.example.gradle.db.performance_schema.tables.HostCache.HOST_CACHE;

    /**
     * The table <code>performance_schema.memory_summary_by_account_by_event_name</code>.
     */
    public static final MemorySummaryByAccountByEventName MEMORY_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.MemorySummaryByAccountByEventName.MEMORY_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.memory_summary_by_host_by_event_name</code>.
     */
    public static final MemorySummaryByHostByEventName MEMORY_SUMMARY_BY_HOST_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.MemorySummaryByHostByEventName.MEMORY_SUMMARY_BY_HOST_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.memory_summary_by_thread_by_event_name</code>.
     */
    public static final MemorySummaryByThreadByEventName MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.MemorySummaryByThreadByEventName.MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.memory_summary_by_user_by_event_name</code>.
     */
    public static final MemorySummaryByUserByEventName MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.MemorySummaryByUserByEventName.MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.memory_summary_global_by_event_name</code>.
     */
    public static final MemorySummaryGlobalByEventName MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.MemorySummaryGlobalByEventName.MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.metadata_locks</code>.
     */
    public static final MetadataLocks METADATA_LOCKS = org.jooq.example.gradle.db.performance_schema.tables.MetadataLocks.METADATA_LOCKS;

    /**
     * The table <code>performance_schema.mutex_instances</code>.
     */
    public static final MutexInstances MUTEX_INSTANCES = org.jooq.example.gradle.db.performance_schema.tables.MutexInstances.MUTEX_INSTANCES;

    /**
     * The table <code>performance_schema.objects_summary_global_by_type</code>.
     */
    public static final ObjectsSummaryGlobalByType OBJECTS_SUMMARY_GLOBAL_BY_TYPE = org.jooq.example.gradle.db.performance_schema.tables.ObjectsSummaryGlobalByType.OBJECTS_SUMMARY_GLOBAL_BY_TYPE;

    /**
     * The table <code>performance_schema.performance_timers</code>.
     */
    public static final PerformanceTimers PERFORMANCE_TIMERS = org.jooq.example.gradle.db.performance_schema.tables.PerformanceTimers.PERFORMANCE_TIMERS;

    /**
     * The table <code>performance_schema.prepared_statements_instances</code>.
     */
    public static final PreparedStatementsInstances PREPARED_STATEMENTS_INSTANCES = org.jooq.example.gradle.db.performance_schema.tables.PreparedStatementsInstances.PREPARED_STATEMENTS_INSTANCES;

    /**
     * The table <code>performance_schema.replication_applier_configuration</code>.
     */
    public static final ReplicationApplierConfiguration REPLICATION_APPLIER_CONFIGURATION = org.jooq.example.gradle.db.performance_schema.tables.ReplicationApplierConfiguration.REPLICATION_APPLIER_CONFIGURATION;

    /**
     * The table <code>performance_schema.replication_applier_status</code>.
     */
    public static final ReplicationApplierStatus REPLICATION_APPLIER_STATUS = org.jooq.example.gradle.db.performance_schema.tables.ReplicationApplierStatus.REPLICATION_APPLIER_STATUS;

    /**
     * The table <code>performance_schema.replication_applier_status_by_coordinator</code>.
     */
    public static final ReplicationApplierStatusByCoordinator REPLICATION_APPLIER_STATUS_BY_COORDINATOR = org.jooq.example.gradle.db.performance_schema.tables.ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR;

    /**
     * The table <code>performance_schema.replication_applier_status_by_worker</code>.
     */
    public static final ReplicationApplierStatusByWorker REPLICATION_APPLIER_STATUS_BY_WORKER = org.jooq.example.gradle.db.performance_schema.tables.ReplicationApplierStatusByWorker.REPLICATION_APPLIER_STATUS_BY_WORKER;

    /**
     * The table <code>performance_schema.replication_connection_configuration</code>.
     */
    public static final ReplicationConnectionConfiguration REPLICATION_CONNECTION_CONFIGURATION = org.jooq.example.gradle.db.performance_schema.tables.ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION;

    /**
     * The table <code>performance_schema.replication_connection_status</code>.
     */
    public static final ReplicationConnectionStatus REPLICATION_CONNECTION_STATUS = org.jooq.example.gradle.db.performance_schema.tables.ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS;

    /**
     * The table <code>performance_schema.replication_group_members</code>.
     */
    public static final ReplicationGroupMembers REPLICATION_GROUP_MEMBERS = org.jooq.example.gradle.db.performance_schema.tables.ReplicationGroupMembers.REPLICATION_GROUP_MEMBERS;

    /**
     * The table <code>performance_schema.replication_group_member_stats</code>.
     */
    public static final ReplicationGroupMemberStats REPLICATION_GROUP_MEMBER_STATS = org.jooq.example.gradle.db.performance_schema.tables.ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS;

    /**
     * The table <code>performance_schema.rwlock_instances</code>.
     */
    public static final RwlockInstances RWLOCK_INSTANCES = org.jooq.example.gradle.db.performance_schema.tables.RwlockInstances.RWLOCK_INSTANCES;

    /**
     * The table <code>performance_schema.session_account_connect_attrs</code>.
     */
    public static final SessionAccountConnectAttrs SESSION_ACCOUNT_CONNECT_ATTRS = org.jooq.example.gradle.db.performance_schema.tables.SessionAccountConnectAttrs.SESSION_ACCOUNT_CONNECT_ATTRS;

    /**
     * The table <code>performance_schema.session_connect_attrs</code>.
     */
    public static final SessionConnectAttrs SESSION_CONNECT_ATTRS = org.jooq.example.gradle.db.performance_schema.tables.SessionConnectAttrs.SESSION_CONNECT_ATTRS;

    /**
     * The table <code>performance_schema.session_status</code>.
     */
    public static final SessionStatus SESSION_STATUS = org.jooq.example.gradle.db.performance_schema.tables.SessionStatus.SESSION_STATUS;

    /**
     * The table <code>performance_schema.session_variables</code>.
     */
    public static final SessionVariables SESSION_VARIABLES = org.jooq.example.gradle.db.performance_schema.tables.SessionVariables.SESSION_VARIABLES;

    /**
     * The table <code>performance_schema.setup_actors</code>.
     */
    public static final SetupActors SETUP_ACTORS = org.jooq.example.gradle.db.performance_schema.tables.SetupActors.SETUP_ACTORS;

    /**
     * The table <code>performance_schema.setup_consumers</code>.
     */
    public static final SetupConsumers SETUP_CONSUMERS = org.jooq.example.gradle.db.performance_schema.tables.SetupConsumers.SETUP_CONSUMERS;

    /**
     * The table <code>performance_schema.setup_instruments</code>.
     */
    public static final SetupInstruments SETUP_INSTRUMENTS = org.jooq.example.gradle.db.performance_schema.tables.SetupInstruments.SETUP_INSTRUMENTS;

    /**
     * The table <code>performance_schema.setup_objects</code>.
     */
    public static final SetupObjects SETUP_OBJECTS = org.jooq.example.gradle.db.performance_schema.tables.SetupObjects.SETUP_OBJECTS;

    /**
     * The table <code>performance_schema.setup_timers</code>.
     */
    public static final SetupTimers SETUP_TIMERS = org.jooq.example.gradle.db.performance_schema.tables.SetupTimers.SETUP_TIMERS;

    /**
     * The table <code>performance_schema.socket_instances</code>.
     */
    public static final SocketInstances SOCKET_INSTANCES = org.jooq.example.gradle.db.performance_schema.tables.SocketInstances.SOCKET_INSTANCES;

    /**
     * The table <code>performance_schema.socket_summary_by_event_name</code>.
     */
    public static final SocketSummaryByEventName SOCKET_SUMMARY_BY_EVENT_NAME = org.jooq.example.gradle.db.performance_schema.tables.SocketSummaryByEventName.SOCKET_SUMMARY_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.socket_summary_by_instance</code>.
     */
    public static final SocketSummaryByInstance SOCKET_SUMMARY_BY_INSTANCE = org.jooq.example.gradle.db.performance_schema.tables.SocketSummaryByInstance.SOCKET_SUMMARY_BY_INSTANCE;

    /**
     * The table <code>performance_schema.status_by_account</code>.
     */
    public static final StatusByAccount STATUS_BY_ACCOUNT = org.jooq.example.gradle.db.performance_schema.tables.StatusByAccount.STATUS_BY_ACCOUNT;

    /**
     * The table <code>performance_schema.status_by_host</code>.
     */
    public static final StatusByHost STATUS_BY_HOST = org.jooq.example.gradle.db.performance_schema.tables.StatusByHost.STATUS_BY_HOST;

    /**
     * The table <code>performance_schema.status_by_thread</code>.
     */
    public static final StatusByThread STATUS_BY_THREAD = org.jooq.example.gradle.db.performance_schema.tables.StatusByThread.STATUS_BY_THREAD;

    /**
     * The table <code>performance_schema.status_by_user</code>.
     */
    public static final StatusByUser STATUS_BY_USER = org.jooq.example.gradle.db.performance_schema.tables.StatusByUser.STATUS_BY_USER;

    /**
     * The table <code>performance_schema.table_handles</code>.
     */
    public static final TableHandles TABLE_HANDLES = org.jooq.example.gradle.db.performance_schema.tables.TableHandles.TABLE_HANDLES;

    /**
     * The table <code>performance_schema.table_io_waits_summary_by_index_usage</code>.
     */
    public static final TableIoWaitsSummaryByIndexUsage TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE = org.jooq.example.gradle.db.performance_schema.tables.TableIoWaitsSummaryByIndexUsage.TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE;

    /**
     * The table <code>performance_schema.table_io_waits_summary_by_table</code>.
     */
    public static final TableIoWaitsSummaryByTable TABLE_IO_WAITS_SUMMARY_BY_TABLE = org.jooq.example.gradle.db.performance_schema.tables.TableIoWaitsSummaryByTable.TABLE_IO_WAITS_SUMMARY_BY_TABLE;

    /**
     * The table <code>performance_schema.table_lock_waits_summary_by_table</code>.
     */
    public static final TableLockWaitsSummaryByTable TABLE_LOCK_WAITS_SUMMARY_BY_TABLE = org.jooq.example.gradle.db.performance_schema.tables.TableLockWaitsSummaryByTable.TABLE_LOCK_WAITS_SUMMARY_BY_TABLE;

    /**
     * The table <code>performance_schema.threads</code>.
     */
    public static final Threads THREADS = org.jooq.example.gradle.db.performance_schema.tables.Threads.THREADS;

    /**
     * The table <code>performance_schema.users</code>.
     */
    public static final Users USERS = org.jooq.example.gradle.db.performance_schema.tables.Users.USERS;

    /**
     * The table <code>performance_schema.user_variables_by_thread</code>.
     */
    public static final UserVariablesByThread USER_VARIABLES_BY_THREAD = org.jooq.example.gradle.db.performance_schema.tables.UserVariablesByThread.USER_VARIABLES_BY_THREAD;

    /**
     * The table <code>performance_schema.variables_by_thread</code>.
     */
    public static final VariablesByThread VARIABLES_BY_THREAD = org.jooq.example.gradle.db.performance_schema.tables.VariablesByThread.VARIABLES_BY_THREAD;
}
