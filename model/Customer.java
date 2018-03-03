public class Customer {
	
private String name ;
private int cashInHand ;

public void setCustomerName(String name)
{
	this.name=name;
}
public String getCustomerName()
{
	return name;
}
public void setCustomerCashInHand(int cashInHand)
{
	this.cashInHand=cashInHand;
}
public void createCustomer()
{
	System.out.println("Enter the customer name: ");
	name=scan.next();
	System.out.println("Enter the cash in hand : ");
	cashInHand=scan.nextInt();
public void printCustomer()
{
	System.out.println(" The customer name is : ");
	System.out.println(" cash in hand is : ");
}	
}


}
