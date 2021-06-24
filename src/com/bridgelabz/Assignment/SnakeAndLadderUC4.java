package com.bridgelabz.Assignment;

import java.util.Random;

public class SnakeAndLadderUC4 {

	public static void main(String args[]) {
		// adding welcome note
		System.out.println("WELCOME TO SNAKE & LADDER GAME");

		// giving a start point to player
		int playerStartPoint = 0;

		int playerPosition = 0;

		while (playerPosition <= 100) {

			// generating random number for dice to roll 1-6
			Random rand = new Random();
			int diceRoll = (rand.nextInt(6)) + 1;

			// generating random numbers for play 0-2
			Random ran = new Random();
			int playCheck = ran.nextInt(3);

			// writing a switch case for play check
			switch (playCheck) {
			case 0:
				playerPosition = playerPosition;
				// System.out.println("Sorry no luck! You can't play.");
				break;

			case 1:
				playerPosition = diceRoll + playerPosition;
				// System.out.println("Hurry you got ladder! You are moved by " + diceRoll + "
				// positions.");
				break;

			case 2:
				playerPosition = playerPosition - diceRoll;
				// System.out.println("Hisses ! You are bitten by snake");
				break;

			default:
				System.out.println("Invalid Option");

			}

			if (playerPosition < 0) {
				playerPosition = playerStartPoint;
			}
		}
		System.out.println("Player wins!, Game Over.");
	}
}