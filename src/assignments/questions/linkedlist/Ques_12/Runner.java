package assignments.questions.linkedlist.Ques_12;

import assignments.commondatastructure.LinkedListNode;
import assignments.commonutils.LinkedListUtility;

import util.stats.Stats;

public class Runner {
	
	/**
	 * Q_12
	 * */
	public static void Ques_12Test(int arr[], String filePath){
		Solution.result = new StringBuilder("");
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		Solution.printReverseRecursive(head);
		stats.endStat();
		LinkedListUtility.print(Solution.result.toString(), filePath);
	}
	
}
