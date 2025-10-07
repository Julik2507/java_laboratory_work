public class Math {

    public long calcFactorial(long value) {
        long total = 1;
        for(int i = 2; i <= value; i++) {
            total *= i;
        }
        return total;
    }

    public void calcFactorial() {
        System.out.println("+------+----------------------------+");
        System.out.printf("| %-4s | %-26s |%n", "n", "n!");
        System.out.println("+------+----------------------------+");

        long total = 1;
        for(int i = 1; i <= 20; i++) {
            for(int j = 2; j <= i; j++) {
                total *= j;
            }
            System.out.printf("| %-4d | %-26d |%n", i, total);
            total = 1;
        }
        System.out.println("+------+----------------------------+");
    }


}
