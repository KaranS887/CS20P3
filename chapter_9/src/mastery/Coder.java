/*

Program: Coder.java       		Date: March 18, 2026
Purpose: Create an application that takes a user message and performs a Ceaser Cipher to it using Unicode
Author: Karanveer S
School: CHHS
Course: Computer Science 20
 

*/
package mastery;
import java.util.Scanner;
public class Coder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String message = input.nextLine();
		char[] messager = message.toCharArray();
		
		for (int i = 0; i < messager.length; i++) {
			if (Character.isLetter(messager[i])) {
			messager[i] += 2; }
			 
			
			
		}
		String result = new String(messager);
		System.out.println("Encrypted: " + result);
		input.close();



	}

}
/* Screen Dump
 * Enter a string: 
Hello, how are you
Encrypted: Jgnnq, jqy ctg {qw


*/