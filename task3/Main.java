public class Main {

    public static void main(String[] args) {

        findPi(200000);
        findPi();

        
    }

    public static void findPi(int quantity) {
        double division = 0;

        System.out.println("+------+--------------+");
        System.out.printf("| %-4s | %-10s |%n", "n", "π");
        System.out.println("+------+--------------+");

        for (int i = 0; i < quantity; i++) {

            division += (i % 2 == 0 ? 1.0 : -1.0) / (2 * i + 1);
            double pi = 4 * division;

            System.out.printf("| %-4d | %-10f |%n", i+1, pi);

        }
        System.out.println("+------+--------------+");

    }

    public static void findPi() {
        double division = 0;

        for (int i = 0; i < 200000; i++) {

            division += (i % 2 == 0 ? 1.0 : -1.0) / (2 * i + 1);
            double pi = 4 * division;

            if (pi >= 3.14159 && pi < 3.14160) {
                System.out.println("n = " + (i + 1) + "  π ≈ " + pi);
                break;
            }

        }
    }

}