package com.exercise.corejava;

import java.util.Scanner;

/*
The Red Cross (while loop)
On an event of a natural calamity, Red Cross is responsible to present
the accurate details of the number of people who were rescued and sought refuge in the
camps.
Write a program to facilitate Red Cross authorities record the total number of
refugees from each tent of the camps given the number of tents.
Note:
• Use integer array to store the number of refugees present in each tent.
• Use while loop
to store people count in tent and calculate the total number of people.
Input Format:
First line of the input is an integer value that corresponds to the number of tents in
the camp.
The next n lines of input contains the number of refugees staying in each of the tents.
Output Format:
Output should print the total number of citizens present in the camp.
Sample
Input and Output:
5
10
12
30
12
12
76*/

public class Q33_RedCrossWhileLoop {
	
	private static int calculateTotal(int[] intArray) {
		
		int total = 0;
		int arrayCount = intArray.length;
		
		//adding values in reverse order from the array
		while (arrayCount > 0) {
			total = total + intArray[arrayCount-1];
			arrayCount--;
		}

		return total;
	}

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter the number of tents in the camp:");
		int tentsCount = userInput.nextInt();
		
		int[] refugeesPerTent = new int[tentsCount];
		int tentIndex = 0;
		
		while (tentsCount > tentIndex) {
			System.out.print("Enter the number of refugees staying in tent-" + (tentIndex+1) + ":");
			refugeesPerTent[tentIndex] = userInput.nextInt();
			tentIndex = tentIndex + 1;
		}
				
		System.out.println("The total number of citizens present in the camp:" + calculateTotal(refugeesPerTent));
		userInput.close();
	}

}
