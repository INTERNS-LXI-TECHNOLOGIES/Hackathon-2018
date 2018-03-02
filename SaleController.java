public class SaleController {

double totalAmount;

public double sell(Product productShopped,int quantity) 
{
double amount=((productShopped.getPrice())*quantity);
totalAmount=totalAmount+amount;
return amount;
}

double totalAmount(){
return totalAmount;
}







}
