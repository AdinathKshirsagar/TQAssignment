package com.VariableDataTypes;

//Java program to find all angles of a triangle if two angles are given

import java.util.Scanner;
class ThirdAngleOfTriangle
{
	public static void main(String args[])
	{
   int a, b, c;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter First angles of triangle: ");
   a=sc.nextInt();
   System.out.print("Enter Second angles of triangle: ");
   b=sc.nextInt();

   /* Compute third angle */
   c = 180 - (a + b);

   /* Print value of the third angle */
   System.out.println("Third angle of the triangle = "+c);
	}
}