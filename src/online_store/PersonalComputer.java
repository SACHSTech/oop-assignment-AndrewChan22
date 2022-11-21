package online_store;

public class PersonalComputer extends Products {
    private String processor;
    private double storageSSD;
    private double storageRAM;

    public PersonalComputer(double price, String productName, int amount, String processor, double storageSSD, double storageRAM) {
        super(price, productName, amount);
        this.storageSSD = storageSSD;
        this.storageRAM = storageRAM;
    }

    public String getProcessor() {
        return processor;
    }

    public double getSSD() {
        return storageSSD;
    }

    public double getRAM() {
        return storageRAM;
    }

    public void getFeatures() {
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
