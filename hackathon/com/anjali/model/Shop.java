/**
*author: anjali
*/

package com.anjali.model;

public class Shop {

private String shopName ;
private Inventory inventory ;
private int totalSales ;
private List<Customer> customerList ;
private InventoryController inventorycontroller;
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

public void setTotalSales(List<Customer> customers){
	this.customers=customers;
}

public List<Customer> getTotalSales(){
	return customers;
}




public static void main(String args[]){
Scanner sc=new Scanner();
//Create Shop

//@Create Customers in Shop
customerList=new ArrayList<Customer>();

for(int i=0;i<2;i++){
	Customer customer=new Customer();
	System.out.println("enter customer name;");
	customer.setName(sc.next());
	System.out.println("enter customers cash in hand;");
	customer.setCashInHand(sc.nextInt());
	customerList.add(customer);

}

//@Create Inventory in Shopp
//@Conduct sale 

}
}
