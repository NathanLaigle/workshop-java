package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nb = scanner.nextInt();
		int total = 0;
		for (int i = 1; i <= nb; i ++) {
			total += i;
		}
		System.out.println(total);
	}
}
