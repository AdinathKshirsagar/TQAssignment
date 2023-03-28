package com.SwitchAssignment;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		System.out.println("Enter num1 : ");
		double num1 = sc.nextDouble();
		System.out.println("Enter Operator + , - , * , / : ");
		String input = sc.next();
		char ch='0';
			if(input.length()==1) {
				 ch= input.charAt(0);
			}else
			{
				System.out.println("Multiple values are not allowed.");
				System.exit(0);
			}
		
				
		System.out.println("Enter num2 : ");
		double num2 = sc.nextDouble();
		double result ;
	
		switch (ch) {
			case '+':
				result = num1 + num2;
				System.out.println("Addition of two Number : "+result);
				break;
			case '-':
				result = num1 - num2;
				System.out.println("Subtraction of two Number : "+result);
				break;
			case '*':
				result = num1 * num2;
				System.out.println("Multiplication of two Number : "+result);
				break;
			case '/':
				result = num1 + num2;
				System.out.println("Division of two Number : "+result);
				break;
			default:
				System.out.println("Invalid Operator ");
				break;
		}
		
		sc.close();
	}

}
