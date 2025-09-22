import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        PcUsers person = new PcUsers();

        System.out.print("Сколько минут сидели за ПК: ");
        person.minutesOnPc = myScanner.nextInt();

        person.countDaysWithHours();

        System.out.println("Вы сидели за ПК " + person.days + " дней " + person.hours + " часов!");

        person.getRecommendation();

    }

}