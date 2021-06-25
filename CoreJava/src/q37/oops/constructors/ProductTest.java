package q37.oops.constructors;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {

		// Create a Scanner object for user inputs
		Scanner consoleInput = new Scanner(System.in);

		// Read inputs from user
		System.out.println("Enter the product id");
		long productId = consoleInput.nextLong();

		System.out.println("Enter the product name");
		String productName = consoleInput.next();

		System.out.println("Enter the supplier name");
		String supplierName = consoleInput.next();

		// Create instance of Product with parameter constructor
		Product product = new Product(productId, productName, supplierName);

		// display product details
		product.display();

	}

}
