package util.other.arrayutility;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class IntegerArrayUtility {

	public static int[] randomArrayGenerator(int length, int min, int max) {
		int arr[] = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = IntegerUtility.generateRandomNumberInRange(min, max);
		}
		return arr;
	}

	public static int[] unRepeatedDecreasingIntegerArray(final int length, final int minVal, final int maxVal) {
		int arr[] = unRepeatedIncreasingIntegerArray(length, minVal, maxVal);
		Sorting.mergeSortReverse(arr);
		return arr;
	}

	public static int[] unRepeatedIncreasingIntegerArray(int size, int minLimit, int maxLimit) {
		int range = Math.abs(maxLimit - minLimit);
		int[] array = new int[size];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = minLimit + rand.nextInt(range) + range * i;
		}
		return array;
	}

	public static int[] rotatedIncreasingArray(int size, int order, int min, int max) {
		int arr[] = unRepeatedIncreasingIntegerArray(size, min, max);
		rotate(arr, order);
		return arr;
	}

	public static void rotate(int[] arr, int order) {
		if (arr == null || arr.length == 0 || order < 0) {
			throw new IllegalArgumentException("Illegal argument!");
		}

		if (order > arr.length) {
			order = order % arr.length;
		}

		// length of first part
		int a = arr.length - order;

		reverse(arr, 0, a - 1);
		reverse(arr, a, arr.length - 1);
		reverse(arr, 0, arr.length - 1);

	}

	private static void reverse(int[] arr, int left, int right) {
		if (arr == null || arr.length == 1)
			return;

		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}

	private static int[] getConsecutiveSortedArray(int size, int min, int diff) {
		int arr[] = new int[size];
		int value = min;
		for (int i = 0; i < arr.length; i++) {
			value = value + diff;
			arr[i] = value;
		}
		return arr;
	}

	public static int[] getConsecutiveUnsortedArray(int size, int min, int diff) {
		int arr[] = getConsecutiveSortedArray(size, min, 1);
		int count = 0;
		while (count < size) {
			int firstIndex = IntegerUtility.generateRandomNumberInRange(0, size - 1);
			int secondIndex = IntegerUtility.generateRandomNumberInRange(0, size - 1);
			int temp = arr[firstIndex];
			arr[firstIndex] = arr[secondIndex];
			arr[secondIndex] = temp;
			count++;
		}
		return arr;
	}
	
	public static double[][] getArrays(String filePath) throws Exception {
	    Scanner scanFile = new Scanner(new File(filePath));
	    int numNames = scanFile.nextInt();
	    int numScores = scanFile.nextInt();
	    double[][] scores = new double[numNames][numScores];
	    String[] names = new String[numNames];

	    for(int i = 0; i < numNames; i++) {
	        names[i] = scanFile.next();
	        for(int j = 0; j < numScores; j++) {
	            scores[i][j] = scanFile.nextDouble();
	        }
	    }
	    scanFile.close();
	    return scores;
	}
	
	
	public static void main(String[] args) {
		
		
	}
	
}
