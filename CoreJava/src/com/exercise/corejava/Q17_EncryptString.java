package com.exercise.corejava;

import java.util.Scanner;

public class Q17_EncryptString {

	/*
	 * Scope: Given a method with a string input. Write code to encrypt the given
	 * string using following rules and return the encrypted string: 
	 * a. Replace the character at odd positions by next character in alphabet 
	 * b. Leave the characters at even positions unchanged 
	 * Note: if an odd position character is 'z' replace it by 'a' 
	 * assume the first character in the string is at position 1 
	 * Example input = curiosity output = dusipsjtz
	 */

	private static String encryptString(String text) {
		
		char[] encryptChars = text.toCharArray();
		
		for (int i = 0; i < encryptChars.length; i=i+2) {
			//get ASCII value of char
			int charASCII = (int)encryptChars[i];
			
			//check char is 'z' or 'Z' if it is then replace with 'a' or 'A' 
			//else replace with next alphabet or next char or next digit
			encryptChars[i] = (charASCII==90 || charASCII == 122)?
							(char) ((int)charASCII - 25) : (char) ((int)charASCII + 1);
		}
		
		return String.valueOf(encryptChars);
	}

	public static void main(String[] args) {
        
		// Create a Scanner object for user inputs
		Scanner userInput = new Scanner(System.in);  
		    
		// Read inputs from user
		System.out.println("Enter String ");
		String string = userInput.nextLine();
		
		System.out.println("Encrypted String : " + encryptString(string));
		
	}

}
