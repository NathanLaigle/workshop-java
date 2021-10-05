package fr.algorithmie;

import java.util.Arrays;
import java.util.List;

public class ComparaisonTableau {
	public static void main(String[] args) {
		int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
		
		int similarity = arraySimilarity(array1, array2);
		
		System.out.println(similarity);
	}
	
	public static int arraySimilarity(int[] array1, int[] array2) {
		
		int[] longestArray = array1.length > array2.length ? array1 : array2;
		int[] smallestArray = array2.length < array1.length ? array2 : array1;
		
		int similarity = 0;
		
		for(int i = 0; i < longestArray.length; i++) {
			if (contains(smallestArray, longestArray[i])) {
				similarity ++;
			}
		}
		
		return similarity;
	}
	
	public static boolean contains(int[] array, int v) {

        boolean result = false;

        for(int i : array){
            if(i == v){
                result = true;
                break;
            }
        }

        return result;
    }
}
