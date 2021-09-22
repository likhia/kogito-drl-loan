package org.acme.kogito.queries.P58;

import static org.acme.kogito.queries.Rules29048254B0781BA76043E875AFAE5668.*;
import org.acme.kogito.model.Applicant;
import org.acme.kogito.queries.*;
import org.acme.kogito.model.LoanApplication;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate583ACF0A1FDD7AAABBB787F32205DBD2 implements org.drools.model.functions.Predicate1<org.acme.kogito.model.LoanApplication>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "F5BA2A4680CEC8B8988F2DA4F41AD747";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.acme.kogito.model.LoanApplication _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterOrEqualNumbers(_this.getApplicant().getAge(), 20);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("applicant.age >= 20", "LargeDepositReject", "/Users/lilim/kogito/kogito-drl-loan/src/main/resources/org/acme/kogito/queries/loan-rules.drl");
    }
}
