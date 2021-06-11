package com.exercise.corejava;

public class Q14_Concat_Char_Position {

	public static void main(String[] args) {
		/*
		 * Scope :
		 * Concatenate the character in a given position. 
		 * If there is no character in a given position place "$" sign. 
		 * input1[]= {"abc","da","ram"}; input2=3; 
		 * hint : 3rd character is "c" in "abc" 
		 * 3rd character is not present in "da", so place "$" 
		 * 3rd character is "m" in "ram" 
		 * concate all the characters to a single string "c$m" 
		 * o/p string ="c$m";
		 */
		
		String[] inputStrings = {"abc","da","ram"};
		int pos = 3;
		String outString = "";
		
		for (String string : inputStrings) {
			if (string.length() >= pos) {
				outString = outString + string.charAt(pos-1);
			}else {
				outString = outString + "$";
			}
		}
		
		System.out.print("Input Strings Array = { ");
		for (int i = 0; i < inputStrings.length; i++) {
			System.out.print(inputStrings[i] + " ");
		}
		System.out.println("}");
		
        System.out.println("Output String = " + outString);
	}

}
