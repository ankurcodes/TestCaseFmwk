package assignments.questions.test.surprisetest.skipmdeleten;

import assignments.commondatastructure.LinkedListNode;

public class Solution {
	
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
		if(M==0){
			return null;
		}
		LinkedListNode<Integer> curr = head, t;
		int count;

		while (curr != null) {

			for (count = 1; count < M && curr != null; count++)
				curr = curr.next;

			if (curr == null)
				return head;

			t = curr.next;
			for (count = 1; count <= N && t != null; count++) {
				t = t.next;

			}
			curr.next = t;
			curr = t;
		}
		return head;
	}
}
