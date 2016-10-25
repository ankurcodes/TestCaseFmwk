package assignments.runners.day30questions.reversearraynotspecialchars;

import assignments.commonutils.ArrayUtility;
import util.stats.Stats;

public class Runner {
	/**
	 * Q_12:
	 */
	public static void Ques_12Test(String input, String filePath) {

		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		String resultString = Solution.reverse(input);
		stats.endStat();
		ArrayUtility.print(resultString, filePath);
	}
}
