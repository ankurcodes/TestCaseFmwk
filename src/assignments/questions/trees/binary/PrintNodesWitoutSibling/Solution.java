package assignments.questions.trees.binary.PrintNodesWitoutSibling;

import java.util.ArrayList;


public class Solution {

	/*	Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	 */

	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		if(root == null){
			return;
		}

		if(root.left == null || root.right == null){
			if(root.left != null){
				System.out.print(root.left.data+" ");
			}
			if(root.right != null){
				System.out.print(root.right.data+" ");
			}
		}
		printNodesWithoutSibling(root.left);
		printNodesWithoutSibling(root.right);
	}



}
