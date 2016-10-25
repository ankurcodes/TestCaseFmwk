package assignments.runners.linkedlist.Ques_13;

import assignments.commondatastructure.LinkedListNode;
import assignments.commonutils.LinkedListUtility;
import assignments.solutions.LinkedListSolution;
import util.stats.Stats;

public class Runner {

	/**
	 * Q_13
	 * */
	public static void Ques_13Test(int arr[],int k, String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer> headresult = LinkedListSolution.append(head,k);
		stats.endStat();
		LinkedListUtility.printList(headresult,filePath);
	}
}
