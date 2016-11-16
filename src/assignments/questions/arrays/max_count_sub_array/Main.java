package assignments.questions.arrays.max_count_sub_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner s = new Scanner(System.in);
	
	public static ArrayList<Integer> takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			arr.add(s.nextInt());
		}
		return arr;
	}

	public static void print(ArrayList<Integer> arr) {
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i)+" ");
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> input = takeInput();
		ArrayList<Integer> output = solution.maxset(input); 
		print(output);
	}
}