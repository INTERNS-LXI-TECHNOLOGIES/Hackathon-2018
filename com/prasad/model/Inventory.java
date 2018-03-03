package com.prasad.model;
import java.util.*;
public class Inventory
{
	private Product product = new Product();
	Scanner s = new Scanner(System.in);
	Scanner ss = new Scanner(System.in);

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
}