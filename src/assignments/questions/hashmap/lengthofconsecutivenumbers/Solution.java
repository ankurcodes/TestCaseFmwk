package assignments.questions.hashmap.lengthofconsecutivenumbers;

import java.util.HashMap;

public class Solution {
	/**
	 * 3. Find the length of maximum number of consecutive numbers jumbled up in
	 * an array. [Array, Hashtable] Time - O(n)
	 */

	public static int lengthOfConsecutiveNumbers(int[] input) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int i : input) {
			map.put(i, false);
		}
		int largestSequenceLength = 0, currentSequenceLength;
		for (int i : input) {
			if (map.get(i) == false) {
				map.put(i, true);
				int j = i - 1;
				currentSequenceLength = 1;
				while (map.containsKey(j)) {
					map.put(j, true);
					j--;
					currentSequenceLength++;
				}
				j = i + 1;
				while (map.containsKey(j)) {
					map.put(j, true);
					j++;
					currentSequenceLength++;
				}
				if (currentSequenceLength > largestSequenceLength) {
					largestSequenceLength = currentSequenceLength;
				}
			}
		}
		return largestSequenceLength;
	}

}
