package assignments.runners;

import assignments.commondatastructure.LinkedListNode;
import assignments.commonutils.LinkedListUtility;
import assignments.solutions.SurpriseTestSolution;
import util.stats.Stats;

public class SurpriseTestRunner {

	public static void Ques_1(){
		
	}
	

	public static void Ques_2Test(int [] arr, int M, int N,String filePath){
		LinkedListNode<Integer> head = LinkedListUtility.arrayToLinkedList(arr);
		Stats stats = Stats.getStatsInstance();
		stats.startStat();
		LinkedListNode<Integer> finalHead= SurpriseTestSolution.skipMdeleteN(head,M,N);
		stats.endStat();
		LinkedListUtility.printList(finalHead,filePath);
	}
	
	public static void Ques_3(){
		
	}
	
	public static void Ques_4(){
		
	}
}
