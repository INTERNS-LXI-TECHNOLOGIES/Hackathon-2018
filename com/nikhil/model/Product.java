package com.nikhil.model ;
import java.util.*;

// @TODO Add proper java doc comments

class Product extends Part {


  private String name = null ;


  private String description = null;

  private TrueOrFalse display = null;

  private long id = 0;



  private double maximumStockLevel = 0;


  //private String name = null;

  private Double reOrderLevel = null;

  private String reference = null;

  private String searchkey = null;

  private List<Product> parts = new ArrayList<Product>();

 public double isProductAvailableinStock()
 {
	return 0;
 }
 public String getName()
 {
	 return null;
 }
 public double getPrice()
 {
	return 0; 
 }
 
 
}