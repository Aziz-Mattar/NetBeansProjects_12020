package InterceptingFilter;

public class Target {
   
    double balance = 2000;
    public String execute(double amount) {
        if(amount<=balance){
            return "Request Complete: The Balance is : " + (balance - amount)  ;
        }else
            return "";
    }

}