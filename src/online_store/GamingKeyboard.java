package online_store;

public class GamingKeyboard extends Keyboard {
    private String keyswitches;
    private boolean backlitLighting;

    public GamingKeyboard(double price, String productName, int amount, int sizePercentage, String keyboardLayout, String keyswitches, boolean backlitLighting) {
        super(price, productName, amount, sizePercentage, keyboardLayout);
        this.keyswitches = keyswitches;
        this.backlitLighting = backlitLighting;
    }

    public String getKeyswitches() {
        return keyswitches;
    }
    
    public boolean backlitLighting() {
        return backlitLighting;
    }

    public void getFeatures() {
        super.getFeatures();
        System.out.println("Mechanical keyswitches: " + keyswitches);
        if (backlitLighting) {
            System.out.println("This keyboard has vibrant RGB backlighting");
        }
    }
 }