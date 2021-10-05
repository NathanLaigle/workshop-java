package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
	public static void main(String[] args) {
		boolean cond = false;
		while(!cond) {
			Scanner scanner = new Scanner(System.in);
			int nb = scanner.nextInt();	
			if(nb >= 1 && nb <= 10) {
				System.out.println(nb);
				cond = true;
			}
		}
	}
}
