package skillbuilders;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle() {
        length = 1;
        width = 1;
    }

    public Rectangle(double l, double w) {
        length = l;
        width = w;   
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;
            return this.length == other.length && this.width == other.width;
        }
        return false;
    }

    public String toString() {
        return "Rectangle length: " + length + ", width: " + width + ", area: " + area() + ", perimeter: " + perimeter();
    }
}
