package assignments.questions.basics.printpattern;

import assignments.commonutils.ArrayUtility;

import util.stats.Stats;

public class Runner {

	/**
	 * Q_11:
	 */
	public static void Ques_11Test(int num, String filePath) {
		Solution.ques11Ans = new StringBuilder("");
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		Solution.printPattern(num);
		stats.endStat();
		ArrayUtility.print(Solution.ques11Ans.toString(), filePath);
	}

}
