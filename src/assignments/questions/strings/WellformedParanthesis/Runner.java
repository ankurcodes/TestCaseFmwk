package assignments.questions.strings.WellformedParanthesis;

import assignments.commonutils.ArrayUtility;

import util.stats.Stats;

public class Runner {

	public static void test(int n, String filePath) {
		Solution.result = new StringBuilder("");
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		Solution.printWellFormedParanthesis(n);
		stats.endStat();
		ArrayUtility.print(Solution.result + "", filePath);
	}
}
