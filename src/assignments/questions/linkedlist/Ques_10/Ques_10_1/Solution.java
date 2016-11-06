package assignments.questions.linkedlist.Ques_10.Ques_10_1;


public class Solution {
	/**
	 * Q_10: Using iteration
	 */

	public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head) {
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

	

}
