
import java.util.Scanner;
import java.util.ArrayList;
public class Shop {

String shopName ;
int totalSales ;
ArrayList<Customer> customers;
Scanner scanner=new Scanner(System.in);

InventoryController controller;
//static SaleController  salecontroller ;

public Shop() {

this.shopName="Pavizham Supermarket";
addCustomers();
createInventory();
conductSale();

}


public ArrayList<Customer> addCustomers() {
 customers=new ArrayList<Customer>(); ;

		for(int i=0;i<5;i++)
		{
		System.out.println("Enter the name of your customer");
		String name=scanner.next();
		System.out.println("Enter the total amount with your customer");
		int cash=scanner.nextInt();
		customers.add(new Customer(name,cash));	
        }
		return customers;
}	
public String toString(String name) {
	return name;
}
public void createInventory(){

controller= new InventoryController();
for(int i=0;i<5;i++)
{
Product pdct=new Product();
System.out.println("Enter your product name");
pdct.setName(scanner.next());
System.out.println("Enter the qnty of the product");
pdct.setQnty(scanner.nextInt());
controller.addStockToInventory(pdct);
}
}
public void conductSale(){
	
System.out.println("Work in progress");


}


}


//Create Shop
//@Create Customers in Shop
//@Create Inventory in Shopp
//@Conduct sale 













