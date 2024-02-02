package number.guessing.game;

// To get input from the user.
import java.util.Scanner;

// To generate random number.
import java.util.Random; 

public class NumberGuessingGame {

    public static void main(String[] args) throws InterruptedException {

        // For generating random numbers.
        Random rand = new Random();

        // For reading user input.
        Scanner scanner = new Scanner(System.in);
      
        int randomNumber = rand.nextInt(100) + 1;

        // Greet the player and set the stage
        printWithDelay("Greetings, challenger. Dive into the unknown.",50);
        printWithDelay("Guess the number between 1 and 100. Goodluck",50);

        // Track the number of attempts
        int tryCount = 0;
        while(true) {

            // Get the player's guess
            int playerGuess = scanner.nextInt();
            tryCount++;
          
            // Check if the guess is correct
            if (playerGuess == randomNumber) {
                printWithDelay("Correct! ", 50);
                printWithDelay("Within the veil of shadows and numbers, \nit took you " + tryCount + " tries to grasp the elusive secrets. \nContinue the dance of guessing, as the enigma lingers. \nFortune favors the persistent. Goodluck on this mysterious path. ",50);
                break;
            }   
            // Provide hints for higher guesses
            else if(randomNumber > playerGuess) {
                printWithDelay("Higher", 50);
            }
            // Provide hints for lower guesses
            else {
                printWithDelay("Lower", 50);
            }
        }
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
    // Method to print text with a specified delay
    private static void printWithDelay(String text, int delay) throws InterruptedException {
      
      // Iterate through characters with delay
        for (char c : text.toCharArray()) {
            System.out.print(c);
            Thread.sleep(delay);
        }
        System.out.println();
  }    
}
