package com.VariableDataTypes;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		float radius = sc.nextFloat();
		
		float diameter = 2* radius;
		float circumference = (float) (3.14 * radius) ;
		float area = (float)(3.14*diameter);
		
		 System.out.println("\nDiameter      = " + diameter + " units");
	     System.out.println("Circumference = " + circumference + " units");
	     System.out.println("Area          = " + area + " sq. units");
	     sc.close();
	}

}
