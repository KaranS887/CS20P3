/*

Program: SortedArray.java       		Date: March 17, 2026

Purpose: Create an application that produces a random array of given size and then sorts it from smallest to largest
Author: Karanveer S
School: CHHS
Course: Computer Science 20
 

*/
package mastery;
import java.util.Scanner;
import java.util.Arrays;
public class SortedArray {
	

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int[] myNums;
		System.out.println("How many values in the array? "); 
		int amount = input.nextInt();
		myNums = new int[amount]; //put users chosen amount of nums in declared array

		for (int i = 0; i < amount; i++) {
			myNums[i] = (int)(Math.random() * 101); //add random, unsorted values to array
		}
		System.out.println("Original array: " + Arrays.toString(myNums)); //display array as string
		
		SelectionSort sorter = new SelectionSort(myNums); //new SelectionSort object
		String newsort = Arrays.toString(sorter.getSortedArray()); //call method that returns sorted string after operation is done in constructor
//also turn new sort to a string
		System.out.println("Sorted array: " + newsort); //display array as string
		input.close();
		
		
		
		

		
	
		

	}

}
/* Screen Dump
 * How many values in the array? 
8
Original array: [1, 82, 26, 47, 76, 49, 39, 12]
Sorted array: [1, 12, 26, 39, 47, 49, 76, 82]

 

*/
