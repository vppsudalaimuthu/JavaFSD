package com.exercise.corejava;

public class Q10_UnionArrays {

	public static void main(String[] args) {
		/*
		 * Scope :
		 * Find A union B 
		 * Sample input: int[] a={1,2,3,4}; int[] b={3,4,5,6}; 
		 * Sample output: int[] c={1,2,3,4,5,6}
		 */
		
		int[] a = {1,2,3,4,5,1};
		int[] b = {10,2,7,6,4,7,8};
		
		int[] tempUnion = new int[a.length + b.length];
		tempUnion[0] = a[0];
		int noOfUniqueValues = 1;
		
		for (int i = 1; i < a.length; i++) {
			boolean isUnique = true;
			for (int j = 0; j < noOfUniqueValues; j++) {
				if (a[i] == tempUnion[j]) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				tempUnion[noOfUniqueValues] = a[i];
				noOfUniqueValues++;
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			boolean isUnique = true;
			for (int j = 0; j < noOfUniqueValues; j++) {
				if (b[i] == tempUnion[j]) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				tempUnion[noOfUniqueValues] = b[i];
				noOfUniqueValues++;
			}
		}
				
		int unionArray[] = new int[noOfUniqueValues];
				
		for (int i = 0; i < noOfUniqueValues; i++) {
			unionArray[i] = tempUnion[i];
		}
		
		System.out.print("A : { ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.print("}\nB : { ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
		System.out.print("}\n(A U B) : { ");
		for (int i = 0; i < unionArray.length; i++) {
			System.out.print(unionArray[i] + " ");
		}
		
		System.out.println("}");
	}

}
