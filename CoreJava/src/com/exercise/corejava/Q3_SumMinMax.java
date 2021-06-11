package com.exercise.corejava;

public class Q3_SumMinMax {

	public static void main(String[] args) {
		
		/*
		 * Scope : Find the sum of maximum and minimum number from a given input array
		 * Input:{19,17,12} 
		 * max - 19 
		 * min - 12 
		 * sum - 31 
		 * Output:31
		 */
		
		int numbers[] = {19,17,12};
		
		int maxNum = numbers[0];
		int minNum = numbers[0];
		
		//We assumed first number in the array is min & max numbers
		//So we compare min & max number with second number onwards in the array
		for (int i=1; i < numbers.length; i++) {
			
			if (numbers[i] > maxNum) {
				
				maxNum = numbers[i];
			}
			
			if (numbers[i] < minNum) {
				
				minNum = numbers[i];
			}
			
		}
		
        System.out.print("Numbers Array = ");
        for (int num : numbers) {
			System.out.print(num + " ");
		}
        System.out.println("\nMax number = " + maxNum);
        System.out.println("Min number = " + minNum);
        System.out.println("Sum of maximum and minimum number = " + (maxNum + minNum));
	}

}
