package assignments.questions.test1.issibling;

public class Solution {
	public static boolean isSibling(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> p,
			BinaryTreeNode<Integer> q) {
		if (root == null)
			return false;
		if (root.left != null && root.right != null) {
			if (root.left.data == p.data && root.right.data == q.data)
				return true;
			else if (root.left.data == q.data && root.right.data == p.data)
				return true;
			else
				return isSibling(root.left, p, q) || isSibling(root.right, p, q);
		}
		if (root.right != null)
			return isSibling(root.right, p, q);
		else
			return isSibling(root.left, p, q);
	}

	public static int depth(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> node) {
		if (root == null)
			return -1;
		if (node.data == root.data)
			return 0;
		int left = depth(root.left, node);
		if (left != -1)
			return left;
		else {
			int right = depth(root.left, node);
			if (left != -1)
				return right;
			else
				return -1;
		}
	}

	public static boolean isCousin(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> p, BinaryTreeNode<Integer> q) {
		if (root == null)
			return false;
		return ((depth(root, p, 0) == depth(root, q, 0)) && (!isSibling(root, p, q)));
	}
}
