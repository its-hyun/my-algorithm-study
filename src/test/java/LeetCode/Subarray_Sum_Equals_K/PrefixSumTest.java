package LeetCode.Subarray_Sum_Equals_K;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Subarray Sum Equals K - Prefix Sum Solution")
class PrefixSumTest {
	PrefixSum prefixSum = new PrefixSum();
	TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2, 3})
	void subarraySum(int testCase) {
		int result = prefixSum.subarraySum(testCases.getNums(testCase), testCases.getK(testCase));
		assertThat(result).isEqualTo(testCases.getAnswer(testCase));
	}
}