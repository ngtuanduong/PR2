package tut6;

public class Rectangle extends Shape2D{
    private double length = 1.0;
    private double width = 1.0;
    public Rectangle () {};
    public Rectangle (double length, double width) {
        setLength(length);
        setWidth(width);
    }
    public Rectangle (double length, double width, Colors color, boolean filled) {
        super(color,filled);
        setWidth(width);
        setLength(length);
    }
    public Rectangle (double length, double width, Colors color, boolean filled, Point2D position) {
        super(color,filled,position);
        setWidth(width);
        setLength(length);
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {

        try{
            this.length = length;
        }catch (Exception e) {
            System.out.println("Can't set length. Try again with correct format.");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        try{
            this.width = width;
        }catch (Exception e) {
            System.out.println("Can't set width. Try again with correct format.");
        }
    }
    public double getArea () {
        return width * length;
    }
    public double getPerimeter() {
        return 2 * (width + length);
    }
    public String toString() {
        return "Rectangle[length = " + length + ",width = " + width + ",Shape2D[color = " + getColor() + ",filled = " + isFilled() + ",position = " + getPosition() + "]";
    }
}
