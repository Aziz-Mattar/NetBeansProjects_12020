package Visitor;

public class customerAccount implements Account {

	private Account[] accounts;

	public customerAccount() {
		accounts = new Account[] {new Checking(), new Merchant(), new Saving()};
	}

	public String getBalance(AccountVisitor accountVisitor) {
        String output ="";
        output+= accountVisitor.getBalance(this) +"\n";
        for(Account account: accounts)
            output+= account.getBalance(accountVisitor) +"\n";
        return output;
	}

}