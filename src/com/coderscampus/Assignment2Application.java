package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		
		Random r = new Random();
		int randomNumber = r.nextInt(100) + 1;
		System.out.println("Random number is: " + randomNumber);
		
		Scanner scanner = new Scanner(System.in);
		
		int playerGuess;
		
		int i = 0;
		boolean winningGame = false;
		while (i < 5 && !winningGame) {
			playerGuess = collectInput(scanner, "Please pick a number "
					+ "between 1 and 100");
			
			if (playerGuess < 1 || playerGuess > 100) {
				System.out.println("Your guess is not between 1 and 100, "
						+ "please try again");
				continue;
			}
			else if (playerGuess < randomNumber) {
				System.out.println("Please pick a higher number");
			}
			else if (playerGuess > randomNumber) {
				System.out.println("Please pick a lower number");
			}
			else {
				System.out.println("You win!");
				winningGame = true;
				break;
			}
						
			i++;
	
		}
		
		if (!winningGame) {
			System.out.println("You lose!");
			System.out.println("The number to guess was: " + randomNumber);  
			}
		
		scanner.close();
	}
	
	private static int collectInput(Scanner scanner, String message) {
		System.out.println(message);
		String userInput = scanner.nextLine();
		return Integer.parseInt(userInput);
	}
		
		
}
