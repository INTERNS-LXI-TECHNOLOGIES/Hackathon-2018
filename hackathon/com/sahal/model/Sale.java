class Sale
{
	Product saleProduct= new Product();
	Double amount;
	int quantity;
	
	public Sale(Product saleProduct,Double amount,int quality)
	{
		this.saleProduct=saleProduct;
		this.amount=amount;
		this.quality=quality;
	}
	
}