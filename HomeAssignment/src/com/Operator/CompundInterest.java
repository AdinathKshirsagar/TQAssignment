package com.Operator;
//	Write a Java program to enter P, T, R and calculate Compound Interest

import java.util.Scanner;

public class CompundInterest {

	public static void main(String[] args) {
		double principle, rate, time,compoundInterest;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Principle :");
	    principle =sc.nextFloat();
	    System.out.println("Enter Interest rate :");
	    rate =sc.nextFloat();
	    System.out.println("Enter time :");
	    time =sc.nextFloat();
	    
	    compoundInterest = principle * (Math.pow((1 + rate / 100), time)) - principle;
	    
	    System.out.println("The Compound Interest is : " +compoundInterest);
	    sc.close();
	}

}
