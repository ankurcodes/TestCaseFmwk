package assignments.runners.linkedlist.Ques_2;

import assignments.commondatastructure.LinkedListNode;
import assignments.commonutils.LinkedListUtility;
import assignments.solutions.LinkedListSolution;
import util.stats.Stats;

public class Runner {

	/**
	 * Q_2:
	 * 
	 * */
	
	public static void Ques_2Test(int[] arr, int pos, String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer> resultHead=LinkedListSolution.delete(head, pos);
		stats.endStat();
		LinkedListUtility.printList(resultHead,filePath);
	}
}
