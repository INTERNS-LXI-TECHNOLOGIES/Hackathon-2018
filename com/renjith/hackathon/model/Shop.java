
import java.util.Scanner;
import java.util.ArrayList;
public class Shop {

String shopName ;
int totalSales ;
ArrayList<Customer> customers;
Scanner scanner=new Scanner(System.in);
ArrayList<Product> inventory;

InventoryController controller;
SaleController  saleController ;

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
public String toString() {
	return shopName;
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
System.out.println("Enter the price of the product");
pdct.setPrice(scanner.nextInt());
inventory=controller.addStockToInventory(pdct);
}
}
public void conductSale(){
	
//System.out.println("Work in progress");
saleController=new SaleController();
System.out.println("choose your customer");
for(int i=0;i<customers.size();i++)
{
	int g=i+1;
	System.out.println(g+"Customer name ="+customers.get(i).name+"\t"+"Amount ="+customers.get(i).cashInHand+"\n");
}
int j=scanner.nextInt();
System.out.println("Your current customer is"+customers.get(j-1).name+"\t"+"Amount="+customers.get(j-1).cashInHand);

System.out.println("choose your product");
for(int f=0;f<inventory.size();f++)
{
	int h=f+1;
	System.out.println(h+"product name ="+inventory.get(f).getName()+"\t"+"price="+inventory.get(f).getPrice()+"\n");
}
int k=scanner.nextInt();
System.out.println("Selected product is"+inventory.get(k-1).getName()+"\t"+"price="+inventory.get(k-1).getPrice());
saleController.amountSell(inventory.get(k));
controller.removeStockFromInventory(inventory.get(k));

}


}


//Create Shop
//@Create Customers in Shop
//@Create Inventory in Shopp
//@Conduct sale 













