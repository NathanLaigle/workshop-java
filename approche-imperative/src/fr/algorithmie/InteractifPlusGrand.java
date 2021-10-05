package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
	public static void main(String[] args) {
		int[] nbs = new int[10];
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++ ) {
			System.out.println("Nombre n°" + i + " : ");
			int nb = scanner.nextInt();
			nbs[i - 1] = nb;
		}
		
		int max = nbs[0];
		
		for (int i = 1; i < nbs.length; i ++) {
			max = max < nbs[i] ? nbs[i] : max;
		}
		
		System.out.println(max);
	}
}
