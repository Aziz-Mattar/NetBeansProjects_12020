package Visitor;

public class Checking implements Account {

    @Override
    public String getBalance(AccountVisitor accountVisitor) {
        return accountVisitor.getBalance(this);
    }

}