/*

Program: MySavings.java       		Date: March 9, 2026

Purpose: Create an application that lets the user input how many of each coin they have in a piggy bank object. They can then perform operations with the money
Author: Karanveer S
School: CHHS
Course: Computer Science 20
 

*/
package mastery;

public class MySavings {
	
	    private int pennies, nickels, dimes, quarters;

	    public MySavings() {
	        this.pennies = 0; this.nickels = 0; this.dimes = 0; this.quarters = 0;
	    }
	    public void addPenny(int count) { pennies += count; }//add as many of coin as user chooses
	    public void addNickel(int count) { nickels += count; } //add as many of coin as user chooses
	    public void addDime(int count) { dimes += count; }//add as many of coin as user chooses
	    public void addQuarter(int count) { quarters += count; }//add as many of coin as user chooses
	    
	    public double getTotal() {
	        return (pennies * 0.01) + (nickels * 0.05) + (dimes * 0.10) + (quarters * 0.25);
	    }

	    public void takeOutMoney() {
	        this.pennies = 0; this.nickels = 0; this.dimes = 0; this.quarters = 0;  //remove all coins
	        System.out.println("Piggy bank emptied!");
	    }
	} 

