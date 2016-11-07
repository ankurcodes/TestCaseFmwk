package assignments.questions.linkedlist.mergefirsthalfsecondhalf;

import assignments.questions.linkedlist.LinkedListNode;

public class solution {

	public static LinkedListNode<Integer> findMid(LinkedListNode<Integer> head)
	{
		if(head == null || head.next == null) {
			return head;
		}
		LinkedListNode<Integer>slow = head, fast = head.next;
		while(fast != null && fast. next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static void mergeFirstAndSecondHalf(LinkedListNode<Integer>head) {
		if(head == null || head.next == null) {
			return;
		}
		LinkedListNode<Integer>mid = findMid(head);
		LinkedListNode<Integer>head1 = head, head2 = mid.next;
		LinkedListNode<Integer> tail = head;
		mid.next = null;
		int i = 1;
		head1 = head1.next;
		while(head1 != null && head2 != null) {
			if(i % 2 == 0) {
				tail.next = head1;
				tail = head1;
				head1 = head1.next;
			}
			else {
				tail.next = head2;
				tail = head2;
				head2 = head2.next;
			}
			i++;
		}
		if(head1 != null) {
			tail.next = head1;
			head1.next = null;
		}
		if(head2 != null) {
			tail.next = head2;
			head2.next = null;
		}
	}

}
