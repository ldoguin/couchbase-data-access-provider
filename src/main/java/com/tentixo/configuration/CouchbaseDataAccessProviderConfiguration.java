/*
 *  Copyright 2024 Curity AB
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.tentixo.configuration;

import se.curity.identityserver.sdk.config.Configuration;
import se.curity.identityserver.sdk.config.annotation.DefaultString;
import se.curity.identityserver.sdk.config.annotation.Description;
import se.curity.identityserver.sdk.config.annotation.Suggestions;
import se.curity.identityserver.sdk.config.annotation.DefaultBoolean;

/**
 * Provides configuration for accessing Couchbase data.
 */
public interface CouchbaseDataAccessProviderConfiguration extends Configuration {

    @Description("Couchbase instance's host")
    @Suggestions("123.25.0.17")
    String getHost();

    @Description("Use TLS to connect to the host")
    @DefaultBoolean(true)
    boolean useTls();

    @Description("Username to connect to a Couchbase instance")
    @Suggestions("Lars")
    String getUserName();

    @Description("Password to connect to a Couchbase instance")
    String getPassword();

    @Description("Couchbase bucket")
    @DefaultString("curity")
    String getBucket();

    @Description("Couchbase bucket's scope")
    @DefaultString("_default")
    String getScope();

    @Description("Couchbase bucket's collection")
    @DefaultString("curity")
    String getCollection();

    @Description("Query (with collection, bucket, scope and subject parameter) to get token claims")
    @Suggestions("SELECT * FROM `[bucket]`.`[collection]`.`[scope]` WHERE META().id = :subject")
    String getClaimQuery();

    @Description("The default format in Curity follows the SCIM model. Enable this to use the SCIM names in queries")
    @DefaultBoolean(true)
    // TODO: This makes it not so flexible, probably some parameter name mapping is needed
    boolean getUseScimParameterNames();
}
