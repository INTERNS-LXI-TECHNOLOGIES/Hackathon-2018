package com.vyshnav.hackathon.model;

public class Customer {
	
	public Customer(){}

	private int id;
	private String name;
	private int cashInHand;

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName() {
		this.name = name;
	}
	public int getCashInHand() {
		return cashInHand;
	}	
	public void setCashInHand(int cashInHand) {
		this.cashInHand = cashInHand;
	}

}
