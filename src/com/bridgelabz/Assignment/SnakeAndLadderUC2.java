package com.bridgelabz.Assignment;

import java.util.Random;

public class SnakeAndLadderUC2 {
	public static void main(String args[]) {
		System.out.println("WELCOME TO SNAKE & LADDER GAME");

		int playerStartPoint = 0;
		Random rand = new Random();
//		int rand = (int) (Math.floor(Math.random() * 10) % 6);
		int diceRoll = (rand.nextInt(6)) + 1;

		System.out.println(diceRoll);
	}
}