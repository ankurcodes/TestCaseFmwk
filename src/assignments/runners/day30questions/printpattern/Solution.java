package assignments.runners.day30questions.printpattern;

public class Solution {
	/**
	 * 11. Pattern
	 */
	public static void printPattern(int n) {

		int startValue = 1; // start value for each row
		for (int i = 1; i <= n; i++) {
			for (int j = startValue; j < startValue + n; j++) {
				System.out.print(j + " ");
				ques11Ans = ques11Ans.append(j + " ");
			}
			System.out.println();
			ques11Ans = ques11Ans.append("\r\n");
			if (i == (n + 1) / 2) {
				if (n % 2 != 0) {
					startValue = n * (n - 2) + 1;
				} else {
					startValue = n * (n - 1) + 1;
				}
			} else if (i > (n + 1) / 2) {
				startValue = startValue - 2 * n;
			} else {
				startValue = startValue + 2 * n;
			}
		}
	}

}
