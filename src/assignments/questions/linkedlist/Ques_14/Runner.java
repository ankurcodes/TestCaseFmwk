package assignments.questions.linkedlist.Ques_14;

import assignments.commondatastructure.LinkedListNode;
import assignments.commonutils.LinkedListUtility;
import assignments.solutions.LinkedListSolution;
import util.stats.Stats;

public class Runner {

	/**
	 * Q_14 KReverese()
	 */
	public static void Ques_14Test(int arr[], int k, String filePath) {
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer> headresult = LinkedListSolution.kReverse(head, k);
		stats.endStat();
		LinkedListUtility.printList(headresult, filePath);
	}
}
