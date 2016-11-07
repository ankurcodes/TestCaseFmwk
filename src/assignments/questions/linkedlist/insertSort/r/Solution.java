package assignments.questions.linkedlist.Ques_7.insertion.r;




public class Solution {
	public static LinkedListNode<Integer> ins_sort(LinkedListNode<Integer> head) {
		if (head == null || head.next == null)
			return head;
		else {
			ins_sort(head.next);
			LinkedListNode<Integer> j = head;
			int key = head.data;
			while ((j.next != null) && (j.next.data < key)) {
				j.data = j.next.data;
				j = j.next;
			}

			j.data = key;
			return head;
		}
	}

}
