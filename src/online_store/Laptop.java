package online_store;

/**
 * Laptop 
 */
public class Laptop extends PersonalComputer {

    private boolean hasWebcam;
    private boolean isTouchscreen;
    private double weight;

    public Laptop (double price, String productName, int amount, String processor, double storageSSD, double storageRAM, boolean hasWebcam, boolean isTouchscreen, double weight) {
        super(price, productName, amount, processor, storageSSD, storageRAM);
        this.hasWebcam = hasWebcam;
        this.isTouchscreen = isTouchscreen;
        this.weight = weight;
    }
    
    public boolean getWebcam() {
        return hasWebcam;
    }

    public boolean getTouchscreen() {
        return isTouchscreen;
    }

    public double getWeight() {
        return weight;
    }

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
