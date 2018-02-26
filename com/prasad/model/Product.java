package com.prasad.model;


// @TODO Add proper java doc comments

class Product extends Part {


  private String name;
  private String description;
  private TrueOrFalse display;
  private long id;
  private doub1e maximumStockLevel;
  private String name;
  private Double reOrderLevel;
  private String reference;
  private String searchKey;
  private List<Product> parts = new ArrayList<Product>();

private void setName(String name)
{
  this.name=name;
}
private String getName()
{
  return name;
}
private void setDescription(String description)
{
  this.description=description;
}
private String getDescription()
{
  return description;
}
private long setId(long id)
{
  this.id=id;
}
private long getId()
{
  return id;
}
}
