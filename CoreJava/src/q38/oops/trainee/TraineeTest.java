package q38.oops.trainee;

import java.util.Iterator;
import java.util.Scanner;

import q37.oops.constructors.Product;

public class TraineeTest {

	public static void main(String[] args) {

		// Create a Scanner object for user inputs
		Scanner consoleInput = new Scanner(System.in);
		
		System.out.println("Enter number of Trainees");
		int traineeCount = consoleInput.nextInt();
		
		//Create array of Trainee to store all trainee objects
		Trainee[] traineeArray = new Trainee[traineeCount];
		
		//get all Trainee details one by one and store into array
		for (int i = 0; i < traineeCount; i++) {
			
			System.out.println("Enter Details of Trainee-" + (i+1));
			// Read inputs from user
			System.out.println("Enter Employee id");
			long emptId = consoleInput.nextLong();

			System.out.println("Enter Name");
			String empName = consoleInput.next();

			// Create instance of Trainee with parameter constructor
			// And store into Trainee array
			traineeArray[i] = new Trainee(emptId, empName);
		}
		
		//display all Trainee details
		for (Trainee trainee : traineeArray) {
			System.out.println("Details of Trainee: " + trainee.getEmployeeId());
			System.out.println("---------------------------");
			trainee.display();
			System.out.println("");
		}

	}

}
