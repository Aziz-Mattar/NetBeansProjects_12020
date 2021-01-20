package Strategy;

public class USD implements Strategy {
	public double calcBalance(double balance) {
            return balance*0.30;
	}
}