package com.VariableDataTypes;
//Write a Java program to enter length in centimeter and convert it into meter and kilometer

import java.util.Scanner;

public class MeterKilometer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length in cm : ");
		double length = sc.nextInt();
		double meter = length/100;
		
		System.out.println("Value in meter is: \n"+ meter);
		sc.close();
	}

}
