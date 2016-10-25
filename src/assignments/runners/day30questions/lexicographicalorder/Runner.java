package assignments.runners.day30questions.lexicographicalorder;

import assignments.commonutils.ArrayUtility;
import util.stats.Stats;

public class Runner {

	/**
	 * Q_10: test till (10 power 4)
	 */
	public static void Ques_10Test(int num, String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		Solution.lexicographicalOrder(num);
		stats.endStat();
		ArrayUtility.print(Solution.ques10Ans.toString(), filePath);

	}
}
