package assignments.questions.strings.check2stringpermutation;

public class Solution {
	/**
	 * Q_6: Given two strings check if they are permutations of each other
	 */
	public static boolean checkPermutation(String str1, String str2) {

		// To store count of each char in first string;
		int[] charCount = new int[256];

		for (int i = 0; i < str1.length(); i++) {
			charCount[str1.charAt(i)]++;
		}

		// Now traverse second string and decrease count of each character
		for (int i = 0; i < str2.length(); i++) {
			charCount[str2.charAt(i)]--;
		}

		// Traverse charCount array now, if any entry in the array is non zero,
		// then ans is false
		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] != 0) {
				return false;
			}
		}
		return true;
	}
}
