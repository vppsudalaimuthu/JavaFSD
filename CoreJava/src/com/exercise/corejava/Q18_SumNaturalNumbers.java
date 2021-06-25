package com.exercise.corejava;

import java.util.Scanner;

public class Q18_SumNaturalNumbers {

	/*
	 * Scope:
	 * Create a class with a method which can calculate the sum of first n natural
	 * numbers which are divisible by 3 or 5. 
	 * Method Name - calculateSum Argument - int n 
	 * Return Type - int sum 
	 * Logic - Calculate the sum of first n natural numbers which are divisible by 3 or 5.
	 */
	private static int calculateSum(int n) {
		
		int sum = 0;
		
		for (int num = 1; num <= n; num++) {
			
			//check number is divisible by 3 or 5 and add to sum
			if ((num % 3 == 0) || (num % 5 == 0)) {
				sum = sum + num;
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		// Create a Scanner object for user inputs
		Scanner userInput = new Scanner(System.in);

		// Read inputs from user
		System.out.print("Enter Number = ");
		int n = userInput.nextInt();

		System.out.println(
				"Sum of first " + n + " natural numbers which are divisible by 3 or 5  : " + String.valueOf(calculateSum(n)));

	}

}
