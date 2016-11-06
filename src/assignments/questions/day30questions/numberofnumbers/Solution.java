package assignments.questions.day30questions.numberofnumbers;

public class Solution {
	/**
	 * 24. Given a number find number of numbers greater than the given number
	 * with same digits with duplicates
	 */
	public static int numberOfNumbers(int num) {
		int numDigits = (int) Math.log10(num) + 1;
		int[] digitCount = new int[10];
		int[] digits = new int[numDigits];
		for (int i = 0; i < digits.length; i++) {
			digits[numDigits - i - 1] = num % 10;
			digitCount[num % 10]++;
			num = num / 10;
		}
		int fact[] = new int[digits.length];
		fact[0] = 1;
		for (int i = 1; i < fact.length; i++) {
			fact[i] = i * fact[i - 1];
		}
		return numberOfNumbers(digits, digitCount, fact, 0);
	}

	private static int numberOfNumbers(int[] digits, int[] digitCount, int[] fact, int beginIndex) {

		if (beginIndex >= digits.length - 1) {
			return 0;
		}
		int count = 0;
		int currentDigit = digits[beginIndex];
		for (int i = currentDigit + 1; i < digitCount.length; i++) {
			if (digitCount[i] > 0) {
				int currentCount = fact[digits.length - beginIndex - 1] / fact[digitCount[i] - 1];
				for (int j = 0; j < digitCount.length; j++) {
					if (i == j) {
						continue;
					}
					currentCount = currentCount / fact[digitCount[j]];
				}
				count += currentCount;
			}
		}
		digitCount[currentDigit]--;
		count += numberOfNumbers(digits, digitCount, fact, beginIndex + 1);
		return count;
	}

}
