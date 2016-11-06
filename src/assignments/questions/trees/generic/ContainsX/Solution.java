package assignments.questions.trees.generic.ContainsX;

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
	
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
		if(root == null){
			return false;
		}
		if(root.data == x){
			return true;
		}
		for(TreeNode<Integer> child : root.children){
			if(checkIfContainsX(child, x)){
				return true;
			}
		}
		return false;
	}
	
}
