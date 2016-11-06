package assignments.questions.day30questions.possiblesortedcombinations;

import assignments.commonutils.ArrayUtility;
import assignments.solutions.Days30Solution;
import util.stats.Stats;

public class Runner {

	public static void Ques_ExtraTest(int arr1[], int arr2[], String filePath) {
	Stats stats = Stats.getStatsInstance();
	stats.startStat();
	long ans = Days30Solution.possibleSortedCombinations(arr1, arr2);
	stats.endStat();
	ArrayUtility.print(ans + "", filePath);
}
}
