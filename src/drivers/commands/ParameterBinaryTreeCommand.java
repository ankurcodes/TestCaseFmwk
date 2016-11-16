package drivers.commands;

import java.util.ArrayList;
import java.util.Scanner;

import util.other.binaryTreeUtil.BinaryTreeNode;
import util.other.binaryTreeUtil.BinaryTreeType;
import util.other.binaryTreeUtil.TreeUtility;

public class ParameterBinaryTreeCommand implements ParameterCommand {

	private static final long serialVersionUID = 1L;
	private int whatMattersCharacter;
	private int size;

	@Override
	public void menu() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter choice ");
		System.out.println("1: Complete BinaryTree");
		System.out.println("2: Random BinaryTree");
		System.out.println("3: Complete BST");
		System.out.println("4: Random BST");
		whatMattersCharacter = s.nextInt();
		System.out.println("No of nodes: ");
		size = s.nextInt();

	}

	public BinaryTreeNode<Integer> logic(int number) {
		BinaryTreeNode<Integer> tree = null;
		switch (number) {
		case 1:
			tree = TreeUtility.constructBinaryTreeLevelWise(BinaryTreeType.COMPLETE_BINARY_TREE,size);
			break;
		case 2:
			tree = TreeUtility.constructBinaryTreeLevelWise(BinaryTreeType.RANDOM_BINARY_TREE,size);
			break;
		case 3:
			tree = TreeUtility.constructBinaryTreeLevelWise(BinaryTreeType.COMPLETE_BST,size);
			break;
		case 4:
			tree = TreeUtility.constructBinaryTreeLevelWise(BinaryTreeType.RANDOM_BST,size);
			break;
		default:
			return null;

		}
		return tree;

	}

	@Override
	public boolean execute(ArrayList<String> result) {
		BinaryTreeNode<Integer> ans = logic(whatMattersCharacter);
		result.add(ans + "");
		return true;
	}

	@Override
	public Object read(String line) {
		return line.trim().charAt(0);
	}

}
