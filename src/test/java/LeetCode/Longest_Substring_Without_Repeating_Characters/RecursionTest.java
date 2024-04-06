package LeetCode.Longest_Substring_Without_Repeating_Characters;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Longest Substring Without Repeating Characters - Recursion Solution")
class RecursionTest {

	private final Recursion recursion = new Recursion();
	private final TestCases testCases = new TestCases();

	@ParameterizedTest
	@MethodSource("testCase")
	void lengthOfLongestSubstring(int testCase) {
		int result = recursion.lengthOfLongestSubstring(testCases.getS(testCase));
		assertThat(result).isEqualTo(testCases.getExpectedAnswer(testCase));
	}

	static Stream<Arguments> testCase() {
		return Stream.of(
			Arguments.of(0),
			Arguments.of(1),
			Arguments.of(2)
		);
	}
}