package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {
	public static void main(String[] args) {
		System.out.println("1 : Add value\n2 : List storage\n3 : exit");
		
		boolean state = true;
		Scanner scanner = new Scanner(System.in);
		
		while(state) {
			int nb = scanner.nextInt();
			switch (nb) {
				case 1 : 
					System.out.println("Enter a value :");
					addToStorage(scanner.nextInt());
					break;
				case 2 :
					displayStorage();
					break;
				case 3 :
					state = false;
					System.out.println("Good bye !");
					break;
				default : 
					System.out.println("wrong option");
			
			}
		}
	}
	
	public static void addToStorage(int value) {
		storage = extendArray(storage);
		storage[storage.length - 1] = value;
	}
	
	public static void displayStorage() {
		System.out.println(Arrays.toString(storage));
	}
	
	
	public static int[] extendArray(int[] array) {
		int[] newArray = new int[array.length + 1];
		for(int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		return newArray;
	}
	
	public static int[] storage = new int[0];
}
