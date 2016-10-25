package assignments.runners.linkedlist.Ques_7.merge.r;

import assignments.commondatastructure.LinkedListNode;
import assignments.commonutils.LinkedListUtility;
import assignments.solutions.LinkedListSolution;
import util.stats.Stats;

public class Runner {

	public static void Ques_7Test_MergeRecursion(int arr[], String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer>headResult = LinkedListSolution.mergeSort(head);
		stats.endStat();
		LinkedListUtility.printList(headResult,filePath);
	}
}
