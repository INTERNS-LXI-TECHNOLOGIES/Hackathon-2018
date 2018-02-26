/**
*author: anjali
*/

package com.anjali.model;
import java.util.*;


// @TODO Add proper java doc comments
/*
*class product implements part interface
*/
public class Product implements Part {

  private String name = null ;
  
  private double price;

  private boolean productAvailableinStock=false;
  
  private String description = null;

  private boolean display = false;

  private long id = 0L;

  private double maximumStockLevel = 0L;

  private double reOrderLevel = 0L;

  private String reference = null;

  private String searchkey = null;

  private List<Part> parts = new ArrayList<Part>();
  
  public void setName(String name){
	  this.name=name;
  }
  
  public void setDescription(String description){
	  this.description=description;
  }
  
  public String getDescription(){
	  return description;
  }
  
  public double getPrice(){
	  return price;
  }
  
  public String getName(){
	  return name;
  }
  
  public boolean isProductAvailableinStock(){
	  return productAvailableinStock;
  }
  

}
