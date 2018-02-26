package com.prasad.model;
import java.util.*;
import com.prasad.controller.*;
public class Shop {

private String shopName;
private Inventory inventory;
private int totalSale;
private List<Customer> customers;

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
}