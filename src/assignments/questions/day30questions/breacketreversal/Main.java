package assignments.questions.day30questions.breacketreversal;


import java.util.Scanner;



public class Main {

	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {

		String str = s.nextLine();
		System.out.println(Solution.countBracketReversals(str));

	}

}