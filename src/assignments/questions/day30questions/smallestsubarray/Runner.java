package assignments.questions.day30questions.smallestsubarray;

import java.util.ArrayList;

import assignments.commonutils.ArrayUtility;
import assignments.solutions.Days30Solution;
import util.stats.Stats;

public class Runner {
	public static void Ques_13Test(int[] arr, int sum, String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		ArrayList<Integer> resultList = Days30Solution.smallestSubarray(sum, ArrayUtility.arrayToList(arr));
		stats.endStat();
		ArrayUtility.printList(resultList, filePath);
	}
}
