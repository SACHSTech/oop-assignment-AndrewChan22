package online_store;

/**
 * Abstract product class
 * @author A. Chan
 */
public abstract class Products {

    // instance variables
    private double price;
    private String productName;
    private int amount;

    /**
     * Product constructor
     * 
     * @param price price of product
     * @param productName product name
     * @param amount amount of product
     * @author A. Chan
     */
    public Products (double price, String productName, int amount) {
        this.price = price;
        this.productName = productName;
        this.amount = amount;
    }

    /**
     * Return price of product
     * 
     * @return price of product
     * @author A. Chan
     */
    public double getPrice() {
        return price;
    }

    /**
     * Return name of product
     * 
     * @return name of product
     * @author A. Chan
     */
    public String getName() {
        return productName;
    }
    
    /**
     * Return amount of product
     * 
     * @return amount of product
     * @author A. Chan
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Set amount of product
     * 
     * @param newAmount amount to set products to
     * @author A. Chan
     */
    public void setAmount(int newAmount) {
        this.amount = newAmount;
    }

    /**
     * toString method
     * 
     * @return String representation 
     */
    public String toString() {
        return productName + ": $" + price;
    }

    /**
     * Abstract showFeatures method
     */
    public abstract void showFeatures();
}
