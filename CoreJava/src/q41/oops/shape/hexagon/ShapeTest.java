package q41.oops.shape.hexagon;

import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		// Get user inputs
		System.out.println("1.Rectangle 2.Square 3.Circle 4.Hexagon Area Calculator --- Choose your shape");
		int shapeOption = userInput.nextInt();

		Shape shape;
		switch (shapeOption) {
		case 1:
            System.out.print("Enter length and breadth:");
            int length = userInput.nextInt();
            int breadth = userInput.nextInt();
            shape = new Rectangle(length, breadth);
			break;
		case 2:
			System.out.print("Enter Side:");
            int side = userInput.nextInt();
            shape = new Square(side);
			break;
		case 3:
			System.out.print("Enter Radius:");
            int radius = userInput.nextInt();
            shape = new Circle(radius);
			break;
		case 4:
			System.out.print("Enter Side:");
            int sideA = userInput.nextInt();
            shape = new Hexagon(sideA);
			break;	
		default:
			shape = null;
			break;
		}
		
		userInput.close();
		
		if (shape != null) {
			Double area = shape.calculateArea();
			System.out.println("Area of " + shape.shapeName + " is:"+ Math.round(area* 100.0) / 100.0);
		}else {
			System.out.println("Invalid Option, Try(Run) Again.");
		}

	}

}
