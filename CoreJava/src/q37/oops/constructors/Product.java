package q37.oops.constructors;

public class Product {
	
	//encapsulate fields with private modifier
	private long id;
	private String productName;
	private String supplierName;
	
	//default constructor
	Product(){
		id = 0;
		productName = "";
		supplierName = "";
	}
	
	//parameterized constructor
	Product(long id, String productName, String supplierName){
		
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}
	
	//getters and setters for fields / states
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	
	//display the product details
	public void display() {
		System.out.println("Product Details\n--------------");
		System.out.println("Product Id = " + id);
		System.out.println("Product Name = " + productName);
		System.out.println("Supplier Name = " + supplierName);
	}
	

}
