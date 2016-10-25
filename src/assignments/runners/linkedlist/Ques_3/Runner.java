package assignments.runners.linkedlist.Ques_3;

import assignments.commondatastructure.LinkedListNode;
import assignments.commonutils.LinkedListUtility;
import assignments.solutions.LinkedListSolution;
import util.stats.Stats;

public class Runner {

	/**
	 * Q_3:
	 * 
	 * */
	
	public static void Ques_3Test(int arr[],int pos1, int pos2, String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer> resultHead = LinkedListSolution.swap_nodes(head,pos1,pos2);
		stats.endStat();
		LinkedListUtility.printList(resultHead,filePath);
	}
}
