package com.sahal.test;

import java.util.*;
class Tdd
{
public static void main(String args[]){

//Scanner scan=new Scanner(System.in);
//int flag=true;
//Create Shop
Shop shop=new Shop();
//@Create Customers in Shop
shop.customers.add(new Customer());

//@Create Inventory in Shopp
shop.inventory=new Inventory();
shop.inventoryController=new InventoryController();
shop.inventoryController.inventory=shop.inventory;

shop.saleController=new SaleController();

//@Conduct sale 



}

}