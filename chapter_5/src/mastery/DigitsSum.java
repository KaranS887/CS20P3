/*

Program:DigitsSum.java       		Date: February 9th, 2026

Purpose: Create an application that displays the sum of digits in a user-given positive integer


Author: Karanveer S.
School: CHHS
Course: Computer Science 20
 

*/
package mastery;
import java.util.Scanner;
public class DigitsSum {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter your number: "); //ask user for number and declare int
	
	int num = input.nextInt(); 
	input.close();
	int sum = 0;
	while (num != 0) {
		
		sum = sum + num%10; //get remainder in ones place and add to sum
		num = num/10; //divide by 10 to repeat
		
	}
	
	System.out.println("Sum = " + sum);    



	}

}
/* Screen Dump

Enter your number: 54235345
Sum = 31



*/

