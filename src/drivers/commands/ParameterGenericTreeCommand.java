package drivers.commands;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import util.other.binaryTreeUtil.GenericTreeType;
import util.other.binaryTreeUtil.TreeUtility;

public class ParameterGenericTreeCommand implements ParameterCommand {
	private static final long serialVersionUID = 1L;
	List<Integer> treeListLength;
	private int whatMattersCharacter;
	private int size;
	private int min;
	private int max;

	@Override
	public void menu() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter choice ");
		System.out.println("1: Complete Generic Tree");
		System.out.println("2: Random Generic Tree");
		whatMattersCharacter = s.nextInt();
		System.out.println("No of nodes: ");
		size = s.nextInt();
		System.out.println("Min value of Node element");
		min = s.nextInt();
		System.out.println("Max value of Node element");
		max = s.nextInt();
		treeListLength = getArrayListLength(size);
	}

	public ArrayList<Integer> logic(int number) {
		int currentLength = treeListLength.remove(0);
		ArrayList<Integer> treeList = null;
		switch (number) {
		case 1:
			treeList = TreeUtility.takeInputLevelWiseGenericTree(GenericTreeType.COMPLETE_GENERIC_TREE, currentLength, min, max);
			break;
		case 2:
			treeList = TreeUtility.takeInputLevelWiseGenericTree(GenericTreeType.RANDOM_GENERIC_TREE, currentLength, min, max);
			break;
		default:
			return null;
		}
		return treeList;
	}

	@Override
	public boolean execute(ArrayList<String> result) {
		ArrayList<Integer> ans = logic(whatMattersCharacter);
		StringBuilder stringResult = new StringBuilder("");
		for (int i : ans) {
			stringResult.append(i + " ");
		}
		result.add(stringResult.toString());
		return true;
	}

	public ArrayList<Integer> getArrayListLength(int length) {
		int digitLength = (int) (Math.log10(length));
		switch (digitLength) {
		case 0:
			int count = 0;
			ArrayList<Integer> list = new ArrayList<>();
			while (count <= length) {
				list.add(count);
				count++;
			}
			while (count <= 9) {
				list.add(length);
				count++;
			}
			return list;
		case 1:
			return new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, length));
		case 2:
			return new ArrayList<Integer>(Arrays.asList(1, 10, 30, 40, 50, 60, 70, 80, length));
		case 3:
			return new ArrayList<Integer>(Arrays.asList(1, 10, 20, 50, 75, 100, 250, 500, length));
		case 4:
			return new ArrayList<Integer>(Arrays.asList(1, 10, 20, 50, 100, 500, 1000, 5000, length));
		case 5:
			return new ArrayList<Integer>(Arrays.asList(1, 10, 20, 50, 75, 100, 1000, 10000, length));
		case 6:
			return new ArrayList<Integer>(Arrays.asList(1, 20, 50, 75, 100, 1000, 10000, 100000, length));
		case 7:
			return new ArrayList<Integer>(Arrays.asList(1, 20, 50, 75, 100, 1000, 10000, 100000, length));
		case 8:
			return new ArrayList<Integer>(Arrays.asList(1, 5, 10, 100, 1000, 10000, 100000, 1000000, 10000000, length));
		case 9:
			return new ArrayList<Integer>(
					Arrays.asList(1, 5, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, length));
		default:
			return null;
		}
	}
	@Override
	public Object read(String line) {
		String[] valueStr = new String(line).trim().split(" ");
		int[] inputArrayParameter = new int[valueStr.length - 1];
		int arrLength = Integer.parseInt(valueStr[0].trim());
		for (int i = 0; i < arrLength; i++) {
			if (!valueStr[i + 1].isEmpty()) {
				inputArrayParameter[i] = Integer.parseInt(valueStr[i + 1].trim());
			}
		}
		return inputArrayParameter;
	}

}
