package assignments.questions.arrays.occur_more_than_nby2;

import assignments.commonutils.ArrayUtility;
import util.stats.Stats;

public class Runner {

	public static void test(int arr[], String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		int result = Solution.majorityElement(arr);
		stats.endStat();
		ArrayUtility.print(result+"", filePath);
	}
}
