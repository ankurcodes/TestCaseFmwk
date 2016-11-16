

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class WordClass {
	String word;
	int firstIndex;
	int count;

	WordClass(String word, int firstIndex) {
		this.word = word;
		this.firstIndex = firstIndex;
		this.count = 1;
	}
}

public class Solution {
static StringBuilder result = new StringBuilder("");
	static Map<String, WordClass> wordMap = new HashMap<>();

	public static String maxFreqWord(String line) {
		wordMap.clear();
	result = new StringBuilder("");
		Set<String> set = buildWordSet(line);
		int minIndex = Integer.MAX_VALUE;
		String minIndexHighFreqWord = null;
		for (String word : set) {
			WordClass wordClass = wordMap.get(word);
			if (wordClass.firstIndex < minIndex) {
				minIndexHighFreqWord = wordClass.word;
				minIndex = wordClass.firstIndex;
			}
		}
		return minIndexHighFreqWord;

	}

	private static Set<String> buildWordSet(String line) {
		String[] words = line.split(" ");
		Set<String> wordSet = new HashSet<>();
		int maxCount = Integer.MIN_VALUE;
		int index = 0;
		for (String word : words) {
			if (word.isEmpty()) {
				continue;
			}
			WordClass wordClass = null;
			if (wordMap.containsKey(word)) {
				wordClass = wordMap.get(word);
				wordClass.count = wordClass.count + 1;
			} else {
				wordClass = new WordClass(word, index);
			}
			wordMap.put(word, wordClass);
			if (wordClass.count > maxCount) {
				wordSet.clear();
				wordSet.add(word);
				maxCount = wordClass.count;
			} else if (wordClass.count == maxCount) {
				wordSet.add(word);
			}
			index++;
		}
		return wordSet;
	}
}
