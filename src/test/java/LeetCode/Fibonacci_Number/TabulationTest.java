package LeetCode.Fibonacci_Number;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TabulationTest {

	Tabulation tabulation = new Tabulation();
	TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2})
	void fib(int testCase) {
		int result = tabulation.fib(testCases.getN(testCase));
		Assertions.assertThat(result).isEqualTo(testCases.getAnswer(testCase));
	}
}