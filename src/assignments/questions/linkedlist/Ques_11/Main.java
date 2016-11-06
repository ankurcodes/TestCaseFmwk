package assignments.questions.linkedlist.Ques_11;

import assignments.commondatastructure.LinkedListNode;
import assignments.commonutils.LinkedListUtility;
import assignments.solutions.LinkedListSolution;
import util.stats.Stats;

public class Main {
	/**
	 * Q_11
	 * */

	public static void Ques_11Test(int arr[], String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer> headresult = LinkedListSolution.sortEvenOdd(head);
		stats.endStat();
		LinkedListUtility.printList(headresult,filePath);
	}
}
