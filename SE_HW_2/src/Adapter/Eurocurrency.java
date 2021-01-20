package Adapter;

public class Eurocurrency implements otherCurrencies {

	public String getBalanceInEuro(double Balance) {
		return "Balance In Euro : " + Balance*0.25 ;
	}

	public String getBalanceInUSD(double Balance) {
            return "";
	}

}