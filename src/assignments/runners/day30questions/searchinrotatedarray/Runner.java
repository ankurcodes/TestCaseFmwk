package assignments.runners.day30questions.searchinrotatedarray;

import assignments.commonutils.ArrayUtility;
import util.stats.Stats;

public class Runner {

	public static void searchInSortedRotatedArray_Test(int[] arr, int order, int element, String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		int ans = Solution.searchInSortedRotatedArray(arr, order, element);
		stats.endStat();
		ArrayUtility.print(ans + "", filePath);
	}
}
