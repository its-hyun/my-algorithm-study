package LeetCode.Roman_to_Integer;

class Solution {
	public int romanToInt(String s) {
		int[] intArr = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			intArr[i] = toIntValue(s.charAt(i));
		}

		for (int i = 1; i < s.length(); i++) {
			if (intArr[i] > intArr[i - 1]) {
				intArr[i] = intArr[i] - intArr[i - 1];
				intArr[i - 1] = 0;
			}
		}

		int answer = 0;
		for (int i = 0; i < s.length(); i++) {
			answer += intArr[i];
		}

		return answer;
	}

	private int toIntValue(char c) {
		switch (c) {
			case 'I':
				return 1;
			case 'V':
				return 5;
			case 'X':
				return 10;
			case 'L':
				return 50;
			case 'C':
				return 100;
			case 'D':
				return 500;
			case 'M':
				return 1000;
			default:
				return 0;
		}
	}
}
