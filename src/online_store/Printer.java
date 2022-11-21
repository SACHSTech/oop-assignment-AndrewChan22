package online_store;

public class Printer extends Products {
    private String type;

    public Printer(double price, String productName, int amount, String type) {
        super(price, productName, amount);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void showFeatures() {
        System.out.println("This printer is a " + type);
    }
}
