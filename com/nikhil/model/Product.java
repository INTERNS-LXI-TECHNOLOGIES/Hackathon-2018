package com.nikhil.model ;
import java.util.*;

// @TODO Add proper java doc comments

public class Product extends Part 
{
	 private String name;
	 private String description = null;
	 private boolean display = false;
	 private long id = 0;
	 private double maximumStockLevel = 0;
	 //private String name = null;
	 private double reOrderLevel = 0;
	 private String reference = null;
	 private String searchKey = null;
	 private List<Product> parts = new ArrayList<Product>();
	 public void setName(String name)
	 {
		 this.name=name;	
	 }
	 public String getName() 
	 {
		 return name;
	 }
	 public void setDescription(String description)
	 {
		 this.description=description;	
	 }
	 public String getDescription() 
	 {
		 return description;
	 }
	 public void setDisplay(boolean display)
	 {
		 this.display=display;	
	 }
	 public boolean getDisplay() 
	 {
		 return display;
	 }
	 public void setId(long id)
	 {
		 this.id=id;	
	 }
	 public long getId() 
	 {
		 return id;
	 }
	 public void setMaximumStockLevel(double maximumStockLevel)
	 {
		 this.maximumStockLevel=maximumStockLevel;	
	 }
	 public double getMaximumStockLevel() 
	 {
		 return maximumStockLevel;
	 }
	 public void setReOrderLevel(double reOrderLevel)
	 {
		 this.reOrderLevel=reOrderLevel;	
	 }
	 public double getReOrderLevel() 
	 {
		 return reOrderLevel;
	 }
	  public void setReference(String reference)
	 {
		 this.reference=reference;	
	 }
	 public String getReference() 
	 {
		 return reference;
	 }
	  public void setSearchKey(String searchKey)
	 {
		 this.searchKey=searchKey;	
	 }
	 public String getSearchKey() 
	 {
		 return searchKey;
	 }
	 public void setParts(List<Product> parts)
	 {
		 this.parts=parts;
	 }
	 public List<Product> getParts()
	 {
		 return parts;
	 }
	 

}