package assignments.questions.arrays.max_count_sub_array;

import java.util.ArrayList;

import assignments.commonutils.ArrayUtility;
import util.stats.Stats;

public class Runner {
	public static void test(int arr[], String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		ArrayList<Integer> resultList = solution.maxset(ArrayUtility.arrayToList(arr));
		stats.endStat();
		ArrayUtility.printList(resultList, filePath);
	}
}
