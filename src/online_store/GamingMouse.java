package online_store;

/**
 * GamingMouse subclass
 * @author A. Chan
 */
public class GamingMouse extends Mouse {
    
    // instance variables
    private double dotsPerInch;
    private boolean RGB;
    private int programmableButtons;

    /**
     * GamingMouse constructor
     * 
     * @param price price of mouse
     * @param productName name of mouse
     * @param amount amount of mouse
     * @param isWireless wireless mouse
     * @param isErgonomic ergonomic mouse
     * @param size size of mouse
     * @param dotsPerInch DPI of of mouse
     * @param RGB whether mouse if RGB
     * @param programmableButtons number of programmable buttons
     */
    public GamingMouse (double price, String productName, int amount, boolean isWireless, boolean isErgonomic, String size, double dotsPerInch, boolean RGB, int programmableButtons) {
        super(price, productName, amount, isWireless, isErgonomic, size);

        this.dotsPerInch = dotsPerInch;
        this.RGB = RGB;
        this.programmableButtons = programmableButtons;
    }

    /**
     * Return DPI
     * 
     * @return dpi of mouse
     * @author A. Chan
     */
    public double getDPI() {
        return dotsPerInch;
    }

    /**
     * RGB mouse
     * 
     * @return hasRGB
     * @author A. Chan
     */
    public boolean getRGB() {
        return RGB;
    }

    /**
     * Outputs features to the screen
     * 
     * @author A. Chan
     */
    public void showFeatures() {

        System.out.println("");
        System.out.println("Name: " + getName());
        System.out.println("Price: $" + getPrice());

        System.out.println("---Product Specifications---");

        System.out.println("Size of Mouse: " + getSize());

        if (getIsErgonomic()) {
            System.out.println("This mouse is ergonomic");
        }

        if (getIsWireless()) {
            System.out.println("This mouse is wireless");
        }
        else {
            System.out.println("This mouse is wired");
        }
        System.out.println(dotsPerInch + " DPI delivers pro-level accuracy and speed");
        System.out.println(programmableButtons + " individually programmable buttons customize functions and store your preferred settings");

        if (RGB) {
            System.out.println("This mouse allows you to personalize your gaming setup using customized lightning");
        }

    }

}
