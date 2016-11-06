package assignments.questions.test.surprisetest.WellformedParanthesis;

public class Solution {

	public static StringBuilder result = new StringBuilder();
	public static void printWellFormedParanthesis(int n) {
		printWellFormedParanthesis(n, n, "");
	}

	public static void printWellFormedParanthesis(int open, int closed, String str) {
		if (closed == 0) {
			//System.out.println(str);
			 result.append(str);
			 result.append("\r\n");
			return;
		}
		if (open != 0) {
			printWellFormedParanthesis(open - 1, closed, str + "(");
		}
		if (closed > open) {
			printWellFormedParanthesis(open, closed - 1, str + ")");
		}
	}

}
