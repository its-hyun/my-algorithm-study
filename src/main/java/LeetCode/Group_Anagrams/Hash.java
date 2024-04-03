package LeetCode.Group_Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Hash {
	public List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> map = new HashMap<>();

		for (String string : strs) {
			char[] charArr = string.toCharArray();
			Arrays.sort(charArr);
			String sortedString = new String(charArr);

			if (!map.containsKey(sortedString)) {
				map.put(sortedString, new ArrayList<>());
			}

			map.get(sortedString).add(string);
		}

		return new ArrayList<>(map.values());
	}

}
