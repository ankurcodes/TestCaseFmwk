package assignments.questions.linkedlist.printmiddle;

import assignments.questions.linkedlist.LinkedListNode;

public class Solution {
	/**
	 * Q_6: Find midpoint of a Linked List
	 */
	public static int printMiddel(LinkedListNode<Integer> head) {
		if (head == null) {
			return -1;
		}
		LinkedListNode<Integer> slow_ptr = head;
		LinkedListNode<Integer> fast_ptr = head.next;
		while (fast_ptr != null && fast_ptr.next != null) {
			fast_ptr = fast_ptr.next.next;
			slow_ptr = slow_ptr.next;
		}
		return slow_ptr.data;

	}
}
