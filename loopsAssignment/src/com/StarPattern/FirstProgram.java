package com.StarPattern;

public class FirstProgram {

	public static void main(String[] args) {
		int num=5;
		
	for(int i=num ; i>=1 ; i--)
	{
		for(int j=num; j>i; j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i; k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	}

}
