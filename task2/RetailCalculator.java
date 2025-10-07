import java.util.Scanner;

public class RetailCalculator {
    public static void main(String[] args) {

        Product myProduct1 = new Product(1, 2.98);
        Product myProduct2 = new Product(2, 4.50);
        Product myProduct3 = new Product(3, 9.98);
        Product myProduct4 = new Product(4, 4.49);
        Product myProduct5 = new Product(5, 6.87);

        boolean status = true;
        int numberOfProduct, quantityOfProduct;
        double price=0, total=0;

        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Введите номер товара(1-5) и количество. Выход - 0: \n");

        while(true) {
            
            System.out.print("Введите номер товара: ");

            numberOfProduct = myScanner.nextInt();
            if(numberOfProduct == 0) {
                status = false;
                break;
            }

            switch(numberOfProduct) {
                case 1: price = myProduct1.getPrice(); break;
                case 2: price = myProduct2.getPrice(); break;
                case 3: price = myProduct3.getPrice(); break;
                case 4: price = myProduct4.getPrice(); break;
                case 5: price = myProduct5.getPrice(); break;
            }
            
            System.out.print("Введите количество товара: ");

            quantityOfProduct = myScanner.nextInt();
            if(quantityOfProduct == 0) {
                status = false;
                break;
            }

            total += price * quantityOfProduct;

            System.out.printf("Итоговая стоимость: %.2f $\n", total);

        }
        System.out.printf("\nИтоговая стоимость: %.2f $\n", total);

    }
}