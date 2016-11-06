package assignments.questions.linkedlist.Ques_13;

import assignments.commondatastructure.LinkedListNode;

public class Solution {

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

}
