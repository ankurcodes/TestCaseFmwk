package assignments.questions.strings.smallest_substring_having_all_chars_of_another_string;

import assignments.commonutils.ArrayUtility;

import util.stats.Stats;

public class Runner {
	public static void test(String large,String small, String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		String result = Solution.findMinSubstringContainingString(large, small);
		stats.endStat();
		ArrayUtility.print(result + "", filePath);
	}
}
