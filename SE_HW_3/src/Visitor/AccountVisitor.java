package Visitor;

public interface AccountVisitor {

	String getBalance(Checking checking);

	String getBalance(Saving saving);

	String getBalance(Merchant merchant);

	String getBalance(customerAccount account);

}