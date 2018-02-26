/**
*author: anjali
*/

package com.anjali.controller;
import com.anjali.model.*;

public class InventoryControllerImpl extends InventoryController{

public void addStockToInventory(Product productToAdd, int quantitytoadd,Inventory inventory){
	inventory=new Inventory();
	for(int i=0;i<quantitytoadd;i++){
		inventory.setProduct(productToAdd);
	}
//	inventory.product.maximumStockLevel=inventory.product.maximumStockLevel+quantitytoadd;

}

public void removeStockFromInventory( Product productToRemove, int quantityToRemove){
	
	
}


}