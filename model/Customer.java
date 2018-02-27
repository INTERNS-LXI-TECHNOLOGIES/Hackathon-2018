package com.lxi.hackathon.model;
public class Customer {
private String name ;
private int cashInHand ;

public Customer(String name, int cashInHand) {
    this.name = name;
    this.cashInHand = cashInHand;
}
public String getName() {
    return this.name;
}

public int getCashInHand() {
    return this.cashInHand;
}

public String toString() {
    return ""+this.name+","+this.cashInHand;
}

}
