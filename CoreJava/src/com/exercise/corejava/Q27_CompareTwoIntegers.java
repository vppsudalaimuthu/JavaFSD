package com.exercise.corejava;

import java.util.Scanner;

public class Q27_CompareTwoIntegers {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter the first number:");
		int num1 = userInput.nextInt();
		
		System.out.print("Enter the second number:");
		int num2 = userInput.nextInt();
		
		if (num1 == num2) {
			System.out.println(num1 + " is equal to " + num2);
		}else if (num1 < num2) {
			System.out.println(num1 + " is less than " + num2);
		}else {
			System.out.println(num1 + " is greater than " + num2);
		}
		
		userInput.close();

	}

}
