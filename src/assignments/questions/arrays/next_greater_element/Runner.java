package assignments.questions.arrays.next_greater_element;

import java.util.ArrayList;

import assignments.commonutils.ArrayUtility;

import util.stats.Stats;

public class Runner {

	/**
	 * Q_15
	 */
	public static void test(int arr[], String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		ArrayList<Integer> resultList = Solution.nextGreaterElement(ArrayUtility.arrayToList(arr));
		stats.endStat();
		ArrayUtility.printList(resultList, filePath);
	}

}
