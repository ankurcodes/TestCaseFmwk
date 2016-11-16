package assignments.questions.arrays.possible_sorted_combinations;

import assignments.commonutils.ArrayUtility;

import util.stats.Stats;

public class Runner {

	public static void Ques_ExtraTest(int arr1[], int arr2[], String filePath) {
	Stats stats = Stats.getStatsInstance();
	stats.startStat();
	long ans = Solution.possibleSortedCombinations(arr1, arr2);
	stats.endStat();
	ArrayUtility.print(ans + "", filePath);
}
}
