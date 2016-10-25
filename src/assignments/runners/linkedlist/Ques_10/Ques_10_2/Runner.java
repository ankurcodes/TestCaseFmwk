package assignments.runners.linkedlist.Ques_10.Ques_10_2;

import assignments.commondatastructure.LinkedListNode;
import assignments.commonutils.LinkedListUtility;
import assignments.solutions.LinkedListSolution;
import util.stats.Stats;

public class Runner {
	public static void Ques_10_RTest(int arr[], String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer> headresult = LinkedListSolution.reverse_R(head);
		stats.endStat();
		LinkedListUtility.printList(headresult,filePath);
	}
}
