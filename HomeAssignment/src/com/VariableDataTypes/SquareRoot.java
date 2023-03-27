package com.VariableDataTypes;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");  
		//creating object of the Scanner class  
		Scanner sc = new Scanner(System.in);  
		//reading a number form the user  
		int num = sc.nextInt();  
		//calling the method and prints the result  
		
		
		double temp;  
		double sqrtroot=num/2;  
		do   
		{  
		temp=sqrtroot;  
		sqrtroot=(temp+(num/temp))/2;  
		}   
		while((temp-sqrtroot)!= 0);  
		System.out.println("The square root of "+ num+ " is: "+sqrtroot); 
	}

}
