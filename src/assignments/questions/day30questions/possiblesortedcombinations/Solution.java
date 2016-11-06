package assignments.questions.day30questions.possiblesortedcombinations;

public class Solution {
	public static long possibleSortedCombinations(int[] input1, int[] input2) {
		int i = 0;
		int j = 0;
		long endingWithFirst = 0;
		long endingWithSecond = 0;
		while (i < input1.length && j < input2.length) {
			if (input1[i] < input2[j]) {
				endingWithFirst += endingWithSecond + 1;
				i++;
			} else {
				endingWithSecond += endingWithFirst + 1;
				j++;
			}
		}
		while (i < input1.length) {
			endingWithFirst += endingWithSecond + 1;
			i++;
		}
		while (j < input2.length) {
			endingWithSecond += endingWithFirst + 1;
			j++;
		}
		return endingWithFirst + endingWithSecond;

	}
}
