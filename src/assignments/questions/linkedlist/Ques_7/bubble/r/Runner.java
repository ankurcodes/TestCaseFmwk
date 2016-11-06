package assignments.questions.linkedlist.Ques_7.bubble.r;

import assignments.commondatastructure.LinkedListNode;
import assignments.commonutils.LinkedListUtility;

import util.stats.Stats;

public class Runner {
	public static void Ques_7Test_BubbleRecursion(int arr[], String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer>headResult = Solution.bubbleSortRec(head);
		stats.endStat();
		LinkedListUtility.printList(headResult,filePath);
	}
}
