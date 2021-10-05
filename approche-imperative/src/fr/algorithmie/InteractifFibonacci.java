package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select a value");
		int nb = scanner.nextInt();
		generateFibonacciArray(nb);
		
		System.out.println(fibonacciArray[nb - 1]);
	}
	
	public static void generateFibonacciArray(int nb) {
		for(int i = 0; i < nb - 2; i ++) {
			addValue(fibonacciArray.length - 2 + fibonacciArray.length - 1);
		}
	}
	
	public static void addValue(int value) {
		fibonacciArray = extendArray(fibonacciArray);
		fibonacciArray[fibonacciArray.length - 1] = value;
	}
	
	public static int[] extendArray(int[] array) {
		int[] newArray = new int[array.length + 1];
		for(int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		return newArray;
	}
	
	public static int[] fibonacciArray = {0, 1};
}
