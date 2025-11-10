public class Trapezoid extends Quadrilateral {
    
    public Trapezoid(Point a, Point b, Point c, Point d) {
        super(a,b,c,d);
    }

    public double square(int upSide, int downSide, int height) {
        return (0.5 * (upSide + downSide) * height);
    }


}