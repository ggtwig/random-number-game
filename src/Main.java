import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        int playerGuess = 0;
        int totalScore = 0;
        boolean validAnswer = false;

        System.out.println("Welcome to the Random Number Game!");
        System.out.println("");
        System.out.println("A random number will be generated 1 to 10 and your aim is to guess the number!");
        System.out.println("");

        while (!validAnswer) {
            System.out.print("Please enter a number [1-10]: ");
            if (scanner.hasNextInt()) {
                playerGuess = scanner.nextInt();
                scanner.nextLine();
                if (playerGuess > 0 && playerGuess <= 10) {
                    System.out.println("Valid Input!");
                    validAnswer = true;
                } else {
                    System.out.println("Invalid Input!");
                }
            } else {
                scanner.nextLine();
                System.out.println("Invalid Input!");
            }
        }

        if (playerGuess == randomNumber) {
            totalScore += 1;
            System.out.println("Correct!");
            System.out.println("+1 point, total score: " + totalScore);
        } else {
            System.out.println("Incorrect guess. Random number was: " + randomNumber + "!");
            System.out.println("Total score is: " + totalScore);
        }

    }

}
