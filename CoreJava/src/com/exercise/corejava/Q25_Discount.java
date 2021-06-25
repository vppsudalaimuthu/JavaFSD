package com.exercise.corejava;

import java.util.Scanner;

public class Q25_Discount {
	
	public static void calculateDiscount(float item1Price, float item2Price, int discountPercentage) {
		
		float totalAmt = item1Price + item2Price;
		System.out.println("Total amount :$" + String.format("%.2f",totalAmt));
		
		float discountedAmt = totalAmt - (totalAmt * discountPercentage/100);
		System.out.println("Discounted amount :$" + String.format("%.2f",discountedAmt));
		
		float savedAmt = totalAmt - discountedAmt;
		System.out.println("Saved amount :$" + String.format("%.2f",savedAmt));
		
	}

	public static void main(String[] args) {
		
		float item1Price;
		float item2Price;
		int discountPercentage;
		
		Scanner userInput = new Scanner(System.in);

		System.out.print("Price of item 1 : ");
		item1Price = userInput.nextFloat();

		System.out.print("Price of item 2 : ");
		item2Price = userInput.nextFloat();

		System.out.print("Discount in percentage : ");
		discountPercentage = userInput.nextInt();
		
		calculateDiscount(item1Price,item2Price,discountPercentage);
		
		userInput.close();

	}

}
