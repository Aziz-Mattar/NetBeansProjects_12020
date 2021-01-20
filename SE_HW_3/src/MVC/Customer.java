package MVC;


public class Customer {

    private String name;
    private String address;
    private String DOB;
    private String accountNumber;

    public Customer(String name, String address, String DOB, String accountNumber) {
        this.name = name;
        this.address = address;
        this.DOB = DOB;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    
   
}