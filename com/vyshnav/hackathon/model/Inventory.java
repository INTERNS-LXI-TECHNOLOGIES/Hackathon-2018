package com.vyshnav.hackathon.model;
import java.util.ArrayList;
import java.util.List;

// @TODO Add proper java doc comments

public Class Inventory {
	
	public Inventory(int id, String name, int maximumStockLevel, int reOrderLevel, List<Product> productList){
		// code later
	}

    private int id;
	private String name;
    private double maximumStockLevel;
    private double reOrderLevel;
	private List<Product> productList = new ArrayList<Product>();

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
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
	

  //private String description = null;

  //private TrueOrFalse display = null;

  //private String name = null;


  //private String reference = null;

  //private String searchkey = null;




}
