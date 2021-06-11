package com.exercise.corejava;

public class Q12_Union_Minus_Intersection {

	public static void main(String[] args) {
		/*
		 * Scope :
		 * Find (A union B) - (A intersection B) 
		 * Sample input: int[] a= {1,2,3,4}; int[] b={3,4,5,6}; 
		 * a union b = {1,2,3,4,5,6} a intersection b = {3,4} 
		 * (a union b) - (a intersection b) = {1,2,5,6} 
		 * Sample output: int[] c={1,2,5,6}
		 */
		
		int[] a = {1,2,3,4}; 
		int[] b = {3,4,5,6};
		
		int[] aUb_aIb = new int[a.length + b.length];
		int noOfElements = 0;
		
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
		
		int[] finalAInterB = new int[commonElementCount];
		
		for (int i = 0; i < commonElementCount; i++) {
			finalAInterB[i] = aIntb[i];
		}
		
		boolean numberPresent = false;
		
		for (int i = 0; i < a.length; i++) {
			numberPresent = false;
			for (int j = 0; j < finalAInterB.length; j++) {
				if (a[i] == finalAInterB[j]) {
					numberPresent = true;
					break;
				}
			}
			if (!numberPresent) {
				aUb_aIb[noOfElements] = a[i];
				noOfElements += 1;
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			numberPresent = false;
			for (int j = 0; j < finalAInterB.length; j++) {
				if (b[i] == finalAInterB[j]) {
					numberPresent = true;
					break;
				}
			}
			if (!numberPresent) {
				aUb_aIb[noOfElements] = b[i];
				noOfElements += 1;
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
		
		
		System.out.print("(a union b) - (a intersection b) = { ");
		for (int i = 0; i < noOfElements; i++) {
			System.out.print(aUb_aIb[i] + " ");
		}
		System.out.println("}");

	}

}
