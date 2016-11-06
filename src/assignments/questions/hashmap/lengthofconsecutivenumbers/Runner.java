package assignments.questions.hashmap.lengthofconsecutivenumbers;

import assignments.commonutils.ArrayUtility;
import util.stats.Stats;

public class Runner {
	/**
	 * Q_3:
	 */

	public static void Ques_3Test(int[] arr, String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		int ans = Solution.lengthOfConsecutiveNumbers(arr);
		stats.endStat();
		ArrayUtility.print(ans + "", filePath);
	}
}
