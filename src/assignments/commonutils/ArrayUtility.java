package assignments.commonutils;

import java.util.ArrayList;

import util.logs.writer.LogWriter;

public class ArrayUtility {
public static void print(String ans, String filePath) {
		
		LogWriter logger = new LogWriter(filePath);
		logger.writing(ans);
		CommonUtility.printToConsole(ans);
	}
	
	public static void printList(ArrayList<Integer> resultList, String filePath){
		StringBuilder finalAns = new StringBuilder("");
		for(int i: resultList){
			finalAns.append(i+" ");
		}
		ArrayUtility.print(finalAns + "", filePath);
	}
	public static void printListln(ArrayList<Integer> resultList, String filePath){
		StringBuilder finalAns = new StringBuilder("");
		for(int i: resultList){
			finalAns.append(i);
			finalAns.append(System.lineSeparator());
		}
		ArrayUtility.print(finalAns + "", filePath);
	}

	public static void printToFile(LogWriter logger,String outputString) {
		logger.writing(outputString);
		CommonUtility.printToConsole(outputString);
	}
	
	public static ArrayList<Integer> arrayToList(int[] arr){
		ArrayList<Integer> list = new ArrayList<Integer>(arr.length);
		for(int i :arr){
			list.add(i);
		}
		return list;
	}
}
