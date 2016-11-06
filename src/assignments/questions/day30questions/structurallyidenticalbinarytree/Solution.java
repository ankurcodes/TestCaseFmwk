package assignments.questions.day30questions.structurallyidenticalbinarytree;

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

	public static boolean checkIdentical(BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2){
		if(root1 == null && root2 == null){
			return true;
		}
		if(root1 == null || root2 == null){
			return false;
		}
		
		if( root1.data != root2.data || !checkIdentical(root1.left, root2.left) || !checkIdentical(root1.right, root2.right)){
			return false;
		}
		return true;
	}
	
	


}
