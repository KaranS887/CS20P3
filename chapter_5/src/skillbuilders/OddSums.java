package skillbuilders;
import java.util.Scanner;
public class OddSums {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int num = input.nextInt(); 
		int sum = 0;
		for(int i = 0; i <= num ; i++) {
			
			if (i % 2 != 0) {
				sum += i;}
			}
		   System.out.println("Sum: " + sum);  
		   input.close();
		}
    
	
		

	}

