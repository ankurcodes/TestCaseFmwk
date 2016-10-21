
public class Solution {
	/**
	 * Q_2: Delete node at ith position from Linked list recursively
	 */
	public static LinkedListNode<Integer> delete(LinkedListNode<Integer> head, int position) {
		if (position == 0) {
			return head.next;
		}
		head.next = delete(head.next, --position);
		return head;
	}

}