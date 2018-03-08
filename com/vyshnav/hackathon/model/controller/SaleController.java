package com.vyshnav.hackathon.model.controller;

public class SaleController {
	
	private double totalAmount = 0.00;

	public void printSaleDetails(Product product, quantity){
		System.out.println("\n SALES: ");
		System.out.println("\n Product Name = "+product.getName());
		System.out.println("\n Product Price = "+product.getPrice());
		System.out.println("\n Quantity = "+quantity);
		double amount = product.getPrice*quantity;
		System.out.println("\n Amount = "+amount);
		totalAmount = totalAmount + amount;
		
	}
	

	public void printTotalAmount(){
		System.out.println("\n Total Amount = "+totalAmount);
	}

}
