package assignments.questions.day30questions.numberofnumbersgreater;

public class Solution {

	/*
	 * 23. Given a number find number of numbers greater than the given number
	 * with same digits without duplicates
	 */
	public static long numberOfNumbersGreater(long num) {
		if (num < 10) {
			return 0;
		}
		int numDigits = (int) Math.log10(num) + 1;
		int digits[] = new int[numDigits];
		int k = numDigits - 1;
		for (int i = 0; i < numDigits; i++) {
			digits[k] = (int) (num % 10);
			num = num / 10;
			k--;
		}
		long fact[] = new long[digits.length + 1];
		fact[0] = 1;
		for (int i = 1; i <= digits.length; i++) {
			fact[i] = i * fact[i - 1];
		}
		return numberOfNumbersGreater(digits, 0, fact);
	}
	private static long numberOfNumbersGreater(int[] digits, int beginIndex, long[] fact) {
		if (beginIndex >= digits.length - 1) {
			return 0;
		}
		long count = 0;
		for (int i = beginIndex + 1; i < digits.length; i++) {
			if (digits[beginIndex] < digits[i]) {
				count = count + fact[digits.length - beginIndex - 1];
			}
		}
		count += numberOfNumbersGreater(digits, beginIndex + 1, fact);
		return count;
	}
}
