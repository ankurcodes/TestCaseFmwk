package assignments.runners;

import java.util.ArrayList;

import assignments.commondatastructure.LinkedStack;
import assignments.commonutils.ArrayUtility;
import assignments.solutions.Days30Solution;
import util.stats.Stats;

public class Days30Runner {

	/**
	 * Q_4:
	 */

	/**
	 * Q_8:
	 */

	/**
	 * Q_13
	 */

	public static void Ques_13Test(int[] arr, int sum, String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		ArrayList<Integer> resultList = Days30Solution.smallestSubarray(sum, ArrayUtility.arrayToList(arr));
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
	 * Q_Extra
	 */
	public static void Ques_ExtraTest(int arr1[], int arr2[], String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		long ans = Days30Solution.possibleSortedCombinations(arr1, arr2);
		stats.endStat();
		ArrayUtility.print(ans + "", filePath);
	}

}
