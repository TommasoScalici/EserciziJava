package geometria;

import java.util.*;

import geometria.figurepiane.*;

public final class App {

    private static final Scanner scanner = new Scanner(System.in);


    private App() {
    }

    public static void main(String[] args) {
        Point2D a, b, c, d;
        double x, y;

        System.out.print("Inserisci le coordinate del punto A (separate da spazi): ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        a = new Point2D(x, y);

        System.out.print("Inserisci le coordinate del punto B (separate da spazi): ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        b = new Point2D(x, y);

        System.out.print("Inserisci le coordinate del punto C (separate da spazi): ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        c = new Point2D(x, y);

        System.out.print("Inserisci le coordinate del punto D (separate da spazi): ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        d = new Point2D(x, y);

        System.out.println(Quadrilatero.controllaAllineamento(a, b, c, d));
    }
}
