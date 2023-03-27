package com.LoopAssignment;
import java.util.Scanner;  

public class OddWhile {

	public static void main(String[] args) {
		
		int number, i;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the limit: ");  
		number = sc.nextInt();    
		i=521;   
		System.out.print("List of odd numbers: ");  
		//the while loop executes until the cond\ition become false  
		while(i>=number)  
		{  
				//		//prints the odd number  
				//		System.out.print(i +" ");   
				//		//decrements the variable i by 2  
				//		i=i-2;  
			
			if(i%2!=0) {
				System.out.print(i +" "); 
				
				}
			i--;
		 }
	}
}
