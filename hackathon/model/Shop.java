package model;
import com.silpa.product1.*;
import model.controller.Size;
import model.Customer;
import inventory.Inventory;
import java.util.*;
 public class Shop {

 private String shopName ;
Inventory inventory ;
int totalSales ;
List<Customer> customers ;


InventoryController inventorycontroller;
SaleController  SaleController ;
Scanner scan  = new Scanner(System.in);
inventory = new Inventory();
Customers = new ArrayList<Customer>();
List<Product> products=ArrayList<Product>();
Size size  = new Size();

public void setShopName(String shopName)
{
  shopName = shopName;
}
public String getShopName()
{
return shopName;
}


public static void main(String args[]){

setShopName("SHOP NAME");
System.out.print("******"+getShopName()+"********");
customers.add(new Customer());
customers.get(customers.size()-1).setCustomerDetails();
products.add(new product());
products.get(products.size()-1).productToAddDetails();
size.quantityToInput();


inventory.addStockToInventory(products.get(products.size()-1),size.quantity);
inventory.removeStockFromInventory(products.get(products.size()-1),size.quantity);
System.out.print("Enter the total sales:");
totalSales = scan.nextInt();




//Create Shop
//@Create Customers in Shop
//@Create Inventory in Shopp
//@Conduct sale







}
