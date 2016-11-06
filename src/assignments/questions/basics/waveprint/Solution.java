package assignments.questions.basics.waveprint;

public class Solution {
	public static StringBuilder ques5Ans = new StringBuilder("");
	/**
	 * 5. Print 2d array in wave form.
	 */

	public static void wavePrint(int input[][]) {

		if (input.length == 0) {
			return;
		}

		int numRows = input.length;
		int numCols = input[0].length;

		for (int j = 0; j < numCols; j++) {
			if (j % 2 == 0) {
				for (int i = 0; i < numRows; i++) {
					// System.out.print(input[i][j]+" ");
					ques5Ans.append(input[i][j] + " ");
				}
			} else {
				for (int i = input.length - 1; i >= 0; i--) {
					// System.out.print(input[i][j]+" ");
					ques5Ans.append(input[i][j] + " ");
				}
			}
		}
	}

}
