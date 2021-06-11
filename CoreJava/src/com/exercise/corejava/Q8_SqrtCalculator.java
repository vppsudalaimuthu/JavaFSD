package com.exercise.corejava;

public class Q8_SqrtCalculator {

	public static void main(String[] args) {
		/*
		 * Scope :
		 * Square root calculation ((x1+x2)(x1+x2))+((y1+y2)(y1+y2)) 
		 * o/p should be rounded of to int; 
		 * Sample input: double x1=5; double x2=6; double y1=8; double y2=3; 
		 * output : 15
		 */
		
		double x1 = 5;
		double x2 = 6;
		double y1 = 8;
		double y2 = 3;
		
		double formulaValue = (((x1 + x2) * (x1 + x2)) + ((y1 + y2) * (y1 + y2)));
		
		//double sqrtValue = Math.round(Math.sqrt(formulaValue));  
		int sqrtValue = (int)Math.sqrt(formulaValue);
						
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		System.out.println("y1 = " + y1);
		System.out.println("y2 = " + y2);
		
		System.out.println("((x1+x2)(x1+x2))+((y1+y2)(y1+y2)) = " + formulaValue);
		
		System.out.println("Square root of " + formulaValue + " = " + sqrtValue);

	}

}
