/*

Program: MySavings.java       		Date: March 9, 2026

Purpose: Create an application that lets the user input how many of each coin they have in a piggy bank object. They can then perform operations with the money
Author: Karanveer S
School: CHHS
Course: Computer Science 20
 

*/
package mastery;
import java.util.Scanner;
public class MySavings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        MySavingsTest myBank = new MySavingsTest();
        int choice = 0;  

        
        while (choice != 7) {
            System.out.println("\n1. Show total\n2. Add penny\n3. Add nickel");
            System.out.println("4. Add dime\n5. Add quarter\n6. Take out money\n7. Quit");  //loop until user quits
            System.out.print("Enter choice: ");
            
            choice = input.nextInt(); 

            switch (choice) {
                case 1: 
                    System.out.printf("Total: $%.2f\n", myBank.getTotal()); 
                    break;
                case 2: 
                    System.out.print("How many pennies to add? "); //call object method
                    int p = input.nextInt();
                    myBank.addPenny(p); 
                    break;
                case 3: 
                    System.out.print("How many nickels to add? ");//call object method
                    int n = input.nextInt();
                    myBank.addNickel(n);
                    break;
                case 4: 
                    System.out.print("How many dimes to add? ");//call object method
                    int d = input.nextInt();
                    myBank.addDime(d); 
                    break;
                case 5: 
                    System.out.print("How many quarters to add? ");//call object method
                    int q = input.nextInt();
                    myBank.addQuarter(q); 
                    break;

                case 6: myBank.takeOutMoney(); break; //call object method
                case 7: System.out.println("Bye"); break; //leave code
                default: System.out.println("Invalid choice.");
            }
        }
        input.close();
    }


	}
/* Screen Dump
1. Show total
2. Add penny
3. Add nickel
4. Add dime
5. Add quarter
6. Take out money
7. Quit
Enter choice: 4
How many dimes to add? 25

1. Show total
2. Add penny
3. Add nickel
4. Add dime
5. Add quarter
6. Take out money
7. Quit
Enter choice: 1
Total: $2.50

1. Show total
2. Add penny
3. Add nickel
4. Add dime
5. Add quarter
6. Take out money
7. Quit
Enter choice: 7
Bye




 

*/


