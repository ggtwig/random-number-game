import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int playerGuess = 0;
        int totalScore = 0;
        int roundsPlayed = 0;
        boolean validAnswer = false;
        boolean validReply = false;
        boolean continuePlaying = true;
        String continueResponse;

        System.out.println("Welcome to the Random Number Game!");
        System.out.println("");
        System.out.println("A random number will be generated 1 to 10 and your aim is to guess the number!");
        System.out.println("");

        while (continuePlaying) {

            int randomNumber = random.nextInt(10) + 1;

            while (!validAnswer) {
                System.out.print("Please enter a number [1-10]: ");
                if (scanner.hasNextInt()) {
                    playerGuess = scanner.nextInt();
                    scanner.nextLine();
                    if (playerGuess > 0 && playerGuess <= 10) {
                        validAnswer = true;
                    } else {
                        System.out.println("Invalid Input!");
                    }
                } else {
                    scanner.nextLine();
                    System.out.println("Invalid Input!");
                }
            }

            validAnswer = false;

            if (playerGuess == randomNumber) {
                totalScore += 1;
                System.out.println("Correct!");
                System.out.println("+1 point, current score: " + totalScore);
            } else {
                System.out.println("Incorrect guess. Random number was: " + randomNumber + "!");
                System.out.println("Current score is: " + totalScore);
            }

            roundsPlayed += 1;

            while (!validReply) {
                System.out.print("Would you like to play another round? [Y/N]: ");
                continueResponse = scanner.nextLine();
                    if (continueResponse.equalsIgnoreCase("no") || continueResponse.equalsIgnoreCase("n")) {
                        System.out.println("Thanks for playing!");
                        System.out.println("Final score was: " + totalScore + " with " + roundsPlayed + " rounds played!");
                        validReply = true;
                        continuePlaying = false;
                    } else if (continueResponse.equalsIgnoreCase("yes") || continueResponse.equalsIgnoreCase("y")) {
                        System.out.println("Starting the next round!");
                        System.out.println("Current score is: " + totalScore + " with " + roundsPlayed + " rounds played!");
                        validReply = true;
                    } else {
                        System.out.println("Invalid Input!");
                    }
            }

            validReply = false;

        }
    }
}
