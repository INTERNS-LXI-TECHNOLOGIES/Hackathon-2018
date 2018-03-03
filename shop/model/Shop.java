package com.jesily.shop.model;
import com.jesily.shop.model.controller.InventoryController;
import com.jesily.shop.model.controller.SaleController;
import java.util.ArrayList;
import java.util.Scanner;
import com.jesily.shop.model.Customer;


public class Shop {
	Scanner scan=new Scanner(System.in);

	private String name ;

	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return name;
	}



	int totalSales ;
	ArrayList<Customer> customers=new ArrayList<Customer>();
	InventoryController inventoryController=new InventoryController();
	SaleController  saleController=new SaleController();

	public void start(){
		inventoryController.addStockToInventory();
		inventoryController.displayStock();
		String selectedProduct=saleController.choosingItem();
		boolean isAvailable=inventoryController.isProductAvailableInStock(selectedProduct);
		if(isAvailable==true){
		performingSale(selectedProduct);
		}
		else{
			System.out.println("Stock not available");
		}
		
		
	}

	public void createCustomer()
	{
		int y=0;
		do{
			
			System.out.println("enter the name of the customer");
			String name=scan.next();
			
			System.out.println("enter the amount the customer have");
			int cashInHand=scan.nextInt();
			
			customers.add(new Customer(name,cashInHand));
			System.out.println("do you want to add new customer 1.yes3\0.no");
			y=scan.nextInt();
		}
		while(y==1);
		
		
	}

	public void performingSale(Product selectedProduct){
			System.out.println("enter the quantity of the product you want");
			int qty=scan.nextInt();
			inventoryController.removeStockFromInventory(selectedProduct,qty);
		
	}
		


	//Create Shop
	//@Create Customers in Shop
	//@Create Inventory in Shopp
	//@Conduct sale 





}
