package assignments.questions.test.surprisetest.CheckPermutationOfOther;

import assignments.commonutils.ArrayUtility;
import util.stats.Stats;

public class Runner {

	public static void test(String input1, String input2, String filePath){
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		Boolean boolAns = Solution.isPermutation(input1, input2);
		stats.endStat();
		ArrayUtility.print(boolAns + "", filePath);
	}
}
