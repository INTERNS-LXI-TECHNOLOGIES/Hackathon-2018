package com.lxi.hackathon.model.controller;
import com.lxi.hackathon.model.Product;
import java.util.List;
import java.util.ArrayList;
public class SaleController {
    private List<Product> products = new ArrayList<Product>();
    private long amount = 0;

    public List<Product> getProducts() {
        return this.products;
    }

    public void sell(Product productShopped, long quantity) {
        this.products.add(productShopped);
        this.amount += quantity;
    }

    public long totalAmount() {
        return this.amount;
    }
}
