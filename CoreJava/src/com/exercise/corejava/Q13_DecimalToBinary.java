package com.exercise.corejava;

public class Q13_DecimalToBinary {

	public static void main(String[] args) {
		/*
		 * Scope:
		 * Convert decimal to binary 
		 * Sample input : 12 
		 * Sample output : 1100
		 */

		int decNumber = 12;
		String binary = "";
		
		System.out.println("Decimal Number = " + decNumber);
		
		do {
			binary = decNumber % 2 + binary;
			decNumber = decNumber / 2;
			
		} while (decNumber != 0);

		System.out.println("Binary Number = " + binary);
		
	}

}
