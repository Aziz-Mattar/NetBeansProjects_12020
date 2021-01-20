package Decorator;

public class accounts implements accountsDecorator {

	private accountsDecorator acDecorator;

	public String getBalance() {
            return this.acDecorator.getBalance();
        }

	public void addAccounts(accountsDecorator ac) {
            this.acDecorator = ac;
	}

}