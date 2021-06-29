package com.exercise.corejava;

import java.util.Scanner;

public class Q35_ProfitLossMethod {
	
	public static float calculateProfit(int dozenCount, float pricePerDozen, float sellPrice) {

		float costPricePerToy = pricePerDozen / 12;
		float profitPerToy = sellPrice - costPricePerToy;
		float profitPercentage = (profitPerToy / costPricePerToy) * 100;

		return profitPercentage;
	}

	public static void main(String[] args) {
		int dozenCount;
		float ratePerDozen;
		float sellingPricePerToy;

		Scanner userInput = new Scanner(System.in);

		System.out.print("Number of dozens of toys purchased : ");
		dozenCount = userInput.nextInt();

		System.out.print("Price per dozen : ");
		ratePerDozen = userInput.nextFloat();

		System.out.print("Selling price of 1 toy : ");
		sellingPricePerToy = userInput.nextFloat();

		System.out.println("Sam's profit percentage is : "
				+ String.format("%.2f", calculateProfit(dozenCount, ratePerDozen, sellingPricePerToy)) + "%");

		userInput.close();
	}

}
