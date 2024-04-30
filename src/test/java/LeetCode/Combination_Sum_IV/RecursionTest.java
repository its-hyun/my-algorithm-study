package LeetCode.Combination_Sum_IV;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RecursionTest {

	Recursion recursion = new Recursion();
	TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1})
	void combinationSum4Test(int testCase) {
		int result = recursion.combinationSum4(testCases.getNums(testCase), testCases.getTarget(testCase));
		Assertions.assertThat(result).isEqualTo(testCases.getExpectedAnswer(testCase));
	}
}