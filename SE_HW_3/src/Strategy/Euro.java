package Strategy;

public class Euro implements Strategy {
	public double calcBalance(double balance) {
		return balance*0.25;
	}
}