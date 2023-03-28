package com.VariableDataTypes;
// Write a Java program to enter two numbers and find their sum.
import java.util.Scanner;

public class SumOfTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("Sum of Two Number : "+(num1+ num2));
		sc.close();
	}

}
