/**
 * [SIMINOV FRAMEWORK - HYBRID]
 * Copyright [2014-2016] [Siminov Software Solution LLP|support@siminov.com]
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
 * Exposes constants which represents Database Descriptor on Hybrid.
 */
public interface HybridDatabaseDescriptor {

	/**
	 * Hybrid Module Database Descriptor Function Name.
	 */
	public String DATABASE_DESCRIPTOR = "DatabaseDescriptor";
	
	
	/**
	 * Hybrid Database Descriptor Database Name.
	 */
	public String NAME = "databaseName";
	
	/**
	 * Hybrid Database Descriptor Description.
	 */
	public String DESCRIPTION = "description";
	
	
	/**
	 * Hybrid Database Descriptor Is Locking Required.
	 */
	public String IS_TRANSACTION_SAFE = "transactionSafe";
	
	/**
	 * Hybrid Database Descriptor External Storage.
	 */
	public String EXTERNAL_STORAGE = "externalStorage";
	
	
	/**
	 * Hybrid Database Descriptor Entity Descriptor Paths.
	 */
	public String ENTITY_DESCRIPTORS = "Array";
	
	/**
	 * Hybrid Database Descriptor Entity Descriptor Path.
	 */
	public String ENTITY_DESCRIPTOR_PATH = "entityDescriptorPath";
	
}
