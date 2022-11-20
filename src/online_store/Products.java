package online_store;

public class Products {

    private double price;
    private String productName;
    private int amount;

    public Products (double price, String productName, int amount) {
        this.price = price;
        this.productName = productName;
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return productName;
    }
    
}
