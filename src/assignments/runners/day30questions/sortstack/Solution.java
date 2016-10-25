package assignments.runners.day30questions.sortstack;

import java.util.Stack;

public class Solution {
	/*
	 * 18.
	 * 
	 * Sort the elements inside a stack in ascending order using only push and
	 * pop operation. You can use one additional stack.
	 */
	public static void sortStack(Stack<Integer> stack, Stack<Integer> helper) {
		if (stack.size() <= 1) {
			return;
		}
		int top = stack.pop();
		// to sort stack except top element
		sortStack(stack, helper);

		// pop till all elements in stack are greater than top
		while (!stack.isEmpty() && stack.peek() > top) {
			helper.push(stack.pop());
		}
		stack.push(top);
		while (!helper.isEmpty()) {
			stack.push(helper.pop());
		}
	}
}
