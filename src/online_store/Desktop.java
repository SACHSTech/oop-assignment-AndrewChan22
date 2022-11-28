package online_store;

/**
 * Subclass of PersonalComputer
 * @author A. Chan
 */
public class Desktop extends PersonalComputer {

    // instance variables
    private String graphicsCard;
    private boolean prebuilt;

    /**
     * Constructor for Desktop
     *
     * @param price price of product
     * @param productName name of product
     * @param amount amount of product
     * @param processor processor of desktop
     * @param storageSSD storage of SSD
     * @param storageRAM storage of RAM
     * @param graphicsCard desktop's graphics card
     * @param prebuilt is the computer prebuilt
     * @author A. Chan
     */
    public Desktop(double price, String productName, int amount, String processor, double storageSSD, double storageRAM, String graphicsCard, boolean prebuilt) {
        super(price, productName, amount, processor, storageSSD, storageRAM);
        this.graphicsCard = graphicsCard;
        this.prebuilt = prebuilt;
    }
    
    /**
     * Return graphics card
     * 
     * @return graphics card
     * @author A. Chan
     */
    public String getGraphicsCard() {
        return graphicsCard;
    }

    /**
     * Return if computer is prebuilt or not
     * 
     * @return whether the computer is prebuilt
     * @author A. Chan
     */
    public boolean getPrebuilt() {
        return prebuilt;
    }

    /**
     * Displays feature of Desktop object
     * 
     * @author A. Chan
     */
    public void showFeatures() {

        System.out.println("");
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());

        System.out.println("---Product Specifications---");

        System.out.println("Processor: " + getProcessor());
        System.out.println("SSD Storage: " + getSSD() + " GB");
        System.out.println("RAM Storage: " + getRAM() + " GB");

        System.out.println("Graphics card: " + graphicsCard);
        
        if(prebuilt) {
            System.out.println("This desktop computer is pre-built");
        }
    }
}
