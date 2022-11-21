package online_store;

public class Mouse extends Products{
    private boolean isWireless;
    private boolean isErgonomic;
    private String size;

    public Mouse (double price, String productName, int amount, boolean isWireless, boolean isErgonomic, String size) {
        super(price, productName, amount);
        this.isWireless = isWireless;
        this.isErgonomic = isErgonomic;
        this.size = size;
    }

    public boolean getIsWireless() {
        return isWireless;
    }

    public boolean getIsErgonomic() {
        return isErgonomic;
    }

    public String getSize() {
        return size;
    }

    public void getFeatures() {
        
        System.out.println("Size of Mouse: " + size);

        if (isErgonomic) {
            System.out.println("This mouse is ergonomic");
        }

        if (isWireless) {
            System.out.println("This mouse is wireless");
        }
        else {
            System.out.println("This mouse is wired");
        }
    } 
}
