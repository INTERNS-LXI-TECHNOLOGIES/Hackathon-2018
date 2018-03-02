package com.silpa.product1;
import java.util.*;

// @TODO Add proper java doc comments

Class Product extends Part {


  private String reference = null;
  private double reOrderLevel = null;
  private doub1e maximumStockLevel = null;
  private long int id = 0;
  private string name = null ;
  private String searchkey = null;
  private String description = null;
  private boolean display = null;
  private boolean isProductAvailableinStock=false;
  
  Scanner scan = new Scanner(System.in);
  private List<Product> parts = new ArrayList<Part>();
  
  public void setPart(ArrayList<Part> parts)
  {
	  parts = parts;
  }
  public ArrayList<Part> getPart()
  {
	  return parts;
  }
  
  
  
  
  public void setDescription(String description)
{
description = description;
}
public String getDescription()
{
return description;
}
public void setDisplay(boolean display)
{
display = display;
}
public boolean getDisplay()
{
return display;
}



public void setId(long int id)
{
id = id;
}
public long int getId()
{
return id;
}
public void setMaximumStockLevel(double maximumStockLevel)
{
maximumStockLevel = maximumStockLevel;
}
public double getMaximumStockLevel()
{
return maximumStockLevel;
}


  

public void setReOrderLevel(double reOrderLevel)
{
reOrderLevel = reOrderLevel;
}
public double getReOrderLevel()
{
return reOrderLevel;
}


public void setReference(String reference)
{
 reference = reference;
}
public String getReference()
{
return refernce;
}

public void setSearchKey(String searchkey)
{
searchkey = searchkey;
}
public String getSearchkey()
{
return searchkey;
}

public void setPrice(double price)
{
	price=price;
}
public void setName(String name)
{
	name = name;
}


public double getPrice()
{
return price;
}
public String getName() 
{
return name;

}
public boolean isProductAvailableinStock() 
{
return true;
}

public void productToAddDetails()
{
	System.out.print("product name:");
	setName(scan.next());
	System.out.print("price:");
	setPrice(scan.nextInt());
}



}
