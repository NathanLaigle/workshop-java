package fr.algorithmie;

import java.util.Arrays;

public class Rotation {
	public static void main(String[] args) {
		int[] array = {6, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
		
		System.out.println(Arrays.toString(rotation(array)));
		
	}
	
	public static int[] rotation (int[] array) {
		int[] rotatedArray = new int[array.length];
		
		rotatedArray[0] = array[array.length - 1];
		
		for(int i = 1; i < array.length; i++) {
			rotatedArray[i] = array[i - 1];
		}
		
		return rotatedArray;
	}
}
