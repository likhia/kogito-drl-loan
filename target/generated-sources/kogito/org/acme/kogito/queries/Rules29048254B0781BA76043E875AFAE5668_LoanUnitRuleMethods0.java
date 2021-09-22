package org.acme.kogito.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.kogito.model.Applicant;
import org.acme.kogito.model.LoanApplication;
import static org.acme.kogito.queries.Rules29048254B0781BA76043E875AFAE5668.*;

public class Rules29048254B0781BA76043E875AFAE5668_LoanUnitRuleMethods0 {

    /**
     * Rule name: LargeDepositApprove
     */
    public static org.drools.model.Rule rule_LargeDepositApprove() {
        final org.drools.model.Variable<org.acme.kogito.model.LoanApplication> var_$l = D.declarationOf(org.acme.kogito.model.LoanApplication.class,
                                                                                                        DomainClassesMetadata29048254B0781BA76043E875AFAE5668.org_acme_kogito_model_LoanApplication_Metadata_INSTANCE,
                                                                                                        "$l",
                                                                                                        D.entryPoint("loanApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata29048254B0781BA76043E875AFAE5668.org_acme_kogito_model_LoanApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.acme.kogito.queries",
                                            "LargeDepositApprove").unit(org.acme.kogito.queries.LoanUnit.class)
                                                                  .build(D.pattern(var_$l).expr("GENERATED_EE3E669D12C6A33CAE8A3AE6405F3238",
                                                                                                org.acme.kogito.queries.P58.LambdaPredicate583ACF0A1FDD7AAABBB787F32205DBD2.INSTANCE,
                                                                                                D.alphaIndexedBy(int.class,
                                                                                                                 org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                 -1,
                                                                                                                 org.acme.kogito.queries.P33.LambdaExtractor33D14DB7C4B1FB9124D2CF14FBAA8D61.INSTANCE,
                                                                                                                 20),
                                                                                                D.reactOn("applicant")).expr("GENERATED_1176C4575C9DC7D6288C5C286390ABF0",
                                                                                                                             org.acme.kogito.queries.PD1.LambdaPredicateD1974536ED36E82A59238DE7FCD4F96F.INSTANCE,
                                                                                                                             D.alphaIndexedBy(int.class,
                                                                                                                                              org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                              DomainClassesMetadata29048254B0781BA76043E875AFAE5668.org_acme_kogito_model_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                              org.acme.kogito.queries.P34.LambdaExtractor34DA28BA3335E384FC3E65590446750E.INSTANCE,
                                                                                                                                              1000),
                                                                                                                             D.reactOn("deposit")).expr("GENERATED_A1FF8B6E7F190DD3F8F0B115A19C71E0",
                                                                                                                                                        var_maxAmount,
                                                                                                                                                        org.acme.kogito.queries.P32.LambdaPredicate3286EDA25DD746FEE0057E55DB0F7117.INSTANCE,
                                                                                                                                                        D.reactOn("amount")),
                                                                         D.on(var_$l).execute(org.acme.kogito.queries.PFF.LambdaConsequenceFF490BE71BDFA399D9B2287333885C36.INSTANCE));
        return rule;
    }

    /**
     * Rule name: LargeDepositReject
     */
    public static org.drools.model.Rule rule_LargeDepositReject() {
        final org.drools.model.Variable<org.acme.kogito.model.LoanApplication> var_$l = D.declarationOf(org.acme.kogito.model.LoanApplication.class,
                                                                                                        DomainClassesMetadata29048254B0781BA76043E875AFAE5668.org_acme_kogito_model_LoanApplication_Metadata_INSTANCE,
                                                                                                        "$l",
                                                                                                        D.entryPoint("loanApplications"));
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata29048254B0781BA76043E875AFAE5668.org_acme_kogito_model_LoanApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.acme.kogito.queries",
                                            "LargeDepositReject").unit(org.acme.kogito.queries.LoanUnit.class)
                                                                 .build(D.pattern(var_$l).expr("GENERATED_EE3E669D12C6A33CAE8A3AE6405F3238",
                                                                                               org.acme.kogito.queries.P58.LambdaPredicate583ACF0A1FDD7AAABBB787F32205DBD2.INSTANCE,
                                                                                               D.alphaIndexedBy(int.class,
                                                                                                                org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                -1,
                                                                                                                org.acme.kogito.queries.P33.LambdaExtractor33D14DB7C4B1FB9124D2CF14FBAA8D61.INSTANCE,
                                                                                                                20),
                                                                                               D.reactOn("applicant")).expr("GENERATED_1176C4575C9DC7D6288C5C286390ABF0",
                                                                                                                            org.acme.kogito.queries.PD1.LambdaPredicateD1974536ED36E82A59238DE7FCD4F96F.INSTANCE,
                                                                                                                            D.alphaIndexedBy(int.class,
                                                                                                                                             org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                             DomainClassesMetadata29048254B0781BA76043E875AFAE5668.org_acme_kogito_model_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                             org.acme.kogito.queries.P34.LambdaExtractor34DA28BA3335E384FC3E65590446750E.INSTANCE,
                                                                                                                                             1000),
                                                                                                                            D.reactOn("deposit")).expr("GENERATED_C27F02A6680E21E2DE791666DF19F497",
                                                                                                                                                       var_maxAmount,
                                                                                                                                                       org.acme.kogito.queries.P89.LambdaPredicate89141BCD6FC29F81AC6B79C7B8D73B37.INSTANCE,
                                                                                                                                                       D.reactOn("amount")),
                                                                        D.on(var_$l).execute(org.acme.kogito.queries.PD0.LambdaConsequenceD0E170003B62232D66C3869084436FEB.INSTANCE));
        return rule;
    }
}
