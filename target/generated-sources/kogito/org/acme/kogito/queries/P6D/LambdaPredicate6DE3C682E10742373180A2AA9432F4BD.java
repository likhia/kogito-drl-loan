package org.acme.kogito.queries.P6D;

import static org.acme.kogito.queries.Rules29048254B0781BA76043E875AFAE5668.*;
import org.acme.kogito.model.Applicant;
import org.acme.kogito.queries.*;
import org.acme.kogito.model.LoanApplication;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate6DE3C682E10742373180A2AA9432F4BD implements org.drools.model.functions.Predicate1<org.acme.kogito.model.LoanApplication>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "E6DA5B3DC0968DCBD1E2979D4409CBBD";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.acme.kogito.model.LoanApplication _this) throws java.lang.Exception {
        return _this.isApproved();
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("approved", "FindApproved", "/Users/lilim/kogito/kogito-drl-loan/src/main/resources/org/acme/kogito/queries/loan-rules.drl");
    }
}
