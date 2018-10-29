package geometria.figurepiane;

public class Point2D {

    protected double x, y;


    public Point2D() { }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() { return x; }
    public double getY() { return y; }


    @Override
    public String toString() {
        return "X: " + x + "\nY: " + y;
    }
}