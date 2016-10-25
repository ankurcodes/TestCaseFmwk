package assignments.runners.day30questions.searchinrotatedarray;

import assignments.commonutils.ArrayUtility;
import assignments.solutions.Days30Solution;
import util.stats.Stats;

public class Runner {

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
}
