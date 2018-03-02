package model.controller;
import java.util.*;
class Size
{
	
	
	
	private int quantity;
    Scanner scan = new Scanner(System.in);
    	
	public void setQuantity(int quantity)
	{
		quantity = quantity;
	}
	public int getQuantity()
	{
		return quantity;
	}
	
	public void quantityToInput()
	{
		System.out.print("Quantity:");
		setQuantity(scan.nextInt());
		
	}
	
	
}