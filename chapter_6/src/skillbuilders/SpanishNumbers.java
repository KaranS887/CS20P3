/*

Program: SpanishNumbers.java       		Date: February 18th, 2026

Purpose: Create an application that lists the spanish numbers from 1-10
Author: Karanveer S.
School: CHHS
Course: Computer Science 20
 

*/
package skillbuilders;

public class SpanishNumbers {
	public static String spanish(int choice) {
	    return switch (choice) {
	        case 1 -> "uno";
	        case 2 -> "dos";
	        case 3 -> "tres";
	        case 4 -> "cuatro";
	        case 5 -> "cinco";
	        case 6 -> "seis";
	        case 7 -> "siete";
	        case 8 -> "ocho";
	        case 9 -> "nueve";
	        case 10 -> "diez";
	        default -> "number can't below 1 or past 10"; 
	    };
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
	        String word = spanish(i);
	        System.out.println(i + ": " + word);
	    }
	}

		

	}
/* Screen Dump
1: uno
2: dos
3: tres
4: cuatro
5: cinco
6: seis
7: siete
8: ocho
9: nueve
10: diez


 

*/

