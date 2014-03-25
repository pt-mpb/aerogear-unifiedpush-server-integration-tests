/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.aerogear.test.api.chromepackagedapp;

import org.jboss.aerogear.test.Session;
import org.jboss.aerogear.test.api.AbstractUPSContext;
import org.jboss.aerogear.test.model.ChromePackagedAppVariant;
import org.jboss.aerogear.test.model.PushApplication;

public class ChromePackagedAppVariantContext extends AbstractUPSContext<ChromePackagedAppVariant, String,
        ChromePackagedAppVariantBlueprint, ChromePackagedAppVariantEditor, PushApplication,
        ChromePackagedAppVariantWorker, ChromePackagedAppVariantContext> {

    public ChromePackagedAppVariantContext(ChromePackagedAppVariantWorker worker, PushApplication parent,
                                           Session session) {
        super(worker, parent, session);
    }

    @Override
    public ChromePackagedAppVariantBlueprint create() {
        return new ChromePackagedAppVariantBlueprint(this);
    }

    @Override
    public ChromePackagedAppVariantBlueprint generate() {
        return create()
                .name(randomString())
                .description(randomString())
                .clientId(randomString())
                .clientSecret(randomString())
                .refreshToken(randomString());
    }

    @Override
    protected ChromePackagedAppVariantContext castInstance() {
        return this;
    }

    @Override
    public String getEntityID(ChromePackagedAppVariant chromePackagedAppVariant) {
        return chromePackagedAppVariant.getVariantID();
    }
}