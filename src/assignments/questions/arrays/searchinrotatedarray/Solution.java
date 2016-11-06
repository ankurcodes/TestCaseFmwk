package assignments.questions.arrays.searchinrotatedarray;

public class Solution {
	/**
	 * Q 1. Search a given element in sorted rotated array which is rotated by
	 * d. Array is sorted in increasing order and all elements in the input
	 * array are distinct. input - array d - rotation value element - element to
	 * be searched Output - Index of element if found else -1.
	 */
	public static int searchInSortedRotatedArray(int[] input, int d, int element) {
		if (input.length == 0 || d > input.length) {
			return -1;
		}
		int maxElementIndex = d - 1;
		if (d == 0 || d == input.length - 1) {
			return binarySearch(input, 0, input.length - 1, element);
		}
		if (input[maxElementIndex] == element) {
			return maxElementIndex;
		}
		if (element <= input[input.length - 1]) {
			return binarySearch(input, maxElementIndex + 1, input.length - 1, element);
		} else {
			return binarySearch(input, 0, maxElementIndex - 1, element);
		}
	}

	public static int binarySearch(int[] input, int start, int end, int element) {
		if (start > end) {
			return -1;
		}
		int mid = (start + end) / 2;
		if (input[mid] == element) {
			return mid;
		} else if (input[mid] < element) {
			return binarySearch(input, mid + 1, end, element);
		} else {
			return binarySearch(input, start, mid - 1, element);
		}
	}

}
