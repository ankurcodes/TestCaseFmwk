package drivers;

import java.util.ArrayList;
import java.util.List;

import constants.TestCaseConstants;
import drivers.commands.ParameterCommand;

public class TestCaseController {
	private static TestCaseController instance = null;
	private static Object mutex = new Object();

	private TestCaseController() {

	}

	public static TestCaseController getInstance() {
		if (instance == null) {
			synchronized (mutex) {
				if (instance == null)
					instance = new TestCaseController();
			}
		}
		return instance;
	}

	/**
	 * steps Generate Menu Parse Menu Identify number of input parameter
	 * //parameter1 : manually // paramtere 2: auto fill // also add comments to
	 * input parameter in testcases that parser will ignore For each input:
	 * Identify the dataType Do Action based on Menu input Generate TestCases
	 * [small 3 & large 6] verify this TestCase after verified passed to
	 * TestCaseWriter // view it to user // give option to user to accept or
	 * discard it // in the end view all the test cases Generate TestCases
	 * results in end run your code and view graph.... // while running also
	 * display error if any
	 */

	public static List<ParameterCommand> parameterList = new ArrayList<ParameterCommand>();

	public void putParameter(ParameterCommand parameter) {
		parameterList.add(parameter);
	}

	public ArrayList<ArrayList<ArrayList<String>>> generateParameters() {
		ArrayList<ArrayList<ArrayList<String>>> finalResult = new ArrayList<ArrayList<ArrayList<String>>>();
		for (int no_of_testCases = 0; no_of_testCases < TestCaseConstants.EXACT_TEST_CASE; no_of_testCases++) {
			
			ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
			for (int i = 0; i < parameterList.size(); i++) {

				ArrayList<String> list = new ArrayList<String>();
				parameterList.get(i).execute(list);
				result.add(list);
			}
			finalResult.add(result);

		}

		return finalResult;
	}

}
