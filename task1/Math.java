public class Math {

    public long calcFactorial(long value) {
        long total = 1;
        for(int i = 2; i <= value; i++) {
            total *= i;
        }
        return total;
    }

    public long calcFactorial() {
        long total = 1;
        for(int i = 1; i <= 20; i++) {
            for(int j = 2; j <= i; j++) {
                total *= j;
            }
            System.out.printf("Factorial %d = %d\n", i, total);
            total = 1;
        }
        return total;
    }


}
