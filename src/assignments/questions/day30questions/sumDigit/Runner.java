package assignments.questions.day30questions.sumDigit;

import assignments.commonutils.ArrayUtility;
import assignments.solutions.Days30Solution;
import util.stats.Stats;

public class Runner {
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
}
