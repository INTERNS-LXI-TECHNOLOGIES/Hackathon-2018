package com.ruhail.Product;
@TODO Add java doc comments


public class Product {

private String name;
private double price;
private boolean productAvailableInStock;

@override
public void setName(String pName)
{
	this.name=pName;
}
public String getName()
{
	return this.name;
}

@override
public void setPrice(double pPrice)
{
	this.price=pPrice;
}
public double getPrice()
{
	return this.price;
}

@override
public void setProductAvailableInStock(boolean pProductAvailableInStock)
{
	this.productAvailableInStock=pProductAvailableInStock;
}
public boolean isProductAvailableInStock()
{
	return this.productAvailableInStock;
} 


}
