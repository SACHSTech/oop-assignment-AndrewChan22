package online_store;

public class Desktop extends PersonalComputer {
    private String graphicsCard;
    private boolean prebuilt;

    public Desktop(double price, String productName, int amount, String processor, double storageSSD, double storageRAM, String graphicsCard, boolean prebuilt) {
        super(price, productName, amount, processor, storageSSD, storageRAM);
        this.graphicsCard = graphicsCard;
        this.prebuilt = prebuilt;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public boolean getPrebuilt() {
        return prebuilt;
    }

    public void getFeatures() {

        super.getFeatures();
        System.out.println("Graphics card: " + graphicsCard);
        
        if(prebuilt) {
            System.out.println("This desktop computer is pre-built");
        }
    }
}
