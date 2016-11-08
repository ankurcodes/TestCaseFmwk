package assignments.questions.basics.titletonumber;

import assignments.commonutils.ArrayUtility;

import util.stats.Stats;

public class Runner {
	public static void Ques_17Test(String input, String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		int result = Solution.titleToNumber(input);
		stats.endStat();
		ArrayUtility.print(result + "", filePath);
	}
}
