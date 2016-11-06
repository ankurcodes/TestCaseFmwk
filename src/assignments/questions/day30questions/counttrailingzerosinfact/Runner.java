package assignments.questions.day30questions.counttrailingzerosinfact;

import assignments.commonutils.ArrayUtility;
import assignments.solutions.Days30Solution;
import util.stats.Stats;

public class Runner {
	public static void Ques_4Test(int num, String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		int ans = Days30Solution.countTrailingZerosInFact(num);
		stats.endStat();
		ArrayUtility.print(ans + "", filePath);
	}
}
