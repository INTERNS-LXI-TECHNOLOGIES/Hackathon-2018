public class Shop 
{

	String shopName ;
	Inventory inventory ;
	int totalSales ;
	List<Customer> customers = new List <Customer>();


	InventoryController inventorycontroller;
	SaleController  SaleController ;


	public static void main(String args[])
	{
		customers = new Customers(); 
		customers.input();
		//Create Shop
		//@Create Customers in Shop
		//@Create Inventory in Shopp
		//@Conduct sale 
	}
}

