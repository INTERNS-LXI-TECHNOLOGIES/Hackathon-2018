package com.lxi.hackathon.model;
import java.util.List;
import java.util.ArrayList;
import com.lxi.hackathon.model.controller.InventoryController;
import com.lxi.hackathon.model.controller.SaleController;
import com.lxi.hackathon.model.Customer;
public class Shop {
    private String shopName ;
    private int totalSales ;
    private List<Customer> customers ;
    private InventoryController inventoryController;
    private SaleController  saleController ;

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopName() {
        return this.shopName;
    }

    public int getTotalSales() {
        return this.totalSales;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getCustomers() {
        return this.customers;
    }

    public void setInventoryController(InventoryController inventoryController) {
        this.inventoryController = inventoryController;
    }

    public void setSaleController(SaleController saleController) {
        this.saleController = saleController;
    }


    public InventoryController getInventoryController() {
        return this.inventoryController;
    }

    public SaleController getSaleController() {
        return this.saleController;
    }


    public void showCustomers() {
        for (Customer c: this.customers) {
            System.out.println(c);
        }
    }


//public static void main(String args[]){

//Create Shop
//@Create Customers in Shop
//@Create Inventory in Shopp
//@Conduct sale





//}





}
