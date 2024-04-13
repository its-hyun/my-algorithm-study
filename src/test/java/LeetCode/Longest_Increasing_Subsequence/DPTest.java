package LeetCode.Longest_Increasing_Subsequence;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class DPTest {

	DP dp = new DP();
	TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2})
	void lengthOfLIS(int testCase) {
		int result = dp.lengthOfLIS(testCases.getNums(testCase));
		Assertions.assertThat(result).isEqualTo(testCases.getExpectedAnswer(testCase));
	}
}