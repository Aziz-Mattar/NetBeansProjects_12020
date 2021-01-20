package InterceptingFilter;

public class Checking implements Filter {
    
    double balance = 2000;
    public String execute(double amount) {
        if(amount<=balance)
        return "Checking: Done";
        else
         return "Enter a valid amount";
    }

}