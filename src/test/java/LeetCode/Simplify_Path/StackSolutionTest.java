package LeetCode.Simplify_Path;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class StackSolutionTest {

	StackSolution stack = new StackSolution();
	TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2, 3, 4})
	void simplifyPath(int testCase) {
		String result = stack.simplifyPath(testCases.getPath(testCase));
		assertThat(result).isEqualTo(testCases.getExpectedAnswer(testCase));
	}
}