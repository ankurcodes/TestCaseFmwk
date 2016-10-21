

public class Solution {
	/**
	 * Q_12: Print a given linked list in reverse order.
	 */

	public static void printReverseRecursive(LinkedListNode<Integer> root) {
		if (root == null) {
			return;
		}
		printReverseRecursive(root.next);
		System.out.print(root.data + " ");

	}

}
