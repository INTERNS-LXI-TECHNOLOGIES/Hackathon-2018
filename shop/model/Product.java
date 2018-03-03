package com.jesily.shop.model;
import java.util.ArrayList;
import com.jesily.shop.model.Part;


// @TODO Add proper java doc comments

public class Product{


  private String name;
  private int quantity;
  private double price;

  private String description;

  private boolean display;

  private int id;
  private double maximumStockLevel;
  private double reOrderLevel;

  private String reference;

  private String searchKey;

  private ArrayList<Product> parts = new ArrayList<Product>();

	public void setName(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}

	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}

	public void setQuantity(int quantity){
		this.quantity=quantity;
	}
	public int getQuantity(){
		return quantity;
	}

	public void setPrice(double price){
		this.price=price;
	}
	public double getPrice(){
		return price;
	}


}
