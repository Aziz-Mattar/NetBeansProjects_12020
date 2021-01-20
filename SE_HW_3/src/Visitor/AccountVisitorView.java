package Visitor;

public class AccountVisitorView implements AccountVisitor {

    @Override
    public String getBalance(Checking checking) {
       return "Checking Account";
    }

    @Override
    public String getBalance(Saving saving) {
        return "Saving Account";
    }

    @Override
    public String getBalance(Merchant merchant) {
        return "Merchant Account";
    }

    @Override
    public String getBalance(customerAccount account) {
        return "customer Account";
    }
}