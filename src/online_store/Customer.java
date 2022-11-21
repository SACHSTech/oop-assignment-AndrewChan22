package online_store;

/**
 * Customer class
 * @author A. Chan
 */
public class Customer {
    
    // instance variables
    private String fName;
    private String lName;
    private Address addr;

    /**
     * Customer constructor
     * 
     * @param fName first name
     * @param lName last name
     * @param addr address
     * @param cart new cart
     * @author A. Chan
     */
    public Customer(String fName, String lName, Address addr, ShoppingCart cart) {
        this.fName = fName;
        this.lName = lName;
        this.addr = addr;
    }

    /**
     * Return first name of customer
     * 
     * @return first name
     * @author A. Chan
     */
    public String getFirstName() {
        return fName;
    }

    /**
     * Returns last name of customer
     * 
     * @return last name
     * @author A. Chan
     */
    public String getLastName() {
        return lName;
    }

    /**
     * Returns address of customer
     *  
     * @return address string representation
     * @author A. Chan
     */
    public String getAddress() {
        return this.addr.toString();
    }
}
