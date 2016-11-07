package assignments.questions.linkedlist.ispalindrome;

import assignments.questions.linkedlist.LinkedListNode;

public class Solution {

	/**
	 * Q_9: Reverse the second list and compare two sublists. The time is O(n)
	 * and space is O(1).
	 */
	private static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> curr = head;
		LinkedListNode<Integer> prev = null;
		LinkedListNode<Integer> fwd = null;

		while (curr != null) {
			fwd = curr.next;
			curr.next = prev;
			prev = curr;
			curr = fwd;
		}

		return prev;
	}
	public static boolean isPalindrome_2(LinkedListNode<Integer> head) {

		if (head == null || head.next == null) {
			return true;
		}

		// find list center
		LinkedListNode<Integer> fast = head;
		LinkedListNode<Integer> slow = head;

		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		LinkedListNode<Integer> secondHead = slow.next;
		slow.next = null;
		secondHead = reverse_I(secondHead);

		

		// compare two sublists now
		LinkedListNode<Integer> p = secondHead;
		LinkedListNode<Integer> q = head;
		while (p != null) {
			if (p.data != q.data) {
				return false;
			}

			p = p.next;
			q = q.next;

		}

		return true;
	}

}
