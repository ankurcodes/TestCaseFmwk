package assignments.runners.linkedlist.Ques_5;

public class Solution {

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


}
