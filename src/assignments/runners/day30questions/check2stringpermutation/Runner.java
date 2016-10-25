package assignments.runners.day30questions.check2stringpermutation;

import assignments.commonutils.ArrayUtility;
import util.stats.Stats;

public class Runner {

	/**
	 * Q_6:
	 * 
	 */

	public static void Ques_6Test(String input1, String input2, String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		Boolean boolAns = Solution.checkPermutation(input1, input2);
		stats.endStat();
		ArrayUtility.print(boolAns + "", filePath);
	}
}
