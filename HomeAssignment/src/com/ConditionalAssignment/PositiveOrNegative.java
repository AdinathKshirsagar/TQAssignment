package com.ConditionalAssignment;

import java.util.Scanner;

public class PositiveOrNegative
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = sc.nextInt();
		
		if(num>0)
		{
			System.out.println(num + " is Positive Number");
		}else if(num<0)
		{
			System.out.println(num + " is Negative Number");
		}else
		{
			System.out.println(num + " is Zero Number");
		}
			
	}
}