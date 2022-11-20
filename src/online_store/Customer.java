package online_store;

public class Customer {
    
    private String fName;
    private String lName;
    private Address addr;

    public Customer(String fName, String lName, Address addr) {
        this.fName = fName;
        this.lName = lName;
        this.addr = addr;
    }

    public String getFirstName() {
        return fName;
    }

    public String getLastName() {
        return lName;
    }

    public String getAddress() {
        return this.addr.toString();
    }
}
