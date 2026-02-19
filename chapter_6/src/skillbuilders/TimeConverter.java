/*

Program: TimeConverter.java       		Date: February 18th, 2026

Purpose: Create an application that converts time to other values
Author: Karanveer S.
School: CHHS
Course: Computer Science 20
 

*/
package skillbuilders;
import java.util.Scanner;
public class TimeConverter {
	public static double HtoM(int hours) {
		return hours * 60;
	}
	public static double DtoH(int days) {
		return days * 24;
	}
	public static double MtoH(int minutes) {
		return minutes/60;
	}
	public static double HtoD(int hours) {
		return hours/24;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Select conversion:\n1: Hours to Minutes\n2: Days to Hours\n3: Minutes to Hours\n4: Hours to Days");
		int choice = input.nextInt();
		System.out.print("Enter value to convert: ");
        int value = input.nextInt();
        
        switch (choice) {
        case 1 -> System.out.println(value + " hours = " + HtoM(value) + " minutes");
        case 2 -> System.out.println(value + " days = " + DtoH(value) + " hours");
        case 3 -> System.out.println(value + " minutes = " + MtoH(value) + " hours");
        case 4 -> System.out.println(value + " hours = " + HtoD(value) + " days");
        default -> System.out.println("Invalid selection.");
    }
    
    input.close();


        


		

	}

}
/* Screen Dump
Select conversion:
1: Hours to Minutes
2: Days to Hours
3: Minutes to Hours
4: Hours to Days
1
Enter value to convert: 2
2 hours = 120.0 minutes



 

*/