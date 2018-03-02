package com.vyshnav.hackathon;

public class SaleController {
	
	private double totalAmount;

	public void sell(Product product, quantity){
		System.out.println("\n SALES: ");
		System.out.println("\n Product Name = "+product.getName());
		System.out.println("\n Product Price = "+product.getPrice());
		System.out.println("\n Quantity = "+quantity);
		double amount = product.getPrice*quantity;
		System.out.println("\n Amount = "+amount);
		totalAmount = totalAmount + amount;
		
	}
	

	public void totalAmount(){
		System.out.println("\n Total Amount = "+totalAmount);
	}

}
