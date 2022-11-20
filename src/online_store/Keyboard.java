package online_store;

public class Keyboard extends Products {
    private int sizePercentage;
    private String keyboardLayout;

    public Keyboard(double price, String productName, int amount, int sizePercentage, String keyboardLayout) {
        super(price, productName, amount);
        this.sizePercentage = sizePercentage;
        this.keyboardLayout = keyboardLayout;
    }

    
}
