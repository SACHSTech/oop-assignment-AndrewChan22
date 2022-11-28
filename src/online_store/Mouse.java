package online_store;

/**
 * Mouse subclass
 * @author A. Chan
 */
public class Mouse extends Products{
    
    // instance variables
    private boolean isWireless;
    private boolean isErgonomic;
    private String size;

    /**
     * Mouse constructor 
     * 
     * @param price price of mouse
     * @param productName name of mouse
     * @param amount amount of mouse
     * @param isWireless is the mouse wireless
     * @param isErgonomic is the mouse ergonomic
     * @param size size of mouse
     * @author A. Chan
     */
    public Mouse (double price, String productName, int amount, boolean isWireless, boolean isErgonomic, String size) {
        super(price, productName, amount);
        this.isWireless = isWireless;
        this.isErgonomic = isErgonomic;
        this.size = size;
    }

    /**
     * Return whether or not the mouse if wireless
     * 
     * @return isWireless
     * @author A. Chan
     */
    public boolean getIsWireless() {
        return isWireless;
    }

    /**
     * Return whether or not the mouse is ergonomic
     * 
     * @return isErgonomic
     * @author A. Chan
     */
    public boolean getIsErgonomic() {
        return isErgonomic;
    }

    /**
     * Return size of mouse
     * 
     * @return size of mouse
     * @author A. Chan
     */
    public String getSize() {
        return size;
    }

    /**
     * Outputs features to screen
     * 
     * @author A. Chan
     */
    public void showFeatures() {

        System.out.println("");
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());

        System.out.println("---Product Specifications---");
        
        System.out.println("Size of Mouse: " + size);

        if (isErgonomic) {
            System.out.println("This mouse is ergonomic");
        }

        if (isWireless) {
            System.out.println("This mouse is wireless");
        }
        else {
            System.out.println("This mouse is wired");
        }
    } 
}
