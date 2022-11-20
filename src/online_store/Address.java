package online_store;

public class Address {

    private int houseNumber;
    private String streetName;
    private String city;
    private String province;
    
    public Address(int houseNumber, String streetName, String city, String province) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.city = city;
        this.province = province;
    }

    public String toString() {
        return houseNumber + " " + streetName + ", " + city + ", " + province;
    }

}