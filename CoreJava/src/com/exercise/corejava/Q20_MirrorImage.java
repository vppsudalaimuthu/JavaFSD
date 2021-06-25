package com.exercise.corejava;

import java.util.Scanner;

public class Q20_MirrorImage {

	/*
	 * Scope :
	 * Create a class containing a method to create the mirror image of a String.
	 * The method should return the two Strings separated with a pipe(|) symbol .
	 * Method Name - getImage Argument - String Return Type - String 
	 * Logic - Accepts One String. Find the mirror image of the String. 
	 * Add the two Strings together separated by a pipe(|) symbol. 
	 * For Example Input : EARTH Output : EARTH|HTRAE
	 */
	private static String getImage(String image) {
		
		//create char array based on string length
		char[] mirrorChars = new char[image.length()];
		int index = 0;
		
		//take char from image string in reverse order
		for (int pos = mirrorChars.length-1; pos >= 0; pos--) {
			mirrorChars[index] = image.charAt(pos);
			index++;
		}
		
		return image + "|" + String.valueOf(mirrorChars);
	}
	public static void main(String[] args) {
		
		// Create a Scanner object for user inputs
		Scanner userInput = new Scanner(System.in);

		// Read inputs from user
		System.out.print("Enter String Image = ");
		String image = userInput.nextLine();
		
		System.out.println("Mirror image of the String = " + getImage(image));

	}

}
