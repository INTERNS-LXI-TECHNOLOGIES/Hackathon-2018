// @TODO Add java doc comments
package com.nikhil.model;

public class Part {
double price;
String name;
boolean productAvailableInStock;

/**
@override
*/
public void setPrice(double price)
{
	this.price=price;
}
public double getPrice() 
{
	return price;
}



/**
@override
*/
public void setName(String name)
{
this.name=name;	
}
public String getName() 
{
	return name;
}


/**
@override
*/
public void isProductAvailableinStock(boolean productAvailableInStock)
{
	this.productAvailableInStock=productAvailableInStock;
}
public boolean isProductAvailableinStock() 
{
	return productAvailableInStock;
}


}
