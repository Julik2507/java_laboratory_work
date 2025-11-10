public class Quadrilateral {

    public Point a,b,c,d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Point getA() {
        return this.a;
    }

    public Point getB() {
        return this.b;
    }

    public Point getC() {
        return this.c;
    }

    public Point getD() {
        return this.d;
    }
}