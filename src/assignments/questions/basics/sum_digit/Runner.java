package assignments.questions.basics.sum_digit;

import assignments.commonutils.ArrayUtility;

import util.stats.Stats;

public class Runner {
	/**
	 * Q_22:
	 */
	public static void Ques_22Test(int num, String filePath) {
		int ans = Solution.sumDigits(num);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		ArrayUtility.print(ans + "", filePath);
		stats.endStat();
	}
}
