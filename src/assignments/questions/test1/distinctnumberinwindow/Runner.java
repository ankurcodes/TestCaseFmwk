package assignments.questions.test1.distinctnumberinwindow;

import assignments.commonutils.ArrayUtility;

import util.stats.Stats;

public class Runner {
	public static void test(int[] arr, int k, String filePath) {	
		Solution.result = new StringBuilder("");
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		Solution.countDistinctNumbers(arr,k);
		stats.endStat();
		ArrayUtility.print(Solution.result + "", filePath);
	}
}
