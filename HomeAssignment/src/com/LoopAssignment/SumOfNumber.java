package com.LoopAssignment;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num :");
		int num = sc.nextInt();
		int sum=0;
		for( int i=1;i<=num ;i++ )
		{
			sum+= i;
			
		}
		System.out.println("Sum of N number :"+sum);
		
		sc.close();
	}

}
