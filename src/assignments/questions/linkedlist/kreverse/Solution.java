package assignments.questions.linkedlist.kreverse;

import assignments.questions.linkedlist.LinkedListNode;

public class Solution {
	/**
	 * Q_14: Implement kReverse(int k)
	 */
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		LinkedListNode<Integer> current = head;
		LinkedListNode<Integer> next = null;
		LinkedListNode<Integer> prev = null;

		int count = 0;

		/* Reverse first k nodes of linked list */
		while (count < k && current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}

		if (next != null) {
			head.next = kReverse(next, k);
		}
		return prev;
	}

}
