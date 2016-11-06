package assignments.questions.test1.distinctnumberinwindow;

import java.util.HashMap;

public class Solution {
	public static StringBuilder result = new StringBuilder();

	public static void countDistinctNumbers(int[] input, int k) {
		if (input.length == 0) {
			return;
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		int distinctCount = 0;
		int i;
		for (i = 0; i < k && i < input.length; i++) {
			if (!map.containsKey(input[i])) {
				map.put(input[i], 1);
				distinctCount++;
			} else {
				map.put(input[i], map.get(input[i]) + 1);
			}
		}
		// System.out.println(distinctCount);
		result.append(distinctCount);
		result.append("\r\n");
		while (i < input.length) {
			if (map.get(input[i - k]) == 1) {
				distinctCount--;
				map.remove(input[i - k]);
			} else {
				map.put(input[i - k], map.get(input[i - k]) - 1);
			}

			if (!map.containsKey(input[i])) {
				map.put(input[i], 1);
				distinctCount++;
			} else {
				map.put(input[i], map.get(input[i]) + 1);
			}
			// System.out.println(distinctCount);
			result.append(distinctCount);
			result.append("\r\n");
			i++;
		}
	}
}