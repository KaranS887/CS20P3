/*

Program: Investment.java       		Date: February 9th, 2026

Purpose: Create an application that displays the years it takes for a $2500 investment to reach $5000

Author: Karanveer S.
School: CHHS
Course: Computer Science 20
 

*/
package mastery;
public class Investment {

	public static void main(String[] args) {
		double n = 2500.0;
		int years = 0;

		do {
				n += 0.075*n;
				years++;
            
                    } while (n < 5000);
		System.out.println("Total years: " + years);

		

	}

}


/* Screen Dump

Total years: 10
 

*/
 

