package hackathon.model;
import java.util.*;
class Customer {


String name ;
int cashInHand ;
Scanner scan = new Scanner(System.in);

public void setCustomerDetails()
{
System.out.print("Enter your name:");
name = scan.nextInt();
System.out.print("Enter your budget:");
cashInHand = scan.nextInt();
}


}
