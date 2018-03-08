package com.vyshnav.hackathon.model.controller;

import java.util.ArrayList;
import java.util.List;

public class InventoryController {

	private List<Inventory> inventoryList = new ArrayList<Inventory>();
	
	
	public void displayInventoryListForCustomer(){
		for (Inventory inventory : inventoryList){
			Sysytem.out.print("\n Id = "+inventory.id);
			Sysytem.out.print(" Name = "+inventory.name);
			for (Product product : inventory.productList){
////////////////////
		}
	}
	
	public void displayInventoryList(){
		for (Inventory inventory : inventoryList){
			Sysytem.out.print("\n Id = "+inventory.id);
			Sysytem.out.print(" Name = "+inventory.name);
			Sysytem.out.print(" Re-order level = "+inventory.reOrderLevel);
			Sysytem.out.print(" Maximum stock level = "+inventory.maximumStockLevel);
		}
	}
	

	public List<Inventory> getInventoryList(){		
		return inventoryList;
	}
	public void setInventoryList(List<Inventory> inventoryList){
		this.inventoryList = inventoryList;
	}

	public void addInventory(Inventory inventory){
		inventoryList.add(inventory);										
	}

	public void removeInventory(Inventory inventory){
		inventoryList.remove(inventory);									
	}

}
