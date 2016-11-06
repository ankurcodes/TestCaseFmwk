package assignments.questions.linkedlist.Ques_7.bubble.r;

import assignments.commondatastructure.LinkedListNode;

public class Solution {

	static LinkedListNode<Integer> bubbleSortRec(LinkedListNode<Integer> start) {
		if (start == null)
			return null;
		start.next = bubbleSortRec(start.next);
		if (start.next != null && start.data > start.next.data) {
			start = move(start);
		}
		return start;
	}

	private static LinkedListNode<Integer> move(LinkedListNode<Integer> x) {
		LinkedListNode<Integer> n, p, ret;

		p = x;
		n = x.next;
		ret = n;
		while (n != null && x.data > n.data) {
			p = n;
			n = n.next;
		}
		/* we now move the top item between p and n */
		p.next = x;
		x.next = n;
		return ret;
	}

}
