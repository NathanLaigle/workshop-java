package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nb = scanner.nextInt();
		for(int i = nb + 1; i < nb + 11; i++) {
			System.out.println(i);
		}
	}
}
