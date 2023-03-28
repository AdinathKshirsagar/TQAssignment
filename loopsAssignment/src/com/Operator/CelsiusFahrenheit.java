package com.Operator;
// Write a Java program to enter temperature in °Celsius and convert it into °Fahrenheit

import java.util.Scanner;

public class CelsiusFahrenheit {

	public static void main(String[] args) {
		float celsius,fahrenheit ;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter celsius :");
	    celsius =sc.nextFloat();
	   
	    fahrenheit =((celsius*9)/5)+32;
	    
	    System.out.println("Temperature in Fahrenheit is :"+fahrenheit);
	    
	    sc.close();
	}

}
