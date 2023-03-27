package com.LoopAssignment;

import java.util.Scanner;

public class EvenWhile {

	public static void main(String[] args) {
		
		int number, i;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the limit: ");  
		number = sc.nextInt();    
		i=121;   
		System.out.print("List of Even numbers: ");  
		//the while loop executes until the condition become false  
		while(i<=number)  
		{  
			if(i%2==0) 
			{
				System.out.print(i +" ");
				
			}
			i++;
		 	}
	}

}
