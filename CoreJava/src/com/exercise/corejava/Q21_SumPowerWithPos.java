package com.exercise.corejava;

import java.util.Arrays;
import java.util.Scanner;

public class Q21_SumPowerWithPos {
	
	/*
	 * Given a method with an int array. Write code to find the power of each
	 * individual element according to its position index, add them up and return as
	 * output. 
	 * Example: input = {3,6,2,1} output = (3)0+ (6)1+ (2)2+ (1)3 = 1+6+4+1 = 12
	 */
	private static int sumPowerOfElementWithPos(int[] numbers) {
		
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + (int)Math.pow(numbers[i], i);
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int[] numbers = {3,6,2,1};
		System.out.println("Input Integer Array = " + Arrays.toString(numbers));
		System.out.println("Sum of power of each element(number) according to its position = " + sumPowerOfElementWithPos(numbers));

	}

}
