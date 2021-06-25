package com.exercise.corejava;

import java.util.Scanner;

public class Q24_ProfitLoss {

	public static float calculateProfitPercentage(float ratePerDozen, float sellingPricePerToy) {

		float costPricePerToy = ratePerDozen / 12;
		float profitPerToy = sellingPricePerToy - costPricePerToy;
		float profitPercentage = (profitPerToy / costPricePerToy) * 100;

		return profitPercentage;
	}

	public static void main(String[] args) {
		int purchasedDozen;
		float ratePerDozen;
		float sellingPricePerToy;

		Scanner userInput = new Scanner(System.in);

		System.out.print("Number of dozens of toys purchased : ");
		purchasedDozen = userInput.nextInt();

		System.out.print("Price per dozen : ");
		ratePerDozen = userInput.nextFloat();

		System.out.print("Selling price of 1 toy : ");
		sellingPricePerToy = userInput.nextFloat();

		System.out.println("Sam's profit percentage is : "
				+ String.format("%.2f", calculateProfitPercentage(ratePerDozen, sellingPricePerToy)) + "%");

	}

}
