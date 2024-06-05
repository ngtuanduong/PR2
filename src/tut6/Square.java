package tut6;

public class Square extends Rectangle {
    public Square() {}

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, Colors color, boolean filled) throws Exception {
        super(side, side, color, filled);
    }

    public Square(double side, Colors color, boolean filled, Point2D position) throws Exception {
        super(side, side, color, filled, position);
    }

    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }
    @Override

    public double getArea() {
        return getSide()*getSide();
    }
    public double getPerimeter () {
        return getSide() * 4;
    }

    @Override
    public String toString() {
        return "Square[Rectangle[Shape2D[color=" + getColor() + ",filled=" + isFilled() + ",width=" + getWidth() + ",length=" + getLength() + "]";
    }
}