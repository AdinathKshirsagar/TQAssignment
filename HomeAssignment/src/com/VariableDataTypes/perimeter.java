package com.VariableDataTypes;
// Write a Java program to enter length and breadth of a rectangle and find its perimeter
import java.util.Scanner;

public class perimeter {
	public static void main(String[] args) {
		float a,b,perimeter;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length : ");
		a = sc.nextFloat();
		System.out.println("Enter the breadth : ");
		b = sc.nextFloat();
		 
		
		
		perimeter = 2*(a+b);
		System.out.println("Perimeter of a Rectangle : "+perimeter);
		
		sc.close();
	}
}
