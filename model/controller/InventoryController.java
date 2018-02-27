package com.lxi.hackathon.model.controller;
import com.lxi.hackathon.model.Product;
import java.util.ArrayList;
import java.util.Iterator;
public class InventoryController {
    private  ArrayList<Product> products = new ArrayList<Product>();
    public long quantity = 0;

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return this.products;
    }

    public void addStockToInventory( Product productToAdd, long quantityToadd) {
        this.products.add(productToAdd);
        this.quantity = this.quantity + quantityToadd;
    }

    public void removeStockFromInventory( Product productToRemove, long purchaseQuantity) {
        Product removeProduct = null;
        for (int i=0; i<products.size(); i++) {
            if (products.get(i).getId() == productToRemove.getId()) {
                removeProduct = products.get(i);
            }
        }
        //this.products.remove(removeProduct);
        this.quantity = this.quantity - purchaseQuantity;
    }

    public ArrayList<Product> showAllProducts() {
        return this.products;
    }

    public long showQuantity() {
        return this.quantity;
    }

}
