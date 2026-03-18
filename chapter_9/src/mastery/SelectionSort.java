/*

Program: SelectionSort.java       		Date: March 17, 2026
Sorted Array is used in this
Purpose: Create an application that produces a random array of given size and then sorts it from smallest to largest
Author: Karanveer S
School: CHHS
Course: Computer Science 20
 

*/
package mastery;

public class SelectionSort {
	    private int[] originalArray;
	    private int[] sortedArray;

	    public SelectionSort(int[] arr) {
	        this.originalArray = arr;
	        this.sortedArray = new int[arr.length]; 
	        for (int k = 0; k < arr.length; k++) {
	            this.sortedArray[k] = arr[k];
	        }

	        
	        for (int i = 0; i < arr.length; i++) {
	        	int minIndex = i;  //choose  current as smallest number
	        	for (int x = i + 1; x < sortedArray.length; x++) {
	                if (sortedArray[x] < sortedArray[minIndex]) {
	                    minIndex = x; // Scan the rest of the array to find the index of the smallest remaining element
	                }
	            }

	        	int temp = sortedArray[i]; //temporary is the "smallest" number found.
	            sortedArray[i] = sortedArray[minIndex]; //array i is now array minIndex so if x was smaller than i, x now "becomes" i in the next iteration
	            sortedArray[minIndex] = temp; //declare minIndex as new temporary smallest number

	            	
	            	
	            	
	            }
	        }
	    public int[] getSortedArray() {
	        return sortedArray; //return function so array can be called
	    }
	        }

