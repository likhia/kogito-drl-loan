package org.acme.kogito.queries.P32;

import static org.acme.kogito.queries.Rules29048254B0781BA76043E875AFAE5668.*;
import org.acme.kogito.model.Applicant;
import org.acme.kogito.queries.*;
import org.acme.kogito.model.LoanApplication;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate3286EDA25DD746FEE0057E55DB0F7117 implements org.drools.model.functions.Predicate2<org.acme.kogito.model.LoanApplication, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "1A07D035428348A706A66A2BBAA736A2";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.acme.kogito.model.LoanApplication _this, Integer maxAmount) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.lessOrEqualNumbers(_this.getAmount(), maxAmount);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("amount <= maxAmount", "LargeDepositApprove", "/Users/lilim/kogito/kogito-drl-loan/src/main/resources/org/acme/kogito/queries/loan-rules.drl");
    }
}
