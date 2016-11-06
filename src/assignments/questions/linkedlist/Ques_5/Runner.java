package assignments.questions.linkedlist.Ques_5;

import assignments.commondatastructure.LinkedListNode;
import assignments.commonutils.LinkedListUtility;
import assignments.solutions.LinkedListSolution;
import util.stats.Stats;

public class Runner {
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
}
