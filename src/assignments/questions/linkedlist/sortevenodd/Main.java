package assignments.questions.linkedlist.sortevenodd;

import assignments.questions.linkedlist.LinkedListNode;
import assignments.commonutils.LinkedListUtility;

import util.stats.Stats;

public class Main {
	/**
	 * Q_11
	 * */

	public static void Ques_11Test(int arr[], String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer> headresult = Solution.sortEvenOdd(head);
		stats.endStat();
		LinkedListUtility.printList(headresult,filePath);
	}
}
