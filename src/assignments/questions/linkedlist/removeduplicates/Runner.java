package assignments.questions.linkedlist.removeduplicates;

import assignments.questions.linkedlist.LinkedListNode;
import assignments.commonutils.LinkedListUtility;

import util.stats.Stats;

public class Runner {
	/**
	 * Q_4:
	 * 
	 * */
	
	public static void Ques_4Test(int arr[],String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer> resultHead = Solution.removeDuplicates(head);
		stats.endStat();
		LinkedListUtility.printList(resultHead,filePath);
	}
}
