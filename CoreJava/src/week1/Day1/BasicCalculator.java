package week1.Day1;

public class BasicCalculator {

	public static void main(String[] args) {

		//Scope : Get Two arguments from users through command line / run configurations... window
		//        Do basic arithmetic operations on args
		
		//Get String args and convert into Integer values for arithmetic calculation
		
		Integer num1 = Integer.parseInt(args[0]);
		Integer num2 = Integer.parseInt(args[1]);
		
		//Displayed basic arithmetic operations result 
		System.out.println("Basic Calculator");
		System.out.println("================");
		System.out.println("Addition : " + args[0] + " + " + args[1] + " = " + (num1 + num2));
		System.out.println("Subtraction : " + args[0] + " - " + args[1] + " = " + (num1 - num2));
		System.out.println("Multiplication : " + args[0] + " * " + args[1] + " = " + (num1 * num2));
		System.out.println("Division : " + args[0] + " / " + args[1] + " = " + (num1 / num2));

	}

}
