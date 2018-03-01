
public class SaleController {

public void amountSell(Product productShopped) {
	System.out.println("customer shopped");
System.out.println("customer shopped for an amount of "+productShopped.getPrice());	
	totalAmount(productShopped.getPrice());
}


public void totalAmount(int price){

	System.out.println("total amount costs"+price);
}







}
