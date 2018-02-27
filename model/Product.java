

// @TODO Add proper java doc comments

package com.lxi.hackathon.model;
import java.util.List;
import java.util.ArrayList;
import com.lxi.hackathon.model.Part;
public class Product implements Part {
  private String name;
  private String description;
  private boolean display;
  private long id;
  private double maximumStockLevel;
  private Double reOrderLevel = 0.0;
  private String reference;
  private String searchkey;
  //private List<Product> parts = new ArrayList<Product>();

  public Product(String name, String description, boolean display, long id, double maximumStockLevel, String reference, String searchkey) {
      this.name = name;
      this.description = description;
      this.id = id;
      this.maximumStockLevel = maximumStockLevel;
      this.reference = reference;
      this.searchkey =searchkey;
  }

  public String toString() {
      return ""+this.name;
  }

  public long getId() {
      return this.id;
  }

  public double getPrice() {
      return 0.0;
  }

  public String getName() {
      return "check";
  }

  public double isProductAvailableinStock() {
      return 0.0;
  }

}
