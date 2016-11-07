package assignments.questions.linkedlist.ispalindrome;

import assignments.questions.linkedlist.LinkedListNode;
import assignments.commonutils.LinkedListUtility;

import util.stats.Stats;

public class Runner {
	/**
	 * Q_9:
	 * Check if a linked list is a palindrome
	 * */
	
	public static void Ques_9Test(int arr[],String filePath){
		LinkedListNode<Integer> head=LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		boolean headResult =Solution.isPalindrome_2(head);
		stats.endStat();
		LinkedListUtility.print(headResult+"",filePath);
	}
}
