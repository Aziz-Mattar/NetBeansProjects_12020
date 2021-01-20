package Visitor;

public interface Account {
    public String getBalance(AccountVisitor accountVisitor);
}