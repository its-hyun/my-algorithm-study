package Programmers.코드_처리하기;

class Solution {
	public String solution(String code) {
		StringBuilder sb = new StringBuilder();
		boolean mode = false;

		for (int i = 0; i < code.length(); i++) {
			if (code.charAt(i) == '1') {
				mode = !mode;
				continue;
			}

			if (!mode && i % 2 == 0) {
				sb.append(code.charAt(i));
				continue;
			}

			if (mode && i % 2 != 0) {
				sb.append(code.charAt(i));
				continue;
			}
		}

		String result = sb.toString();
		return result.length() == 0 ? "EMPTY" : result;
	}
}