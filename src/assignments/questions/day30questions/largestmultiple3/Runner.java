package assignments.questions.day30questions.largestmultiple3;

import java.util.ArrayList;

import assignments.commonutils.ArrayUtility;
import assignments.solutions.Days30Solution;
import util.stats.Stats;

public class Runner {
	public static void Ques_16Test(int arr[], String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		ArrayList<Integer> resultList = Days30Solution.largestMultiple3(ArrayUtility.arrayToList(arr));
		stats.endStat();
		ArrayUtility.printList(resultList, filePath);
	}
}
