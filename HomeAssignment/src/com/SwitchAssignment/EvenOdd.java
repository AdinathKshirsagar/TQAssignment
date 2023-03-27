package com.SwitchAssignment;
import java.util.Scanner;

public class EvenOdd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		switch (num%2) // it will return remainder i. e. 0 => even or 1 =>odd
		{
			case 0 :
			System.out.println("The number is even");
			break;
			case 1 :
			System.out.println("The number is odd");
			break;
		}
		
		sc.close();
		
	}
}
