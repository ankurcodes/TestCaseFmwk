package assignments.questions.linkedlist.Ques_6;

import assignments.commondatastructure.LinkedListNode;
import assignments.commonutils.LinkedListUtility;
import assignments.solutions.LinkedListSolution;
import util.stats.Stats;

public class Runner {
	/**
	 * Q_6:
	 * 
	 * */
	
	public static void Ques_6Test(int arr[], String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		int headResult = LinkedListSolution.printMiddel(head);
		stats.endStat();
		LinkedListUtility.print(headResult+"",filePath);
	}
}
