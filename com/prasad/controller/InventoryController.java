package com.prasad.controller;
import java.util.*;
import com.prasad.model.*;
public interface InventoryController {


public List<Product> inventory = null;


//@override
void addStockToInventory( Product productToAdd, int quantitytoAdd) ;


//@override
void removeStockFromInventory( Product productToRemove, int quantityToRemove) ;






}
