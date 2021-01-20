package Visitor;

public class Saving implements Account {

    @Override
    public String getBalance(AccountVisitor accountVisitor) {
        return accountVisitor.getBalance(this);
    }
}