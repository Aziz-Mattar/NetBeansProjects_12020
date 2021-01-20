package State;

public class Context {

	private accountState as;
        
        public void Context() {		
                this.as = null;
	}
        
	public accountState getAccountState() {
		return as;		
	}

	/**
	 * 
	 * @param as
	 */
	public void setAccountState(accountState as) {
		this.as = as;		
	}

	

}