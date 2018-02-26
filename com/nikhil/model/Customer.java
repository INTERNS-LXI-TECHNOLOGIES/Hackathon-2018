package com.nikhil.model;
public class Customer {
private String name ;
private int cashInHand ;
public void setName(String name)
{
	this.name=name;
}
public void setCashInHand(int cashInHand)
{
	this.cashInHand=cashInHand;
}
public String getName()
{
	return name;
}
public int getCashInHand()
{
	return cashInHand;
}
}
