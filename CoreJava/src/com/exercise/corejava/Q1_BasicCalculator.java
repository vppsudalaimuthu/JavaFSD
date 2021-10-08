package com.exercise.corejava;

public class Q1_BasicCalculator {

	public static void main(String[] args) {
		//Scope : Get Two arguments from users through command line / run configurations... window
				//        Do basic arithmetic operations on args
				
		//Add this line by other user to check git process
		//Add one more line for Git testing
				//Get String args and convert into Integer values for arithmetic calculation
				//Added comment for git checking
				
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
