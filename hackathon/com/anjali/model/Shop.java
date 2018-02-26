/**
*author: anjali
*/

package com.anjali.model;
import java.util.*;
import com.anjali.controller.*;

public class Shop {

private String shopName ;
private Inventory inventory ;
private int totalSales ;
private  List<Customer> customerList ;
private  InventoryController inventorycontroller;
private SaleController  SaleController ;

public void setShopName(String shopName){
	this.shopName=shopName;
}

public String getShopName(){
	return shopName;
}

public void setInventory(Inventory inventory){
	this.inventory=inventory;
}

public Inventory getInventory(){
	return inventory;
}

public void setTotalSales(int totalSales){
	this.totalSales=totalSales;
}

public int getTotalSales(){
	return totalSales;
}

public void setCustomerList(List<Customer> customerList){
	this.customerList=customerList;
}

public List<Customer> getCustomerList(){
	return customerList;
}




public void inventoryShopping(){
Scanner sc=new Scanner(System.in);

//Create Shop
Shop shop=new Shop();
shop.shopName="Big Bazar";
shop.totalSales=10000;

//@Create Customers in Shop
customerList=new ArrayList<Customer>();
System.out.println("enter number of customers to add:");
int number=sc.nextInt();

for(int i=0;i<number;i++){
	Customer customer=new Customer();
	System.out.println("enter customer name");
	customer.setName(sc.next());
	System.out.println("enter customers cash in hand");
	customer.setCashInHand(sc.nextInt());
	customerList.add(customer);

}

//@Create Inventory in Shopp
	System.out.println("enter number of products in inventory");
	int nuOfProducts=sc.nextInt();
	//inventory=new Inventory();
	
	for(int i=0;i<nuOfProducts;i++){
		Product product=new Product();
		System.out.println("enter product name");
		product.setName(sc.next());
		System.out.println("enter product description");
		product.setDescription(sc.next());	
		inventorycontroller=new InventoryControllerImpl();
		inventorycontroller.addStockToInventory(product,nuOfProducts,inventory);
		//inventory.setProduct(product);
	}

//@Conduct sale 

}
}
