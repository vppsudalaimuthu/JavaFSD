package com.exercise.corejava;

public class Q15_UniqueChars {

	public static void main(String[] args) {
		/*Scope :
		 * Display unique characters in a string. 
		 * input:"helloworld" 
		 * output:"helowrd"
		 */
        
		String inputStr = "helloworld";
		
		char[] inputChars = inputStr.toCharArray();
		char[] tempUnique = new char[inputChars.length];
		tempUnique[0] = inputChars[0];
		int noOfUniqueValues = 1;
				
		for (int i = 1; i < inputChars.length; i++) {
			boolean isUnique = true;
			for (int j = 0; j < noOfUniqueValues; j++) {
				if (inputChars[i] == tempUnique[j]) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				tempUnique[noOfUniqueValues] = inputChars[i];
				noOfUniqueValues++;
			}
		}
		
		char uniqueChars[] = new char[noOfUniqueValues];
		
		for (int i = 0; i < noOfUniqueValues; i++) {
			uniqueChars[i] = tempUnique[i];
		}
		
		System.out.println("Input String : " + inputStr);
		
		System.out.print("Output String (Unique Chars) : \"");
		for (int i = 0; i < uniqueChars.length; i++) {
			System.out.print(uniqueChars[i]);
		}
		System.out.print("\"");
	}

}
