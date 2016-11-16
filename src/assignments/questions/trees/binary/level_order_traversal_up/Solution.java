package assignments.questions.trees.binary.level_order_traversal_up;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Solution {
	public static void reverseLevelOrder(BinaryTreeNode<Integer> node) {
		Stack<BinaryTreeNode<Integer>> S = new Stack<>();
		Queue<BinaryTreeNode<Integer>> Q = new LinkedList<>();
		Q.add(node);
		while (Q.isEmpty() == false) {
			node = Q.peek();
			Q.remove();
			S.push(node);

			if (node.right != null)
				Q.add(node.right);

			if (node.left != null)
				Q.add(node.left);
		}
		while (S.empty() == false) {
			node = S.peek();
			System.out.print(node.data + " ");
			S.pop();
		}
	}
}
