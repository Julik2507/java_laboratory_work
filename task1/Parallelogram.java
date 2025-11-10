public class Parallelogram extends Trapezoid {
    
    public Parallelogram(Point a, Point b, Point c, Point d) {
        super(a,b,c,d);
    }

    public int square(int side, int height) {
        return (side * height);
    }


}