package online_store;

public class GamingKeyboard extends Keyboard {
    private String keyswitches;
    private boolean backlitLighting;

    public GamingKeyboard(double price, String productName, int amount, int sizePercentage, String keyboardLayout, String keyswitches, boolean backlitLighting) {
        super(price, productName, amount, sizePercentage, keyboardLayout);
        this.keyswitches = keyswitches;
        this.backlitLighting = backlitLighting;
    }

    
 }