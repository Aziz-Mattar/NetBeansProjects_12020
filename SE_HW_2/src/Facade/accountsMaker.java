package Facade;

public class accountsMaker {

	private Checking c;
	private Saving s;
	private Merchant m;
        
        private static accountsMaker maker;
	private accountsMaker() {
            this.c = new Checking();
            this.s = new Saving();
            this.m = new Merchant();
	}
        public static accountsMaker getAccountsMaker(){
            if(maker == null){maker = new accountsMaker();}
            return maker;                
        }

	public String getMBalance() {
            return this.m.getBalance();
        }

	public String getCBalance() {
            return this.c.getBalance();
	}

	public String getSBalance() {
            return this.s.getBalance();
	}

}