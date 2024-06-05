package tut6;

public class Point2D {

    private double x = 0.0;
    private double y = 0.0;


    public Point2D() {}

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void increaseX (double amount) {
        this.x += amount;
    }
    public void increaseY (double amount) {
        this.y += amount;
    }


    public double getDistanceTo (double x,double y) {
        return Math.sqrt(Math.pow((this.x-x),2)+Math.pow(this.y-y,2));
    }
    public double getDistanceTo (Point2D p) {
        return Math.sqrt(Math.pow((this.x-p.x),2)+Math.pow(this.y-p.y,2));
    }
    public String toString () {
        return  "(" + x + ", " + y + ")" ;
    }

}
