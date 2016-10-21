package assignments.solutions;

import assignments.commondatastructure.LinkedListNode;

public class SurpriseTestSolution {

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
	public static void print(LinkedListNode<Integer> head){
		while(head!=null){
			System.out.print(head.data+"---->");
			head = head.next;
		}
	}

	public static void main(String args[]) {
		LinkedListNode<Integer> list = new LinkedListNode<>(10);
		list.next = new LinkedListNode<>(20);
		list.next.next = new LinkedListNode<>(30);		
		list.next.next.next = new LinkedListNode<>(40);		
		list.next.next.next.next = new LinkedListNode<>(50);		
		list.next.next.next.next.next = new LinkedListNode<>(60);
		list.next.next.next.next.next.next = new LinkedListNode<>(70);
		list.next.next.next.next.next.next.next = new LinkedListNode<>(80);
		list.next.next.next.next.next.next.next.next = new LinkedListNode<>(90);
		list.next.next.next.next.next.next.next.next.next = new LinkedListNode<>(100);
		skipMdeleteN(list,0,2);
		print(list);
		
	}
}
