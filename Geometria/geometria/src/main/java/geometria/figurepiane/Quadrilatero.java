package geometria.figurepiane;

public class Quadrilatero {
    protected Point2D a, b, c, d;

    public Quadrilatero(Point2D a, Point2D b, Point2D c, Point2D d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }


    public static boolean controllaAllineamento(Point2D a, Point2D b, Point2D c, Point2D d) {

        double determinant1 = (b.getY() - a.getY()) * (c.getX() - d.getX()) -
                              (d.getY() - c.getY()) * (a.getX() - b.getX());

        double determinant2 = (c.getY() - b.getY()) * (a.getX() - d.getX()) -
                              (d.getY() - a.getY()) * (b.getX() - c.getX());

        return determinant1 == 0 && determinant2 == 0;

    }
}