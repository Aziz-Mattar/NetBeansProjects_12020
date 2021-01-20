
package Strategy;

public class Context {

	private Strategy strategy;

        public Context(Strategy strategy) {
            this.strategy = strategy;
        }
        
	public double execStrategy(double balance) {
		return this.strategy.calcBalance(balance);
	}

}