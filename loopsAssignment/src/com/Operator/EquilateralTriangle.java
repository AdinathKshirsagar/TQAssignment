package com.Operator;
//Write a Java program to calculate area of an equilateral triangle

import java.util.Scanner;

public class EquilateralTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Side of Triangle :");
		float side = sc.nextFloat();
		
		float area = (1.73f*side*side)/4;
		
		System.out.println("Area of Equilateral Triangle : "+area);
		sc.close();
	}

}
