package com.exercise.corejava;

public class Q6_ConvertStringArrayToString {

	public static void main(String[] args) {
		/*
		 * Scope:
		 * Convert String array to String 
		 * String[] input1= ["Vikas","Lokesh","Ashok"]
		 * Expected output String: "Vikas,Lokesh,Ashok"
		 */
		
		String strArray[] = {"Vikas","Lokesh","Ashok"};
		String singleString = "";
		//This flag is used to skip concatenation of comma with first string
		boolean isFirstString = true;
		String arrayString = "";
		
		for (String eachString : strArray) {
			
			singleString = (isFirstString)? singleString + eachString : singleString + "," + eachString;
			isFirstString = false;
			
			//This just for printing purpose
			arrayString = arrayString + "\"" + eachString + "\"" + " ";
			
		}
		
		System.out.println("String Array = { " + arrayString +"}");
		System.out.println("String of Given String Array = " + singleString);

	}

}
