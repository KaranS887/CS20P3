/*

Program: Exponentiation.java       		Date: February 18th, 2026

Purpose: Create an application that does exponentiation given 2 values
Author: Karanveer S.
School: CHHS
Course: Computer Science 20
 

*/
package skillbuilders;
import java.util.Scanner;
public class Exponentiation {
	public static double exponent(int x, int power) {
		return Math.pow(x, power);

		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number and what power to be raised to (seperated by spaces): ");
		int base = input.nextInt(), pwr = input.nextInt();
		System.out.print("The exponentiation is " + exponent(base, pwr));
		input.close();
		
		
		

	}

}
/* Screen Dump
 * Enter a number and what power to be raised to (seperated by spaces): 3 3
The exponentiation is 27.0



 

*/