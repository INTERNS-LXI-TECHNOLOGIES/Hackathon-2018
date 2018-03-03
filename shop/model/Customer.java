package com.jesily.shop.model;

public class Customer {


	private String name ;
	int cashInHand ;

	public Customer(String name, int cashInHand)
	{
		this.name=name;
		this.cashInHand=cashInHand;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	public void setCashInHand(int cashInHand){
		this.cashInHand=cashInHand;
	}
	public int getCashInHand(){
		return cashInHand;
	}

	


}
