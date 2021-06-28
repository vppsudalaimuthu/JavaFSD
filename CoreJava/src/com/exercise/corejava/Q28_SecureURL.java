package com.exercise.corejava;

import java.util.Scanner;

/*Secure URL
Write a program to check whether the given URL is secure.
Example:
Secure URL:https://www.amazon.com/

Sample Input and Output 1:
Enter the string
http://www.amazon.com/
Enter the start string
https
"http://www.amazon.com/" does not start with "https"

Sample Input and Output 2:
Enter the string
https://www.amazon.com/
Enter the start string
https
"https://www.amazon.com/" starts with "https"
*/

public class Q28_SecureURL {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter the string");
		String url = userInput.nextLine();

		System.out.println("Enter the start string");
		String startStr = userInput.nextLine();
		
		if (url.startsWith(startStr)) {
			System.out.println("\"" + url + "\" starts with \"" + startStr + "\"");
		}else {
			System.out.println("\"" + url + "\" does not start with \"" + startStr + "\"");
		}
		
		userInput.close();
	}

}
