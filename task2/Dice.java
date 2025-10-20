import java.util.Random;

public class Dice {
    public static void main(String[] args) {

        Random random = new Random();

        int firstSpin, secondSpin, summ;
        int startBound = 1;
        int finishBound = 6;
        
        int counter = 0;
        int[] arr = new int[11];

        while(counter != 36000000) {

            firstSpin = random.nextInt(finishBound - startBound +1) + startBound;
            secondSpin = random.nextInt(finishBound - startBound +1) + startBound;

            summ = firstSpin + secondSpin;
            arr[summ-2] += 1; 
            
            summ = 0;
            counter++;
        }
    
        System.out.println("+------+--------------+");

        for(int i=0; i<11; i++) {
            System.out.printf("| %-4d | %-10d |%n", i+2, arr[i]);

            // System.out.printf("%d ", arr[i]);
        }
        System.out.println("+------+--------------+");

    }
}