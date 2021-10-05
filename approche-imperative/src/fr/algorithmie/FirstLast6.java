package fr.algorithmie;

public class FirstLast6 {
	public static void main(String[] args) {
		int[] array = {6, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
		
		System.out.println(checkFirstLast6(array));
	}
	
	public static boolean checkFirstLast6(int[] array) {
		return array.length >= 1 && array[0] == 6 || array[array.length -1] == 6;
	}
}
