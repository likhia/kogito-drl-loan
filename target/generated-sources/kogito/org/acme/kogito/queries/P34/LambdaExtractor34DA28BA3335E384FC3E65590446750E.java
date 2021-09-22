package org.acme.kogito.queries.P34;

import static org.acme.kogito.queries.Rules29048254B0781BA76043E875AFAE5668.*;
import org.acme.kogito.model.Applicant;
import org.acme.kogito.queries.*;
import org.acme.kogito.model.LoanApplication;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor34DA28BA3335E384FC3E65590446750E implements org.drools.model.functions.Function1<org.acme.kogito.model.LoanApplication, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "B3B06605603191D358A934CD24A88992";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Integer apply(org.acme.kogito.model.LoanApplication _this) {
        return _this.getDeposit();
    }
}
