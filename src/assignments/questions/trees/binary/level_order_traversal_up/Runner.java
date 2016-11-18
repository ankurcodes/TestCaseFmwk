package assignments.questions.trees.binary.level_order_traversal_up;

import assignments.commonutils.ArrayUtility;
import util.other.binaryTreeUtil.BinaryTreeNode;
import util.stats.Stats;

public class Runner {
	static int count = 0;
	public static void test(int[] arr, String filePath) {
		Solution.result = new StringBuilder("");
		BinaryTreeNode<Integer> root = ArrayUtility.arrayListToBinaryTree(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		Solution.reverseLevelOrder(root);
		stats.endStat();
		ArrayUtility.print(Solution.result + "", filePath);
	}
}
