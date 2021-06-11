package com.exercise.corejava;

public class Q7_EmailValidation {

	public static void main(String[] args) {
		/*
		 * Scope : 
		 * Email Validation. Output is false if the validation fails else true.
		 * String input1="test@gmail.com" 
		 * 1)@ & . should be present;
		 * 2)@ & . should not be repeated; 
		 * 3)there should be four characters between @ and .; 
		 * 4)there should be at least 3 characters before @ ; 
		 * 5)the end of mail id should be .com; 
		 * Expected Output=true
		 */

		String emailID = "sudalai@mail.com";
		boolean isValidEmailID = true;

		//get index(position) value of '@' and '.'
		int at_index = emailID.indexOf('@');
		int dot_index = emailID.indexOf('.');
				
		// Check all rules one by one, if any one of the rule is not satisfied then it returns false immediately,
		// it returns true only after all the rules are satisfied
		isValidEmailID = (at_index < 0 || dot_index < 0) ? false
				: (at_index != emailID.lastIndexOf('@') || dot_index != emailID.lastIndexOf('.')) ? false
						: (emailID.substring(at_index + 1, dot_index).length() != 4) ? false
								: (emailID.substring(0, at_index).length() < 3) ? false
										: (emailID.toLowerCase().endsWith(".com") == false) ? false : true;
		
		System.out.println("Email ID : " + emailID);
		
						
		if (isValidEmailID) {
			System.out.println("Email Validation Result : True (ie given maild is in vaild format)");
		} else {
			System.out.println("Email Validation Result : False (ie given maild is not in vaild format)");
		}

	}

}
