package com.ruhail.Inventory;


 @TODO Add proper java doc comments

public class Inventory {

  private String name = null ;

  private String description = null;

  private long id = null;

  private List<Product> products = new ArrayList<Product>();
  
  public void setName(String iName)
  {
	  this.name=iName;
  }
  public String getName()
  {
	  return this.name;
  }
  public void setDescription(String iDescription)
  {
	  this.description=iDescription;
  }
  public String getDescription()
  {
	  return this.description;
  }
  public void setId(long iId)
  {
	  this.id=iId;
  }
  public long getId()
  {
	  return this.id;
  }
  
 /* public void setCurrentStock()
  {
	  this.currentStock=maximumStockLevel;
  }
  public int getCurrentStock()
  {
	  return this.currentStock;
  }*/)

}
