package skillbuilders;
public class Circle {

    private static final double PI = 3.14;
    private double radius;

    public Circle() {
        radius = 1;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public double area() {
        double circlearea = PI * radius * radius;
        return circlearea;
    }

    public double circumference() {
        double circlecircumference = PI * radius * 2;
        return circlecircumference;
    }

    public double getRadius() {
        return radius;
    }

    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else {
            if (obj instanceof Circle) {
                Circle other = (Circle) obj;
                if (this.radius == other.radius) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    
    public String toString() {
        return "Circle's radius: " + radius + ", area: " + area() + ", circumference: " + circumference();
    }
}
