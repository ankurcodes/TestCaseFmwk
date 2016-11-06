package assignments.questions.strings.reversewordwise;

import assignments.commonutils.ArrayUtility;
import util.stats.Stats;

public class Runner {
	/**
	 * Q_7:
	 * 
	 */

	public static void Ques_7Test(String input, String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		String ans = Solution.reverseWordWise(input);
		stats.endStat();
		ArrayUtility.print(ans + "", filePath);
	}
}
