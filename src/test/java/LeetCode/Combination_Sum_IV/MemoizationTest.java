package LeetCode.Combination_Sum_IV;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MemoizationTest {

	Memoization memoization = new Memoization();
	TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1})
	void combinationSum4Test(int testCase) {
		int result = memoization.combinationSum4(testCases.getNums(testCase), testCases.getTarget(testCase));
		Assertions.assertThat(result).isEqualTo(testCases.getExpectedAnswer(testCase));
	}
}