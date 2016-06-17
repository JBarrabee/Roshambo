package rockPaperScissors;

import java.util.Scanner;

import projects.Validator;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String opponentChoice = "";
		String opponent = "";
		int winCount = 0;
		int lossCount = 0;
		// TODO Auto-generated method stub
		boolean repeat = true;
		System.out.println("Welcome to Rock Paper Scissors!");

		String name = Validator.getString(scan, "Enter your Name:");
		while (repeat) {
			opponent = Validator.getChoice(scan, "Would you like to play against Rocky, Spock, or Dennis?", "Rocky",
					"Spock", "Dennis", "You must choose between Rocky, Spock, or Dennis");
			// System.out.println("Please enter an opponent:");
			// opponent = scan.nextLine();
			if (opponent.equalsIgnoreCase("Rocky")) {
				Rocky Rocky = new Rocky();
				Rocky.setName("Rocky");
				Rocky.setRoshambo("Rock");
				opponentChoice = Rocky.getRoshambo();
			}
			if (opponent.equalsIgnoreCase("Spock")) {
				Spock Spock = new Spock();
				Spock.calculateRoshambo();
				opponentChoice = Spock.getRoshambo();

			}
			if (opponent.equalsIgnoreCase("dennis")) {
				Dennis Dennis = new Dennis();
				Dennis.setName("Dennis");
				Dennis.setRoshambo("Paper");
				opponentChoice = Dennis.getRoshambo();

			}

			String realPlayerChoice = Validator.getChoice(scan, "Please choose Rock, Paper, or Scissors", "Rock",
					"Paper", "Scissors", "You must choose between Rock, Paper, or Scissors");

			System.out.println(name + ": " + realPlayerChoice);
			// Next is challenge
			// String opponentChoice = opponentChoice;

			System.out.println(opponent + ": " + opponentChoice);

			if (realPlayerChoice.equals(opponentChoice)) {
				System.out.println("Draw");
			}
			if (realPlayerChoice.equals("Rock") && opponentChoice.equals("Paper")) {
				System.out.println(opponent + " wins!");
				lossCount++;
			}
			if (realPlayerChoice.equals("Rock") && opponentChoice.equals("Scissors")) {
				System.out.println(name + " wins!");
				winCount++;
			}
			if (realPlayerChoice.equals("Scissors") && opponentChoice.equals("Rock")) {
				System.out.println(opponent + " wins!");
				lossCount++;
			}
			if (realPlayerChoice.equals("Scissors") && opponentChoice.equals("Paper")) {
				System.out.println(name + " wins!");
				winCount++;
			}
			if (realPlayerChoice.equals("Paper") && opponentChoice.equals("Rock")) {
				System.out.println(name + " wins!");
				winCount++;
			}
			if (realPlayerChoice.equals("Paper") && opponentChoice.equals("Scissors")) {
				System.out.println(opponent + " wins!");
				lossCount++;
			}
			System.out.println("You have won: " + winCount + " Your Opponent has won: " + lossCount);

			repeat = Validator.getYorN(scan, repeat, "Play again? (y/n):", "OK, have a nice day.",
					"Sorry you must choose Yes or No.");

		}
	}
}
