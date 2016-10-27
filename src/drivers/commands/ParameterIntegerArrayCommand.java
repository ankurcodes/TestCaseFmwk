package drivers.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import util.other.arrayutility.IntegerArrayUtility;

public class ParameterIntegerArrayCommand implements ParameterCommand {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static int whatMattersArray;

	private int length;
	private int min;
	private int max;
	private int diff;
	List<Integer> arrayLengthlist = new ArrayList<Integer>(9);
	List<Integer> rotateIndexList = new ArrayList<Integer>(9);
	private AssignmentType currentAssignmentType= AssignmentType.ARRAY;

	@Override
	public void menu() {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter choice ");
		System.out.println("1: Random Array");
		System.out.println("2: Sorted Increasing Array");
		System.out.println("3: Sorted Increasing Array (duplicates)");
		System.out.println("4: Sorted Decreasing Array");
		System.out.println("5: Sorted Decreasing Array (duplicates)");
		System.out.println("6. Rotated Increasing Array");
		System.out.println("7. Rotated Decreasing Array");
		System.out.println("8. Consecutive Unsorted Array");

		whatMattersArray = s.nextInt();
		System.out.println("Array Length:");
		length = s.nextInt();

		switch (whatMattersArray) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Array Min Element");
			min = s.nextInt();
			System.out.println("Array Max Element");
			max = s.nextInt();
			break;
		case 6:
		case 7:
			System.out.println("Array Min Element");
			min = s.nextInt();
			System.out.println("Array Max Element");
			max = s.nextInt();
			rotateIndexList = getArrayListLength(length);
			break;
		case 8:
			System.out.println("Array Min Element");
			min = s.nextInt();
			System.out.println("Diff value");
			diff = s.nextInt();
			break;

		}

		arrayLengthlist = getArrayListLength(length);
		// s.close();
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

	public int[] logic(int number) {
		int currentLength = arrayLengthlist.remove(0);
		switch (number) {

		case 1:
			return IntegerArrayUtility.randomArrayGenerator(currentLength, min, max);
		case 2:
			return IntegerArrayUtility.increasingIntegerArray(currentLength, min, max);
		case 3:
			return IntegerArrayUtility.increasingIntegerArrayWithDuplicates(currentLength, min, max);
		case 4:
			return IntegerArrayUtility.decreasingIntegerArray(currentLength, min, max);
		case 5:
			return IntegerArrayUtility.decreasingIntegerArrayWithDuplicates(currentLength, min, max);
		case 6:
			int rotateBy1 = rotateIndexList.remove(0);
			System.out.println("Rotate By:  " + rotateBy1 / 2);
			return IntegerArrayUtility.rotatedIncreasingArray(currentLength, rotateBy1 / 2, min, max);
		case 7:
			int rotateBy2 = rotateIndexList.remove(0);
			System.out.println("Rotate By:  " + rotateBy2 / 2);
			return IntegerArrayUtility.rotatedDecreasingArray(currentLength, rotateBy2 / 2, min, max);
		case 8:
			return IntegerArrayUtility.getConsecutiveUnsortedArray(currentLength, min, diff);
		default:
			return null;
		}

	}

	private boolean execute_L(ArrayList<String> result) {
		StringBuilder str = new StringBuilder();
		int arr[] = logic(whatMattersArray);
		for (int j = 0; j < arr.length; j++) {
			str.append(arr[j] + " ");
		}
		str.append(-1);
		result.add(str.toString());
		return true;
	}

	private boolean execute_A(ArrayList<String> result) {
		StringBuilder str = new StringBuilder();
		int arr[] = logic(whatMattersArray);
		str.append(arr.length + " ");
		for (int j = 0; j < arr.length; j++) {
			str.append(arr[j] + " ");
		}
		result.add(str.toString());
		return true;
	}

	
	@Override
	public boolean execute(ArrayList<String> result) {
		return execute(result, currentAssignmentType);
	}

	public boolean execute(ArrayList<String> result, AssignmentType type) {
		switch (type) {
		case ARRAY:
			return execute_A(result);
		case LINKEDLIST:
			return execute_L(result);
		default:
			return true;
		}
	}

	@Override
	public int[] read(String line) {
		return read(line, currentAssignmentType);
	}

	public int[] read(String line, AssignmentType type) {
		switch (type) {
		case ARRAY:
			return read_A(line);
		case LINKEDLIST:
			return read_L(line);
		default:
			return null;
		}
	}

	public int[] read_A(String line) {
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

	public int[] read_L(String line) {
		String[] valueStr = new String(line).trim().split(" ");
		int[] inputArrayParameter = new int[valueStr.length - 1];

		for (int i = 0; i < inputArrayParameter.length; i++) {
			if (!valueStr[i].isEmpty()) {
				inputArrayParameter[i] = Integer.parseInt(valueStr[i].trim());
			}
		}
		return inputArrayParameter;
	}

}
