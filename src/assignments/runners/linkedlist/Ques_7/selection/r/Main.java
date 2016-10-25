package assignments.runners.linkedlist.Ques_7.selection.r;
import java.util.Scanner;

import LinkedList.Node;

public class Main {
     
	public static Node<Integer> takeInput()
	{
		Scanner s = new Scanner(System.in);
		Node<Integer> head = null,tail=null;
		System.out.println("Enter data: ");
		int data=s.nextInt();
		
		while(data!=-1)
		{
			Node<Integer> newNode= new Node<>(data);
			if(head==null)
			{
				head=newNode;
				tail=newNode;
			}
			else
			{
				Node<Integer> temp=head;
				while(temp.next!=null)
					temp=temp.next;
				temp.next=newNode;
				tail.next=newNode;
				tail=tail.next;
			}
			System.out.println("Enter data: ");
			data=s.nextInt();
		}
		return head;
		
	}
	public static void print(Node<Integer> head)
	{
		
		while(head!=null)
	{
			
			
		System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.print(-1);
	}

    	
	public static void main(String[] args) {
		
		Node<Integer> head = takeInput();
		 head =solution.selectionSortRecursion(head);
		print(head);
		
	}
}
