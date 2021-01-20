package Adapter;

import Adapter.currency;
import Adapter.currencyAdapter;

public class JDcurrency implements currency {

	private currencyAdapter adapter;

	public String getBalance(double Balance,String type) {
            if(type.equalsIgnoreCase("JD")){
                return  "Balance In JD : " + Balance*0.21;
            }else if(type.equalsIgnoreCase("USD") || type.equalsIgnoreCase("Euro")){
                adapter = new currencyAdapter(type);
                return  adapter.getBalance(Balance, type);
            }
            else{
                return  "Balance In JD : " + Balance*0.21;
            }
	}

}