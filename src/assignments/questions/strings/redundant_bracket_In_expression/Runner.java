package assignments.questions.strings.redundant_bracket_In_expression;

import assignments.commonutils.ArrayUtility;

import util.stats.Stats;

public class Runner {
	public static void test(String input, String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		boolean n = Solution.removeRedundantBrackets(input);
		stats.endStat();
		ArrayUtility.print(""+n, filePath);
	}
}
