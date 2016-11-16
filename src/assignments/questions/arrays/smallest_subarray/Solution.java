package assignments.questions.arrays.smallest_subarray;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> smallestSubarray(int sum, ArrayList<Integer> input) {
		if (sum <= 0) {
			return new ArrayList<Integer>();
		}
		int si = 0;
		int ei = 0;
		int bestStart = 0;
		int length = Integer.MAX_VALUE;
		int currentSum = 0;
		while (ei < input.size()) {
			if (currentSum <= sum) {
				currentSum += input.get(ei);
				ei++;
			} else {
				if (ei - si < length) {
					bestStart = si;
					length = ei - si;
				}
				currentSum -= input.get(si);
				si++;
			}
		}

		while (currentSum > sum) {
			if (ei - si < length) {
				bestStart = si;
				length = ei - si;
			}
			currentSum -= input.get(si);
			si++;
		}
		if (length == Integer.MAX_VALUE) {
			length = 0;
		}
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < length; i++) {
			output.add(input.get(bestStart + i));
		}
		return output;
	}

	

}
