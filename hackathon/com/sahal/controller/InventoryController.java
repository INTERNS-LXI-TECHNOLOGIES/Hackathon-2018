package com.sahal.model;
import java.util.*;
class InventoryControll {
	


Inventory inventory;

public void addStockToInventory( Product productToAdd, int quantitytoadd) 
{
	if (inventory.products.containsKey(productToAdd)) {
	  inventory.products.put(productToAdd, inventory.products.get(productToAdd) + quantitytoadd );
	} else {
	  inventory.products.put(productToAdd, quantitytoadd);
	}
}



public void removeStockFromInventory( Product productToRemove, int quantityToRemove) 
{
	if(inventory.products.containsKey(productToRemove))
	{
	if(quantityCheck(quantityToRemove>inventory.products.get(productToRemove))
	{
		inventory.products.put(productToRemove, inventory.products.get(productToRemove) - quantityToRemove );
	}
	else if(quantityCheck(quantityToRemove==inventory.products.get(productToRemove))
	{
		
		 inventory.products.put(productToRemove, 0);
	}
	else
	{
		System.out.println("Not enough stock available ");
	}
	
	}
}





}
