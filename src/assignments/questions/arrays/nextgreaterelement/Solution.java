package assignments.questions.arrays.nextgreaterelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Solution {
	/**
	 * /*15 Next greater element/
	 * 
	 */
	public static ArrayList<Integer> nextGreaterElement(ArrayList<Integer> input) {
		Stack<Integer> data = new Stack<>();
		ArrayList<Integer> output = new ArrayList<>();
		for (int i = input.size() - 1; i >= 0; i--) {
			int element = input.get(i);
			while (!data.isEmpty() && data.peek() <= element) {
				data.pop();
			}
			if (data.isEmpty()) {
				output.add(-1);
			} else {
				output.add(data.peek());
			}
			data.push(element);
		}
		Collections.reverse(output);
		return output;
	}
}
