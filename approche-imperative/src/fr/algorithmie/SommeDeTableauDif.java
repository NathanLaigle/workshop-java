package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauDif {
	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 };
		
		int[] array3 = getArrayAddition(array, array2);
		
		System.out.println(Arrays.toString(array3));
		
	}
	
	public static int[] getArrayAddition(int[] array1, int[] array2) {
		if(array1.length != array2.length) {			
			int[] longestArray = array1.length > array2.length ? array1 : array2;
			int[] smallestArray = array1.length < array2.length ? array1 : array2;
			int[] array3 = longestArray;
			for (int i = 0; i < smallestArray.length; i ++) {
				array3[i] += smallestArray[i];
			}
			
			return array3;
		}
		throw new IllegalArgumentException("The two arrays given have the same length, you should use SommeDeTableau instead");	
	}
}
