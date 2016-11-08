package assignments.questions.basics.numberofnumbersgreater;

import assignments.commonutils.ArrayUtility;

import util.stats.Stats;

public class Runner {
	/**
	 * Q_23:
	 */

	public static void Ques_23Test(int num, String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		long ans = Solution.numberOfNumbersGreater(num);
		stats.endStat();
		ArrayUtility.print(ans + "", filePath);
	}
}
