package online_store;

/**
 * GamingKeyboard subclass
 * @author A. Chan
 */
public class GamingKeyboard extends Keyboard {

    // instance variables
    private String keyswitches;
    private boolean backlitLighting;

    /**
     * GamingKeyboard constructor
     * 
     * @param price price of keyboard
     * @param productName name of keyboard
     * @param amount amount of keyboard
     * @param sizePercentage percent size of keyboard
     * @param keyboardLayout layout of keyboard
     * @param keyswitches switches of keyboard
     * @param backlitLighting whether or not keyboard has lighting
     * @author A. Chan
     */
    public GamingKeyboard(double price, String productName, int amount, int sizePercentage, String keyboardLayout, String keyswitches, boolean backlitLighting) {
        super(price, productName, amount, sizePercentage, keyboardLayout);
        this.keyswitches = keyswitches;
        this.backlitLighting = backlitLighting;
    }

    /**
     * Return what type of switches the keyboard has
     * 
     * @return keyswitches
     * @author A. Chan
     */
    public String getKeyswitches() {
        return keyswitches;
    }
    
    /**
     * Return if keyboard can light up
     * 
     * @return backlitLighting
     * @author A. Chan
     */
    public boolean backlitLighting() {
        return backlitLighting;
    }

    /**
     * Output features to the screen
     * 
     * @author A. Chan
     */
    public void showFeatures() {
        super.showFeatures();
        System.out.println("Mechanical keyswitches: " + keyswitches);
        if (backlitLighting) {
            System.out.println("This keyboard has vibrant RGB backlighting");
        }
    }
 }