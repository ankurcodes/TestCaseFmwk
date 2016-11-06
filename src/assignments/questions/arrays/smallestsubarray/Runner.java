package assignments.questions.arrays.smallestsubarray;

import java.util.ArrayList;

import assignments.commonutils.ArrayUtility;

import util.stats.Stats;

public class Runner {
	public static void Ques_13Test(int[] arr, int sum, String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		ArrayList<Integer> resultList = Solution.smallestSubarray(sum, ArrayUtility.arrayToList(arr));
		stats.endStat();
		ArrayUtility.printList(resultList, filePath);
	}
}
