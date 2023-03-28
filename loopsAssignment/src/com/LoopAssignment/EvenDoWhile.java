package com.LoopAssignment;

import java.util.Scanner;

public class EvenDoWhile {

	public static void main(String[] args) {
		int number, i;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the limit: ");  
		number = sc.nextInt();    
		i=121;   
		System.out.print("List of Even numbers: ");  
		//the while loop executes until the condition become false  
		  
		do
		{  
			if(i%2==0) 
			{
				System.out.print(i +" ");
				
			}
			i++;
		 }while(i<=number);
	}

}
