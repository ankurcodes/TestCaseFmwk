package assignments.questions.hashmap.max_freq_word;

import assignments.commonutils.ArrayUtility;

import util.stats.Stats;

public class Runner {
	public static void test(String input, String filePath) {
		Solution.result = new StringBuilder("");
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		Solution.maxFreqWord(input);
		stats.endStat();
		ArrayUtility.print(Solution.result + "", filePath);
	}
}
