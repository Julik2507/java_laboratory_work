import java.util.Scanner;

public class Booking {

    private static boolean[] seats = {false, false, false, false, false,
                           false, false, false, false, false};

    private static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        String answer;
        boolean status = true;
        int counter = 0;
        
        while(status && counter != 10) {
            System.out.println("Выбрать место в бизнес-классе - 1");
            System.out.println("Выбрать место в эконом-классе - 2");
            System.out.println("Выйти - 0");
            int value = myScanner.nextInt();
            myScanner.nextLine();
            if(value == 0 ) break;

            if(value == 1 || value == 2) {
                if(!choseSeat(value)) {
                    status = false;
                    break;
                }
            }

            System.out.println("Хотите продолжить выбор мест? да / нет");
            // myScanner.nextLine();
            answer = myScanner.nextLine();
            if(answer.equals("нет")) break;

            System.out.print("\033\143");
        }
    }

    public static boolean choseSeat(int typeOfSeat) {
        int counter = 0;
        String answer;
        if(typeOfSeat == 1) {
            for(int i=0; i<5; i++) {
                if(seats[i] == true) counter++;
            }

            if(counter < 5) {
                pickBusiness();
                counter = 0;
            } else if(counter == 5) {
                System.out.println("В бизнесе мест нет, хотите эконом? да / нет");
                // myScanner.nextLine();
                answer = myScanner.nextLine();
                if(answer.equals("нет")) return false;

                pickEconomy();
            }
        } else if(typeOfSeat == 2) {
            for(int i=5; i<10; i++) {
                if(seats[i] == true) counter++;
            }

            if(counter < 5) {
                pickEconomy();
                counter = 0;
            } else if(counter == 5) {
                System.out.println("В экономе мест нет, хотите эконом? да / нет");
                // myScanner.nextLine();
                answer = myScanner.nextLine();
                if(answer.equals("нет")) return false;

                pickBusiness();
            }
        }
        return true;
    }

    public static void pickBusiness() {
                //  System.out.println("tesssssssssssst");
        for(int i=0; i<5; i++) {
            if(seats[i] == false) {
                seats[i] = true;
                break;
            }
        }
        System.out.println("Оформление бизнес-класса прошло успешно!");
    }

    public static void pickEconomy() {
        for(int i=5; i<10; i++) {
            if(seats[i] == false) {
                seats[i] = true;
                break;
            }
        }
        System.out.println("Оформление эконом-класса прошло успешно!");

    }

}