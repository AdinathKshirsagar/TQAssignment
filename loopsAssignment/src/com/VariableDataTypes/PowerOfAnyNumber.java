package com.VariableDataTypes;

//Java program to find the power of any number
import java.util.Scanner;

public class PowerOfAnyNumber {
 public static void main(String[] args) {
 	Scanner in = new Scanner(System.in);

     System.out.println("Enter the base values : ");
     int base = in.nextInt();
     System.out.println("Enter the exponent values : ");
     int expo = in.nextInt();
     int result = 1;
     int i = 1;
     // base = base
     // expo = exponent
     // result = result

     /* finding power of base value by equiping exponent value */
     while(i <= expo) {
         result *= base;
         i++;
     }

     // Output
     System.out.println("\nResult:: " + base + "^" + expo + " = " + result + "\n");
 }
}