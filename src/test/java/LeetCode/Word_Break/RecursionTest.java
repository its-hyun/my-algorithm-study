package LeetCode.Word_Break;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Subarray Sum Equals K - Prefix Sum Solution")
class RecursionTest {

	Recursion recursion = new Recursion();
	TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2})
	void wordBreak(int testCase) {
		boolean result = recursion.wordBreak(testCases.getS(testCase), testCases.getWordDict(testCase));
		assertThat(result).isEqualTo(testCases.getAnswer(testCase));
	}

}