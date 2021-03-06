package org.acme.kogito.queries;
public class DomainClassesMetadata29048254B0781BA76043E875AFAE5668 {

    public static final org.drools.model.DomainClassMetadata org_acme_kogito_model_LoanApplication_Metadata_INSTANCE = new org_acme_kogito_model_LoanApplication_Metadata();
    private static class org_acme_kogito_model_LoanApplication_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.acme.kogito.model.LoanApplication.class;
        }

        @Override
        public int getPropertiesSize() {
            return 5;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "amount": return 0;
                case "applicant": return 1;
                case "approved": return 2;
                case "deposit": return 3;
                case "id": return 4;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class org.acme.kogito.model.LoanApplication");
        }
    }

    public static final org.drools.model.DomainClassMetadata org_kie_kogito_rules_DataStore_Metadata_INSTANCE = new org_kie_kogito_rules_DataStore_Metadata();
    private static class org_kie_kogito_rules_DataStore_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.kie.kogito.rules.DataStore.class;
        }

        @Override
        public int getPropertiesSize() {
            return 0;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class interface org.kie.kogito.rules.DataStore");
        }
    }

}