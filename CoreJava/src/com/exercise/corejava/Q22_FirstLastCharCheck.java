package com.exercise.corejava;

import java.util.Scanner;

public class Q22_FirstLastCharCheck {

	public static int checkFirstLastChars(String text) {

		int result = (text.charAt(0) == text.charAt(text.length() - 1)) ? 1 : -1;
		return result;

	}

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter the text");

		String text = userInput.nextLine();
		userInput.close();

		System.out.println("Output = " + checkFirstLastChars(text));

	}

}
