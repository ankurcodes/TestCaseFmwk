package assignments.questions.strings.smallest_substring_having_all_chars_of_another_string;

import java.util.HashMap;

public class Solution {
	public static String findMinSubstringContainingString(String large, String small){
		if(large.length() == 0){
			return null;
		}
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < small.length(); i++){
			if(map.containsKey(small.charAt(i))){
				map.put(small.charAt(i), 1 + map.get(small.charAt(i)));
			}
			else{
				map.put(small.charAt(i), 1);
			}
		}

		int answerStart = 0;
		int answerEnd = -1;
		int answerLength = Integer.MAX_VALUE;
		int currentSubStringStart = 0;
		int currentSubStringEnd = 0;
		int numRemainingChar = map.size();

		while(currentSubStringEnd < large.length()){
			char curentChar = large.charAt(currentSubStringEnd);
			int currentCharFreq = map.containsKey(curentChar) ? map.get(curentChar) : Integer.MIN_VALUE;
			if(currentCharFreq == Integer.MIN_VALUE){
				currentSubStringEnd++;
			}else{
				map.put(curentChar, currentCharFreq - 1);
				if(currentCharFreq == 1){
					numRemainingChar--;
				}
				if(numRemainingChar == 0){
					while(currentSubStringStart != currentSubStringEnd){
						char ch = large.charAt(currentSubStringStart);
						int freq = map.containsKey(ch) ? map.get(ch) : Integer.MIN_VALUE;
						if(freq == Integer.MIN_VALUE){
							currentSubStringStart++;
						}else if(freq < 0){
							currentSubStringStart++;
							map.put(ch, freq + 1);
						}else{
							int currentSubstringLength = currentSubStringEnd - currentSubStringStart + 1;
							if(currentSubstringLength < answerLength){
								answerStart = currentSubStringStart;
								answerEnd = currentSubStringEnd;
								answerLength = currentSubstringLength;
							}
							break;
						}
					}
				}
				currentSubStringEnd++;
			}
		}
		if(answerLength == Integer.MAX_VALUE){
			return null;
		}else{
			return large.substring(answerStart, answerEnd + 1); 
		}
	}
}