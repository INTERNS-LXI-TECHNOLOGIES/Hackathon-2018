package com.vyshnav.hackathon.model;
import java.util.ArrayList;
import java.util.List;

public Class Inventory {
	
	public Inventory(){}
	
	public Inventory(int id, String name, int maximumStockLevel, int reOrderLevel, List<Product> productList){
		this.id = id;
		this.name = name;
		this.maximumStockLevel = maximumStockLevel;
		this.reOrderLevel = reOrderLevel;
		this.productList = productList;
	}

    private int id;
	private String name;
    private double maximumStockLevel;
    private double reOrderLevel;
	private List<Product> productList;

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getMaximumStockLevel(){
		return maximumStockLevel;
	}
	public void setMaximumStockLevel(int maximumStockLevel){
		this.maximumStockLevel = maximumStockLevel;
	}	
	public int getReOrderLevel(){
		return reOrderLevel;
	}
	public void setReOrderLevel(int reOrderLevel){
		this.reOrderLevel = reOrderLevel;
	}
	public List<Product> getProductList(){		
		return productList;
	}
	public void setProductList(List<Product> productList){
		this.productList = productList;
	}
}
