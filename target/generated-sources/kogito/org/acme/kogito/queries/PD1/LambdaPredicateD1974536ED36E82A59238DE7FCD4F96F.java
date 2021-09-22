package org.acme.kogito.queries.PD1;

import static org.acme.kogito.queries.Rules29048254B0781BA76043E875AFAE5668.*;
import org.acme.kogito.model.Applicant;
import org.acme.kogito.queries.*;
import org.acme.kogito.model.LoanApplication;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateD1974536ED36E82A59238DE7FCD4F96F implements org.drools.model.functions.Predicate1<org.acme.kogito.model.LoanApplication>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "648D277C0FCCA79E78E62934C9A0F376";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.acme.kogito.model.LoanApplication _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterOrEqualNumbers(_this.getDeposit(), 1000);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("deposit >= 1000", "LargeDepositReject", "/Users/lilim/kogito/kogito-drl-loan/src/main/resources/org/acme/kogito/queries/loan-rules.drl");
    }
}
