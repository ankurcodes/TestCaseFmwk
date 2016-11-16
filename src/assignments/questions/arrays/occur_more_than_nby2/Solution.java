package assignments.questions.arrays.occur_more_than_nby2;

public class Solution {

	public static int majorityElement(int[] arr) {
		int size = arr.length;
		if (size == 1)
			return arr[0];
		int count = 0;
		int i;
		int candidate = arr[0];

		for (i = 1; i < size; i++) {
			if (count == 0)
				candidate = arr[i];
			if (arr[i] == candidate)
				count++;
			else
				count--;
		}
		count = 0;

		for (i = 0; i < size; i++) {
			if (arr[i] == candidate)
				count++;
		}

		if (count > size / 2)
			return candidate;
		return -1;
	}
}
