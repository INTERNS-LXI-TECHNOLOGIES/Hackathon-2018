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
Scanner s = new Scanner(System.in);

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
 //System.out.println("in createInventory..!!"+product);
/*  productList.add(product);
 System.out.println(productList.get(0));
 System.out.println("in inventory.."+productList); 
*/}
public void display()
{
	System.out.println("***************************"+getShopName()+"*************************");
	System.out.println("____________________________________________________________________");
	System.out.println("..............Inventory......................");
    this.createInventory();
    System.out.println("\t ID\tNAME\tDESCRIPTION\tPRICE\tSTOCK LEVEL\tREORDER LEVEL\tREFERENCE\tSEARCH KEY");
    System.out.println("\t_____________________________________________________________________________________");
	System.out.println("\t"+ product.getId()+"\t"+product.getName()+"\t"+product.getDescription()+"\t"+product.getReference());
    System.out.println("\n\n\t\t1.Add product to stock\t2.Remove product from stock");
    int choice = s.nextInt();
    if(choice == 1)
    {
    	inventory.addStockToInventory(product,10);
    	System.out.println("do you want to remove product from stock\n1.yes \t2.No");
    	int opt = s.nextInt();
if(opt == 1)
{   
	inventory.removeStockFromInventory(product,10);;
}
}
}
}