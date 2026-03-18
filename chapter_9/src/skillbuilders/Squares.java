package skillbuilders;

public class Squares {

	public static void main(String[] args) {
		int[] square = new int[5];
		for (int i = 0; i < 5; i++) {
			square[i] = (i * i);
			
		}
		for (int i = 0; i < square.length; i++) {
		    System.out.println((i) + ". " + square[i]);
		}
		
	}

}
