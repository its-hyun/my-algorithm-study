package LeetCode.Climbing_Stairs;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Climbing Stairs - Memoization Solution")
class MemoizationTest {

	Memoization memoization = new Memoization();
	TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2})
	void climbStairs(int testCase) {
		int result = memoization.climbStairs(testCases.getN(testCase));
		assertThat(result).isEqualTo(testCases.getAnswer(testCase));
	}
}