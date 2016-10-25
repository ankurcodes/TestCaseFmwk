package assignments.runners.day30questions.numberofnumbers;

import assignments.commonutils.ArrayUtility;
import util.stats.Stats;

public class Runner {
	/**
	 * Q_24:
	 */
	public static void Ques_24Test(int num, String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		int ans = Solution.numberOfNumbers(num);
		stats.endStat();
		ArrayUtility.print(ans + "", filePath);
	}

}
