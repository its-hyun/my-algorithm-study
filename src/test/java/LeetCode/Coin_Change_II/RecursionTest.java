package LeetCode.Coin_Change_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RecursionTest {

	Recursion recursion = new Recursion();
	TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2, 3})
	void changeTest(int testCase) {
		int result = recursion.change(testCases.getAmount(testCase), testCases.getCoins(testCase));
		Assertions.assertThat(result).isEqualTo(testCases.getExpectedAnswer(testCase));
	}
}