package assignments.questions.day30questions.titletonumber;

import assignments.commonutils.ArrayUtility;
import assignments.solutions.Days30Solution;
import util.stats.Stats;

public class Runner {
	public static void Ques_17Test(String input, String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		int result = Days30Solution.titleToNumber(input);
		stats.endStat();
		ArrayUtility.print(result + "", filePath);
	}
}
