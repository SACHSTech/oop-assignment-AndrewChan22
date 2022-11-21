package online_store;

/**
 * Laptop subclass
 * @author A. Chan
 */
public class Laptop extends PersonalComputer {

    // instance variables
    private boolean hasWebcam;
    private boolean isTouchscreen;
    private double weight;

    /**
     * Laptop constructor
     * 
     * @param price price of laptop
     * @param productName name of laptop
     * @param amount amount of laptop
     * @param processor processor of laptop
     * @param storageSSD storage of SSD
     * @param storageRAM storage of RAM
     * @param hasWebcam has webcam or not
     * @param isTouchscreen is touchscreen or not
     * @param weight weight of laptop
     * @author A. Chan
     */
    public Laptop (double price, String productName, int amount, String processor, double storageSSD, double storageRAM, boolean hasWebcam, boolean isTouchscreen, double weight) {
        super(price, productName, amount, processor, storageSSD, storageRAM);
        this.hasWebcam = hasWebcam;
        this.isTouchscreen = isTouchscreen;
        this.weight = weight;
    }
    
    /**
     * Return whether laptop has webcam
     * @return has webcam
     * @author A. Chan
     */
    public boolean getWebcam() {
        return hasWebcam;
    }

    /**
     * Return whether laptop is touchscreen
     * 
     * @return is touchscreen
     * @author A. Chan
     */
    public boolean getTouchscreen() {
        return isTouchscreen;
    }

    /**
     * Return weight of laptop
     * 
     * @return weight of laptop 
     * @author A. Chan
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Output features to screen
     * 
     * @author A. Chan
     */
    public void showFeatures() {

        super.showFeatures();

        if (hasWebcam) {
            System.out.println("This laptop has a webcam");
        } else {
            System.out.println("Webcam not included");
        }

        if (isTouchscreen) {
            System.out.println("This laptop has touchscreen");
        }

        System.out.println("Weight of laptop: " + weight + " lb(s)");
    }
}
