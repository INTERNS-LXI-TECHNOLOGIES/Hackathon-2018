

package com.lxi.hackathon.model;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import com.lxi.hackathon.model.controller.InventoryController;
import com.lxi.hackathon.model.controller.SaleController;
import java.util.Iterator;
public class Tdd {
    public static void main(String[] args) {
        int cash = 100;
        Scanner s = new Scanner(System.in);

        /////SHOP
        Shop shop = new Shop();
        shop.setShopName("Amazon");
        List<Customer> customers = new ArrayList<Customer>();
        shop.setCustomers(customers);

        System.out.println("Enter the number of customers");
        int limit = s.nextInt();

        for(int i=0; i<limit; i++) {
            System.out.println("Enter the Name");
            String cusName = s.next();
            System.out.println("Cash in Hand ??");
            int cashInHand = s.nextInt();
            Customer customer = new Customer(cusName, cash);
            shop.getCustomers().add(customer);
        }
        System.out.println("///////SHOW CUSTOMERS");
        shop.showCustomers();

        System.out.println("///////INVENTORY////////");
        InventoryController inventoryController = new InventoryController();
        shop.setInventoryController(inventoryController);

        System.out.println("///addStockToInventory");
        System.out.println("Enter the number of products");
        int proNum = s.nextInt();
        for (int i=0; i<proNum; i++) {

            System.out.println("Enter the name of Product");
            String productName = s.next();
            System.out.println("Enter Description about the product -->");
            String productDescription = s.next();
            System.out.println("Enter the reference");
            String productReference = s.next();
            System.out.println("\n");

            Product product = new Product(productName, productDescription, true, i+1, 10.0, productReference, i+"A");
            long quantity = 20;
            shop.getInventoryController().addStockToInventory(product, quantity);
        }

        System.out.println("///////PRODUCTS IN INVENTORY///");
        for (Product p: shop.getInventoryController().getProducts()) {
            System.out.println(p.getId()+"."+p);
        }

        System.out.println("/////SALE///////");
        SaleController saleController = new SaleController();
        shop.setSaleController(saleController);

        for(Product p: shop.getInventoryController().getProducts()) {
            System.out.println(p.getId()+"."+p);
        }
        System.out.println("Select id for purchase product");
        long purchaseId = s.nextInt();

        for(Product p: shop.getInventoryController().getProducts()) {
            if(p.getId() == purchaseId) {
                System.out.println("Enter the quantity");
                long purchaseQuantity = s.nextLong();
                shop.getSaleController().sell(p, purchaseQuantity);
                shop.getInventoryController().removeStockFromInventory(p, purchaseQuantity);
            }
        }
        System.out.println("Quantity of products to be sale :"+shop.getSaleController().totalAmount());
        System.out.println("Quantity of products in inventory :"+shop.getInventoryController().showQuantity());


    }
}
