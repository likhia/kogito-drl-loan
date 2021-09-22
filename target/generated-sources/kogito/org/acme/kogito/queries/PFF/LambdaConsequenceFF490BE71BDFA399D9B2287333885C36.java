package org.acme.kogito.queries.PFF;

import static org.acme.kogito.queries.Rules29048254B0781BA76043E875AFAE5668.*;
import org.acme.kogito.model.Applicant;
import org.acme.kogito.queries.*;
import org.acme.kogito.model.LoanApplication;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceFF490BE71BDFA399D9B2287333885C36 implements org.drools.model.functions.Block2<org.drools.model.Drools, org.acme.kogito.model.LoanApplication>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "4B11A0AF61A86B9BB40F00312635CCD8";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata29048254B0781BA76043E875AFAE5668.org_acme_kogito_model_LoanApplication_Metadata_INSTANCE, "approved");

    @Override()
    public void execute(org.drools.model.Drools drools, org.acme.kogito.model.LoanApplication $l) throws java.lang.Exception {
        {
            {
                ($l).setApproved(true);
            }
            drools.update($l, mask_$l);
        }
    }
}
