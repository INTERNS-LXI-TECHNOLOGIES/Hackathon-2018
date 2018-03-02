package com.ruhail.TDD;
public class TDD
{
	public static void main(String args[])
	{
		Shop shop=new Shop();
		System.out.println("Enter Shop name");
		Scanner scan=new Scanner(System.in);
		String name=scan.next();
		shop.setShopName(name);
		shop.addInventory();
		System.out.println("Do you want to purchase something...Enter yes");
		String open=scan.next();
		while(open.equals("yes")
		{
			System.out.println("Enter catogory to be purchased");
			String catogory=scan.next();
			System.out.println("Enter item name");
			String itemName=scan.next();	
			double itemPrice=shop.checkAvailability(catogory,itemName);
			System.out.println("can we proceed this transaction...? Enter yes");
			String trans=scan.next();
			if(trans.equals("yes"))
			{
				System.out.println("Are registered customer...Enter yes or No");
				String registered=scan.next();
				if(registered.equals("yes")
				{
					shop.makeTransaction();
				}
				else
				{
					shop.addCustomers();
					shop.makeTransaction(itemPrice);
				}
				System.out.println("Do you need more transaction...Enter yes or no");
				String moreTrans=scan.next()
				if(moreTrans.equals("yes")
				{
					continue;
				}
				else
				{
					break;
				}
			}
		}
		
		

	

	
}