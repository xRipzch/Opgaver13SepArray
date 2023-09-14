import java.util.Random;
import java.util.Arrays;


public class Opgave2 {
    public static void main(String[] args) {

        printNewline();
        Random random = new Random();
        double[] deciNumbers = new double[3];
        double sum = 0;
        int[] numbersC = new int[10];
        int sumAfC = 0;
        int max = 100;
        int min = 999;


        System.out.println("Opgave A");
        for (int i = 0; i < 3; i++) {
            deciNumbers[i] = random.nextDouble() * 10;
            System.out.println(deciNumbers[i]);
            sum += deciNumbers[i];

        }
        System.out.printf("Sum: " + sum);


        printNewline();
        System.out.println("Opgave B");
        int[] numbers = new int[10];
        for (int i = 0; i < 1; i++) {
            numbers[i] = random.nextInt(100) + 1;
            sum += numbers[i];

        double average = sum / 10;
        System.out.printf("Total af 10 tilfældige hel tal: %.2f ", sum + average);
        }

        printNewline();
        System.out.println("Opgave C");
        for (int i = 0; i < 10; i++) {
            numbersC[i] = random.nextInt(900) + 100;
            sumAfC += numbersC[i];

            if (numbersC[i] > max) {
                max = numbersC[i];
            }
            if (numbersC[i] < min) {
                min = numbersC[i];
            }
            System.out.println("Tilfældige tal mellem 100 og 999");
            for (int iC = 0; iC < 10; iC++) {
                System.out.println(numbersC[iC]);
            }
            System.out.println("Største tal: " + max);
            System.out.println("Mindste tal: " + min);
            System.out.println("Sum af tal: " + sumAfC / 10);
        }







    }private static void printNewline () {
            System.out.println();
        }
    }
