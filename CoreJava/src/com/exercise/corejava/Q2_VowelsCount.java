package com.exercise.corejava;

public class Q2_VowelsCount {

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

		// Define vowel string and flag array (check if specific vowel char is already counted or not)
		String vowelString = "aeiou";
		boolean vowelsFoundFlag[] = { false, false, false, false, false };
		int vowelCount = 0;

		for (char letter : lowerStr.toCharArray()) {

			// Get index of letter in vowel string "aeiou";
			int letterIndex = vowelString.indexOf(letter);

			// Check the letter is vowel or not, and also check it is already founded or not
			if ((letterIndex >= 0) && (vowelsFoundFlag[letterIndex] == false)) {

				vowelCount += 1;

				// Set corresponding letter flag is true, because it is founded in first time
				// This flag helps to avoid multiple count for the same letter
				vowelsFoundFlag[letterIndex] = true;
			}
		}

		System.out.println("Input string = " + inputStr);
		System.out.println("Number of vowels in a given string = " + vowelCount);

	}

}
