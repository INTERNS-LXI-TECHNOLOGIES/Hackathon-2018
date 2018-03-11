package com.vyshnav.hackathon.controller;

import java.util.ArrayList;
import java.util.List;

public class ShopController {

	private Shop shop = new Shop();

	//Create Shop
	//@Create Customers in Shop
	//@Create Inventory in Shop
	//@Conduct sale  
	
	//Display User Input Codes
	public void displayCodes() {
		System.out.println("\n ====================================");	
		System.out.println("\n WHAT TO DO		CODE");
		System.out.println("\n Display inventories		1");
		System.out.println("\n Create inventory		2");
		System.out.println("\n Create product		3");
		System.out.println("\n Create customer		4");
		System.out.println("\n Conduct sales		5");  
		System.out.println("\n ====================================");	
	}
	
	//Display Inventories in Shop
	public void displayInventoryList(){
		InventoryController inventoryController = new InventoryController();
		inventoryController.displayInventoryList(shop);
	}
	
	//Create Inventory in Shop
	public Inventory createInventory(){
		int inventoryId, maximumStockLevel,reOrderLevel;
		String name;
		List<Product> productList;
		Inventory inventory;
		InventoryController inventoryController = new InventoryController();
		
		System.out.println("\n Enter inventory id:");
		inventoryId = scanner.nextInt();
		System.out.println("\n Enter inventory name:");
		name = scanner.next();
		System.out.println("\n Enter maximum stock level:");
		maximumStockLevel = scanner.nextInt();
		System.out.println("\n Enter reorder level:");
		reOrderLevel = scanner.nextInt();
		productList = createProductList(inventoryId);
		//inventory = new Inventory(inventoryId, name, maximumStockLevel, reOrderLevel, productList);
		inventory = inventoryController.createInventory(inventoryId, name, maximumStockLevel, reOrderLevel, productList);
		inventoryController.addInventory(shop, inventory);
		return inventory;
	}	
	
	//Create Product
	public Product createProduct(){
		int inventoryId, productId;
		double price;
		String name;
		Product product;
		ProductController productController = new ProductController();
		
		System.out.println("\n Enter inventory id: ");
		inventoryId = scanner.nextInt();	
		System.out.println("\n Enter product id:");
		productId = scanner.nextInt();
		System.out.println("\n Enter product name: ");
		name = scanner.next();
		System.out.println("\n Enter product price: ");
		price = scanner.nextInt();
		product = productController.createProduct(id, name, price);
		product = productController.addProduct(shop, inventoryId, product);
		return product;
	}
	
	//Create Customer
	public Customer createCustomer(){
		//code later
	}
	
	//Conduct Sales
	public void conductSales(){
		int cashInHand, inventoryId, productId;
		double totalAmount = 0.0;
		String name;
		Product product;
		ProductController productController = new ProductController();
		SalesController salesController = new SalesController();
		
		System.out.println("\n Enter customer name: ");
		name = scanner.next();
		System.out.println("\n Enter customer cash in hand: ");
		cashInHand = scanner.nextInt();

		while(true){
			System.out.println("\n Items present =  ");
			productController.displayProductList(shop);
			System.out.println("\n Choose required inventory id: ");
			inventoryId = scanner.nextInt();
			System.out.println("\n Choose required product id: ");
			productId = scanner.nextInt();
			totalAmount = salesController.conductSales(totalAmount, shop, inventoryId ,productId, cashInHand);
			System.out.println("\n Dou you want to add another product: (yes/no)");
			choice = scanner.next();	
			if (choice.equals("no")){
				break; 
			}
		}
		salesController.displayTotalAmount(totalAmount);
	
	}		
	
	public List<Product> createProductList(int inventoryId){
		
		int id;
		String name;
		double price;
		Product product;
		List<Product> productList;
		ProductController productController = new ProductController();
		
		while(true){		
			System.out.println("\n Enter product id:");
			id = scanner.next(); 
			System.out.println("\n Enter product name:");
			name = scanner.next();
			System.out.println("\n Enter product price:");
			price = scanner.nextInt();
			
			product = productController.createProduct(id, name, price);
			productList = productController.add(product);
			System.out.println("\n Dou you want to add another product: (yes/no)");
			choice = scanner.next();	
			if (choice.equals("no")){
				break; 
			}
		}
		return productList;
	}
	
	//Shop Getters and Setters
	public List<Inventory> getShopInventoryList(Shop shop) {
		return shop.getInventoryList();
	}
	public void setShopInventoryList(Shop shop, List<Inventory> inventoryList) {
		shop.setInventoryList(inventoryList);
	}
	public List<Customer> getShopCustomerList(Shop shop) {
		return shop.getCustomerList();
	}
	public void setShopCustomerList(Shop shop, List<Customer> customerList) {
		shop.setCustomerList(customerList);
	}

	
}
