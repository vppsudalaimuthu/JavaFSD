package com.exercise.corejava;

public class Q11_IntersectionArrays {

	public static void main(String[] args) {
		/*
		 * Scope :
		 * Find A interscetion B 
		 * Sample input: int[] a={1,2,3,4}; int[] b= {3,4,5,6};
		 * Sample output: int[] c={3,4}
		 */
		
		int[] a = {1,2,3,4}; 
		int[] b = {3,4,5,6};
		
		int size = 0;
		if (a.length < b.length) {
			size = a.length;
		}else {
			size = b.length;
		}
		
		int[] aIntb = new int[size];
		int commonElementCount = 0;
		
		for (int i = 0; i < a.length; i++) {
			//System.out.println("a = " + a[i]);
			for (int j = 0; j < b.length; j++) {
				//System.out.println("b = " + b[j]);
				if (a[i] == b[j]) {
					aIntb[commonElementCount] = a[i];
					commonElementCount += 1;
					break;
				}
			}
		}
		
		System.out.print("a = { ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("}");
		
		System.out.print("b = { ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println("}");
		
		
		System.out.print("a Intersection b = { ");
		for (int i = 0; i < commonElementCount; i++) {
			System.out.print(aIntb[i] + " ");
		}
		System.out.println("}");
		
	}

}
