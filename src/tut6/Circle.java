package tut6;

public class Circle extends Shape2D{
    double radius = 1.0;
    public Circle(){};
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, Colors color, boolean filled) {
        super(color,filled);
        setRadius(radius);
    }
    public Circle (double radius, Colors color, boolean filled, Point2D p) {
        super(color,filled,p);
        setRadius(radius);
    }
    public double getRadius () {
        return radius;
    }
    public void setRadius (double radius) {
        try {
            this.radius = radius;
        }catch (Exception E) {
            System.out.println("Can't set radius. Try again with the correct format");
        }
    }
    public double getArea(){
        return Math.PI * radius * radius ;
    }
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }
    public String toString () {
        return "Circle [radius = "+ radius +",Shape2D[color = " + getColor() + ",filled = " + isFilled() + ",position = " + getPosition() + "]";
    }
}
