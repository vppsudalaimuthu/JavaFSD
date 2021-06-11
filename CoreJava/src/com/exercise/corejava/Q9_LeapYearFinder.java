package com.exercise.corejava;

public class Q9_LeapYearFinder {

	public static void main(String[] args) {
		/*
		 * Scope :
		 * Calculate whether given year as leap or not; Sample input: int year = 2020;
		 * Sample output: boolean isLeapYear = true;
		 */
		
		/*
		 * [ Algorithm ] if year is not divisible by 4 then it is a common year 
		 * else if year is not divisible by 100 then it is a leap year 
		 * else if year is not divisible by 400 then it is a common year 
		 * else it is a leap year
		 */
		
		//Years like 1996, 2000, and 2004 are leap years. But 1700, 1800, 1900, 2100, 2200, 2300, 3000 are not leap years.
		
		int year = 2000;
		
		boolean isLeapYear = false;
		
		isLeapYear = (year % 4 != 0) ? false : (year % 100 != 0) ? true : (year % 400 != 0) ? false : true;
		
		System.out.println("Year = " + year);
		System.out.println("isLeapYear = " + isLeapYear);
		
	}

}
