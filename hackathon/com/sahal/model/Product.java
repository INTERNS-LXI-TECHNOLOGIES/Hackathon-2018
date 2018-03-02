package com.sahal.model ;
import java.util.*;


// @TODO Add proper java doc comments

Class Product extends Part {
	



  private String description = null;

  private boolean display = null;

  private Long id = null;



  private Double maximumStockLevel = null;

  private Double reOrderLevel = null;

  private String reference = null;

  private String searchkey = null;

  public void setName(String name)
  {
	  this.name=name;
  }
   public void setPrice(Double price)
  {
	  this.price=price;
  }
   public void setProductAvailableinStock(Boolean productAvailableinStock)
  {
	  this.productAvailableinStock=productAvailableinStock;
  }
  public String getName()
  {
	  return name;
  }
   public Boolean getProductAvailableinStock()
  {
	  return productAvailableinStock
  }
   public String getPrice()
  {
	  return price;
  }
     public Long getId()
  {
	  return id;
  }
  
  public void setId(Long id)
  {
	  this.id=id;
  }
  
  
  
  
  
  
  
  
  
  



}
