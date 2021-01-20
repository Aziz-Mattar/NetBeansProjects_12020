package Adapter;

public class currencyAdapter implements currency {

	private otherCurrencies oc;

    currencyAdapter(String type) {
         if(type.equalsIgnoreCase("USD")){
                oc = new USDcurrency();
            }else if(type.equalsIgnoreCase("Euro")){
                oc = new Eurocurrency();
            }
    }

	public String getBalance(double Balance,String type) {
           if(type.equalsIgnoreCase("USD")){
               return oc.getBalanceInUSD(Balance);
           }else if(type.equalsIgnoreCase("Euro")){
               return oc.getBalanceInEuro(Balance);
           }
            return null;
	}
}