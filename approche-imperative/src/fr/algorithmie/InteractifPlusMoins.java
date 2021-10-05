package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rand = randomizer();
		boolean win = false;
		System.out.println("Let's go!");
		while(!win) {
			int nb = scanner.nextInt();
			if(nb < rand) {
				System.out.println("C'est plus");
			} else if(nb > rand) {
				System.out.println("c'est moins");
			} else {
				System.out.println("Correct grand fou !");
				win = true;
			}
		}
	}
	
	public static int randomizer() {
		double rand = Math.random();
		rand *= 100;
		return (int)Math.floor(rand) + 1;
	}
}
