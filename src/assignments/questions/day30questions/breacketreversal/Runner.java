package assignments.questions.day30questions.breacketreversal;

import assignments.commonutils.ArrayUtility;
import util.stats.Stats;

public class Runner {
	public static void test(String input, String filePath) {
		
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		int n = Solution.countBracketReversals(input);
		stats.endStat();
		ArrayUtility.print(n+"", filePath);
	}
}
