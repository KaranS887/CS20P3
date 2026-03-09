package skillbuilders;
public class CircleTest {

    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle();

        c1.setRadius(5);
        c2.setRadius(5);
        c3.setRadius(3);

        System.out.println("c1: " + c1.toString());
        System.out.println("c2: " + c2.toString());
        System.out.println("c3: " + c3.toString());

        System.out.println("c1 equals c2: " + c1.equals(c2));
        System.out.println("c1 equals c3: " + c1.equals(c3));

        System.out.println("c1 radius: " + c1.getRadius());
        System.out.println("c1 area: " + c1.area());
        System.out.println("c1 circumference: " + c1.circumference());
    }
}