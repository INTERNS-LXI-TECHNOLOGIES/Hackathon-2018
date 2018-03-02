package com.vyshnav.hackathon;
package com.vyshnav.hackathon;

import java.util.ArrayList;
import java.util.List;

public class Shop {

	
	private String shopName ;
	private int totalSales ;
	private Inventory inventory ;
	private List<Customer> customers ;
	private InventoryController inventoryController;
	private SaleController  saleController ;

	//Create Shop
	//@Create Customers in Shop
	//@Create Inventory in Shop
	//@Conduct sale 
	
	public void displayCodes() {
		System.out.println("\n ====================================");	
		System.out.println("\n WHAT TO DO		CODE");
		System.out.println("\n Dispplay inventories		1");
		System.out.println("\n Add inventory		2");
		System.out.println("\n Add product		3");
		System.out.println("\n Customer Sales		4");
		System.out.println("\n ====================================");	
	}
	
	public void doStuff(){
		int code;
		boolean quit = false;
		Scanner scanner = new Scanner (System.in);
		
		while(quit==false) {
			//display code table
			displayCodes();
			//user input				
			System.out.println("\n Enter required code: ");
			code = scanner.nextInt();
			
			if(code==1){
				
				InventoryController inventoryController = new InventoryController();
				inventoryController.displayInventoryList();
				
			} else if (code==2){
				
				int id, maximumStockLevel,reOrderLevel;
				String name;
				Inventory inventory;
				InventoryController inventoryController;
				
				System.out.println("\n Enter inventory id:");
				id = scanner.nextInt();
				System.out.println("\n Enter inventory name:");
				name = scanner.next();
				System.out.println("\n Enter maximum stock level:");
				maximumStockLevel = scanner.nextInt();
				System.out.println("\n Enter reorder level:");
				reOrderLevel = scanner.nextInt();
				// ====> create productlist here later <====
				inventory = new Inventory(id, name, maximumStockLevel, reOrderLevel, productList);
				inventoryController = new InventoryController();
				inventoryController.addInventory(inventory);
				
			} else if (code==3){
				
				double price;
				String name;
				Product product;
				
				System.out.println("\n Enter product name: ");
				name = scanner.next();
				System.out.println("\n Enter product price: ");
				price = scanner.nextInt();
				product(name, price);
				// ====> add product to corresponding inventory here later <====
				
			} else if (code==4){
				
				int cashInHand, id;
				String name;
				InventoryController inventoryController;
				
				System.out.println("\n Enter customer name: ");
				name = scanner.next();
				System.out.println("\n Enter customer cash in hand: ");
				cashInHand = scanner.nextInt();
				System.out.println("\n Items present =  ");
				inventoryController = new InventoryController();
				inventoryController.displayInventoryListForCustomer();
				System.out.println("\n Choose required id: ");
				id = scanner.nextInt();
				// ====> get logic and do something here later <====
				
			} else {
				System.out.println("\n Enter correct code");
			}
			
			System.out.println("\n Do you want to play again? (yes/no)");
			choice = scanner.next();	
			if (choice.equals("yes")){
				quit=false; 
			} 
			else {
				quit = true; 
			}
		}
		scanner.close();
	}
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public int getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(int totalSales) {
		this.totalSales = totalSales;
	}
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	public InventoryController getInventoryController() {
		return inventoryController;
	}
	public void setInventoryController(InventoryController inventoryController) {
		this.inventoryController = inventoryController;
	}
	public SaleController getSaleController() {
		return saleController;
	}
	public void setSaleController(SaleController saleController) {
		this.saleController = saleController;
	}

	
}
