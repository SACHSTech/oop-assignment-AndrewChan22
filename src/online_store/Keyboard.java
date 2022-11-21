package online_store;

/**
 * Keyboard class
 * @author A. Chan
 */
public class Keyboard extends Products {

    // instance variables
    private int sizePercentage;
    private String keyboardLayout;

    /**
     * Keyboard constructor
     * 
     * @param price price of keyboard
     * @param productName name of keyboard
     * @param amount amount of keyboard
     * @param sizePercentage size percent of keyboard
     * @param keyboardLayout layout of keyboard
     * @author A. Chan
     */
    public Keyboard(double price, String productName, int amount, int sizePercentage, String keyboardLayout) {
        super(price, productName, amount);
        this.sizePercentage = sizePercentage;
        this.keyboardLayout = keyboardLayout;
    }

    /**
     * Return percent size
     * 
     * @return size percentage
     * @author A. Chan
     */
    public int getSizePercentage() {
        return sizePercentage;
    }

    /**
     * Layout of keyboard
     * 
     * @return layout
     * @author A. Chan
     */
    public String getLayout() {
        return keyboardLayout;
    }

    /**
     * Output features to the screen
     * 
     * @author A. Chan
     */
    public void showFeatures() {
        if (sizePercentage == 100) {
            System.out.println("Size: full-sized (100%)");
        } 

        else if (sizePercentage == 96) {
            System.out.println("Size: compact full-sized (96%)");
        }
        else if (sizePercentage == 80) {
            System.out.println("Size: Tenkeyless (80%)");
        }
        else if (sizePercentage == 65) {
            System.out.println("Size: Compact (65%)");
        }
        else {
            System.out.println("Size percentage " + sizePercentage);
        }

        System.out.println("Keyboard layout " + keyboardLayout);
    }
}
