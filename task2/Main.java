import java.util.Scanner;

public class Main {
    static String gift = "Вы получаете подарочный купон";


    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Feature receipt = new Feature();

        receipt.price = myScanner.nextDouble();
        receipt.quantity = myScanner.nextInt();
        receipt.discount = myScanner.nextDouble();

        double totalPrice = receipt.countTotalPrice();
        System.out.println("Итог. стоимость: " + totalPrice + "$");

        if(totalPrice > 100) System.out.println(gift);

    }

}