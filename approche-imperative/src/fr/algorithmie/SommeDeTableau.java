package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableau {
	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
		
		int[] array3 = getArrayAddition(array, array2);
		
		System.out.println(Arrays.toString(array3));
		
	}
	
	public static int[] getArrayAddition(int[] array1, int[] array2) {
		if (array1.length != array2.length) {
			throw new IllegalArgumentException("Can't get addition of two arrays that do not have the same length");
		}
		
		int[] array3 = new int[array1.length];
		
		for (int i = 0; i < array3.length; i ++) {
			array3[i] = array1[i] + array2[i];
		}
		
		return array3;
	}
}