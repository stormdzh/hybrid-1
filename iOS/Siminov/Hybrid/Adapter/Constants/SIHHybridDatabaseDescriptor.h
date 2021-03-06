///
/// [SIMINOV FRAMEWORK - HYBRID]
/// Copyright [2014-2016] [Siminov Software Solution LLP|support@siminov.com]
///
/// Licensed under the Apache License, Version 2.0 (the "License");
/// you may not use this file except in compliance with the License.
/// You may obtain a copy of the License at
///
///     http://www.apache.org/licenses/LICENSE-2.0
///
/// Unless required by applicable law or agreed to in writing, software
/// distributed under the License is distributed on an "AS IS" BASIS,
/// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/// See the License for the specific language governing permissions and
/// limitations under the License.
///

/**
 * Exposes constants which represents Database Descriptor on Hybrid.
 */

#import <Foundation/Foundation.h>


/**
 * Hybrid Module Database Descriptor Function Name.
 */
static NSString * const HYBRID_DATABASE_DESCRIPTOR_DATABASE_DESCRIPTOR = @"DatabaseDescriptor";


/**
 * Hybrid Database Descriptor Database Name.
 */
static NSString * const HYBRID_DATABASE_DESCRIPTOR_NAME = @"databaseName";

/**
 * Hybrid Database Descriptor Description.
 */
static NSString * const HYBRID_DATABASE_DESCRIPTOR_DESCRIPTION = @"description";


/**
 * Hybrid Database Descriptor Is Locking Required.
 */
static NSString * const HYBRID_DATABASE_DESCRIPTOR_IS_TRANSACTION_SAFE = @"transactionSafe";

/**
 * Hybrid Database Descriptor External Storage.
 */
static NSString * const HYBRID_DATABASE_DESCRIPTOR_EXTERNAL_STORAGE = @"externalStorage";


/**
 * Hybrid Database Descriptor Entity Descriptor Paths.
 */
static NSString * const HYBRID_DATABASE_DESCRIPTOR_ENTITY_DESCRIPTORS = @"Array";

/**
 * Hybrid Database Descriptor Entity Descriptor Path.
 */
static NSString * const HYBRID_DATABASE_DESCRIPTOR_ENTITY_DESCRIPTOR_PATH = @"entityDescriptorPath";