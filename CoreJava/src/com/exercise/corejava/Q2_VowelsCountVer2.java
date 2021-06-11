package com.exercise.corejava;

public class Q2_VowelsCountVer2 {

	public static void main(String[] args) {
		/*
		 * Scope : Find the number of vowels in a given string Input1:”NewyorkE” 'e' or
		 * 'E' - it should be counted as 1 Output1:2 Hint:irrespective of case
		 */

		//Check the input string is given or not
		if (args.length == 0) {
			System.out.println("Please give input string through command line argument");
			return;
		}
		
		// Get input string from command line / run configurations... window
		String inputStr = args[0];

		// Covert input string to lower case to achieve irrespective of case count
		String lowerStr = inputStr.toLowerCase();

		// Define vowel chars array
		char vowels[] = {'a','e','i','o','u'};
				
		int vowelCount = 0;

		for (char vowelChar : vowels) {

			// Check the vowel char is in given input string
			int charIndex = lowerStr.indexOf(vowelChar);
			
			if (charIndex >= 0) {
				vowelCount += 1;
			}
		}

		System.out.println("Input string = " + inputStr);
		System.out.println("Number of vowels in a given string = " + vowelCount);

	}

}
