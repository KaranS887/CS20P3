package skillbuilders;
import java.util.Scanner;
public class StudentRoster {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter how many students are in the class: ");
		int size = input.nextInt();
		input.nextLine();
		String[] classroom = new String[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Enter name " + (i + 1) + ": ");
		    classroom[i] = input.nextLine(); 

			
			
		}
		input.close();
		System.out.println("Student Roster: ");
		for (int i = 0; i < classroom.length; i++) {
		    System.out.println((i + 1) + ". " + classroom[i]);
		}

		

		

		

	}

}
