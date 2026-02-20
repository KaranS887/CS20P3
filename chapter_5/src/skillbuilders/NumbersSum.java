package skillbuilders;
import java.util.Scanner;
public class NumbersSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your number: ");
        int num = input.nextInt(); 
        input.close(); 
        int c = 1;                            
        int sum = 0;                              

        while (c <= num) {                  
            System.out.println(c);           
            sum += c;                //adds every number from 1 to the number the user types in        
            c++;                             
        }

        System.out.println("Sum = " + sum);     //gives sum of number

		
		

	}

}
