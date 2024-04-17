package LeetCode.Simplify_Path;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TwoPointerTest {

	TwoPointer twoPointer = new TwoPointer();
	TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2, 3, 4})
	void simplifyPath(int testCase) {
		String result = twoPointer.simplifyPath(testCases.getPath(testCase));
		assertThat(result).isEqualTo(testCases.getExpectedAnswer(testCase));
	}
}