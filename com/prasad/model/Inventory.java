package com.prasad.model;
import java.util.*;

import com.prasad.controller.InventoryController;
public class Inventory implements InventoryController
{
	private Product product = new Product();
	Scanner s = new Scanner(System.in);
	Scanner ss = new Scanner(System.in);
	private List<Product> productList = new ArrayList<Product>();

public Product createProduct()
{

	System.out.println("Enter your product name :");
    String name = s.nextLine();
    product.setName(name);
    System.out.println("Enter product's description :");
    String desc = s.nextLine();
    product.setDescription(desc);
    System.out.println("Enter product id");
    long id = ss.nextLong();
    product.setId(id);
    System.out.println("Enter maximum stock level :");
    double maxStockLevel = ss.nextDouble();
    product.setMaximumStockLevel(maxStockLevel);
    System.out.println("Enter reorder level :");
    double reOrderLevel = ss.nextDouble();
    product.setReOrderLevel(reOrderLevel);
    System.out.println("enter reference :");
    String reference = s.nextLine();
    product.setReference(reference);
    System.out.println("Enter Search key");
    String searchKey = s.nextLine();
    product.setSearchKey(searchKey);

	return product;   		
	
}
public void addStockToInventory(Product productToAdd, int quantitytoAdd) {
	
	System.out.println(productToAdd);
	  productList.add(productToAdd);
	  System.out.println(".....................inventory......................");
	  System.out.println("Your prdouct added to inventory..\nProduct :"+productList.get(0));
	 
}


public void removeStockFromInventory(Product productToRemove, int quantityToRemove) {
	
	if(productToRemove.getId()==productList.get(0).getId())
	{
		System.out.println("products in the inventory\n"+productList.get(0));
		productList.remove(productToRemove);
		System.out.println("Removed product from stock..Inventory stock :"+productList);
	}
}
}