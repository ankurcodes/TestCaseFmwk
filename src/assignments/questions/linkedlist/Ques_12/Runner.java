package assignments.questions.linkedlist.Ques_12;

import assignments.commondatastructure.LinkedListNode;
import assignments.commonutils.LinkedListUtility;
import assignments.solutions.LinkedListSolution;
import util.stats.Stats;

public class Runner {
	
	/**
	 * Q_12
	 * */
	public static void Ques_12Test(int arr[], String filePath){
		LinkedListSolution.ques12Ans = new StringBuilder("");
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListSolution.printReverseRecursive(head);
		stats.endStat();
		LinkedListUtility.print(LinkedListSolution.ques12Ans.toString(), filePath);
	}
	
}
