/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.acme.kogito.queries;

import java.util.List;
import java.util.Map;
import org.kie.kogito.rules.RuleUnitInstance;
import static java.util.stream.Collectors.toList;

public class LoanUnitQueryFindApproved implements org.kie.kogito.rules.RuleUnitQuery<List<org.acme.kogito.model.LoanApplication>> {

    private final RuleUnitInstance<org.acme.kogito.queries.LoanUnit> instance;

    public LoanUnitQueryFindApproved(RuleUnitInstance<org.acme.kogito.queries.LoanUnit> instance) {
        this.instance = instance;
    }

    @Override
    public List<org.acme.kogito.model.LoanApplication> execute() {
        return instance.executeQuery("FindApproved").stream().map(this::toResult).collect(toList());
    }

    private org.acme.kogito.model.LoanApplication toResult(Map<String, Object> tuple) {
        return (org.acme.kogito.model.LoanApplication) tuple.get("$l");
    }
}
