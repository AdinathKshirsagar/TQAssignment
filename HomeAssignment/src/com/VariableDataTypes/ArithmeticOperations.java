package com.VariableDataTypes;
// Write a Java program to enter two numbers and perform all arithmetic operations

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("Addition of Two Number : "+(num1+ num2));
		System.out.println("Subtraction of Two Number : "+(num1- num2));
		System.out.println("Dividation of Two Number : "+(num1/ num2));
		System.out.println("Multipilcation of Two Number : "+(num1* num2));
		System.out.println("Remainder of Two Number : "+(num1%num2));
		sc.close();
	}

}
