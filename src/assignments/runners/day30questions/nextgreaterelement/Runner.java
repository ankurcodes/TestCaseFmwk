package assignments.runners.day30questions.nextgreaterelement;

import java.util.ArrayList;

import assignments.commonutils.ArrayUtility;
import assignments.solutions.Days30Solution;
import util.stats.Stats;

public class Runner {

	/**
	 * Q_15
	 */
	public static void Ques_15Test(int arr[], String filePath) {
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		ArrayList<Integer> resultList = Solution.nextGreaterElement(ArrayUtility.arrayToList(arr));
		stats.endStat();
		ArrayUtility.printList(resultList, filePath);
	}

}
