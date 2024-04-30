package LeetCode.Coin_Change_II;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MemoizationTest {

	Memoization memoization = new Memoization();
	TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2, 3})
	void changeTest(int testCase) {
		int result = memoization.change(testCases.getAmount(testCase), testCases.getCoins(testCase));
		assertThat(result).isEqualTo(testCases.getExpectedAnswer(testCase));
	}
}