package com.ruhail.Shop;
public class Shop {

String shopName ;
List<Inventory> inventory = new ArrayList<Inventory>();
int totalSales ;
List<Customer> customers = new ArrayList<Customer>();

public void setShopName(String sShopName)
{
	this.shopName=sShopName;
}
public String getShopName()
{
	return this.shopName;
}

/*public void setInventory(List<Inventory> inv)
{
	inventory=inv;
}
public <Inventory> getInventory()
{
	return inventory;
}*/

public void setTotalSales(int sTotalSales)
{
	this.totalSales=sTotalSales;
}
public String getTotalSales()
{
	return this.totalSales;
}

public void setCustomers(Customer sCustomer)
{
	customers.add(sCustomer);
}
public List<Customer> getCustomers()
{
	return cutomers
}


public void addInventory()
{
	System.out.println("Enter iventory Details");
	System.out.println("- - - - - - - - - - - - ");
	System.out.println("Enter how many inventories do you want to add");
	int num1=scan.nextInt();
	for(int i=0;i<num1;i++)
	{
		Inventory inv=new Inventory()
		System.out.println("Enter the Inventory name");
		String iName=scan.next();
		inv.setName(iName);
		System.out.println("Enter descriptionof this inventory");
		String iDes=scan.nextln();
		inv.setDescription(iDes);
		System.out.println("Enter Id of this inventory");
		int id=scan.nextInt();
		inv.setId(id);
		System.out.println("Do you want to add how many of this type to be added");
		int num2=scan.nextInt();
		for(int j=0;j<num2;j++)
		{
			Product prod=new Product();
			System.out.println("Enter the name of product");
			String pName=scan.next();
			prod.setName(pName);
			System.out.println("Enter the price of product");
			double pPrice=Double.parseDouble(scan.next());
			prod.setPrice(pName);
			prod.setProductAvailableInStock(true);
			inv.products.add(prod);
		}
		inventory.add(inv);
			
	}
}
public double chechAvailability(String catogory,String item)
{
	for(Inventory i:inventory)
	{
		String catog=i.getName();
		if(catog.equals(catogory))
		{
			for(Product j:i.products)
			{
				String ite=j.getName();
				if(ite.equals(item)
				{
					System.out.println("The requested itemis available");
					System.out.println("The price is :"+j.getPrice);
					return j.getPrice();
				}
			}
		}
	}
}
public void addCustomers()
{
	Customer cust=new Customer();
	System.out.println("Enter Your name");
	String cName=scan.next();
	cust.setName(cName);
	System.out.println("Enter Cash in hand");
	int cash=scan.nextInt();
	cust.setCashInHand(cash);
	customers.add(cust);
}
public void makeTransaction(double price)
{
	int j=1;
	while(j<5)
	{
	System.out.println("Enter your name for verification");
	String veriName=scan.next();
	int i=1;
	for(Customer c: customers)
	{
		if((c.getName()).equals(veriName))
		{
			if(price<c.getCashInHand())
			{
				double cash=c.getCashInHand()-price;
				c.setCashInHand(cash);
				break outer;
			}
			else
			{
				System.out.println("In sufficient Balance");
			}
		}
		i++;
	}
	int siz=customers.size();
	if(siz<i)
	{
		System.out.println("The entered name is incorrect");
	}
	j++;
	}
	outer:System.out.println("your transaction completed");
}



}





}
