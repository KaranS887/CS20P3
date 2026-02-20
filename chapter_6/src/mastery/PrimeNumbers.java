/*

Program: PrimeNumber.java       		Date: February 18th, 2026

Purpose: Create an application that determines prime identity of a number
Author: Karanveer S.
School: CHHS
Course: Computer Science 20
 

*/
package mastery;
import java.util.Scanner;
import java.lang.Math;
public class PrimeNumbers {
	public static boolean isPrime(int num) {
		for(int i = 2; i <= Math.sqrt(num); i++ ) 
		{
			if(num % i == 0) 
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number to test if it is prime: ");
		if (isPrime(input.nextInt())) {
			System.out.print("Yes it is prime");
		}
		else {
			System.out.print("No it is not prime");
			}           
		input.close();

		

		
	}

}
/* Screen Dump

Enter a number to test if it is prime: 23
Yes it is prime

 

*/