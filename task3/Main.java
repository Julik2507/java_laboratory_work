import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Feature person = new Feature();

        System.out.print("Введите имя: ");
        person.name = myScanner.nextLine();
        System.out.print("Введите возраст: ");
        person.age = myScanner.nextInt();

        String status = person.chooseStatus(person.age);
        String fullName = person.name + " " + status;

        System.out.print(fullName);
    }

}