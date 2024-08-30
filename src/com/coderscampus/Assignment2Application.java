package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		
		// generate a random number
		
		// and collect user input
		
		// etc.
		
		Random r = new Random();
		int low = 1;
		int high = 100;
		int randonNumber = r.nextInt(high-low) + low;
		System.out.println("Randon number is: " + randonNumber);
		
		Scanner scanner = new Scanner(System.in);
		
		int intGuess = collectInput(scanner, "Please pick a number "
				+ "between 1 and 100");
		//System.out.println("Number guessed is: " + strGuess);
		
		
	 
		int i = 0;
		boolean jackpot = false;
		while (i < 6) {
			checkInput(scanner, randonNumber, intGuess);
			
		}
	
		
		scanner.close();

	}
	
	private static int checkInput (Scanner scanner, int randonNumber, int intGuess) {
		if (intGuess < 1 || intGuess > 100) {
			collectInput(scanner, "Your guess is not between 1 and 100, "
					+ "please try again");
			return false;
		}
		else if (intGuess < randonNumber) {
			collectInput(scanner, "Please pick a higher number");
			return false;
		}
		else if (intGuess > randonNumber) {
			collectInput(scanner, "Please pick a lower number");
			return false;
		}
		else {
			System.out.println("You win!");
			return true;
		}
	}

	private static int collectInput(Scanner scanner, String message) {
		System.out.println(message);
		String userInput = scanner.nextLine();
		int intInput = Integer.parseInt(userInput);
		return intInput;
	}

}
