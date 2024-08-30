package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		
		Random r = new Random();
		int low = 1;
		int high = 100;
		int randonNumber = r.nextInt(high-low) + low;
		System.out.println("Randon number is: " + randonNumber);
		
		Scanner scanner = new Scanner(System.in);
		
		int intGuess = collectInput(scanner, "Please pick a number "
				+ "between 1 and 100");
		
		int i = 0;
		boolean jackpot = false;
		while (i < 6 && jackpot == false) {
		
			if (intGuess < 1 || intGuess > 100) {
				intGuess = collectInput(scanner, "Your guess is not between 1 and 100, "
					+ "please try again");
			}
			else if (intGuess < randonNumber) {
				intGuess = collectInput(scanner, "Please pick a higher number");
			}
			else if (intGuess > randonNumber) {
				intGuess = collectInput(scanner, "Please pick a lower number");
			}
			else if (intGuess == randonNumber){
				System.out.println("You win!");
				jackpot = true;
			}
						
			i++;
	
		}
		
		if (!jackpot) {
			System.out.println("You lose, the number to guess "
						+ "was: " + randonNumber); 
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
