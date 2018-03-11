package com.vyshnav.hackathon;

import java.util.Scanner;

public class Test {		

	public static void main(String[] args) {
	
		ShopController shopController = new ShopController();
		int code;
		boolean quit = false;
		Scanner scanner = new Scanner (System.in);
		String choice;
		
		while(quit==false) {
			//display code table to choose from
			shopController.displayCodes();
			System.out.println("\n Enter required code: ");
			code = scanner.nextInt();
			
			if(code==1){				
				shopController.displayInventoryList();			
			} else if (code==2){			
				shopController.createInventory();				
			} else if (code==3){				
				shopController.createProduct();				
			} else if (code==4){				
				shopController.createCustomer();				
			} else if (code==5){				
				shopController.conductSales();				
			} else {
				System.out.println("\n Enter correct code");
			}
			
			System.out.println("\n Do you want to play again? (yes/no)");
			choice = scanner.next();	
			if (choice.equals("yes")){
				quit=false; 
			} else {
				quit = true; 
			}
		}
		scanner.close();
	}
}