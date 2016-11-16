package util.other.binaryTreeUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class TreeUtility {
	int array[];
	// input sorted array to get complete BST
	// input random Array to get complete Binary Tree
	// generate random tree using queue as we did in class...

	public BinaryTreeNode<Integer> sortedArrayToBST(int arr[], int start, int end) {
		if (start > end) {
			return null;
		}
		int mid = (start + end) / 2;
		BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>(arr[mid]);
		node.left = sortedArrayToBST(arr, start, mid - 1);
		node.right = sortedArrayToBST(arr, mid + 1, end);
		return node;
	}

	// read from array that may contain -1
	public static BinaryTreeNode<Integer> constructBinaryTreeLevelWise(BinaryTreeType treeType, int size) {
		int array[];
		switch (treeType) {
		// case COMPLETE_BINARY_TREE:
		// array = ;
		// case RANDOM_BINARY_TREE:
		// array = ;
		// case COMPLETE_BST:
		// array = ;
		// case RANDOM_BST:
		// array = ;
		}

		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data: ");
		int rootData = s.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		LinkedList<BinaryTreeNode<Integer>> queue = new LinkedList<>();
		queue.addLast(root);
		while (!queue.isEmpty()) {
			BinaryTreeNode<Integer> currentNode = queue.removeFirst();
			System.out.println("Enter left child: ");
			int leftChildData = s.nextInt();
			if (leftChildData != -1) {
				currentNode.left = new BinaryTreeNode<>(leftChildData);
				queue.add(currentNode.left);
			}

			System.out.println("Enter right child: ");
			int rightChildData = s.nextInt();

			if (rightChildData != -1) {
				currentNode.right = new BinaryTreeNode<>(rightChildData);
				queue.addLast(currentNode.right);
			}

		}
		return root;
	}

	// generic tree from an array
	public static ArrayList<Integer> takeInputLevelWiseGenericTree(GenericTreeType treeType, int size, int min, int max) {
		// need to create an array of sum of all array will be equal to size...
		ArrayList<Integer> list = new ArrayList<>();
		Random rn = new Random();
		switch (treeType) {
		case COMPLETE_GENERIC_TREE:
			while (true) {
				int randomNum = rn.nextInt(10) + 1;
				size = size - randomNum;
				if (size <= 0) {
					break;
				}
				list.add(randomNum);
			}
		case RANDOM_GENERIC_TREE:
			while (true) {
				int randomNum = rn.nextInt(9);
				size = size - randomNum;
				if (size <= 0) {
					break;
				}
				list.add(randomNum);
			}
		}
		ArrayList<Integer> result = new ArrayList<>();
		result.add(rn.nextInt(max - min + 1) + min);
		for (int numChild : list) {
			result.add(numChild);
			for (int i = 0; i < numChild; i++) {
				int rootData = rn.nextInt(max - min + 1) + min;
				result.add(rootData);
			}
		}
		return result;
	}
}
