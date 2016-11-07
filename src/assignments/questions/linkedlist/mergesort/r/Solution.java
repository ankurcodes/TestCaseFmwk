package assignments.questions.linkedlist.mergesort.r;

import assignments.questions.linkedlist.LinkedListNode;

public class Solution {

	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		if (head == null || head.next == null) {
			return head;
		}
		LinkedListNode<Integer> mid = midPoint(head);
		LinkedListNode<Integer> head1 = head;
		LinkedListNode<Integer> head2 = mid.next;
		mid.next = null;
		head1 = mergeSort(head1);
		head2 = mergeSort(head2);
		LinkedListNode<Integer> answer = merge(head1, head2);
		return answer;

	}
	public static LinkedListNode<Integer> merge(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
		LinkedListNode<Integer> resultHead = null;
		LinkedListNode<Integer> resultTail = null;
		if (head1.data < head2.data) {
			resultHead = head1;
			resultTail = head1;
			head1 = head1.next;
		} else {
			resultHead = head2;
			resultTail = head2;
			head2 = head2.next;
		}
		while (head1 != null && head2 != null) {
			if (head1.data < head2.data) {
				resultTail.next = head1;
				head1 = head1.next;
				resultTail = resultTail.next;
			} else {
				resultTail.next = head2;
				head2 = head2.next;
				resultTail = resultTail.next;
			}
		}
		resultTail.next = head1 == null ? head2 : head1;
		return resultHead;
	}

	public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
		if (head == null) {
			return head;
		}
		LinkedListNode<Integer> slow_ptr = head;
		LinkedListNode<Integer> fast_ptr = head.next;

		while (fast_ptr != null && fast_ptr.next != null) {
			fast_ptr = fast_ptr.next.next;
			slow_ptr = slow_ptr.next;
		}
		return slow_ptr;
	}
	public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
		LinkedListNode<Integer> head = null, tail = null;
		if (head1.data < head2.data) {
			head = head1;
			tail = head1;
			head1 = head1.next;
		} else {

			head = head2;
			tail = head2;
			head2 = head2.next;
		}
		while (head1 != null && head2 != null) {
			if (head1.data < head2.data) {
				tail.next = head1;
				tail = tail.next;
				head1 = head1.next;
			} else {
				tail.next = head2;
				tail = tail.next;
				head2 = head2.next;
			}
		}
		if (head1 != null) {
			tail.next = head1;
		}
		if (head2 != null) {
			tail.next = head2;
		}
		return head;
	}

}
