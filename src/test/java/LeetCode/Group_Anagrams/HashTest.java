package LeetCode.Group_Anagrams;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Group Anagrams - Hash Solution")
class HashTest {
	Hash hash = new Hash();
	TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2})
	void groupAnagrams(int testCase) {
		List<List<String>> result = hash.groupAnagrams(testCases.getStrs(testCase));
		boolean isAnswer = testCases.isAnswer(testCase, result);
		assertThat(isAnswer).isTrue();
	}
}