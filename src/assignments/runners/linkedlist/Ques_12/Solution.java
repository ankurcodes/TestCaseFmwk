package assignments.runners.linkedlist.Ques_12;



public class Solution {
	public static StringBuilder result = new StringBuilder("");
	/**
	 * Q_12: Print a given linked list in reverse order.
	 */

	public static void printReverseRecursive(LinkedListNode<Integer> root) {
		if (root == null) {
			return;
		}
		printReverseRecursive(root.next);
		System.out.print(root.data + " ");
		result.append(root.data + " ");

	}

}
