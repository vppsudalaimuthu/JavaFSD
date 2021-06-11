package com.exercise.corejava;

public class Q5_NumbersSumInStringArray {

	public static void main(String[] args) {
		/*
		 * Scope:
		 * Find the sum of the numbers in the given input string array
		 * Input:{“2AA”,”12”,”ABC”,”c1a”) Output:6 (2+1+2+1) 
		 * Note in the above array 12 must not considered as such it must be considered as 1,2
		 */
		
		String strArray[] = {"2AA2-1","120","ABC","c1a"};
		String arrayString = "";
		
		int numbersSum = 0;
		
		//traverse each string in array
		for (String string : strArray) {
			//traverse each char in the string
			for (char letter : string.toCharArray()) {
				
				//Get ASCII value of letter 
				int asciiValue = (int)letter;
				
				//Check letter is digit(0 to 9) or not, and sum it if it is digit
				if (asciiValue >= 48 && asciiValue <= 57) {
					numbersSum = numbersSum + (asciiValue - 48);
				}
				
			}
			
			//This just for printing purpose
			arrayString = arrayString + "\"" + string + "\"" + " ";
			
		}
		
		System.out.println("String Array = { " + arrayString +"}");
		System.out.println("Sum of the numbers in the given input string array = " + numbersSum);
	}

}
