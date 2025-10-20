import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String answer;
        boolean status = true;
        int startBound = 1;
        int finishBound = 1000;
        
        Random random = new Random();
        Scanner myScanner = new Scanner(System.in);
       
        int secretValue = random.nextInt(finishBound - startBound +1) + startBound;
        System.out.println(secretValue);
        while(status) {
            System.out.println("Угадайте число от 1 до 1000 (введите 0 для выхода):");
            int value = myScanner.nextInt();
            if(value == 0) break;

            if(value < secretValue) {
                System.out.println("Загаданное число больше!");
            } else if(value > secretValue) {
                System.out.println("Загаданное число меньше!");
            } else if(value == secretValue) {
                System.out.println("Поздравляю! Вы угадали число!"); 
                
                System.out.println("Хотите продолжить игру? да / нет");
                myScanner.nextLine();
                answer = myScanner.nextLine();
                if(answer.equals("нет")) status = false; 
            }
        }

    }

}