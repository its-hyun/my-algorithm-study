package LeetCode.Group_Anagrams;

import java.util.ArrayList;
import java.util.List;

public class TestCases {
	private final String[][] strs = {{"eat", "tea", "tan", "ate", "nat", "bat"}, {""}, {"a"}};
	private final List<List<List<String>>> expectedAnswer = new ArrayList<>();

	public TestCases() {
		// List<List<String>> output 값을 초기화
		List<List<String>> case1 = new ArrayList<>();
		case1.add(List.of("bat"));
		case1.add(List.of("nat", "tan"));
		case1.add(List.of("ate", "eat", "tea"));
		expectedAnswer.add(case1);

		List<List<String>> case2 = new ArrayList<>();
		case2.add(List.of(""));
		expectedAnswer.add(case2);

		List<List<String>> case3 = new ArrayList<>();
		case3.add(List.of("a"));
		expectedAnswer.add(case3);
	}

	public String[] getStrs(int i) {
		return strs[i];
	}

	public boolean isAnswer(int testCaseIndex, List<List<String>> output) {
		// 주어진 테스트 케이스의 정답을 가저온다.
		List<List<String>> expected = expectedAnswer.get(testCaseIndex);

		// 만약 output 리스트의 길이와 정답 리스트의 길이가 다르다면 false를 반환
		if (output.size() != expected.size()) {
			return false;
		}

		// 각 리스트를 정렬하여 순서가 달라도 같은 요소로 이루어 졌는지 확인
		for (List<String> expctedList : expected) {
			boolean found = false;

			// 각 예상 리스트의 요소가 output 리스트에 포함되어 있는지 확인
			for (List<String> outputList : output) {
				if (expctedList.size() == outputList.size() && expctedList.containsAll(outputList)) {
					found = true;
					break;
				}
			}

			// 만약 예상 리스트의 요소가 output 리스트에 포함되어 있지 않다면 false를 반환
			if (!found) {
				return false;
			}
		}

		// 모든 조건을 통과하면 true를 반환
		return true;
	}
}
