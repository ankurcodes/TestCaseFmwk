package assignments.questions.basics.titletonumber;

public class Solution {
	/*
	 * 17. Given a column title as appears in an Excel sheet, return its
	 * corresponding column number.
	 */
	public static int titleToNumber(String a) {

		int len = a.length();
		int rank = 0;
		int power26 = 1;
		for (int i = 0; i < len; i++) {
			int charIndex = a.charAt(len - 1 - i) - 64;
			rank += power26 * charIndex;
			power26 = power26 * 26;
		}
		return rank;
	}
}
