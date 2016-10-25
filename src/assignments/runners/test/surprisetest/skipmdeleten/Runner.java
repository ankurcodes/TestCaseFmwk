package assignments.runners.test.surprisetest.skipmdeleten;

import assignments.commondatastructure.LinkedListNode;
import assignments.commonutils.LinkedListUtility;
import util.stats.Stats;

public class Runner {
	public static void test(int[] arr, int M, int N, String filePath) {
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer> finalHead = Solution.skipMdeleteN(head, M, N);
		stats.endStat();
		LinkedListUtility.printList(finalHead, filePath);
	}
}
