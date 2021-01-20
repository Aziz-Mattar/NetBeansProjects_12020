package Decorator;

public class Saving extends accounts {

	//private accountsDecorator acDecorator;

      
	public String getBalance() {
           return super.getBalance() + "\n Saving Account Balance : 2000$";
	}

	public void addAccounts(accountsDecorator ac) {
             super.addAccounts(ac);
	}

}