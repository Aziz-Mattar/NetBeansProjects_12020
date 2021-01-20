package Decorator;

public class Merchant extends accounts {

	//private accountsDecorator acDecorator;

       
	public String getBalance() {
           return super.getBalance() + "\n Merchant Account Balance : 5500$" ;
	}

	public void addAccounts(accountsDecorator ac) {
             super.addAccounts(ac);
	}

}