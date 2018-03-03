package com.jesily.shop.test;
import com.jesily.shop.model.Shop;
import java.util.Scanner;

public class Tdd{
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		Shop shop=new Shop();
		
	System.out.println("enter the shop name");
	shop.setName(scan.next());
	
	System.out.println("welcome to "+shop.getName());
	shop.start();
		
	}
	
	
	
	
	
	
	
}