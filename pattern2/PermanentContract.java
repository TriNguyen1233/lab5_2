package builder.pattern2;

class PermanentContract extends Contract {
    public PermanentContract(int contractID, int propertyID, int tenantID, double rentAmount) {
        super(contractID, propertyID, tenantID, rentAmount);
    }

    @Override
    public String getTerm() {
        return "Permanent";
    }
}

// LongTermContract.java
 class LongTermContract extends Contract {
    public LongTermContract(int contractID, int propertyID, int tenantID, double rentAmount) {
        super(contractID, propertyID, tenantID, rentAmount);
    }

    @Override
    public String getTerm() {
        return "LongTerm";
    }
}
