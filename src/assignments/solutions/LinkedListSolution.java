package assignments.solutions;

import assignments.commondatastructure.LinkedListNode;
import assignments.commonutils.LinkedListUtility;

public class LinkedListSolution {
	public static StringBuilder ques12Ans = new StringBuilder("");

	/**
	 * Q_1: Insert a node into Linked List at ith position recursively
	 */

	public static <T> LinkedListNode<T> insertR(LinkedListNode<T> head, int pos, T data) {
		if (pos == 0) {
			LinkedListNode<T> newNode = new LinkedListNode<T>(data);
			newNode.next = head;
			return newNode;
		}
		head.next = insertR(head.next, pos - 1, data);
		return head;
	}

	/**
	 * Q_1: Insert at position in LinkedList
	 */

	public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int position, int element) {
		if (position > LinkedListUtility.length(head)) {
			return head;
		}

		LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(element);

		if (position == 0) {
			newNode.next = head;
			return newNode;
		}

		LinkedListNode<Integer> prevNode = head;
		int i = 1;
		while (i < position) {
			i++;
			prevNode = prevNode.next;
		}
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		return head;
	}

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

	/**
	 * Q_3: Swap Nodes
	 */
	public static LinkedListNode<Integer> swap_nodes(LinkedListNode<Integer> head, int i, int j) {
		LinkedListNode<Integer> temp = head, prev = null;
		LinkedListNode<Integer> node1 = null, node2 = null, node1_prev = null, node2_prev = null;
		int pos = 0;
		while (temp != null) {
			if (pos == i) {
				node1_prev = prev;
				node1 = temp;
			} else if (pos == j) {
				node2_prev = prev;
				node2 = temp;
			}
			prev = temp;
			temp = temp.next;
			pos++;
		}

		if (node1_prev != null) {
			node1_prev.next = node2;
		} else {
			head = node2;
		}

		if (node2_prev != null) {
			node2_prev.next = node1;
		} else {
			head = node1;
		}

		LinkedListNode<Integer> temp1 = node2.next;
		node2.next = node1.next;
		node1.next = temp1;

		return head;
	}

	/**
	 * Q_4: Remove duplicates
	 */

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> current = head;

		if (head == null)
			return null;

		while (current.next != null) {
			if (current.data.equals(current.next.data)) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}

		return head;
	}

	public static LinkedListNode<Integer> merge(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
		LinkedListNode<Integer> resultHead = null;
		LinkedListNode<Integer> resultTail = null;
		if (head1.getData() < head2.getData()) {
			resultHead = head1;
			resultTail = head1;
			head1 = head1.next;
		} else {
			resultHead = head2;
			resultTail = head2;
			head2 = head2.next;
		}
		while (head1 != null && head2 != null) {
			if (head1.getData() < head2.getData()) {
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

	/**
	 * Q_6: Find midpoint of a Linked List
	 */
	public static int printMiddel(LinkedListNode<Integer> head) {
		if (head == null) {
			return -1;
		}
		LinkedListNode<Integer> slow_ptr = head;
		LinkedListNode<Integer> fast_ptr = head.next;

		while (fast_ptr != null && fast_ptr.next != null) {
			fast_ptr = fast_ptr.next.next;
			slow_ptr = slow_ptr.next;
		}
		return slow_ptr.data;

	}

	/**
	 * Q_7: Bubble Sort [recursion]
	 */
	public static LinkedListNode<Integer> bubbleSortRec(LinkedListNode<Integer> start) {
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

	/**
	 * Q_8: Bubble Sort [non recursive]
	 */
	public static LinkedListNode<Integer> bubbleSortIterative(LinkedListNode<Integer> head) {
		int n = LinkedListUtility.length(head);

		for (int i = 0; i < n - 1; i++) {
			LinkedListNode<Integer> prev = null;
			LinkedListNode<Integer> curr = head;
			for (int j = 0; j < n - i - 1; j++) {
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

	/**
	 * Q_9: new list in reversed order and then compare each node. Time and
	 * space are O(n).
	 */
	public static boolean isPalindrome_1(LinkedListNode<Integer> head) {
		if (head == null)
			return true;

		LinkedListNode<Integer> p = head;
		LinkedListNode<Integer> prev = new LinkedListNode<Integer>(head.data);

		while (p.next != null) {
			LinkedListNode<Integer> temp = new LinkedListNode<Integer>(p.next.data);
			temp.next = prev;
			prev = temp;
			p = p.next;
		}

		LinkedListNode<Integer> p1 = head;
		LinkedListNode<Integer> p2 = prev;

		while (p1 != null) {
			if (p1.data != p2.data)
				return false;

			p1 = p1.next;
			p2 = p2.next;
		}

		return true;
	}

	/**
	 * Q_9: Reverse the second list and compare two sublists. The time is O(n)
	 * and space is O(1).
	 */

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
			if (!p.data.equals(q.data)) {
				return false;
			}

			p = p.next;
			q = q.next;

		}

		return true;
	}

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

	/**
	 * Q_10: Reverse List
	 */
	public static LinkedListNode<Integer> reverse_R(LinkedListNode<Integer> head) {
		if (head.next == null) {
			return head;
		}

		LinkedListNode<Integer> finalHead = reverse_R(head.next);
		head.next.next = head;
		head.next = null;
		return finalHead;
	}

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

	/**
	 * Q_12: Print a given linked list in reverse order.
	 */

	public static void printReverseRecursive(LinkedListNode<Integer> root) {
		if (root == null) {
			return;
		}
		printReverseRecursive(root.next);
		// System.out.print(root.data + " ");
		ques12Ans.append(root.data + " ");
	}

	/**
	 * Q_13: Append the last n elements of a linked list to the front.
	 */
	public static LinkedListNode<Integer> append(LinkedListNode<Integer> root, int n) {
		LinkedListNode<Integer> fast = root, slow = root;
		LinkedListNode<Integer> temp = root;
		for (int i = 0; i < n; i++) {
			fast = fast.next;
		}
		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		LinkedListNode<Integer> jk = slow.next;
		slow.next = null;
		fast.next = temp;
		root = jk;
		return root;
	}

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
