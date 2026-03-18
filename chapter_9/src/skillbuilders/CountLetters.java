package skillbuilders;
import java.util.Scanner;

public class CountLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What phrase do you want to see words of: ");
		String user = input.nextLine();
		String realuser = user.replaceAll("[^a-zA-Z]", "");
		char[] realusera = realuser.toCharArray();
		int count = 0;

		for (char chr : realusera) {
			count ++;
			
			
		}
		System.out.println("Amount of letters: " + count);

		
		input.close();
		

	}

}
