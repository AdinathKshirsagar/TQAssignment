package com.ConditionalAssignment;
import java.util.Scanner;

public class EvenOdd
{
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num = sc.nextInt();
		
		if (num%2==0)
		{
			System.out.println(num + " It is a Even number..");
		}
		else
		{
			System.out.println(num + " It is a Odd nunber..");
		}
	}
}