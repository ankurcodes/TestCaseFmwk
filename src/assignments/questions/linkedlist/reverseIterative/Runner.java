package assignments.questions.linkedlist.reverseIterative;

import assignments.questions.linkedlist.LinkedListNode;
import assignments.commonutils.LinkedListUtility;

import util.stats.Stats;

public class Runner {
	/**
	 * Q_10
	 * Reverse Linked List
	 * */
	

	public static void Ques_10_ITest(int arr[], String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer> headresult = Solution.reverse_I(head);
		stats.endStat();
		LinkedListUtility.printList(headresult,filePath);
	}
}
