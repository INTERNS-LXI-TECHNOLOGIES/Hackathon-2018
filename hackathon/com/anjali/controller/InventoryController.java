/**
*author: anjali
*/

package com.anjali.controller;
import java.util.*;
import com.anjali.model.*;

public abstract class InventoryController {


List<Inventory> inventory ;

public abstract void addStockToInventory( Product productToAdd, int quantitytoadd,Inventory inventory) ;

public abstract void removeStockFromInventory( Product productToRemove, int quantityToRemove) ;


}
