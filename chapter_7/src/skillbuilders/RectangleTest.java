package skillbuilders;

public class RectangleTest {

	public static void main(String[] args) {


        Rectangle r1 = new Rectangle(); 
        Rectangle r2 = new Rectangle(); 
        Rectangle r3 = new Rectangle(5, 3);
        Rectangle r4 = new Rectangle(5, 3);

		        System.out.println(r1.toString());
		        System.out.println(r2.toString());
		        System.out.println(r3.toString());
		        System.out.println(r4.toString());

		        System.out.println(r1.equals(r2));
		        System.out.println(r3.equals(r4));
		        System.out.println(r1.equals(r3));
		    }
		}

