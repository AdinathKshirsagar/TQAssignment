package com.VariableDataTypes;
//Write a Java program to enter length and width of a rectangle and find its area

import java.util.Scanner;

public class AreaOfRectangular {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the width : ");
		float width = sc.nextInt();
		System.out.println("Enter the height : ");
		float height = 88f;
		
		int area = (int)(height*width); // Explicit casting
		System.out.println(" Area of Rectangle : "+area);
		sc.close();
	}
}
