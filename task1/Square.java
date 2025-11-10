public class Square extends Rectangle {
    
    public Square (Point a, Point b, Point c, Point d) {
        super(a,b,c,d);
    }

    public int square(int side) {
        return side*side;
    }
}