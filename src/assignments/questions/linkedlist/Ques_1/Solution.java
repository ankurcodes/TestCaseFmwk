package assignments.questions.linkedlist.Ques_1;



public class Solution {
	/**
	 * Q_1: Insert a node into Linked List at ith position recursively
	 */

	public static  LinkedListNode<Integer> insertR(LinkedListNode<Integer> head, int pos, int data) {
		if (pos == 0) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			newNode.next = head;
			return newNode;
		}
		head.next = insertR(head.next, pos - 1, data);
		return head;
	}

	
}
 