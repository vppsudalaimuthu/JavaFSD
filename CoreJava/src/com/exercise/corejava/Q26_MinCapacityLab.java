package com.exercise.corejava;

import java.util.Scanner;

public class Q26_MinCapacityLab {

	public static void main(String[] args) {

		int minCapacity = 0;
		int minLab = 1;

		Scanner userInput = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {
			System.out.print("Enter the Lab - L" + i + " seating capacity :");
			int labSeat = userInput.nextInt();

			if (labSeat <= 0) {
				System.out.println("Please Enter Valid Seating Capacity...");
				i=i-1;
				continue;
			}

			if (i == 1)
				minCapacity = labSeat;

			if (labSeat < minCapacity) {
				minCapacity = labSeat;
				minLab = i;
			}
		}
		
		userInput.close();

		System.out.println("L" + minLab + " has the minimal seating capacity");

	}

}
