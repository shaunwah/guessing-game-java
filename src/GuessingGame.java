import java.security.SecureRandom;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        final int MIN = 1;
        final int MAX = 100;

        Scanner scanner = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        final int RAND_NUMBER = rand.nextInt(MIN, MAX);
        System.out.printf("Guess a number between %d and %d.\n", MIN, MAX);

        while (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            if (input > RAND_NUMBER) {
                System.out.printf("%d is too big!\n", input);
            } else if (input < RAND_NUMBER)  {
                System.out.printf("%d is too small!\n", input);
            } else {
                System.out.printf("You've guessed %d correctly!\n", RAND_NUMBER);
                break;
            }
        }
    }
}
