package Adapter;

public class USDcurrency implements otherCurrencies {

	public String getBalanceInEuro(double Balance) {
            return  "";
	}

	public String getBalanceInUSD(double Balance) {
            return "Balance In USD : " + Balance*0.29;
	}

}