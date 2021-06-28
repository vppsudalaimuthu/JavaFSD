package com.exercise.corejava;

import java.util.Scanner;

/*
Replace Organization Name
This program is to illustrate the use of the method replace() defined in the string API.
Two companies enter into a Marketing Agreement and they prepare
an Agreement Draft. After that one of the companies changes its name. The name changes
need to be made in the Agreement Draft as well. Write a program to perform the name
changes in the agreement draft.

Sample Input and Output :
Enter the content of the document
ITT is a private organisation. ITT is a product based company. DBox is a ITT product
Enter the old name of the company
ITT
Enter the new name of the company
TTT
The content of the modified document is
TTT is a private organisation. TTT is a product based company.DBox is a TTT product
*/

public class Q29_TextReplace {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter the content of the document");
		String docContent = userInput.nextLine();

		System.out.println("Enter the old name of the company");
		String oldStr = userInput.nextLine();
		
		System.out.println("Enter the new name of the company");
		String newStr = userInput.nextLine();
	
		System.out.println("The content of the modified document is");
		System.out.println(docContent.replace(oldStr, newStr));
		
		userInput.close();
	}

}
