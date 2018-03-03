package com.jesily.shop.model.controller;
import com.jesily.shop.model.Product;
import com.jesily.shop.model.Part;
import java.util.Scanner;
import java.util.ArrayList;
public class InventoryController {
	Scanner scan=new Scanner(System.in);

	ArrayList<Product> inventory=new ArrayList<Product>();


	//@override
	public void  addStockToInventory(){
		int x=0;
		do{
			inventory.add(new Product());
			System.out.println(""+inventory.size());
			inventory.get(inventory.size()-1).setId(inventory.size());
			
			System.out.println("enter the name of the item");
			inventory.get(inventory.size()-1).setName(scan.next());
			
			System.out.println("enter the quantity of the item");
			inventory.get(inventory.size()-1).setQuantity(scan.nextInt());
			
			System.out.println("enter the price of the item");
			inventory.get(inventory.size()-1).setPrice(scan.nextDouble());
			
			System.out.println("do you want to add new Item 1.yes/ 2.no");
			x=scan.nextInt();
		}
		while(x==1);

		}

	public void displayStock(){
		int i=0;
		for(Product product:inventory){
			System.out.println((i+1)+" product name: "+product.getName()+"  ID: "+product.getId());
				i++;
		
		}
		
		
	}


	public boolean isProductAvailableInStock(Product selectedProduct){
		boolean isAvailable;
		for(Product product:inventory){
				if(selectedProduct.equals(product)){
					System.out.println("the product is available");
					isAvailable=true;
				}
				
		}
	}
			
			
		
		


	public void removeStockFromInventory( Product productToRemove, int quantityToRemove) {
		int remainingStock=productToRemove.getQuantity()-quantityToRemove;
		productToRemove.setQuantity(remainingStock);
		System.out.println("remaining stock : "+remainingStock);
		
	}






}
