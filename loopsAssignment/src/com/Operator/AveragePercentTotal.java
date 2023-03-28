package com.Operator;
//Write a Java program to enter marks of five subjects and calculate total, average and percentage

import java.util.Scanner;

public class AveragePercentTotal {

	public static void main(String[] args) {
		float eng, phy, chem, math, comp; 
	    double total, average, percentage;
	    Scanner sc=new Scanner(System.in);
	    /* Input marks of all five subjects */
	    System.out.println("Enter marks of five subjects:");
	    System.out.println("Enter marks of English subjects:");
	    eng=sc.nextFloat();
	    System.out.println("Enter marks of physics subjects:");
	    phy=sc.nextFloat();
	    System.out.println("Enter marks of chemistry subjects:");
	    chem=sc.nextFloat();
	    System.out.println("Enter marks of maths subjects:");
	    math=sc.nextFloat();
	    System.out.println("Enter marks of computers subjects:");
	    comp=sc.nextFloat();

	    /* Calculate total, average and percentage */
	    total = eng + phy + chem + math + comp;
	    average = (total / 5.0);
	    percentage = (total / 500.0) * 100;

	    /* Print all results */
	    System.out.println("Total marks ="+total);
	    System.out.println("Average marks = "+average);
	    System.out.println("Percentage = "+percentage);
		sc.close();
	}

}
