package assignments.questions.arrays.reverse_array_not_special_chars;

public class Solution {
	/**
	 * Q_12. Reverse an array without affecting special characters Given a
	 * string, that contains special character together with alphabets (‘a’ to
	 * ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that special characters
	 * are not affected.
	 */
	public static String reverse(String str) {
		if (str.length() <= 1) {
			return str;
		}
		int i = 0;
		int j = str.length() - 1;
		char charArray[] = new char[str.length()];

		while (i <= j) {
			if (isSpecialCharacter(str.charAt(i))) {
				charArray[i] = str.charAt(i);
				i++;
			} else if (isSpecialCharacter(str.charAt(j))) {
				charArray[j] = str.charAt(j);
				j--;
			} else { // swap if both characters at i and j aren't special
				charArray[i] = str.charAt(j);
				charArray[j] = str.charAt(i);
				i++;
				j--;
			}
		}
		String reverse = new String(charArray);
		return reverse;
	}

	private static boolean isSpecialCharacter(char c) {

		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			return false;
		} else {
			return true;
		}
	}

}
