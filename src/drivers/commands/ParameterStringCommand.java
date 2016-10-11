package drivers.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import util.other.stringutil.StringUtil;

public class ParameterStringCommand implements ParameterCommand {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<Integer> stringLengthlist;
	List<Integer> stringWordlist;
	int StringType;
	int textLength;
	int numberOfWords;

	@Override
	public void menu() {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter choice ");
		System.out.println("1: String['a' to 'z']");
		System.out.println("2: String['A' to 'Z']");
		System.out.println("3: String['1' to '9']");
		System.out.println("4: String[alphanumeric]");
		System.out.println("5: String line");
		System.out.println("7: String & Its Permutation");

		StringType = s.nextInt();

		switch (StringType) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Text Length:");
			textLength = s.nextInt();
			stringLengthlist = getArrayListLength(textLength);
			break;
		case 5:
			System.out.println("Number of Words:");
			numberOfWords = s.nextInt();
			stringLengthlist = getArrayListLength(numberOfWords);
			break;

		case 7:
			break;
		default:
			break;
		}

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

	public String logic(int number) {
		int currentLength = stringLengthlist.remove(0);
		switch (number) {
		case 1:
			return StringUtil.getRequiredString(currentLength, StringUtil.StringType.SMALL);
		case 2:
			return StringUtil.getRequiredString(currentLength, StringUtil.StringType.CAPITAL);
		case 3:
			return StringUtil.getRequiredString(currentLength, StringUtil.StringType.NUMERIC);
		case 4:
			return StringUtil.getRequiredString(currentLength, StringUtil.StringType.ALPHANUMERIC);
		case 5:
			return StringUtil.generateUniqueStringOfGivenLength(currentLength);
		case 7:
			String inputTemp = StringUtil.getRequiredString(currentLength, StringUtil.StringType.SMALL);
			return StringUtil.generatePermutationOfString(inputTemp);
		default:

			return null;
		}
	}

	@Override
	public boolean execute(ArrayList<String> result) {
		String ans = logic(StringType);
		result.add(ans);
		return true;
	}

	@Override
	public void setStatus(boolean b) {

	}

	@Override
	public String read(String line) {
		// String[] valueStr = new String(line).trim().split(" ");

		return line;
	}

}
