package online_store;

import java.util.ArrayList;
public class ShoppingCart {
    private int totalItems;
    private double totalCost;
    private ArrayList<Products> products = new ArrayList<Products>();

    public ShoppingCart (int totalItems, double totalCost, ArrayList<Products> products) {
        this.totalItems = totalItems;
        this.totalCost = totalCost;
        this.products = products;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public ArrayList<Products> getProducts() {
        return products;
    }
    
}
