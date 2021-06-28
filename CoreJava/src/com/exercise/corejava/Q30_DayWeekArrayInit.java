package com.exercise.corejava;

import java.util.Scanner;

/*
Day of the Week (Using direct Array initialization)
Write a program to find the day of the week
for the day number given. 1 should return Sun, 2 should return Mon, etc.
Note: Declare and Initialize array in a single line using curly braces.
Sample Input and Output:
Enter the day number
3
Day of the week is Tue
*/
public class Q30_DayWeekArrayInit {

	public static void main(String[] args) {
		
		String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		
		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter the day number");
		int dayNum = userInput.nextInt();
		
		if(dayNum > 0 && dayNum <= 7)
		{
		System.out.println("Day of the week is " + days[dayNum-1]);
		}else {
			System.out.println("Invaild day number. Please Try(Run) Again.");
		}
		
		userInput.close();
		
	}

}
