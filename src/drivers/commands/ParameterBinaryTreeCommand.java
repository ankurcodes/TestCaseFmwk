package drivers.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import util.other.binaryTreeUtil.BinaryTreeNode;
import util.other.binaryTreeUtil.BinaryTreeType;
import util.other.binaryTreeUtil.TreeUtility;

public class ParameterBinaryTreeCommand implements ParameterCommand {

	private static final long serialVersionUID = 1L;
	private int whatMattersCharacter;
	private int size;

	private int min;
	private int max;
	ArrayList<Integer> treeListLength;
	@Override
	public void menu() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter choice ");
		System.out.println("1: Complete BinaryTree");
		System.out.println("2: Random BinaryTree");
		System.out.println("3: Complete BST");
		System.out.println("4: Random BST");
		whatMattersCharacter = s.nextInt();
		switch(whatMattersCharacter){
		case 1:
			System.out.println("No of levels");
			size = s.nextInt();
			break;
		case 2:
		case 3:
		case 4:
			System.out.println("No of nodes: ");
			size = s.nextInt();
			break;
		}
		System.out.println("Min value of Node element");
		min = s.nextInt();
		System.out.println("Max value of Node element");
		max = s.nextInt();
		treeListLength = ParameterCommandUtil.getArrayListLength(size);

	}

	

	public ArrayList<Integer> logic(int number) {
		ArrayList<Integer> tree = null;
		switch (number) {
		case 1:
			tree = TreeUtility.constructBinaryTreeLevelWise(BinaryTreeType.COMPLETE_BINARY_TREE,size,min,max);
			break;
		case 2:
			tree = TreeUtility.constructBinaryTreeLevelWise(BinaryTreeType.RANDOM_BINARY_TREE,size,min,max);
			break;
		case 3:
			tree = TreeUtility.constructBinaryTreeLevelWise(BinaryTreeType.COMPLETE_BST,size,min,max);
			break;
		case 4:
			tree = TreeUtility.constructBinaryTreeLevelWise(BinaryTreeType.RANDOM_BST,size,min,max);
			break;
		default:
			return null;

		}
		return tree;

	}

	@Override
	public void execute(ArrayList<String> result) {
		ArrayList<Integer> ans = logic(whatMattersCharacter);
		StringBuilder stringResult = new StringBuilder("");
		for (int i : ans) {
			stringResult.append(i + " ");
		}
		result.add(stringResult.toString());
	}

	@Override
	public Object read(String line) {
		return line.trim().charAt(0);
	}

}