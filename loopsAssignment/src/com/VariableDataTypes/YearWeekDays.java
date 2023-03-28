package com.VariableDataTypes;
//Write a Jaa program to convert days into years, weeks and days

import java.util.Scanner;

public class YearWeekDays {

	public static void main(String[] args) {
		int days, years,weeks;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Days : ");
		days = sc.nextInt();
		
        years = days / 365;  
        weeks = (days%365)/7;
        days = (days%365)%7;
        
        System.out.println("Number of years is:"+years);
        System.out.println("Number of weeks is:"+weeks);
        System.out.println("Number of days is:"+days);
        sc.close();
	}

}
