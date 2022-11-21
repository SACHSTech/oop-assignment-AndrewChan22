package online_store;

/**
 * Address class
 * @author A. CHan
 */
public class Address {

    // instance variables
    private int houseNumber;
    private String streetName;
    private String city;
    private String province;
    
    /**
     * Address constructor
     * 
     * @param houseNumber house number
     * @param streetName street name
     * @param city city
     * @param province province
     * @author A. Chan
     */
    public Address(int houseNumber, String streetName, String city, String province) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.city = city;
        this.province = province;
    }

    /**
     * Output address to screen
     * 
     * @return string representation of address
     * @author A. Chan
     */
    public String toString() {
        return houseNumber + " " + streetName + ", " + city + ", " + province;
    }

}