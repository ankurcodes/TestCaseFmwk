package assignments.questions.trees.generic.ReplaceWithDepth;

import util.other.binaryTreeUtil.GenericTreeNode;

public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	public static void replaceWithDepthValue(GenericTreeNode<Integer> root){
		if(root == null){
			return;
		}
		 replaceWithDepthValue(root,0);
	}
	
	public static void replaceWithDepthValue(GenericTreeNode<Integer> root, int depth){
		root.data = depth;
		for(GenericTreeNode<Integer> child : root.children){
			replaceWithDepthValue(child, depth + 1);
		}	
	}
	
}
