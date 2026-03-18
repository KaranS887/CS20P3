/*

Program: Adder.java       		Date: March 9, 2026

Purpose: Create an application gives the user 2 random numbers to add together with 3 tries to get it before moving. Once quitting the program will show the user how well they did
Author: Karanveer S
School: CHHS
Course: Computer Science 20
 

*/
package mastery;

public class Adder {
	private int num1;
	private int num2;
	public String NumbersAndEquation() {
		num1 = (int)(Math.random() * 21); //random 2 numbers between 0-20
		num2 = (int)(Math.random() * 21);
		        
		return num1 + " + " + num2; 
		    }

	public boolean checkAnswer(int userInput) {
        return userInput == (num1 + num2); //confirm true for answer
    }
	public int getPoints(int attempt) {
        if (attempt == 1) return 5; //get it in time
        if (attempt == 2) return 3;
        if (attempt == 3) return 1;
        return 0;
    }

}



