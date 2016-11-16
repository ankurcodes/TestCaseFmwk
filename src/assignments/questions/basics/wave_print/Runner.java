package assignments.questions.basics.wave_print;

import assignments.commonutils.ArrayUtility;
import util.stats.Stats;

public class Runner {
	/**
	 * Q_5:
	 */
	public static void Ques_5Test(int arr[][], String filePath) {
		Solution.ques5Ans = new StringBuilder("");
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		Solution.wavePrint(arr);
		stats.endStat();
		ArrayUtility.print(Solution.ques5Ans + "", filePath);
	}

}
