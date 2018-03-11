package com.vyshnav.hackathon.controller;

import java.util.ArrayList;
import java.util.List;

public class ProductController {
		
	//Display Products
	public void displayProductList(Shop shop){
		ShopController shopController = new ShopController();
		for (Inventory inventory : shopController.getShopInventoryList(shop)){
			Sysytem.out.print("\n Id = "+inventory.getId);
			Sysytem.out.print(" Inventory Name = "+inventory.getName); //////shouldn't access other pojos directly
			for (Product product : inventory.getProductList){ //////shouldn't access other pojos directly
				Sysytem.out.print(" Product id = "+product.getId); //////shouldn't access other pojos directly
				Sysytem.out.print(" Product name = "+product.getName); //////shouldn't access other pojos directly
				Sysytem.out.print(" Product price = "+product.getPrice); //////shouldn't access other pojos directly
			}
		}
	}
	
	//Create Product
	public Product createProduct(int id, String name, double price){
		Product product = new Product(id, name, price);
		return product;
	}
	
	//Add Product	
	public Product addProduct(Product product){
		List<Product> productList = new List<Product> product;
		productList.add(product);
		return productList;
	}	
	public Product addProduct(Shop shop, int inventoryId, Product product){
		List<Product> productList;
		ShopController shopController = new ShopController();
		List<Inventory> inventoryList = shopController.getShopInventoryList(shop);
 		InventoryController inventoryController = new InventoryController();	
		
		for(Inventory inventory : inventoryList){
			int id = inventoryController.getInventoryId(inventory);
			if (id==inventoryId){
				productList = inventoryController.getInventoryProductList(inventory);
				productList.add(product);
				return product;
			}
		}
		return null;
	}
	
	//Remove Product
	public Product removeProduct(Inventory inventory, Product product){
		List<Product> productList = inventoryController.getInventoryProductList(inventory);
		InventoryController inventoryController = new InventoryController();	
		productList.remove(product);
		inventoryController.checkReOrderLevel(inventory, productList);
		return product;
	}
	
	/*public boolean isProductAvailable(Inventory inventory){ 
		InventoryController inventoryController = new InventoryController();	
		if (inventoryController.getInventoryProductList(inventory) != 0){
			return true;
		} else{
			return false;
		}
	}*/
		
	//Product Getters and Setters
	public int getProductId(Product product){
		return product.getId();
	}
	public void setProductId(Product product, int id){
		product.setId(id);
	}
	public String getProductName(Product product){
		return product.getName();
	}
	public void setProductName(Product product, String name){
		product.setName(name);
	}
	public double getProductPrice(Product product){
		return product.getPrice();
	}
	public void setProductPrice(Product product, double price){
		product.setPrice(price);
	}

}

