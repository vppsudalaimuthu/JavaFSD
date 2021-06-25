package q40.oops.shape;

import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		// Get user inputs
		System.out.println("1.Rectangle 2.Square 3.Circle Area Calculator --- Choose your shape");
		int shapeOption = userInput.nextInt();

		Shape shape;
		switch (shapeOption) {
		case 1:
            System.out.println("Enter length and breadth:");
            int length = userInput.nextInt();
            int breadth = userInput.nextInt();
            shape = new Rectangle(length, breadth);
			break;
		case 2:
			System.out.println("Enter Side:");
            int side = userInput.nextInt();
            shape = new Square(side);
			break;
		case 3:
			System.out.println("Enter Radius:");
            int radius = userInput.nextInt();
            shape = new Circle(radius);
			break;
		default:
			shape = null;
			break;
		}
		
		if (shape != null) {
			Double area = shape.calculateArea();
			System.out.println("Area of " + shape.shapeName + " is:"+ Math.round(area* 100.0) / 100.0);
		}else {
			System.out.println("Invalid Option, Try(Run) Again.");
		}

	}

}
