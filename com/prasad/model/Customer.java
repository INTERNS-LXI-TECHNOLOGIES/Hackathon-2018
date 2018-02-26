package com.prasad.model;
class Customer {


private String name ;
private int cashInHand ;

public Customer(String name)
{
	this.name=name;
}
public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}
public void setCashInHand(int cashInHand)
{
	this.cashInHand=cashInHand;
}

public int getCashInHand()
{
	return cashInHand;
}
}
