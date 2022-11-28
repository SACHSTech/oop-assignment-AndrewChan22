package online_store;

/**
 * Subclass of products
 */
public class PersonalComputer extends Products {

    // instance variables
    private String processor;
    private double storageSSD;
    private double storageRAM;

    /**
     * PersonalComputer constructor
     * 
     * @param price price of product
     * @param productName name of product
     * @param amount amount of product
     * @param processor process of product
     * @param storageSSD storageSSD of product
     * @param storageRAM storageRAM of product
     * @author A. Chan
     */
    public PersonalComputer(double price, String productName, int amount, String processor, double storageSSD, double storageRAM) {
        super(price, productName, amount);
        this.processor = processor;
        this.storageSSD = storageSSD;
        this.storageRAM = storageRAM;
    }

    /**
     * Returns processor of computer
     * 
     * @return processor of computer
     * @author A. Chan
     */
    public String getProcessor() {
        return processor;
    }

    /**
     * Returns storage of SSD of computer
     * 
     * @return SSD storage
     * @author A. Chan
     */
    public double getSSD() {
        return storageSSD;
    }

    /**
     * Returns storage of RAM
     * @return RAM storage
     * @author A. Chan
     */
    public double getRAM() {
        return storageRAM;
    }

    /**
     * Outputs features 
     * 
     * @author A. Chan
     */
    public void showFeatures() {
        System.out.println("");
        System.out.println("Name: " + getName());
        System.out.println("Price: $" + getPrice());

        System.out.println("---Product Specifications---");
        System.out.println("Processor: " + processor);
        if (storageSSD >= 1000) {
            System.out.println((storageSSD/1000) + " TB solid-state drive (SSD)");
        }
        else {
            System.out.println(storageSSD + " GB solid-state drive (SSD)");
        }

        System.out.println("RAM: " + storageRAM + "GB");
    }

}
