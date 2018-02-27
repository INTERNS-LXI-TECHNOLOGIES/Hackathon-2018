package com.nikhil.model;
import com.nikhil.controller.*;
import java.util.*;
public class Shop {

String shopName ;
int totalSales ;
List<Customer> customers ;

public String toString()
{
	return "AJ Stores";
}
InventoryController inventoryController;
SaleController  saleController ;


public static void main(String args[]){
	
Shop shop=new Shop();
System.out.println(shop);

Scanner scan=new Scanner(System.in);
System.out.println("Enter number of customers");
int numOfCustomers=scan.nextInt();
shop.customers=new ArrayList<Customer>();
String name;
int cashInHand;
for(int i=0;i<numOfCustomers;i++)
{
	System.out.println("Enter name");
	name=scan.next();
	System.out.println("Enter cash in hand");
	cashInHand=scan.nextInt();

	shop.customers.add(new Customer());
	shop.customers.get(i).setName(name);
	shop.customers.get(i).setCashInHand(cashInHand);
}
 for(int j=0;j<numOfCustomers;j++)
{
	System.out.println(shop.customers.get(j).getName()+"  "+shop.customers.get(j).getCashInHand());
}

shop.inventoryController=new InventoryController();
shop.saleController=new SaleController();
System.out.println("How many products:");
int numberOfProducts=scan.nextInt();
shop.inventoryController.inventory=new ArrayList<Product>();
String productName;
int[] quantity=new int[10];
int [] price =new int[10];
for(int k=0;k<numberOfProducts;k++)
{
System.out.println("name of product:");
productName=scan.next();
System.out.println("quantity of products:");
quantity[k]=scan.nextInt();
System.out.println("Price of product");
price[k]=scan.nextInt();
shop.inventoryController.inventory.add(new Product());
shop.inventoryController.inventory.get(k).setName(productName);
shop.inventoryController.addStockToInventory(shop.inventoryController.inventory.get(k),quantity[k]);
}
System.out.println("Product list..");
for(int l=0;l<numberOfProducts;l++)
{
	System.out.println(shop.inventoryController.inventory.get(l).getName()+"  "+quantity[l]+"  "+price[l]);
}
System.out.println("Choose the product you want: ");
String productChoose=scan.next();
for(int m=0;m<numberOfProducts;m++)
{
if(productChoose.equals(shop.inventoryController.inventory.get(m).getName()))
{
	System.out.println("How many "+shop.inventoryController.inventory.get(m).getName()+" do you want ");
	int quantityWanted=scan.nextInt();
	int totalCost=shop.saleController.totalAmount(quantityWanted,price[m]);
	System.out.println("Total cost:"+totalCost);
	//System.out.println(shop.customers.get(m).getCashInHand());
	int amountLeft=shop.customers.get(0).getCashInHand()-totalCost;
	System.out.println("The amount left in hand is: "+amountLeft);
}
}
	//shop.inventoryController.addStockToInventory(shop.inventoryController.inventory.get(k),quantity);

/* */
//Create Shop
//@Create Customers in Shop
//@Create Inventory in Shopp
//@Conduct sale 





}





}
