package assignments.runners.day30questions.containsconsecutivenumbers;

public class Solution {
	/*
	 * 8. Given an unsorted array of positive numbers, write a function that
	 * returns true if complete array consists of consecutive numbers. Array
	 * contains only positive numbers.
	 * 
	 * / * Numbers are integers. Time - O(n)
	 */

	public static boolean containsConsecutiveNumbers(int[] input) {
		if (input.length == 0) {
			return true;
		}

		int min = findMin(input);
		int max = findMax(input);

		if (max - min + 1 != input.length) {
			return false;
		}

		for (int i = 0; i < input.length; i++) {
			int index;
			if (input[i] > 0) {
				index = input[i] - min;
			} else {
				index = -input[i] - min;
			}
			if (input[index] < 0) {
				return false;
			} else {
				input[index] = -input[index];
			}
		}
		return true;
	}

	private static int findMax(int[] input) {
		if (input.length == 0) {
			return Integer.MIN_VALUE;
		}
		int max = input[0];
		for (int i = 1; i < input.length; i++) {
			if (input[i] > max) {
				max = input[i];
			}
		}
		return max;
	}

	private static int findMin(int[] input) {
		if (input.length == 0) {
			return Integer.MAX_VALUE;
		}
		int min = input[0];
		for (int i = 1; i < input.length; i++) {
			if (input[i] < min) {
				min = input[i];
			}
		}
		return min;
	}

	

}
