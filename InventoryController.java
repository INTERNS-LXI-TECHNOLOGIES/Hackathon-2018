import java.util.*;
public class InventoryController {

ArrayList<Product> inventory=new ArrayList<>() ;
ArrayList<Integer> size=new ArrayList<>();

public void addStockToInventory( Product productToAdd, int quantitytoadd) 
{
inventory.add(productToAdd);
size.add(quantitytoadd);
}

//public void removeStockFromInventory( Product productToRemove, int quantityToRemove) ;
}