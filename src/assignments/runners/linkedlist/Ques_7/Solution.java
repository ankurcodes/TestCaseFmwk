package assignments.runners.linkedlist.Ques_7;

import assignments.commondatastructure.LinkedListNode;
import assignments.commonutils.LinkedListUtility;

public class Solution {
	/**
	 * Q_7: Bubble Sort [non recursive]
	 */
	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
		int n = LinkedListUtility.length(head);

		for (int i = 0; i < n - 1; i++) {
			LinkedListNode<Integer> prev = null;
			LinkedListNode<Integer> curr = head;
			for (int j = 0; j < n - i - 1; j++) {
				// while (curr != null && curr.next != null) {

				if (curr.getData() <= curr.next.getData()) {
					prev = curr;
					curr = curr.next;
				} else {
					if (prev == null) {
						LinkedListNode<Integer> fwd = curr.next;
						head = head.next;
						curr.next = fwd.next;
						fwd.next = curr;
						prev = fwd;
					} else {
						LinkedListNode<Integer> fwd = curr.next;
						prev.next = fwd;
						curr.next = fwd.next;
						fwd.next = curr;
						prev = fwd;
					}
				}
			}
		}
		return head;
	}

	/**
	 * Selection Sort only changing data [non recursive]
	 */
	public void selectionSort(LinkedListNode<Integer> head) {
		for (LinkedListNode<Integer> node1 = head; node1 != null; node1 = node1.next) {
			LinkedListNode<Integer> min = node1;
			for (LinkedListNode<Integer> node2 = node1; node2 != null; node2 = node2.next) {
				if (min.data > node2.data) {
					min = node2;
				}
			}
			LinkedListNode<Integer> temp = new LinkedListNode<Integer>(node1.data);
			node1.data = min.data;
			min.data = temp.data;
		}
	}

	/**
	 * Insertion Sort [non recursive]
	 */
	public static LinkedListNode<Integer> insertNode(LinkedListNode<Integer> node) {
		if (node == null) {
			return null;
		}

		LinkedListNode<Integer> sortedList = node;
		node = node.next;
		sortedList.next = null;

		while (node != null) {

			final LinkedListNode<Integer> current = node;
			node = node.next;

			if (current.data < sortedList.data) {
				current.next = sortedList;
				sortedList = current;
			} else {
				LinkedListNode<Integer> search = sortedList;
				while (search.next != null && current.data > search.next.data) {
					search = search.next;
				}
				current.next = search.next;
				search.next = current;
			}
		}

		return sortedList;
	}

	/**
	 * Merge sort [recursive sol]
	 */
	public static LinkedListNode<Integer> mergeSortList(LinkedListNode<Integer> head) {
		if (head == null || head.next == null) {
			return head;
		}

		int count = 0;
		LinkedListNode<Integer> p = head;
		while (p != null) {
			count++;
			p = p.next;
		}

		int middle = count / 2;

		LinkedListNode<Integer> l = head, r = null;
		LinkedListNode<Integer> p2 = head;
		int countHalf = 0;
		while (p2 != null) {
			countHalf++;
			LinkedListNode<Integer> next = p2.next;
			if (countHalf == middle) {
				p2.next = null;
				r = next;
			}
			p2 = next;
		}
		LinkedListNode<Integer> h1 = mergeSortList(l);
		LinkedListNode<Integer> h2 = mergeSortList(r);
		LinkedListNode<Integer> merged = merge(h1, h2);

		return merged;
	}

}
