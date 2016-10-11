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

	@Override
	public void menu() {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter choice ");
		System.out.println("1: Random Array");
		System.out.println("2: Sorted NonRepeated Increasing Array");
		System.out.println("3: Sorted NonRepeated Decreasing Array");
		System.out.println("4. Rotated Increasing Array");
		System.out.println("5. Rotated Decreasing Array");
		System.out.println("6. Consecutive Unsorted Array");

		whatMattersArray = s.nextInt();
		System.out.println("Array Length:");
		length = s.nextInt();

		switch (whatMattersArray) {
		case 1:
		case 2:
		case 3:
			System.out.println("Array Min Element");
			min = s.nextInt();
			System.out.println("Array Max Element");
			max = s.nextInt();
			break;
		case 4:
		case 5:
			System.out.println("Array Min Element");
			min = s.nextInt();
			System.out.println("Array Max Element");
			max = s.nextInt();
			rotateIndexList = getArrayListLength(length);
			break;
		case 6:
			System.out.println("Array Min Element");
			min = s.nextInt();
			System.out.println("Diff value");
			diff = s.nextInt();
			break;

		}

		arrayLengthlist = getArrayListLength(length);
s.close();
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

			return IntegerArrayUtility.unRepeatedIncreasingIntegerArray(currentLength, min, max);
		case 3:
			return IntegerArrayUtility.unRepeatedDecreasingIntegerArray(currentLength, min, max);
		case 4:
			int rotateBy = rotateIndexList.remove(0);
			System.out.println("Rotate By:  " + rotateBy / 2);
			return IntegerArrayUtility.rotatedIncreasingArray(currentLength, rotateBy / 2, min, max);
		case 5:

			return null;

		case 6:
			return IntegerArrayUtility.getConsecutiveUnsortedArray(currentLength, min, diff);
		default:
			return null;
		}

	}

	@Override
	public boolean execute(ArrayList<String> result) {
		StringBuilder str = new StringBuilder();
		int arr[] = logic(whatMattersArray);
		str.append(arr.length + " ");
		for (int j = 0; j < arr.length; j++) {
			str = str.append(arr[j] + " ");
		}
		result.add(str.toString());
		return true;
	}

	@Override
	public void setStatus(boolean b) {

	}

	@Override
	public int[] read(String line) {
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
