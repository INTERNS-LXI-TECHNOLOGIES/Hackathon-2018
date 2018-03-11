package com.vyshnav.hackathon.controller;

public class SalesController {

	public double conductSales(double totalAmount, Shop shop, int inventoryId ,int productId, int cashInHand){
		
		ShopController shopController = new ShopController();
		List<Inventory> inventoryList = shopController.getShopInventoryList(shop);
		InventoryController inventoryController = new InventoryController();
		ProductController productController = new ProductController();
		
		List <Product> productList;

		for (Inventory inventory : inventoryList){
			if(inventoryController.getInventoryId(inventory)==inventoryId){
				for (Product product : inventoryController.getInventoryProductList(inventory)){ 
					if(productController.getProductId(product)==productId){
						if(totalAmount + productController.getProductPrice(product) <= cashInHand){
							System.out.println("\n SALES: ");
							System.out.println("\n Product Name = " + productController.getProductName(product)); 
							System.out.println("\n Product Price = " + productController.getProductPrice(product)); 
							totalAmount = totalAmount + productController.getProductPrice(product); 
							productController.removeProduct(inventory, product);
						}else{
							System.out.println("\n No enough cash in hand ");
						}
					}
				}
			}
		}
		return totalAmount;
	}
	

	public void displayTotalAmount(double totalAmount){
		System.out.println("\n Total Amount = "+totalAmount);
	}

}
