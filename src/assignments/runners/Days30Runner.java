package assignments.runners;

import java.util.ArrayList;

import assignments.commondatastructure.LinkedStack;
import assignments.commonutils.ArrayUtility;
import assignments.solutions.Days30Solution;
import util.stats.Stats;

public class Days30Runner {

	/**
	 * Q_1:
	 */
	public static void Ques_1Test(int[] arr, int order, int element, String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		int ans = Days30Solution.searchInSortedRotatedArray(arr, order, element);
		stats.endStat();
		ArrayUtility.print(ans + "", filePath);
	}

	/**
	 * Q_3:
	 */

	public static void Ques_3Test(int[] arr, String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		int ans = Days30Solution.lengthOfConsecutiveNumbers(arr);
		stats.endStat();
		ArrayUtility.print(ans + "", filePath);
	}

	/**
	 * Q_4:
	 */
	public static void Ques_4Test(int num, String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		int ans = Days30Solution.countTrailingZerosInFact(num);
		stats.endStat();
		ArrayUtility.print(ans + "", filePath);
	}

	/**
	 * Q_5:
	 */
	public static void Ques_5Test(int arr[][], String filePath) {
		Days30Solution.ques5Ans = new StringBuilder("");
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		Days30Solution.wavePrint(arr);
		stats.endStat();
		ArrayUtility.print(Days30Solution.ques5Ans + "", filePath);
	}

	/**
	 * Q_6:
	 * 
	 */

	public static void Ques_6Test(String input1, String input2, String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		Boolean boolAns = Days30Solution.checkPermutation(input1, input2);
		stats.endStat();
		ArrayUtility.print(boolAns + "", filePath);
	}

	/**
	 * Q_7:
	 * 
	 */

	public static void Ques_7Test(String input, String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		String ans = Days30Solution.reverseWordWise(input);
		stats.endStat();
		ArrayUtility.print(ans + "", filePath);
	}

	/**
	 * Q_8:
	 */
	public static void Ques_8Test(int arr[], String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		Boolean boolAns = Days30Solution.containsConsecutiveNumbers(arr);
		stats.endStat();
		ArrayUtility.print(boolAns + "", filePath);

	}

	/**
	 * Q_10: test till (10 power 4)
	 */
	public static void Ques_10Test(int num, String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		Days30Solution.lexicographicalOrder(num);
		stats.endStat();
		ArrayUtility.print(Days30Solution.ques10Ans.toString(), filePath);

	}

	/**
	 * Q_11:
	 */
	public static void Ques_11Test(int num, String filePath) {
		Days30Solution.ques11Ans = new StringBuilder("");
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		Days30Solution.printPattern(num);
		stats.endStat();
		ArrayUtility.print(Days30Solution.ques11Ans.toString(), filePath);
	}

	/**
	 * Q_12:
	 */
	public static void Ques_12Test(String input, String filePath) {

		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		String resultString = Days30Solution.reverse(input);
		stats.endStat();
		ArrayUtility.print(resultString, filePath);
	}

	/**
	 * Q_13
	 */

	public static void Ques_13Test(int[] arr,int sum, String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		ArrayList<Integer> resultList = Days30Solution.smallestSubarray(sum, ArrayUtility.arrayToList(arr));
		stats.endStat();
		ArrayUtility.printList(resultList, filePath);
	}

	/**
	 * Q_15
	 */
	public static void Ques_15Test(int arr[], String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		ArrayList<Integer> resultList = Days30Solution.nextGreaterElement(ArrayUtility.arrayToList(arr));
		stats.endStat();
		ArrayUtility.printList(resultList, filePath);
	}

	/**
	 * Q_16
	 */
	public static void Ques_16Test(int arr[], String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		ArrayList<Integer> resultList = Days30Solution.largestMultiple3(ArrayUtility.arrayToList(arr));
		stats.endStat();
		ArrayUtility.printList(resultList, filePath);
	}

	/**
	 * Q_17:
	 * 
	 */

	public static void Ques_17Test(String input, String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		int result = Days30Solution.titleToNumber(input);
		stats.endStat();
		ArrayUtility.print(result + "", filePath);
	}

	/**
	 * Q_18: Complexity: O(n2)
	 */

	public static void Ques_18Test(int arr[], String filePath) {
		LinkedStack<Integer> stack = new LinkedStack<Integer>();
		LinkedStack<Integer> helper = new LinkedStack<Integer>();
		for (int i : arr) {
			stack.push(i);
		}

		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		Days30Solution.sortStack(stack, helper);
		stats.endStat();
		stack.displayReverse(filePath);
	}

	/**
	 * Q_22:
	 */
	public static void Ques_22Test(int num, String filePath) {
		int ans = Days30Solution.sumDigits(num);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		ArrayUtility.print(ans + "", filePath);
		stats.endStat();
	}

	/**
	 * Q_23:
	 */

	public static void Ques_23Test(int num, String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		long ans = Days30Solution.numberOfNumbersGreater(num);
		stats.endStat();
		ArrayUtility.print(ans + "", filePath);
	}

	/**
	 * Q_24:
	 */
	public static void Ques_24Test(int num, String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		int ans = Days30Solution.numberOfNumbers(num);
		stats.endStat();
		ArrayUtility.print(ans + "", filePath);
	}

	/**
	 * Q_Extra
	 * */
	public static void Ques_ExtraTest(int arr1[], int arr2[], String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		long ans = Days30Solution.possibleSortedCombinations(arr1, arr2);
		stats.endStat();
		ArrayUtility.print(ans + "", filePath);
	}
}
