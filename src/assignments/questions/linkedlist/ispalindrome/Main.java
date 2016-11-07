package assignments.questions.linkedlist.ispalindrome;


import java.util.Scanner;

import assignments.questions.linkedlist.LinkedListNode;


public class Main {
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print(Solution.isPalindrome_2(input()));
	}

	public static LinkedListNode<Integer> input() {
		int data = s.nextInt();
		
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		while (data!=-1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}

}
