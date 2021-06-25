package q36.oops.instance;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		
		// Create a Scanner object for user inputs
		Scanner userInput = new Scanner(System.in);

		// Read inputs from user
		System.out.println("Enter the product id");
		long productId = userInput.nextLong();
		
		System.out.println("Enter the product name");
		String productName = userInput.next();
		
		System.out.println("Enter the supplier name");
		String supplierName = userInput.next();
		
		//Create instance of Product 
		Product product = new Product();
		
		//set the values into Product instance using setter methods
		product.setId(productId);
		product.setProductName(productName);
		product.setSupplierName(supplierName);
		
		//Get the product details using getter methods and display
		System.out.println("Product Id : " + product.getId());
		System.out.println("Product Name : " + product.getProductName());
		System.out.println("Supplier Name : " + product.getSupplierName());
				

	}

}
