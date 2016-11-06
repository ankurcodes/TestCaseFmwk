package assignments.questions.test1.mergefirsthalfsecondhalf;

import assignments.commondatastructure.LinkedListNode;
import assignments.commonutils.LinkedListUtility;
import util.stats.Stats;

public class Runner {
	/**
	 * Q_1: 
	 * Insert at ith position
	 */
	public static void Ques_1Test(int [] arr, String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		solution.mergeFirstAndSecondHalf(head);
		stats.endStat();
		LinkedListUtility.printList(head,filePath);
	}
}
