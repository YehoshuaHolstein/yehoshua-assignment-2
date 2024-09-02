package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		
		Random r = new Random();
		int low = 1;
		int high = 100;
		int randomNumber = r.nextInt(high-low) + low;
		//System.out.println("Random number is: " + randomNumber);
		
		Scanner scanner = new Scanner(System.in);
		
		int intGuess;
		
		int i = 0;
		boolean jackpot = false;
		while (i < 5 && jackpot == false) {
			intGuess = collectInput(scanner, "Please pick a number "
					+ "between 1 and 100");
			if (intGuess < 1 || intGuess > 100) {
				System.out.println("Your guess is not between 1 and 100, "
						+ "please try again");
				i--;
			}
			else if (intGuess < randomNumber) {
				System.out.println("Please pick a higher number");
			}
			else if (intGuess > randomNumber) {
				System.out.println("Please pick a lower number");
			}
			else if (intGuess == randomNumber){
				System.out.println("You win!");
				jackpot = true;
			}
						
			i++;
	
		}
		
		if (!jackpot) {
			System.out.println("You lose!");
			System.out.println("The number to guess was: " + randomNumber);  
			}
		
		scanner.close();
	}
	
	private static int collectInput(Scanner scanner, String message) {
		System.out.println(message);
		String userInput = scanner.nextLine();
		int intInput = Integer.parseInt(userInput);
		return intInput;
	}
		
		
}
