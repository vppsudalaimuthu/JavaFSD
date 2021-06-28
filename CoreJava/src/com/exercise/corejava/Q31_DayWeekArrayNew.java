package com.exercise.corejava;

import java.util.Scanner;

/*
Day of the Week (Using new keyword)
Write a program to find the day of the week for the
day number given. 1 should return Sun, 2 should return Mon, etc.
Note:Declare and Initialize array elements using new keyword.
Sample Input and Output:
Enter the day number
3
Day of the week is Tue
*/
public class Q31_DayWeekArrayNew {

	public static void main(String[] args) {

		String[] days = new String[7];	
		
		days[0] = "Sun";
		days[1] = "Mon";
		days[2] = "Tue";
		days[3] = "Wed";
		days[4] = "Thu";
		days[5] = "Fri";
		days[6] = "Sat";

		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter the day number");
		int dayNum = userInput.nextInt();

		if (dayNum > 0 && dayNum <= 7) {
			System.out.println("Day of the week is " + days[dayNum - 1]);
		} else {
			System.out.println("Invaild day number. Please Try(Run) Again.");
		}

		userInput.close();

	}

}
