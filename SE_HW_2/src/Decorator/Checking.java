package Decorator;

public class Checking extends accounts {

	//private accountsDecorator acDecorator;

        
	public String getBalance() {
           return super.getBalance() + "\n Checking Account Balance : 1000$";
	}

	public void addAccounts(accountsDecorator ac) {
                super.addAccounts(ac);
	}

}