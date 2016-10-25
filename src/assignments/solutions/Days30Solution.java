package assignments.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;

/*
 * 30 Day Problems Solutions
 * */
public class Days30Solution {

	
	public static StringBuilder ques11Ans = new StringBuilder("");


	

	
	/**
	 * Q_13
	 */
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

	/*
	 * 17. Given a column title as appears in an Excel sheet, return its
	 * corresponding column number.
	 */
	public static int titleToNumber(String a) {

		int len = a.length();
		int rank = 0;
		int power26 = 1;
		for (int i = 0; i < len; i++) {
			int charIndex = a.charAt(len - 1 - i) - 64;
			rank += power26 * charIndex;
			power26 = power26 * 26;
		}
		return rank;
	}



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
