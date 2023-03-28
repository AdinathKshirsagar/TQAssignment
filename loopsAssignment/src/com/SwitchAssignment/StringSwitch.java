package com.SwitchAssignment;

import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vehicle Name : ");
		String bike = sc.next();
		
		switch (bike) 
		{
			case "Bullet" :
			System.out.println("This is two Wheeler");
			break;
			case "Pulsar" :
			System.out.println("This is two Wheeler");
			break;
			case "Hero" :
			System.out.println("This is two Wheeler");
			break;
			case "Hondacity":
			System.out.println("This is Four Wheeler");
			break;
			case "Toyato":
			System.out.println("This is Four Wheeler");
			break;
			default :
			System.err.println("Enter valid Vehicle name..");
		}
		sc.close();
	}

}
