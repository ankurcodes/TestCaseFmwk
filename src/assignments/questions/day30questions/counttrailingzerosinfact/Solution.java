package assignments.questions.day30questions.counttrailingzerosinfact;

public class Solution {

	/**
	 * 4. Find number of trailing 0s in n factorial.
	 */
	
	public static int countTrailingZerosInFact(int num){

		int numFives = 0;
		int currentPow = 5;
		while(currentPow <= num){
			numFives += num/currentPow;
			currentPow  = currentPow*5;
		}
		return numFives;
	}

}
