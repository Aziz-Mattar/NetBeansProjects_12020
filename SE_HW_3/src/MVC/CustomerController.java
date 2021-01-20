package MVC;



public class CustomerController {

    private Customer model;
    private CustomerView view;

    public CustomerController(Customer model, CustomerView view) {
        this.model = model;
        this.view = view;
    }


    public String updateView() {
            return view.view(model.getName(), model.getAddress(), model.getAccountNumber(), model.getDOB());
    }


    public String getCustomerName() {
            return model.getName();
    }


    public void setCustomerName(String name) {
            model.setName(name);
    }

    public String getCustomerAddress() {
            return model.getAddress();
    }


    public void setCustomerAddress(String address) {
            model.setAddress(address);
    }

    public String getCustomerDOB() {
            return model.getDOB();
    }


    public void setCustomerDOB(String DOB) {
            model.setDOB(DOB);
    }

    public String getCustomerAccountNumber() {
            return model.getAccountNumber();
    }


    public void setCustomerAccountNumber(String accountNumber) {
            model.setAccountNumber(accountNumber);
    }

}