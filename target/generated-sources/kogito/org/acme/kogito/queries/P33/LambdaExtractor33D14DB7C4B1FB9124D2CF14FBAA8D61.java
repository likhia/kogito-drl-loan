package org.acme.kogito.queries.P33;

import static org.acme.kogito.queries.Rules29048254B0781BA76043E875AFAE5668.*;
import org.acme.kogito.model.Applicant;
import org.acme.kogito.queries.*;
import org.acme.kogito.model.LoanApplication;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor33D14DB7C4B1FB9124D2CF14FBAA8D61 implements org.drools.model.functions.Function1<org.acme.kogito.model.LoanApplication, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "30F9809BA287AB569E1B8A138B275D78";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Integer apply(org.acme.kogito.model.LoanApplication _this) {
        return _this.getApplicant().getAge();
    }
}
