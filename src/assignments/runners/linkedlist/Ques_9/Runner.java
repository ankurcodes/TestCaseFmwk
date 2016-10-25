package assignments.runners.linkedlist.Ques_9;

import assignments.commondatastructure.LinkedListNode;
import assignments.commonutils.LinkedListUtility;
import assignments.solutions.LinkedListSolution;
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
		boolean headResult =LinkedListSolution.isPalindrome_2(head);
		stats.endStat();
		LinkedListUtility.print(headResult+"",filePath);
	}
}
