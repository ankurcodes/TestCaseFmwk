package assignments.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;

/*
 * 30 Day Problems Solutions
 * */
public class Days30Solution {

	public static StringBuilder ques10Ans = new StringBuilder("");
	public static StringBuilder ques11Ans = new StringBuilder("");
	public static StringBuilder ques5Ans = new StringBuilder("");

	/**
	 * Q 1. Search a given element in sorted rotated array which is rotated by
	 * d. Array is sorted in increasing order and all elements in the input
	 * array are distinct. input - array d - rotation value element - element to
	 * be searched Output - Index of element if found else -1.
	 */
	public static int searchInSortedRotatedArray(int[] input, int d, int element) {
		if (input.length == 0 || d > input.length) {
			return -1;
		}
		int maxElementIndex = d - 1;
		if (d == 0 || d == input.length - 1) {
			return binarySearch(input, 0, input.length - 1, element);
		}
		if (input[maxElementIndex] == element) {
			return maxElementIndex;
		}
		if (element <= input[input.length - 1]) {
			return binarySearch(input, maxElementIndex + 1, input.length - 1, element);
		} else {
			return binarySearch(input, 0, maxElementIndex - 1, element);
		}
	}

	public static int binarySearch(int[] input, int start, int end, int element) {
		if (start > end) {
			return -1;
		}
		int mid = (start + end) / 2;
		if (input[mid] == element) {
			return mid;
		} else if (input[mid] < element) {
			return binarySearch(input, mid + 1, end, element);
		} else {
			return binarySearch(input, start, mid - 1, element);
		}
	}

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

	/**
	 * 5. Print 2d array in wave form.
	 */
	

public static void wavePrint(int input[][]){
		
		if(input.length == 0){
			return;
		}

		int numRows = input.length;
		int numCols = input[0].length;
		
		for(int j = 0; j < numCols; j++){
			if(j % 2 ==0){
				for(int i = 0; i < numRows; i++){
					//System.out.print(input[i][j]+" ");
					ques5Ans.append(input[i][j]+" ");
				}
			}
			else{
				for(int i = input.length-1; i >= 0; i--){
					//System.out.print(input[i][j]+" ");
					ques5Ans.append(input[i][j]+" ");
				}	
			}
		}
	}


	/*
	 * 8. Given an unsorted array of positive numbers, write a function that
	 * returns true if complete array consists of consecutive numbers. Array
	 * contains only positive numbers.
	 * 
	 * / * Numbers are integers. Time - O(n)
	 */

	public static boolean containsConsecutiveNumbers(int[] input) {
		if (input.length == 0) {
			return true;
		}

		int min = findMin(input);
		int max = findMax(input);

		if (max - min + 1 != input.length) {
			return false;
		}

		for (int i = 0; i < input.length; i++) {
			int index;
			if (input[i] > 0) {
				index = input[i] - min;
			} else {
				index = -input[i] - min;
			}
			if (input[index] < 0) {
				return false;
			} else {
				input[index] = -input[index];
			}
		}
		return true;
	}

	private static int findMax(int[] input) {
		if (input.length == 0) {
			return Integer.MIN_VALUE;
		}
		int max = input[0];
		for (int i = 1; i < input.length; i++) {
			if (input[i] > max) {
				max = input[i];
			}
		}
		return max;
	}

	private static int findMin(int[] input) {
		if (input.length == 0) {
			return Integer.MAX_VALUE;
		}
		int min = input[0];
		for (int i = 1; i < input.length; i++) {
			if (input[i] < min) {
				min = input[i];
			}
		}
		return min;
	}

	/**
	 * 4. Find number of trailing 0s in n factorial.
	 */
	
	public static int countTrailingZerosInFact(int num){

		int numFives = 0;
		int currentPow = 5;
		while(currentPow <= num){
			numFives += num/currentPow;
			currentPow  = currentPow*5;
		}
		return numFives;
	}

	/**
	 * Q_6: Given two strings check if they are permutations of each other
	 */
	public static boolean checkPermutation(String str1, String str2) {

		// To store count of each char in first string;
		int[] charCount = new int[256];

		for (int i = 0; i < str1.length(); i++) {
			charCount[str1.charAt(i)]++;
		}

		// Now traverse second string and decrease count of each character
		for (int i = 0; i < str2.length(); i++) {
			charCount[str2.charAt(i)]--;
		}

		// Traverse charCount array now, if any entry in the array is non zero,
		// then ans is false
		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] != 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Q_7: Reverse String word wise. E.g. “Welcome to Coding Ninjas” reversed
	 * is – “Ninjas Coding to Welcome
	 */

	public static String reverseWordWise(String input) {
		int end = input.length();
		int i = input.length() - 1;
		String output = "";
		while (i >= 0) {
			if (input.charAt(i) == ' ') {
				output = output + input.substring(i + 1, end) + " ";
				end = i;
			}
			i--;
		}
		output += input.substring(i + 1, end);
		return output;
	}

	/**
	 * Q_10: Print numbers from 1 to n in dictionary order.
	 */

	public static void lexicographicalOrder(int num) {
		ques10Ans = new StringBuilder("");
		for (int i = 1; i <= 9; i++) {
			lexicographicalOrderHelper(i, num);
		}
	}

	private static void lexicographicalOrderHelper(int numberSoFar, int num) {
		if (numberSoFar > num) {
			return;
		}
		System.out.println(numberSoFar);
		ques10Ans = ques10Ans.append(numberSoFar + "\r\n");

		for (int i = 0; i <= 9; i++) {
			lexicographicalOrderHelper(numberSoFar * 10 + i, num);
		}

	}

	/**
	 * 11. Pattern
	 */
	public static void printPattern(int n) {

		int startValue = 1; // start value for each row
		for (int i = 1; i <= n; i++) {
			for (int j = startValue; j < startValue + n; j++) {
				System.out.print(j + " ");
				ques11Ans = ques11Ans.append(j + " ");
			}
			System.out.println();
			ques11Ans = ques11Ans.append("\r\n");
			if (i == (n + 1) / 2) {
				if (n % 2 != 0) {
					startValue = n * (n - 2) + 1;
				} else {
					startValue = n * (n - 1) + 1;
				}
			} else if (i > (n + 1) / 2) {
				startValue = startValue - 2 * n;
			} else {
				startValue = startValue + 2 * n;
			}
		}
	}

	/**
	 * Q_12. Reverse an array without affecting special characters Given a
	 * string, that contains special character together with alphabets (‘a’ to
	 * ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that special characters
	 * are not affected.
	 */
	public static String reverse(String str){
		if(str.length() <= 1){
			return str;
		}
		int i = 0;
		int j = str.length() -1;
		char charArray[] = new char[str.length()];

		while(i <= j){
			if(isSpecialCharacter(str.charAt(i))){
				charArray[i] = str.charAt(i);
				i++;
			}else if(isSpecialCharacter(str.charAt(j))){
				charArray[j] = str.charAt(j);
				j--;
			}else{    // swap if both characters at i and j aren't special
				charArray[i] = str.charAt(j);
				charArray[j] = str.charAt(i);
				i++;
				j--;
			}
		}
		String reverse = new String(charArray);
		return reverse;
	}
	
	private static  boolean isSpecialCharacter(char c){

		if((c >= 'a' && c<= 'z') || (c >= 'A' && c<= 'Z')){
			return false;
		}else{
			return true;
		}
	}


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
		if(length == Integer.MAX_VALUE) {
			length = 0;
		}
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int i = 0 ; i < length; i++) {
			output.add(input.get(bestStart + i));
		}
		return output;
	}

	
	/**
	 * /*15 Next greater element/
	 * 
	 */
	public static ArrayList<Integer> nextGreaterElement(ArrayList<Integer> input) {
		Stack<Integer> data = new Stack<>();
		ArrayList<Integer> output = new ArrayList<>();
		for (int i = input.size() - 1; i >= 0; i--) {
			int element = input.get(i);
			while (!data.isEmpty() && data.peek() <= element) {
				data.pop();
			}
			if (data.isEmpty()) {
				output.add(-1);
			} else {
				output.add(data.peek());
			}
			data.push(element);
		}
		Collections.reverse(output);
		return output;
	}

	/**
	 * Q_16: Largest multiple of 3
	 */

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

	/*
	 * 18.
	 * 
	 * Sort the elements inside a stack in ascending order using only push and
	 * pop operation. You can use one additional stack.
	 */
	public static void sortStack(Stack<Integer> stack, Stack<Integer> helper) {
		if (stack.size() <= 1) {
			return;
		}
		int top = stack.pop();
		// to sort stack except top element
		sortStack(stack, helper);

		// pop till all elements in stack are greater than top
		while (!stack.isEmpty() && stack.peek() > top) {
			helper.push(stack.pop());
		}
		stack.push(top);
		while (!helper.isEmpty()) {
			stack.push(helper.pop());
		}
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

	public static long possibleSortedCombinations(int[] input1, int[] input2) {
		int i = 0;
		int j = 0;
		long endingWithFirst = 0;
		long endingWithSecond = 0;
		while (i < input1.length && j < input2.length) {
			if (input1[i] < input2[j]) {
				endingWithFirst += endingWithSecond + 1;
				i++;
			}
			else {
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
		return endingWithFirst + endingWithSecond ;

	}

}
