
import java.util.ArrayList;
public class InventoryController {


ArrayList<Product> inventory=new ArrayList<Product>();

public ArrayList<Product> addStockToInventory( Product product){
	
inventory.add(product);	
	
	return inventory;
}

public void removeStockFromInventory( Product product){
	
	inventory.remove(product);
	
}






}
