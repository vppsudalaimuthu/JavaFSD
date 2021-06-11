package com.exercise.corejava;

public class Q4_CountWords {

	public static void main(String[] args) {
		/*
		 * Scope:
		 * Find the number of words are of given length 
		 * Input1: {“aa”,”b”,”cc”,”ddd”} Input2:2 Output1:2 
		 * Input1: {“aa”,”b”,”cc”,”ddd”} Input2:1 Output1:1
		 * Input1: {“aa”,”b”,”cc”,”ddd”} Input2:3 Output1:1
		 */
		
		String wordsArray[] = {"aa","b","cc","ddd"};
		int wordLength = 3;
		
		int countWords = 0;
		String wordsString = "";
		
		for (String word : wordsArray) {
			if (word.length() == wordLength) {
				
				countWords++;
			}
			
			wordsString = wordsString + word + " ";
		}
		
		System.out.println("Words Array = { " + wordsString +"}");
		System.out.println("Word Length = " + wordLength);
		System.out.println("Number of words are of given length = " + countWords);
		

	}

}
