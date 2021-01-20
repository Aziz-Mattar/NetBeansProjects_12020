package Visitor;

public class Merchant implements Account {

    @Override
    public String getBalance(AccountVisitor accountVisitor) {
        return accountVisitor.getBalance(this);    
    }


}