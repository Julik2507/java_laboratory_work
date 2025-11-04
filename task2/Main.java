public class Main {
    public static void main(String[] args) {

        try {
            Rational myRational = new Rational(0, 0);

            System.out.println(myRational.toString());
            System.out.println(myRational.toDouble());
            

        } catch(ArithmeticException e) {
            System.out.println("На ноль делить нельзя"+e.getMessage());
        }
        
        
        Rational myRational2 = new Rational();
        Rational myRational3 = new Rational();
    
        Rational.addition(myRational2, myRational3);
        Rational.subtraction(myRational2, myRational3);
        Rational.multiplication(myRational2, myRational3);
        Rational.division(myRational2, myRational3);

        System.out.println(myRational2.toString());
        System.out.println(myRational2.toDouble());
    }
}   