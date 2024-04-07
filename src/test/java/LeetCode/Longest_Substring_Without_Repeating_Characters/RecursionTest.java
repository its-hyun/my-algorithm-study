package LeetCode.Longest_Substring_Without_Repeating_Characters;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Longest Substring Without Repeating Characters - Recursion Solution")
class RecursionTest {

	private final Recursion recursion = new Recursion();
	private final TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2})
	void lengthOfLongestSubstring(int testCase) {
		int result = recursion.lengthOfLongestSubstring(testCases.getS(testCase));
		assertThat(result).isEqualTo(testCases.getExpectedAnswer(testCase));
	}
}