/*

Program: Adder.java       		Date: March 9, 2026

Purpose: Create an application gives the user 2 random numbers to add together with 3 tries to get it before moving. Once quitting the program will show the user how well they did
Author: Karanveer S
School: CHHS
Course: Computer Science 20
 

*/
package mastery;
import java.util.Scanner;

public class Adder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        AdderTest game = new AdderTest();
        int score = 0;
        int count = 0;
       
        System.out.println("Welcome to the Math Quiz! (999 to exit)");
        
        while (true) 
        {
            System.out.println(game.NumbersAndEquation());

            for (int tryNum = 1; tryNum <= 3; tryNum++) 
            {
                int userAnswer = input.nextInt();

                if (userAnswer == 999)
                {System.out.println("Score: " + score + "/" + (count * 5)); 
                input.close();
                return;
                }

                if (game.checkAnswer(userAnswer)) 
                {
                    score += game.getPoints(tryNum);
                    System.out.println("Correct!");
                    count += 1;
                    break; 
                } else 
                {
                    System.out.println(tryNum < 3 ? "Try again." : "Out of tries!");
                }
            }
           
        }
        			
            

        }

	/* Screen Dump
	 * Welcome to the Math Quiz! (999 to exit)
3 + 7
10
Correct!
9 + 2
11
Correct!
4 + 14
1
Try again.
1
Try again.
18
Correct!
0 + 8
999
Score: 11/15


	

	 

	*/
		
	
		

	}


