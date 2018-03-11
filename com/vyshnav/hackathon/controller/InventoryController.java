package com.vyshnav.hackathon.controller;

import java.util.List;

public class InventoryController {
	
	public void displayInventoryList(Shop shop){
		ShopController shopController = new ShopController(); 
		for (Inventory inventory : shopController.getShopInventoryList(shop)){
			Sysytem.out.println("\n Id = "+inventory.id); 
			Sysytem.out.println(" Name = "+inventory.name); 
			Sysytem.out.println(" Re-order level = "+inventory.reOrderLevel);
			Sysytem.out.println(" Maximum stock level = "+inventory.maximumStockLevel); 
		}
	}	
	
	public void checkReOrderLevel(Inventory inventory, List<Product> productList){
		if(productList.size()<=inventory.getReOrderLevel()){
			Sysytem.out.println("\n "+ getInventoryName(inventory)+ "Stock went below Re-Order Level. Time to re-order...");
		}
	}
	
	public Inventory createInventory(int inventoryId, String name, int maximumStockLevel, int reOrderLevel, List<Product> productList){
		Inventory inventory= new Inventory(inventoryId, name, maximumStockLevel, reOrderLevel, productList);
		return inventory;
	}
	
	//Add and Remove Inventory
	public void addInventory(Shop shop, Inventory inventory){
		ShopController shopController = new ShopController();
		shopController.getShopInventoryList(shop).add(inventory);										
	}
	public void removeInventory(Shop shop, Inventory inventory){
		ShopController shopController = new ShopController();
		shopController.getShopInventoryList(shop).remove(inventory);		
	}
	
	//Inventory Getters and Setters
	public int getInventoryId(Inventory inventory){
		inventory.getId();
	}
	public void setInventoryId(Inventory inventory, int id){
		inventory.setId(id);
	}
	public String getInventoryName(Inventory inventory){
		inventory.getName();
	}
	public void setInventoryName(Inventory inventory, String name){
		inventory.setName(name);
	}
	public int getInventoryMaximumStockLevel(Inventory inventory){
		inventory.getMaximumStockLevel();
	}
	public void setInventoryMaximumStockLevel(Inventory inventory, int maximumStockLevel){
		inventory.setIdMaximumStockLevel(maximumStockLevel);
	}	
	public int getInventoryReOrderLevel(Inventory inventory){
		inventory.getReOrderLevel();
	}
	public void setInventoryReOrderLevel(Inventory inventory, int reOrderLevel){
		inventory.setReOrderLevel(reOrderLevel);
	}
	public List<Product> getInventoryProductList(Inventory inventory){		
		inventory.getProductList();
	}
	public void setInventoryProductList(Inventory inventory, List<Product> productList){
		inventory.setProductList(productList);
	}
	

}
