import java.util.Random;
import java.util.Arrays;

public class Opgave3 {
    public static void main(String[] args) {
        new Opgave3().run();
    }

    private void run() {
        Random random = new Random();


        System.out.println("Opgave C");
    int[] numbers = new int[100];
    for (int i = 0; i < numbers.length; i++) {
        numbers[i] = random.nextInt(10) + 1;
    }
        System.out.println("5'ere på Index nummer: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 5) {
                System.out.println(i);
            }
            
        }


}}