import java.util.Random;

class B2GuessingGame extends ConsoleProgram {

  /**
   * Write a program GuessingGAME that lets the computer generate a secret number
   * 
   * @author: A. Su
   */

  public void run() {
    Random random = new Random();
        
        int intSecretNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        int intAttempts = 0;
        boolean blnGuessedCorrectly = false;
        
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Try to guess the secret number between 1 and 100.");
        
        while (intAttempts < 5) {
            int intGuess = readInt("");
            intAttempts++;
            
            if (intGuess == intSecretNumber) {
                blnGuessedCorrectly = true;
                break;
            } else if (intGuess < intSecretNumber) {
                System.out.println("Too low, guess again.");
            } else {
                System.out.println("Too high, guess again.");
            }
        }
        
        if (blnGuessedCorrectly) {
            System.out.println("Congratulations! You guessed the secret number.");
        } else {
            System.out.println("Nice try. The secret number was: " + intSecretNumber);
        }
  }
}
