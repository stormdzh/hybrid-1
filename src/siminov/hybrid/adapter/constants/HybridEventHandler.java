/** 
 * [SIMINOV FRAMEWORK]
 * Copyright [2015] [Siminov Software Solution LLP|support@siminov.com]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/


package siminov.hybrid.adapter.constants;

/**
 * Exposes constants which represents Hybrid Event Handler on Web.
 */
public interface HybridEventHandler {

	/**
	 * Web Triggered Event API.
	 */
	public String TRIGGERED_EVENT = "TriggeredEvent";
	
	/**
	 * Web First Time Siminov Initialized Event API.
	 */
	public String ISIMINOV_EVENT_ON_FIRST_TIME_SIMINOV_INITIALIZED = "onFirstTimeSiminovInitialized";

	/**
	 * Web Siminov Initialized Event API.
	 */
	public String ISIMINOV_EVENT_ON_SIMINOV_INITIALIZED = "onSiminovInitialized";

	/**
	 * Web Siminov Stopped Event API.
	 */
	public String ISIMINOV_EVENT_ON_SIMINOV_STOPPED = "onSiminovStopped";
	
	
	/**
	 * Web Database Created Event API.
	 */
	public String IDATABASE_EVENT_ON_DATABASE_CREATED = "onDatabaseCreated";

	/**
	 * Web Database Dropped Event API.
	 */
	public String IDATABASE_EVENT_ON_DATABASE_DROPPED = "onDatabaseDropped";
	
	/**
	 * Web Table Created Event API.
	 */
	public String IDATABASE_EVENT_ON_TABLE_CREATED = "onTableCreated";
	
	/**
	 * Web Table Dropped Event API.
	 */
	public String IDATABASE_EVENT_ON_TABLE_DROPPED = "onTableDropped";

	/**
	 * Web Index Created Event API.
	 */
	public String IDATABASE_EVENT_ON_INDEX_CREATED = "onIndexCreated";
	
	/**
	 * Web Index Dropped Event API.
	 */
	public String IDATABASE_EVENT_ON_INDEX_DROPPED = "onIndexDropped";

	/**
	 * INofitication Event On Registration
	 */
	public String INOTIFICATION_EVENT_ON_REGISTRATION = "onRegistration";
	
	
	/**
	 * INotification Event On Unregistration
	 */
	public String INOTIFICATION_EVENT_ON_UNREGISTRATION = "onUnregistration";
	
	
	/**
	 * INotification Event On Notification
	 */
	public String INOTIFICATION_EVENT_ON_NOTIFICATION = "onNotification";
	
	
	/**
	 * INotification Event On Error
	 */
	public String INOTIFICATION_EVENT_ON_ERROR = "onError";
	
	
	/**
	 * ISync Event On Sync Started
	 */
	public String ISYNC_EVENT_ON_SYNC_STARTED = "onSyncStarted";
	
	
	/**
	 * ISync Event On Sync Queued
	 */
	public String ISYNC_EVENT_ON_SYNC_QUEUED = "onSyncQueued";
	
	/**
	 * ISync Event On Sync Removed
	 */
	public String ISYNC_EVENT_ON_SYNC_REMOVED = "onSyncRemoved";
	
	
	/**
	 * ISync Event On Sync Terminated
	 */
	public String ISYNC_EVENT_ON_SYNC_TERMINATED = "onSyncTerminated";
	

	/**
	 * Web Events.
	 */
	public String EVENTS = "Events";
	
	
	/**
	 * Web Event Parameters. 
	 */
	public String EVENT_PARAMETERS = "EventParameters";
	
}
