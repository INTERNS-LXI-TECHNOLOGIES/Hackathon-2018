package com.prasad.model;
import java.util.*;
import com.prasad.controller.*;
public class Shop {

private String shopName;
private Inventory inventory;
private int totalSale;
private List<Customer> customers;
private Product product;

private InventoryController inventorycontroller;
private SaleController  SaleController ;

public void setShopName(String shopName)
{
	this.shopName=shopName;
}
public String getShopName()
{
return shopName;
}
public void setTotalSale(int totalSale)
{
	this.totalSale=totalSale;
}
public int getTotalSale()
{
	return totalSale;
}
public void createCustomer()
{
	customers.add(new Customer("customer1"));
    customers.add(new Customer("customer2"));
    customers.add(new Customer("customer3"));
			
}
public void createInventory()
{
   inventory = new Inventory();
  product = inventory.createProduct();	
}
public void display()
{
	System.out.println("***************************"+getShopName()+"*************************");
	System.out.println("____________________________________________________________________");
	System.out.println("..............Inventory......................");
    this.createInventory();
    System.out.println("\t ID\tNAME\tDESCRIPTION\tPRICE\tSTOCK LEVEL\tREORDER LEVEL\tREFERENCE\tSEARCH KEY");
    System.out.println("_____________________________________________________________________________________");
	System.out.println("\t"+ product.getId()+"\t"+product.getName()+"\t"+product.getDescription()+"\t"+product.getReference());

}
}