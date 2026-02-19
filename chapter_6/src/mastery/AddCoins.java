/*

Program: AddCoins.java       		Date: February 18th, 2026

Purpose: Create an application that turns coin amounts into currency
Author: Karanveer S.
School: CHHS
Course: Computer Science 20
 

*/
package mastery;
import java.util.Scanner;
public class AddCoins {
	public static double getDollarAmount(int quarters, int dimes, int nickles, int pennies) {
		return (quarters * 0.25) + (dimes * 0.10) + (nickles * 0.05) + (pennies * 0.01);
		
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Quarters, Dimes, Nickels, and Pennies (separated by spaces): ");

		int q = input.nextInt(), d = input.nextInt(), n = input.nextInt(), p = input.nextInt();
		input.close();

		System.out.printf("Total: $%.2f\n", getDollarAmount(q, d, n, p));



	}

}
/* Screen Dump

Enter Quarters, Dimes, Nickels, and Pennies (separated by spaces): 2 4 6 8
Total: $1.28

 

*/
