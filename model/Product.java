package com.yourname.modulename ;


// @TODO Add proper java doc comments

public class Product extends Part 
{

  private String name = null ;
  private String description = null;
  private boolean display = null;
  private long id = null;
  private double maximumStockLevel = null;
  //private String name = null;
  private double reOrderLevel = null;
  private String reference = null;
  private String searchkey = null;
  private ArrayList<Product> parts = new ArrayList<Product>();

  public void setName(String name)
  {
	  this.name = name;
  }
  public String getName()
  { 
	  return name;
  }
  public void setDescription(String description)
  {
	  this.description = description;
  }
  public String getDescription()
  {
	  return description;
  }
  public void setDisplay(boolean display)
  {
	  this.display = display;
  }
  public boolean getDisplay()
  {
	  return display;
  }
  public void setId(long id)
  {
	  this.id = id;
  }
  public long getId()
  {
	  return id;
  }
  public void setMaximumStockLevel(double maximumStockLevel)
  {
	  this.maximumStockLevel = maximumStockLevel;
  }
  public double getMaximumStockLevel()
  {
	  return maximumStockLevel;
  }
  public void setReOrderLevel(double reOrderLevel)
  {
	  this.reOrderLevel = reOrderLevel;
  }
  public double getReOrderLevel() 
  {
	  return reOrderLevel;
  }
  public void setReference(String reference)
  {
	  this.reference = reference;
  }
  public String getReference()
  {
	  return reference;
  }
  public void setSearchKey(String searchKey)
  {
	  this.searchKey = searchKey;
  }
  public String getSearchKey()
  {
	  return searchKey;
  }
  public 
}
