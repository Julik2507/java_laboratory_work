public class Rectangle extends Parallelogram {
    
    public Rectangle(Point a, Point b, Point c, Point d) {
        super(a,b,c,d);
    }

    public int square(int length, int width) {
        return (length * width);
    }
}
