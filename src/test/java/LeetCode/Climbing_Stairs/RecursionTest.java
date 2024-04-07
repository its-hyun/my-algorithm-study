package LeetCode.Climbing_Stairs;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Climbing Stairs - Recursion Solution")
class RecursionTest {

	private final Recursion recursion = new Recursion();
	private final TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2})
	void climbStairsTest(int testCase) {
		int result = recursion.climbStairs(testCases.getN(testCase));
		assertThat(result).isEqualTo(testCases.getAnswer(testCase));
	}
}