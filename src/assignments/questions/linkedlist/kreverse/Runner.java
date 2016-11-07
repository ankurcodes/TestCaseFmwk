package assignments.questions.linkedlist.kreverse;

import assignments.questions.linkedlist.LinkedListNode;
import assignments.commonutils.LinkedListUtility;

import util.stats.Stats;

public class Runner {

	/**
	 * Q_14 KReverese()
	 */
	public static void Ques_14Test(int arr[], int k, String filePath) {
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer> headresult = Solution.kReverse(head, k);
		stats.endStat();
		LinkedListUtility.printList(headresult, filePath);
	}
}
