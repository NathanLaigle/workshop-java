package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
	public static void main(String[] args) {
		System.out.println("Give an int between 1 and 10");
		Scanner scanner = new Scanner(System.in);
		int nb = scanner.nextInt();
		if (nb < 1 || nb > 10) {
			throw new IllegalArgumentException("Error : int given must be in range [1, 10]");
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println(nb + " * " + i + " = " + nb*i);
		}
	}
}
