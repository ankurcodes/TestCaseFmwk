package assignments.questions.strings.smallest_substring_having_all_chars_of_another_string;

import java.util.Scanner;

public class Main {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		String large = s.nextLine();
		String small = s.nextLine();
		System.out.println(Solution.findMinSubstringContainingString(large, small));
	}
}