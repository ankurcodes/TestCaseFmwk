package assignments.questions.arrays.occur_more_than_nby2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println(Solution.majorityElement(arr));

	}
}
