package assignments.questions.day30questions.printpattern;

import assignments.commonutils.ArrayUtility;
import assignments.solutions.Days30Solution;
import util.stats.Stats;

public class Runner {

	/**
	 * Q_11:
	 */
	public static void Ques_11Test(int num, String filePath) {
		Days30Solution.ques11Ans = new StringBuilder("");
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		Solution.printPattern(num);
		stats.endStat();
		ArrayUtility.print(Days30Solution.ques11Ans.toString(), filePath);
	}

}
