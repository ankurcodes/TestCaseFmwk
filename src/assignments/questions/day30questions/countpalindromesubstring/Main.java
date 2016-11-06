package assignments.questions.day30questions.countpalindromesubstring;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		int count = Solution.countPalindromeSubstrings(input);
		System.out.println(count);
	}
}
