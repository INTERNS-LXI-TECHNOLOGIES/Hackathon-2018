package com.prasad.model;
import java.util.*;

// @TODO Add proper java doc comments

public class Product implements Part {


  private String name;
  private String description;
  private TrueOrFalse display;
  private long id;
  private double maximumStockLevel;
 // private String name;
  private Double reOrderLevel;
  private String reference;
  private String searchKey;
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
  this.searchKey = searchKey;
}
public double isProductAvailableinStock()
{
return 0;
}
public double getPrice()
{
return 0;
}
public String toString()
{
	return id+"\n"+name+"\n"+description;
	
}
}
