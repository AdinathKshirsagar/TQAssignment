package com.Operator;
//Write a Java program to enter °Fahrenheit and convert it into in °Celsius 

import java.util.Scanner;

public class FahrenheitCelsius {

	public static void main(String[] args) {
		float fahrenheit, celsius ;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter fahrenheit :");
	    fahrenheit =sc.nextFloat();
	    
	    celsius = ((fahrenheit-32)*5)/9 ;
	    System.out.println("Temperature in celsius is: "+celsius);
	    sc.close();
	}

}
