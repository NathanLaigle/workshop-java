package fr.algorithmie;

import java.util.Scanner;

public class Interfactif21Batons {
	public static void main(String[] args) {
		initGame();
		while(gameState) {
			if (turn == "Player") {
				playerPlay();
				checkGame();
			} else {
				computerPlay();
				checkGame();
			}
		}
	}
	
	public static void initGame() {
		System.out.println("Game start : Player's turn");
		showSticks();
	}
	
	public static void removeSticks(int nb) {
		if (nb < 1 || nb > 3) {
			throw new IllegalArgumentException("Value given must be between 1 and 3");
		}
		sticks -= nb;
	}
	
	public static void computerPlay() {
		int randValue = 1 * (int)Math.floor(Math.random() * 3) + 1;
		removeSticks(randValue);
	}
	
	public static void playerPlay() {
		int nb = scanner.nextInt();
		removeSticks(nb);
	}
	
	public static void checkGame() {
		if (sticks <= 0) {
			gameState = false;
			System.out.println(turn + " lost the game");
		} else {
			showSticks();
			turn = turn == "Player" ? "Computer" : "Player";
			System.out.println(turn + "'s turn :");
		}
	}
	
	public static void showSticks() {
		String display = "";
		for(int i = 0; i < sticks; i++) {
			display += " | ";
		}
		System.out.println(display);
	}
	
	public static String turn = "Player";
	
	public static boolean gameState = true;
	
	public static int sticks = 21;
	
	public static Scanner scanner = new Scanner(System.in);
}
