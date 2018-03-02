package com.sahal.controller;
import java.util.*;
class SaleController {


List<Sale> saleProducts= new ArrayList<Sale>();
InventoryController inventoryController=new InventoryController();


Double sell(Product productShopped,int quantity)
{

	saleProducts.add(new Sale(productShopped,quantity,(double)productShopped.getPrice()*quantity));
	
	
}


void totalAmount() 
{
	Double totalAmount=0;
	for(int i=0;i<saleProducts.size();i++)
	{
			totalAmount+=saleProducts.amount;
	}
	System.out.println("Total amount is"+totalAmount);
}
}