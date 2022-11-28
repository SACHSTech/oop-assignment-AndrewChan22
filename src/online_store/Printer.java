package online_store;

/**
 * Printer class
 * @author A. Chan
 */
public class Printer extends Products {
    // instance variable
    private String type;

    /**
     * Printer constructor
     * 
     * @param price price of printer
     * @param productName name of printer
     * @param amount amount of printer
     * @param type type of printer
     * @author A. Chan
     */
    public Printer(double price, String productName, int amount, String type) {
        super(price, productName, amount);
        this.type = type;
    }

    /**
     * Return type of printer
     * @return type of printer
     * @author A. Chan
     */
    public String getType() {
        return type;
    }

    /**
     * showFeatures method
     * 
     * @author A. Chan
     */
    public void showFeatures() {
        System.out.println("");
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());

        System.out.println("---Product Specifications---");

        System.out.println("This printer is a " + type);
    }
}
