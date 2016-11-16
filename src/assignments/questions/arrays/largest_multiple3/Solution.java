package assignments.questions.arrays.largest_multiple3;

import java.util.ArrayList;

public class Solution {
	/**
	 * Q_16: Largest multiple of 3
	 */

	private static boolean removeMin(int freq[], int modulus, int count) {
		for (int i = modulus; count > 0 && i < 10;) {
			if (freq[i] > 0) {
				freq[i]--;
				count--;
			} else {
				i += 3;
			}
		}
		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static ArrayList<Integer> largestMultiple3(ArrayList<Integer> input) {
		int sum = 0;
		int freq[] = new int[10];

		for (int i : input) {
			freq[i]++;
			sum += i;
		}

		if (sum % 3 == 1) {
			if (!removeMin(freq, 1, 1)) {
				removeMin(freq, 2, 2);
			}
		} else if (sum % 3 == 2) {
			if (!removeMin(freq, 2, 1)) {
				removeMin(freq, 1, 2);
			}
		}

		ArrayList<Integer> output = new ArrayList<>();
		for (int i = 9; i >= 0; i--) {
			for (int j = 0; j < freq[i]; j++) {
				output.add(i);
			}
		}
		return output;
	}

}
