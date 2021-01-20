package MVC;



public class CustomerView {

    public String view(String name, String address, String accountNumber, String DOB) {
             return ("Custome data: \n" +
            name  + "\n" +
            address +"\n" +
            accountNumber+ "\n"+
            DOB         );
    }

}