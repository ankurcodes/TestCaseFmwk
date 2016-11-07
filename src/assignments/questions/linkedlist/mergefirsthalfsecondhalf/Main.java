package assignments.questions.linkedlist.mergefirsthalfsecondhalf;

import java.util.Scanner;

import assignments.questions.linkedlist.LinkedListNode;

public class Main {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		LinkedListNode<Integer> head = input();
		solution.mergeFirstAndSecondHalf(head);
		print(head);
	}

	public static void print(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.next;
		}
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
