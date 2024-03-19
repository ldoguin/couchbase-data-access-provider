/*
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.tentixo;

import se.curity.identityserver.sdk.attribute.SubjectAttributes;
import se.curity.identityserver.sdk.datasource.CredentialStoringDataAccessProvider;

/**
 * https://curity.io/docs/idsvr-java-plugin-sdk/latest/se/curity/identityserver/sdk/datasource/CredentialStoringDataAccessProvider.html
 */
public final class CouchbaseCredentialStoringDataAccessProvider implements CredentialStoringDataAccessProvider {

    @Override
    public GetResult get(SubjectAttributes subjectAttributes) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void store(SubjectAttributes subjectAttributes, String passwordData) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(SubjectAttributes subjectAttributes) {
        throw new UnsupportedOperationException();
    }
}
