
public class Main {

    public static void main(String[] args) {

        Point a = new Point(10, 0);
        Point b = new Point(20, 0);
        Point c = new Point(20, 10);
        Point d = new Point(10, 20);

        // Quadrilateral shape1 = new Quadrilateral(a, b, c, d);
        Trapezoid shape1 = new Trapezoid(a, b, c, d);
        Parallelogram shape2 = new Parallelogram(a, b, c, d);
        Rectangle shape3 = new Rectangle(a, b, c, d);
        Square shape4 = new Square(a, b, c, d);
        // System.out.println(a.getX());
        // Point quad_a = shape2.getA();
        System.out.println(shape1.square(12, 25, 5));
        System.out.println(shape2.square(20, 30));
        System.out.println(shape3.square(30, 40));
        System.out.println(shape3.square(30, 40));
        System.out.println(shape4.square(50));
    }

}