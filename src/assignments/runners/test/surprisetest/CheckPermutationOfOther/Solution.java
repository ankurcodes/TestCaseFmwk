package assignments.runners.test.surprisetest.CheckPermutationOfOther;

public class Solution {

	public static boolean isPermutation(String input1, String input2) {
	    int freq[] = new int[26];
	    int nonZeroCount = 0;
	    for(int i = 0; i < input1.length(); i++) {
	        int index = input1.charAt(i) - 'a';
	        if(freq[index] == 0) {
	            nonZeroCount++;
	        }
	        freq[index]++;
	    }
	    for(int i = 0; i < input2.length(); i++) {
	        int index = input2.charAt(i) - 'a';
	        freq[index]--;
	        if(freq[index] == 0) {
	            nonZeroCount--;            
	        }
	    }

	    if(nonZeroCount == 0) {
	        return true;
	    }
	    else {
	        return false;
	    }

	}

}
