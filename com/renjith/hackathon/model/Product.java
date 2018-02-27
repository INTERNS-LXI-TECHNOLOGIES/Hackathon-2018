
import java.util.ArrayList;
import java.util.List;
public class Product extends Part {


  private String name;

  private String description;
  
  private int qnty;
  

 // private Boolean display = null;

  private Long id;
public void setQnty(int qnty){
	this.qnty=qnty;
}

public int getQnty(){
	return qnty;
}

public void setName(String name){
	
	this.name=name;
	
}

public String getName(){
	return name;
}

public void setDescription(String description){
	
	this.description=description;
	
}

public String getDescription(){
	return description;
}

public void setId(Long id){
	this.id=id;
}

public Long getId(){
	return id;
}
 // private Doub1e maximumStockLevel = null;


 // private String name = null;

 // private Double reOrderLevel = null;

 // private String reference = null;

  //private String searchkey = null;

  private ArrayList<Product> parts = new ArrayList<Product>();
  
 // public void setParts()
  
 public int getPrice() {
	 int y=1;
	 return y;
 }


 public int isProductAvailableinStock() {
	int x=2; 
	 
	return x; 
 }





}
