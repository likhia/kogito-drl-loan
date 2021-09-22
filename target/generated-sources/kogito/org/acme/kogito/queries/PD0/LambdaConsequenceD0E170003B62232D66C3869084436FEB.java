package org.acme.kogito.queries.PD0;

import static org.acme.kogito.queries.Rules29048254B0781BA76043E875AFAE5668.*;
import org.acme.kogito.model.Applicant;
import org.acme.kogito.queries.*;
import org.acme.kogito.model.LoanApplication;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceD0E170003B62232D66C3869084436FEB implements org.drools.model.functions.Block2<org.drools.model.Drools, org.acme.kogito.model.LoanApplication>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "27E5F89D6B2021E4CF695D2E564C86BD";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata29048254B0781BA76043E875AFAE5668.org_acme_kogito_model_LoanApplication_Metadata_INSTANCE, "approved");

    @Override()
    public void execute(org.drools.model.Drools drools, org.acme.kogito.model.LoanApplication $l) throws java.lang.Exception {
        {
            {
                ($l).setApproved(false);
            }
            drools.update($l, mask_$l);
        }
    }
}
