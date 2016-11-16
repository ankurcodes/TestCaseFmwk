package assignments.questions.basics.sum_digit;

public class Solution {

	/**
	 * 22. Find sum of all integers of a given number such that sum is always a
	 * single digit
	 *
	 */
	public static int sumDigits(int number) {

		int temp = number;
		int sum = 0;
		while (temp > 0) {
			int lastDigit = temp % 10;
			sum += lastDigit;
			if (sum >= 10) {
				int tempSum = sum % 10;
				sum = sum / 10;
				tempSum += sum;
				sum = tempSum;
			}
			temp = temp / 10;
		}
		return sum;
	}
}
