package online_store;

/**
 * Shopping cart class
 * @author A. Chan
 */
import java.util.ArrayList;
public class ShoppingCart {

    // instance variables
    private int totalItems;
    private double totalCost;
    private ArrayList<Products> products = new ArrayList<Products>();

    /**
     * Shopping cart constructor
     * 
     * @param totalItems starting number of items
     * @param totalCost starting cost
     * @param products products arraylist
     * @author A. Chan
     */
    public ShoppingCart (int totalItems, double totalCost, ArrayList<Products> products) {
        this.totalItems = totalItems;
        this.totalCost = totalCost;
        this.products = products;
    }

    /**
     * Returns total amount of items
     * 
     * @return total amount of items
     * @author A. Chan
     */
    public int getTotalItems() {
        return totalItems;
    }

    /**
     * Returns total cost
     * 
     * @return total cost
     * @author A. Chan
     */
    public double getTotalCost() {
        return totalCost;
    }

    /**
     * Returns product arraylist
     * 
     * @return product arraylist
     * @author A. Chan
     */
    public ArrayList<Products> getProducts() {
        return products;
    }
    
}
