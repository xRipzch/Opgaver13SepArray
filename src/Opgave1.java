import java.util.Arrays;
import java.util.Random;


public class Opgave1 {
    public static void main(String[] args) {

    printNewline();
    Random random = new Random();
    int[] numbers = new int[10];
    int[] moreNumbers = new int[100];
    int[] handyNumbers = new int[10];

        System.out.println("Opgave A");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;

            System.out.println(numbers[i]);
        }
        printNewline();
        System.out.println("Opgave B");
        for (int i = 0; i < 10; i++) {
            moreNumbers[i] = random.nextInt(100) + 1;
            System.out.println(moreNumbers[i]);
        }


        printNewline();
        char[] bogstaver = new char[10];
        System.out.println("Opgave C");
        for (char i = 'a'; i <= 'j'; i++) {
            bogstaver[i - 'a'] = i;
            System.out.print(bogstaver[i - 'a']);
        }

        printNewline(); {
            System.out.println("Opgave D");
            String[] ripRapper = {"Rip", "Rap", "Rup"};
            System.out.println(Arrays.toString(ripRapper));
        }


        printNewline();
        System.out.println("Opgave F");
        for (int i = 0; i < handyNumbers.length; i++) {
            handyNumbers[i] = random.nextInt(100) + 1;
            if (handyNumbers[i] >= 40 && handyNumbers[i] <= 49) {
                System.out.println(handyNumbers[i]);
            }
        }

        }




    private static void printNewline() {
        System.out.println();
    }
}

