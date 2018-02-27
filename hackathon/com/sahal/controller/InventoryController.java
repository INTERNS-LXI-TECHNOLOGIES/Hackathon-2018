package com.sahal.model;
class InventoryControll {
	


Inventory inventory;

public void addStockToInventory( Product productToAdd, int quantitytoadd) 
{
	for(int i=0;i<quantitytoadd;i++){
	this.inventory.products.add(productToAdd);
	}
}



public void removeStockFromInventory( Product productToRemove, int quantityToRemove) 
{
	
	if(quantityCheck)
	{
		
	}
}
private int quantityCheck(Product product)
{
	int count=0;
	for(int i=0;i<inventory.product.size();i++){
	if(product.getId==inventory.product.get(i).getId)
	{
		count++;
	}
	}
	return count;
}





}
