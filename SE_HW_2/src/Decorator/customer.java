package Decorator;

public class customer implements accountsDecorator {

	private String name;

	public customer(String name) {
            this.name = name;
	}

	public String getBalance() {
            return "\n customer : " +this.name;
	}

    @Override
    public void addAccounts(accountsDecorator ac) {       
    }

}