package LeetCode.Subarray_Sum_Equals_K;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PrefixSumTest {
	private final PrefixSum prefixSum = new PrefixSum();
	private static final TestCases testCases = new TestCases();

	@ParameterizedTest
	@MethodSource("provideTestCases")
	public void test(int testCase, int expectedAnswer) {
		int result = prefixSum.subarraySum(testCases.getNums(testCase), testCases.getK(testCase));
		assertThat(result).isEqualTo(expectedAnswer);
	}

	static Stream<Arguments> provideTestCases() {
		return Stream.of(
			Arguments.of(0, testCases.getAnswer(0)),
			Arguments.of(1, testCases.getAnswer(1)),
			Arguments.of(2, testCases.getAnswer(2)),
			Arguments.of(3, testCases.getAnswer(3))
		);
	}
}