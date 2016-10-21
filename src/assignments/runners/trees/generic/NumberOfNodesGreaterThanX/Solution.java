package assignments.runners.trees.generic.NumberOfNodesGreaterThanX;

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
	
	public static int numNodeGreater(TreeNode<Integer> root,int x){
		int count=0;
		if(root == null)
			return 0;
		if(root.data > x)
			count++;
		for(TreeNode<Integer> child : root.children){
			count = count + numNodeGreater(child, x);
		}
		return count;	
	}
	
}
