package assignments.questions.linkedlist.selectionsortrecursion;
import java.util.Scanner;

import assignments.questions.linkedlist.LinkedListNode;



public class Main {
     
	public static LinkedListNode<Integer> takeInput()
	{
		Scanner s = new Scanner(System.in);
		LinkedListNode<Integer> head = null,tail=null;
		System.out.println("Enter data: ");
		int data=s.nextInt();
		
		while(data!=-1)
		{
			LinkedListNode<Integer> newLinkedListNode= new LinkedListNode<>(data);
			if(head==null)
			{
				head=newLinkedListNode;
				tail=newLinkedListNode;
			}
			else
			{
				LinkedListNode<Integer> temp=head;
				while(temp.next!=null)
					temp=temp.next;
				temp.next=newLinkedListNode;
				tail.next=newLinkedListNode;
				tail=tail.next;
			}
			System.out.println("Enter data: ");
			data=s.nextInt();
		}
		return head;
		
	}
	public static void print(LinkedListNode<Integer> head)
	{
		
		while(head!=null)
	{
			
			
		System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.print(-1);
	}

    	
	public static void main(String[] args) {
		
		LinkedListNode<Integer> head = takeInput();
		 head =Solution.selectionSortRecursion(head);
		print(head);
		
	}
}
