import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minRange = 1; // Minimum number in the range
        int maxRange = 100; // Maximum number in the range
        int attempts = 5; // Number of attempts allowed

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the number between " + minRange + " and " + maxRange);

        int score = 0; // Initialize score

        booleann playAgain = true;
        while (playAgain) {
            int randomNumber = generateRandomNumber(minRange, maxRange);
            int attemptCount = 0; // Initialize attempt count for each round

            while (attemptCount < attempts) {
                System.out.print("Enter your guess (" + (attempts - attemptCount) + " attempts left): ");
                int userGuess = scanner.nextInt();
                attemptCount++;

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    score++; // Increment score if the guess is correct
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (attemptCount == attempts) {
                System.out.println("Oops! You've used all your attempts. The correct number was: " + randomNumber);
            }

            System.out.println("Your current score: " + score);

            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = scanner.next();
            playAgain = playChoice.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    // Method to generate a random number within a specified range
    public static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
