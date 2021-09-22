package org.acme.kogito.queries;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.kogito.model.Applicant;
import org.acme.kogito.model.LoanApplication;

public abstract class Rules29048254B0781BA76043E875AFAE5668 implements org.drools.model.Model {

    public final static java.time.format.DateTimeFormatter DATE_TIME_FORMATTER = new java.time.format.DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern(org.drools.core.util.DateUtils.getDateFormatMask()).toFormatter(java.util.Locale.ENGLISH);

    @Override
    public String getName() {
        return "org.acme.kogito.queries";
    }

    @Override
    public java.util.List<org.drools.model.EntryPoint> getEntryPoints() {
        return java.util.Arrays.asList(D.entryPoint("loanApplications"));
    }

    @Override
    public java.util.List<org.drools.model.Global> getGlobals() {
        return globals;
    }

    @Override
    public java.util.List<org.drools.model.TypeMetaData> getTypeMetaDatas() {
        return typeMetaDatas;
    }

    public static final org.drools.model.Global<org.kie.kogito.rules.DataStore> var_loanApplications = D.globalOf(org.kie.kogito.rules.DataStore.class,
                                                                                                                  "org.acme.kogito.queries",
                                                                                                                  "loanApplications");

    public static final org.drools.model.Global<Integer> var_maxAmount = D.globalOf(Integer.class,
                                                                                    "org.acme.kogito.queries",
                                                                                    "maxAmount");

    public static final org.drools.model.Query0Def queryDef_FindAll = D.query("org.acme.kogito.queries",
                                                                              "FindAll");

    public static final org.drools.model.Query0Def queryDef_FindApproved = D.query("org.acme.kogito.queries",
                                                                                   "FindApproved");

    java.util.List<org.drools.model.Global> globals = new java.util.ArrayList<>();

    java.util.List<org.drools.model.TypeMetaData> typeMetaDatas = java.util.Collections.emptyList();

    {
        globals.add(var_loanApplications);
        globals.add(var_maxAmount);
    }
}
