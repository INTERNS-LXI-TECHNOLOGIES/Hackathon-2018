package com.vyshnav.hackathon;

import java.util.ArrayList;
import java.util.List;

public class InventoryController {

	private List<Inventory> inventoryList;
	
	
	public void displayInventoryListForCustomer(){
		for (Inventory inventory : inventoryList){
			Sysytem.out.print("\n Id = "+inventory.id);
			Sysytem.out.print(" Name = "+inventory.name);
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

	public void addInventory(Inventory inventory /*, size quantitytoadd*/){
		inventoryList.add(inventory);										//quantityToAdd
	}

	public void removeInventory(Inventory inventory /*, size quantityToRemove */){
		inventoryList.remove(inventory);									//quantityToRemove

	}

}
