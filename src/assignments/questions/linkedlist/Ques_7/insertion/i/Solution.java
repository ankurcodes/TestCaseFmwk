


public class Solution {
	public static LinkedListNode<Integer> insertionSort(LinkedListNode<Integer> node) {
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
}
