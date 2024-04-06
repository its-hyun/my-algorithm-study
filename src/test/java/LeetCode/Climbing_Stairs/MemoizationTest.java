package LeetCode.Climbing_Stairs;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Climbing Stairs - Memoization Solution")
class MemoizationTest {

	private final Memoization memoization = new Memoization();
	private final TestCases testCases = new TestCases();

	@ParameterizedTest
	@MethodSource("provideTestCases")
	void climbStairsTest(int testCase) {
		int result = memoization.climbStairs(testCases.getN(testCase));
		assertThat(result).isEqualTo(testCases.getAnswer(testCase));
	}

	static Stream<Arguments> provideTestCases() {
		return Stream.of(
			Arguments.of(0),
			Arguments.of(1),
			Arguments.of(2)
		);
	}
}