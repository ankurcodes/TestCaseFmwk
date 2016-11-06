package assignments.questions.stack.sortstack;

import assignments.commondatastructure.LinkedStack;

import util.stats.Stats;

public class Runner {
	/**
	 * Q_18: Complexity: O(n2)
	 */

	public static void Ques_18Test(int arr[], String filePath) {
		LinkedStack<Integer> stack = new LinkedStack<Integer>();
		LinkedStack<Integer> helper = new LinkedStack<Integer>();
		for (int i : arr) {
			stack.push(i);
		}

		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		Solution.sortStack(stack, helper);
		stats.endStat();
		stack.displayReverse(filePath);
	}
}
