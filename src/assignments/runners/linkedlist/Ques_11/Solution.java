

public class Solution {
	/**
	 * Q_11: Arrange elements in a Linked List such that all even numbers are
	 * placed after odd numbers.
	 */
	public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head) {
		if (head == null) {
			return head;
		}
		LinkedListNode<Integer> evenHead = null, oddHead = null, evenTail = null, oddTail = null;
		while (head != null) {
			if (head.data % 2 == 0) {
				if (evenHead == null) {
					evenHead = head;
					evenTail = head;
				} else {
					evenTail.next = head;
					evenTail = evenTail.next;
				}
			} else {
				if (oddHead == null) {
					oddHead = head;
					oddTail = head;
				} else {
					oddTail.next = head;
					oddTail = oddTail.next;
				}
			}
			head = head.next;
		}
		if (oddHead == null) {
			return evenHead;
		} else {
			oddTail.next = evenHead;
		}
		if (evenHead != null) {
			evenTail.next = null;
		}
		return oddHead;
	}
}
