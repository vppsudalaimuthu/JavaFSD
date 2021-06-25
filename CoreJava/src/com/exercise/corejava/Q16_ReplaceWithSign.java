package com.exercise.corejava;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class Q16_ReplaceWithSign {

	private static String replaceNonMatchCharsWithPlusSign(String firstString, String secondString) {

		// ignore case and get all chars
		char[] lowerChars = firstString.toLowerCase().toCharArray();

		// get each char from char array
		for (int i = 0; i < lowerChars.length; i++) {
			
			//replace particular position char with '+' if that char not present in second string
			if (secondString.toLowerCase().indexOf(lowerChars[i]) == -1) {
				firstString = firstString.replace(firstString.charAt(i), '+');
			}

		}
		
		return firstString;
	}

	public static void main(String[] args) {
		/*
		 * Scope : Given a method with two strings as input. Write code to modify the
		 * first string such that all characters are replace by plus sign(+) except the
		 * characters which are present in the second string. That is, if one or more
		 * characters of first string appear in second string, they will not be replace
		 * by +. Return the modified string as output. Note-ignore case. Example: input1
		 * = New York input2 = New Jersy output = New Y+r+
		 */
		
		// Create a Scanner object for user inputs
		Scanner userInput = new Scanner(System.in);  
	    
		// Read inputs from user
		System.out.println("Enter First String");
	    String firstString = userInput.nextLine();
	    
	    System.out.println("Enter Second String");
	    String secondString = userInput.nextLine();
	    
		//Call method and print output
	    String output = replaceNonMatchCharsWithPlusSign(firstString, secondString);
		System.out.println("Output = " + output);
		        
	}

}
