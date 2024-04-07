package LeetCode.Fibonacci_Number;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Fibonacci_Number - Recursion Solution")
class RecursionTest {

	Recursion recursion = new Recursion();
	TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2})
	void fib(int testCase) {
		int result = recursion.fib(testCases.getN(testCase));
		Assertions.assertThat(result).isEqualTo(testCases.getAnswer(testCase));
	}
}