package drivers;
import static constants.TestCaseConstants.EXT;
import static constants.TestCaseConstants.LARGE_INPUT_FILE;
import static constants.TestCaseConstants.LARGE_OUTPUT_FILE;
import static constants.TestCaseConstants.SMALL_INPUT_FILE;
import static constants.TestCaseConstants.SMALL_OUTPUT_FILE;
import static constants.TestCaseConstants.TESTCASE_FOLDER_PATH;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import assignments.runners.test.surprisetest.WellformedParanthesis.Java.Main;
import drivers.commands.ParameterCommand;
import util.serialize_deserialize.CommandDeSerializer;
import util.stats.Stats;

public class TestCaseParser {
	public static int currentTestCaseNumber = 1;
	public static String quesName;

	public static String inputFolderPath;
	public static String outputFolderPath;

	private static String serializedFileLoc = TESTCASE_FOLDER_PATH + "serialized.xml";
	static List<ParameterCommand> parameterList;

	public static void init() {
		Scanner s = new Scanner(System.in);
		System.out.println("Ques Name: ");
		quesName = s.next() + "/";
		inputFolderPath = TESTCASE_FOLDER_PATH + quesName;
		outputFolderPath = TESTCASE_FOLDER_PATH + quesName;
		serializedFileLoc = TESTCASE_FOLDER_PATH + quesName + "serialized.xml";
		s.close();
	}

	public static void main(String[] args) throws IOException {
		init();

		parameterList = CommandDeSerializer.deserializeParameterList(serializedFileLoc);
		String smallFolderOutputPath = TESTCASE_FOLDER_PATH + quesName;
		cleanIOFolders(smallFolderOutputPath);
		String largeFolderOutputPath = TESTCASE_FOLDER_PATH + quesName;
		cleanIOFolders(largeFolderOutputPath);

		createSeparateInputFiles(smallFolderOutputPath + SMALL_INPUT_FILE + EXT, true);

		createSeparateInputFiles(largeFolderOutputPath + LARGE_INPUT_FILE + EXT, false);

		readTestCaseFile(smallFolderOutputPath, true);
		currentTestCaseNumber = 1;
		readTestCaseFile(largeFolderOutputPath, false);
		System.out.println("Successfully Completed...\n\n");
		System.out.println("File Loc: "+smallFolderOutputPath);
		Stats stats = Stats.getStatsInstance();
		stats.showStats();

		clean();
	}

	private static void clean() {
		// delete(serializedFileLoc);
		// delete(inputFolderPath + SMALL_INPUT_FILE + EXT);
		// delete(inputFolderPath+LARGE_INPUT_FILE+EXT);
	}

	public static void delete(String filePath) {
		try {
			File file = new File(filePath);
			if (file.exists()) {
				file.delete();
			}
		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	public static void readTestCaseFile(String fileName, boolean small) throws IOException {
		try {

			if (small) {
				for (int i = 1; i <= 3; i++) {
					runAlgo(parameterList, small);
					currentTestCaseNumber++;
				}
			} else {
				for (int i = 1; i <= 6; i++) {
					runAlgo(parameterList, small);
					currentTestCaseNumber++;
				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void runAlgo(List<ParameterCommand> parameterList, boolean small) {
		File file;
		String outputFile;

		if (small) {
			file = new File(inputFolderPath + SMALL_INPUT_FILE + currentTestCaseNumber + EXT);
			outputFile = inputFolderPath + SMALL_OUTPUT_FILE + currentTestCaseNumber + EXT;
		} else {
			file = new File(inputFolderPath + LARGE_INPUT_FILE + currentTestCaseNumber + EXT);
			outputFile = inputFolderPath + LARGE_OUTPUT_FILE + currentTestCaseNumber + EXT;
		}
		Scanner input = null;
		try {
			input = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Object param1 = parameterList.get(0).read(input.nextLine());
		// Object param2 = parameterList.get(1).read(input.nextLine());
		// Object param3 = parameterList.get(2).read(input.nextLine());

		//Days30Runner.Ques_16Test((int[]) param1, outputFile);
		Main.test((int)param1, outputFile);
		 
	}

	private static void cleanIOFolders(String filePath) {
		File folder = new File(filePath);
		if (!folder.exists()) {
			folder.mkdir();
		}
	}

	public static void createSeparateInputFiles(String inputFilePath, boolean small) {
		File inputFile = new File(inputFilePath);
		Scanner input;
		try {
			input = new Scanner(inputFile);
			input.nextLine();
			input.nextLine();
			File file = null;
			if (small) {
				for (int j = 1; j <= 3; j++) {
					file = new File(inputFolderPath + SMALL_INPUT_FILE + j + EXT);
					file.createNewFile();
					FileWriter writer = new FileWriter(file);
					input.nextLine();
					for (int i = 0; i < parameterList.size(); i++) {
						writer.write(input.nextLine());
						writer.write(System.lineSeparator());
					}
					writer.close();
				}
			} else {
				for (int j = 1; j <= 6; j++) {
					file = new File(inputFolderPath + LARGE_INPUT_FILE + j + EXT);
					file.createNewFile();
					FileWriter writer = new FileWriter(file);
					input.nextLine();
					for (int i = 0; i < parameterList.size(); i++) {
						writer.write(input.nextLine());
						writer.write(System.lineSeparator());
					}
					writer.close();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
