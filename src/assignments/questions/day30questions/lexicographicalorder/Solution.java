package assignments.questions.day30questions.lexicographicalorder;

public class Solution {
	public static StringBuilder ques10Ans = new StringBuilder("");
	/**
	 * Q_10: Print numbers from 1 to n in dictionary order.
	 */

	public static void lexicographicalOrder(int num) {
		ques10Ans = new StringBuilder("");
		for (int i = 1; i <= 9; i++) {
			lexicographicalOrderHelper(i, num);
		}
	}

	private static void lexicographicalOrderHelper(int numberSoFar, int num) {
		if (numberSoFar > num) {
			return;
		}
		System.out.println(numberSoFar);
		ques10Ans = ques10Ans.append(numberSoFar + "\r\n");

		for (int i = 0; i <= 9; i++) {
			lexicographicalOrderHelper(numberSoFar * 10 + i, num);
		}

	}
}
