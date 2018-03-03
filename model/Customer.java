import java.util.Scanner;
import java.util.ArrayList;
public class Customer 
{

	String name ;
	int cashInHand ;
	Scanner scan = new Scanner(System.in);

	public void input()
	{
		System.out.println("--Customer Details--");
		System.out.println("Name :");
		name = scan.nextLine();
		System.out.println("Cash in your hand :");
		cashInHand =  scan.nextInt();
	}
}
