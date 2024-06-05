package tut6;



abstract public class Shape2D implements Shape2DCalculation {
    private Colors color = Colors.WHITE;
    private boolean filled = false;
    Point2D position = new Point2D();
    public Shape2D(){};
    public Shape2D(Point2D position){
        setPosition(position);
    }
    public Shape2D(Colors color, boolean filled) {
        setColor(color);
        setFilled(filled);
    }
    public Shape2D(Colors color,boolean filled,Point2D position){
        setColor(color);
        setFilled(filled);
        setPosition(position);
    }



    public Colors getColor () {
        return this.color;
    }

    public void setColor(Colors color) {
        try {
            this.color = color;
        }catch (Exception e) {
            System.out.println("wrong color");
        }
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean isFilled) {
        try{
            filled = isFilled;
        }catch (Exception e) {
            System.out.println("Can't set Filled. Wrong format");
        }
    }
    public Point2D getPosition () {
        return this.position;
    }
    public void setPosition(Point2D p) {
        try{
            position = p;
        }catch (Exception e) {
            System.out.println("can't set position. Please try again with correct format");
        }
    }
    public String toString () {
        return "Shape2D[color = "+color+",filled = "+filled+", position = "+position+"]";
    }







}
