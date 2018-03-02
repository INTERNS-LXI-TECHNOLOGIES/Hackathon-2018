import java.util.*;
public class Shop{

String shopName ;
InventoryController inventorycontroller ;
int totalSales ;
ArrayList<Customer> customers=new ArrayList<>() ;

Scanner s=new Scanner(System.in);
SaleController saleController ;


public void createCustomers()
{
System.out.println("how many cus");
int cusNumber=s.nextInt();
for(int i=0;i<cusNumber;i++)
{
System.out.println("name of "+(i+1)+ "cusomer ");
String name=s.next();

System.out.println("casshinHand "+(i+1)+ "cusomer ");
int cash=s.nextInt();
customers.add(new Customer(name,cash));
}

}
public void createInventory(){
List<Product> parts = new ArrayList<Product>();
inventorycontroller=new InventoryController();

System.out.println(" how many product");
int productNum=s.nextInt();
for(int i=0;i<productNum;i++)
{

System.out.println("product name");
String name=s.next();
System.out.println("product price");
double price=s.nextInt();
parts.add(new Product(name,price));
System.out.println("product quantity");
int productQuantity=s.nextInt();
inventorycontroller.addStockToInventory(parts.get(i),productQuantity);
}


}

public void createSale(){
int more;
SaleController sc=new SaleController();
ArrayList<Product>products=inventorycontroller.inventory;
for(int i=0;i<products.size();i++)
{
System.out.println((i+1)+" "+products.get(i).getName());
}
do
{
System.out.println("choose any");
int choose=s.nextInt();
System.out.println("choose quantity");
int quantity=s.nextInt();
double amount=sc.sell(products.get(choose),quantity);
System.out.println("amount "+amount);
System.out.println("want more? 1.yes 2.no");
more=s.nextInt();

}while(more==1);
 double totalAmount=sc.totalAmount();
System.out.println("totalAmount "+totalAmount);

}
}
