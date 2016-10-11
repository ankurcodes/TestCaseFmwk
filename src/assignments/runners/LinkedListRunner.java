package assignments.runners;

import assignments.commondatastructure.LinkedListNode;
import assignments.commonutils.LinkedListUtility;
import assignments.solutions.LinkedListSolution;
import util.stats.Stats;

public class LinkedListRunner {
	/**
	 * Q_1: 
	 * Insert at ith position
	 */
	public static void Ques_1Test(int [] arr, int position, int data,String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer> finalHead= LinkedListSolution.insertR(head,position,data);
		stats.endStat();
		LinkedListUtility.printList(finalHead,filePath);
	}
	
	/**
	 * Q_2:
	 * 
	 * */
	
	public static void Ques_2Test(int[] arr, int pos, String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer> resultHead=LinkedListSolution.delete(head, pos);
		stats.endStat();
		LinkedListUtility.printList(resultHead,filePath);
	}
	/**
	 * Q_3:
	 * 
	 * */
	
	public static void Ques_3Test(int arr[],int pos1, int pos2, String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer> resultHead = LinkedListSolution.swapNodes(head,pos1,pos2);
		stats.endStat();
		LinkedListUtility.printList(resultHead,filePath);
	}
	/**
	 * Q_4:
	 * 
	 * */
	
	public static void Ques_4Test(int arr[],String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListSolution.removeDuplicates(head);
		stats.endStat();
		LinkedListUtility.printList(head,filePath);
	}
	/**
	 * Q_5
	 * Merge Two List
	 * 
	 * */
	public static void Ques_5Test(int arr1[], int arr2[],String filePath){
		LinkedListNode<Integer> head1 = LinkedListUtility.arrayToLinkedList(arr1);
		LinkedListNode<Integer> head2 = LinkedListUtility.arrayToLinkedList(arr2);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer>headResult = LinkedListSolution.merge(head1, head2);
		stats.endStat();
		LinkedListUtility.printList(headResult,filePath);
	}
	/**
	 * Q_6:
	 * 
	 * */
	
	public static void Ques_6Test(int arr[], String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		int headResult = LinkedListSolution.printMiddel(head);
		stats.endStat();
		LinkedListUtility.print(headResult+"",filePath);
	}
	/**
	 * Q_7:
	 * 
	 * */
	
	public static void Ques_7Test(int arr[], String filePath){
		
	}
	
	/**
	 * Q_8:
	 * bubbleSort
	 * */
	public static void Ques_8Test(int arr[], String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer>headResult = LinkedListSolution.bubbleSort(head);
		stats.endStat();
		LinkedListUtility.printList(headResult,filePath);
	}
	
	/**
	 * Q_9:
	 * Check if a linked list is a palindrome
	 * */
	
	public static void Ques_9Test(int arr[],String filePath){
		LinkedListNode<Integer> head=null;
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		boolean headResult =LinkedListSolution.isPalindrome_2(head);
		stats.endStat();
		LinkedListUtility.print(headResult+"",filePath);
	}
	
	/**
	 * Q_10
	 * Reverse Linked List
	 * */
	
	public static void Ques_10_RTest(int arr[], String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer> headresult = LinkedListSolution.reverse_R(head);
		stats.endStat();
		LinkedListUtility.printList(headresult,filePath);
	}
	public static void Ques_10_ITest(int arr[], String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer> headresult = LinkedListSolution.reverse_I(head);
		stats.endStat();
		LinkedListUtility.printList(headresult,filePath);
	}
	/**
	 * Q_11
	 * */

	public static void Ques_11Test(int arr[], String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer> headresult = LinkedListSolution.rearrangeEvenOdd(head);
		stats.endStat();
		LinkedListUtility.printList(headresult,filePath);
	}
	
	/**
	 * Q_12
	 * */
	public static void Ques_12Test(int arr[], String filePath){
		LinkedListSolution.ques12Ans = new StringBuilder("");
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListSolution.printReverseRecursive(head);
		stats.endStat();
		LinkedListUtility.print(LinkedListSolution.ques12Ans.toString(), filePath);
	}
	
	/**
	 * Q_13
	 * */
	public static void Ques_13Test(int arr[],int k, String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer> headresult = LinkedListSolution.append(head,k);
		stats.endStat();
		LinkedListUtility.printList(headresult,filePath);
	}
	
	/**
	 * Q_14
	 * KReverese()
	 * */
	public static void Ques_14Test(int arr[],int k, String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer> headresult = LinkedListSolution.kReverse(head,k);
		stats.endStat();
		LinkedListUtility.printList(headresult,filePath);
	}
}
