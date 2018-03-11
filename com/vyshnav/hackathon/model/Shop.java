package com.vyshnav.hackathon.model;

//import java.util.ArrayList;
import java.util.List;

public class Shop {
	
	private List<Inventory> inventoryList = new ArrayList<Inventory> inventoryList;
	private List<Customer> customerList = new ArrayList<Customer> customerList;
	
	public List<Inventory> getInventoryList() {
		return inventoryList;
	}
	public void setInventoryList(List<Inventory> inventoryList) {
		this.inventoryList = inventoryList;
	}
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}	

}
