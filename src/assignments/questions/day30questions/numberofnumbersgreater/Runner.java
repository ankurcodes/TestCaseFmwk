package assignments.questions.day30questions.numberofnumbersgreater;

import assignments.commonutils.ArrayUtility;
import assignments.solutions.Days30Solution;
import util.stats.Stats;

public class Runner {
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
}
