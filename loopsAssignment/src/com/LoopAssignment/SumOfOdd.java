package com.LoopAssignment;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		int number, i, oddSum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
		
		for(i = 1; i <= number; i++)
		{
			if(i % 2 != 0)
			{
				oddSum = oddSum + i; 
			}
		}
		System.out.println("\n The Sum of Even Numbers upto " + number + "  =  " + oddSum);
	}

}