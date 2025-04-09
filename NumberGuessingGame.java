import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame
{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int roundsWon =0;
		String playAgain;
		
		System.out.println("Welcome to the Number Guessing Game!");
		do {
			int secretNumber = random.nextInt(100) + 1;
			int attempts = 0;
			int maxAttempts = 5;
			boolean guessedCorrect = false;
			
			System.out.println("\nGuess a number between 1 and 100. You have " + maxAttempts + " attempts.");
			
			while (attempts < maxAttempts) {
				System.out.print("Enter your guess: ");
				int userGuess = scanner.nextInt();
				attempts++;
				if(userGuess == secretNumber){
					System.out.println("Congratulations! You guessed the correct number.");
					guessedCorrect = true;
					roundsWon++;
					break;
				}else if(userGuess < secretNumber) {
					System.out.println("Too low!");
				}else{
					System.out.println("Too high!");
				}
				System.out.println("attempts left: " + (maxAttempts - attempts));
			}
			
			if (!guessedCorrect){
				System.out.println("Sorry, you ran out of attempts. The number was: " + secretNumber);
			}
			System.out.print("Do you want to play another round? (yes/no): ");
			playAgain = scanner.next();
			
		}while(playAgain.equalsIgnoreCase("yes"));
		System.out.println("\nGame Over! You Won " + roundsWon + "round(s). Thanks for playing!");
		scanner.close();
	}
}