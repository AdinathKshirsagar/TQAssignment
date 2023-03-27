package com.ConditionalAssignment;

import java.util.Scanner;

public class Divisible
{
		public static void main(String []args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Enter a Num :");
			float num = sc.nextFloat();
			 if(num%5==0 && num%11==0){
				 System.out.println("The given num : "+ num + " is divisible by 5 and 11");
			 }else{
				 System.out.println("The given num : "+ num + " is not divisible by 5 and 11");
			 }
		}	
}	
