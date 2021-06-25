package com.exercise.corejava;

import java.util.Scanner;

public class Q19_CalculateDiff {
    
	/*
	 * Scope:
	 * Create a class with a method to find the difference between the sum of the
	 * squares and the square of the sum of the first n natural numbers. 
	 * Method Name - calculateDifference Argument - int n Return Type - int sum
	 * 
	 * Logic - Find the difference between the sum of the squares of the first n
	 * natural numbers and the square of their sum. 
	 * For Example if n is 10,you have to find (1^2+2^2+3^2+….9^2+10^2)- (1+2+3+4+5… +9+10)^2
	 */
	private static int calculateDifference(int n) {
	
		int sumOfSquares = 0;
		int squareOfSum = 0;
			
		//find Sum of square of ‘n’ natural numbers (formula : (n(n+1)(2n+1))/6)
		sumOfSquares = (n * (n + 1) * (2 * n + 1))/6;
		
		//find sum of the first n natural numbers (formula : n(n+1)/2 )
		squareOfSum = n * (n + 1) / 2;
		
		//square of their sum
		squareOfSum = squareOfSum * squareOfSum;
		
		System.out.println("Sum of square of first " + n + " natural numbers = " + sumOfSquares);
		System.out.println("Square of sum of first " + n + " natural numbers = " + squareOfSum);
		
		return Math.abs(sumOfSquares - squareOfSum);
		
	}
	
	public static void main(String[] args) {
		
		// Create a Scanner object for user inputs
		Scanner userInput = new Scanner(System.in);

		// Read inputs from user
		System.out.print("Enter Number = ");
		int n = userInput.nextInt();
		
        System.out.println("Difference of above sums = " + String.valueOf(calculateDifference(n)));
	}

}
