public class Main {

    public static void main(String[] args) {
        Math myMath = new Math();
        System.out.println(myMath.calcFactorial(20) + "\n");

        //без параметра
        myMath.calcFactorial();

        //факториал от 100
        System.out.println(myMath.calcFactorial(100) + "\n");

    }

}