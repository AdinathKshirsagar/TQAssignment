package com.ConditionalAssignment;

import java.util.Scanner;

public class MaximumNum
{
	public static void main (String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first num : ");
		int a = sc.nextInt();
		System.out.println("Enter second num : ");
		int b = sc.nextInt();
		System.out.println("Enter third num :");
		int c = sc.nextInt();

		if(a>b && a>c){
			System.out.println("First num is highest : "+ a);
		}else if (b>a && b>c){
			System.out.println("Second num is highest : " + b);
		}else{
			System.out.println("Third num is highest : "+ c);
		}
	}
}