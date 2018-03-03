package 26Feb.config;
import java.util.Scanner;
public class Configuration
{
	String appName="Inventory Shoppie";
	String address;
	String street;
	String district;
	String state;
	String country;
	
	public void inputDetails()
	{
		System.out.print(appName);
		System.out.print("Address :");
		address = scan.nextLine();
		System.out.print("Street :");
		street = scan.nextLine();
		System.out.print("District :");
		district = scan.nextLine();
		System.out.print("State :");
		state = scan.nextLine();
		System.out.print("Country :");
		country = scan.nextLine();
	}
} 