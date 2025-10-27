import java.util.Random;

public class Rational {

    public record DtoRational(int numerator, int denumerator) {}

    private Random myRandom = new Random();

    private int numerator;
    private int denumerator;

    public Rational(int numerator, int denumerator) {
 
        DtoRational obj = makeShort(numerator, denumerator); ///////////CHECK!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        
        this.numerator = obj.numerator();
        this.denumerator = obj.denumerator();
        // System.out.printf("%d %d", this.numerator, this.denumerator);
    }

    public Rational() {

        DtoRational obj = makeShort(myRandom.nextInt(50), myRandom.nextInt(50));

        this.numerator = obj.numerator();
        this.denumerator = obj.denumerator();        
    }


    public static DtoRational makeShort(int a, int b) {
        int numerator = a;
        int denumerator = b;
        int division;
            while(b != 0) {
                division = a % b;
                a = b;
                b = division;
            }
        int nod = a;
        numerator = numerator / a;
        denumerator = denumerator / a;
        return new DtoRational(numerator, denumerator);
    }

    public static DtoRational addition(Rational a, Rational b) {
        
        int summNumerator = (a.getNumerator()*b.getDenumerator()) + (b.getNumerator()*a.getDenumerator());
        int summDenumerator = a.getDenumerator() * b.getDenumerator();

        return makeShort(summNumerator, summDenumerator); //check
    }

    public static DtoRational subtraction(Rational a, Rational b) {
        
        int subNumerator = (a.getNumerator()*b.getDenumerator()) - (b.getNumerator()*a.getDenumerator());
        int subDenumerator = a.getDenumerator() * b.getDenumerator();

        return makeShort(subNumerator, subDenumerator); //check
    }

    public static DtoRational multiplication(Rational a, Rational b) {
    
        int multNumerator = a.getNumerator() * b.getNumerator();
        int multDenumerator = a.getDenumerator() * b.getDenumerator();

        return makeShort(multNumerator, multDenumerator); //check
    }

    public static DtoRational division(Rational a, Rational b) {
    
        int divNumerator = a.getNumerator() * b.getDenumerator();
        int divDenumerator = b.getNumerator() * a.getDenumerator();

        return makeShort(divNumerator, divDenumerator); //check
    }

    public String toString() {
        return String.format("===== %d / %d =====", this.numerator, this.denumerator);
    }

    public double toDouble() {
        return (double)this.numerator / this.denumerator;
    }    

    public int getNumerator() {return this.numerator;}
    public int getDenumerator() {return this.denumerator;}
}