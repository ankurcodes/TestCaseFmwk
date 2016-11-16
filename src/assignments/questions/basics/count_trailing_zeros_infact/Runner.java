package assignments.questions.basics.count_trailing_zeros_infact;

import assignments.commonutils.ArrayUtility;

import util.stats.Stats;

public class Runner {
	public static void Ques_4Test(int num, String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		int ans = Solution.countTrailingZerosInFact(num);
		stats.endStat();
		ArrayUtility.print(ans + "", filePath);
	}
}
