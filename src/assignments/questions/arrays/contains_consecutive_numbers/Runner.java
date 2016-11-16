package assignments.questions.arrays.contains_consecutive_numbers;

import assignments.commonutils.ArrayUtility;
import util.stats.Stats;

public class Runner {
	public static void Ques_8Test(int arr[], String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		Boolean boolAns = Solution.containsConsecutiveNumbers(arr);
		stats.endStat();
		ArrayUtility.print(boolAns + "", filePath);

	}
}
