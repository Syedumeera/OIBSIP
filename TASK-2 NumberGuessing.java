import java.util.Scanner;
public class NumberGuessing {
	    private static final int userGuess = 0;

		public static void main(String[] args) 
	    {
            Scanner sc = new Scanner(System.in);
	        int secretNumber = 1 + (int) (100 * Math.random());
	        // Generate a random number between 1 and 100
	        int maxTrials = 5;
	        // Maximum number of trials
            System.out.println("A number is chosen between 1 and 100.");
	        System.out.println("Guess the number within " + maxTrials + " trials.");

	        for (int trial = 1; trial <= maxTrials; trial++) {
	            System.out.print("Trial " + trial + ": Enter your guess: ");
	            int userGuess = sc.nextInt();

	            if (userGuess == secretNumber) {
	                System.out.println("Congratulations! You guessed the number.");
	                break;
	            } else if (userGuess < secretNumber) {
	                System.out.println("The number is greater than " + userGuess);
	            } else {
	                System.out.println("The number is less than " + userGuess);
	            }
	        }

	        if (secretNumber != userGuess) {
	            System.out.println("You have exhausted " + maxTrials + " trials.");
	            System.out.println("The secret number was " + secretNumber);
	        }
	    }
	}

