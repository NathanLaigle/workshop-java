package fr.algorithmie;

public class RechercheMin {
	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};	
		int min = findMin(array);
		System.out.println(min);
	}
	
	private static int findMin(int[] array) {
		int min = array[0];
		for(int i = 1; i < array.length; i++) {
			min = min > array[i] ? array[i] : min;
		}
		
		return min;
	}
}
