package drivers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import drivers.commands.ParameterCommand;
import drivers.commands.enums.ParameterTypeEnum;
import drivers.commands.factory.ParameterCommandFactory;
import util.serialize_deserialize.CommandSerializer;
import util.writer.TestCaseWriter;

public class TestCaseGenerator {

	public static int numberOfInputParameter;
	static TestCaseController controller;
	public static String quesName;

	static Map<Integer, drivers.commands.enums.ParameterTypeEnum> parameterDataTypeMap;
	static {
		parameterDataTypeMap = new HashMap<Integer, drivers.commands.enums.ParameterTypeEnum>();
		parameterDataTypeMap.put(1, ParameterTypeEnum.INTEGER);
		parameterDataTypeMap.put(2, ParameterTypeEnum.CHARACTER);
		parameterDataTypeMap.put(3, ParameterTypeEnum.INTEGERARRAY);
		parameterDataTypeMap.put(4, ParameterTypeEnum.BOOLEAN);
		parameterDataTypeMap.put(5, ParameterTypeEnum.STRING);
		parameterDataTypeMap.put(6, ParameterTypeEnum.INTEGER_2DARRAY);
	}

	public static void main(String[] args) throws IOException {
		controller = TestCaseController.getInstance();
		Scanner s = new Scanner(System.in);
		System.out.println("Question Name: ");

		quesName = s.next() + "/";
		System.out.println("Number of input parameters: ");

		numberOfInputParameter = s.nextInt();
		for (int i = 0; i < numberOfInputParameter; i++) {
			System.out.println("*****************PARAMETER: " + (i + 1) + "  *****************");

			int dataType = 0;
			do {
				if (!(dataType >= 1 || dataType <= 9)) {
					System.out.println("Invalid Input Try again:");
				}
				displayDataMenu();
				dataType = s.nextInt();
			} while (!(dataType >= 1 || dataType <= 9));

			ParameterCommand parameterCommand = ParameterCommandFactory
					.buildParameterCommand(parameterDataTypeMap.get(dataType));
			parameterCommand.menu();
			controller.putParameter(parameterCommand);
		}
		ArrayList<ArrayList<ArrayList<String>>> x = controller.generateParameters();
		TestCaseWriter.write(x);
		CommandSerializer.serializeParameterList(TestCaseController.parameterList);
	}

	public static void displayDataMenu() {
		System.out.println("Enter Data Type");
		System.out.println("...... 1: Integer");
		System.out.println("...... 2: Character");
		System.out.println("...... 3: Integer Array");
		System.out.println("...... 4: Boolean");
		System.out.println("...... 5: String Text");
		System.out.println("...... 6: Integer 2D Array");

	}
}
