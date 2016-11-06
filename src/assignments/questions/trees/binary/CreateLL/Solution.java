package assignments.questions.trees.binary.CreateLL;

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

	/* class Node<T> {
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
		}
	}
*/
	public static ArrayList<Node<BinaryTreeNode<Integer>>> LLForEachLevel(BinaryTreeNode<Integer> root) {
		if(root == null){
			return null;
		}

		QueueUsingLL<BinaryTreeNode<Integer>> primary = new QueueUsingLL<>();
		QueueUsingLL<BinaryTreeNode<Integer>>  secondary = new QueueUsingLL<>();
		primary.enqueue(root);
		Node<BinaryTreeNode<Integer>> head = null,tail = null,newNode;
		ArrayList<Node<BinaryTreeNode<Integer>>> output = new ArrayList<>();

		while(!primary.isEmpty()){
			BinaryTreeNode<Integer> currentNode;
			try {
				currentNode = primary.dequeue();
				newNode = new Node<BinaryTreeNode<Integer>>(currentNode);
				if(head == null){
					head = newNode;
					tail = newNode;
				}
				else{
					tail.next = newNode;
					tail = newNode; 
				}
				if(currentNode.left != null){
					secondary.enqueue(currentNode.left);
				}
				if(currentNode.right != null){
					secondary.enqueue(currentNode.right);
				}
				if(primary.isEmpty()){
					output.add(head);
					head = null;
					tail = null;
					QueueUsingLL<BinaryTreeNode<Integer>> temp = primary;
					primary = secondary;
					secondary = temp;
				}
				
			} catch (QueueEmptyException e) {
			
			}
			
		}
		return output;
	}


}
