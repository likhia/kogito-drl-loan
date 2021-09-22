package org.acme.kogito.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.kogito.model.Applicant;
import org.acme.kogito.model.LoanApplication;
import static org.acme.kogito.queries.Rules29048254B0781BA76043E875AFAE5668.*;
import org.drools.model.Query;

public class Rules29048254B0781BA76043E875AFAE5668_LoanUnit extends Rules29048254B0781BA76043E875AFAE5668 {

    @Override
    public String getName() {
        return super.getName() + ".LoanUnit";
    }

    @Override
    public String getPackageName() {
        return super.getName();
    }

    /**
     * With the following expression ID:
     * org.drools.modelcompiler.builder.generator.DRLIdGenerator@1d9427cf
     */
    @Override
    public java.util.List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public java.util.List<org.drools.model.Rule> getRulesList() {
        return java.util.Arrays.asList(Rules29048254B0781BA76043E875AFAE5668_LoanUnitRuleMethods0.rule_LargeDepositApprove(),
                                       Rules29048254B0781BA76043E875AFAE5668_LoanUnitRuleMethods0.rule_LargeDepositReject());
    }

    java.util.List<org.drools.model.Rule> rules = getRulesList();

    final Query query_FindApproved = query_FindApproved();

    final Query query_FindAll = query_FindAll();

    @Override
    public java.util.List<org.drools.model.Query> getQueries() {
        return queries;
    }

    private org.drools.model.Query query_FindApproved() {
        final org.drools.model.Variable<org.acme.kogito.model.LoanApplication> var_$l = D.declarationOf(org.acme.kogito.model.LoanApplication.class,
                                                                                                        DomainClassesMetadata29048254B0781BA76043E875AFAE5668.org_acme_kogito_model_LoanApplication_Metadata_INSTANCE,
                                                                                                        "$l",
                                                                                                        D.entryPoint("loanApplications"));
        org.drools.model.Query FindApproved_build = queryDef_FindApproved.build(D.pattern(var_$l,
                                                                                          D.entryPoint("loanApplications")).expr("GENERATED_B177C9D69958770F5700641E4E59C0BA",
                                                                                                                                 org.acme.kogito.queries.P6D.LambdaPredicate6DE3C682E10742373180A2AA9432F4BD.INSTANCE,
                                                                                                                                 D.reactOn("approved")));
        return FindApproved_build;
    }

    private org.drools.model.Query query_FindAll() {
        final org.drools.model.Variable<org.acme.kogito.model.LoanApplication> var_$l = D.declarationOf(org.acme.kogito.model.LoanApplication.class,
                                                                                                        DomainClassesMetadata29048254B0781BA76043E875AFAE5668.org_acme_kogito_model_LoanApplication_Metadata_INSTANCE,
                                                                                                        "$l",
                                                                                                        D.entryPoint("loanApplications"));
        org.drools.model.Query FindAll_build = queryDef_FindAll.build(D.pattern(var_$l,
                                                                                D.entryPoint("loanApplications")));
        return FindAll_build;
    }

    java.util.List<org.drools.model.Query> queries = new java.util.ArrayList<>();

    {
        queries.add(query_FindApproved);
        queries.add(query_FindAll);
    }
}
