package LeetCode.Palindrome_Number;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MathTest {

	Math math = new Math();
	TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2})
	void isPalindrome(int testCase) {
		boolean result = math.isPalindrome(testCases.getX(testCase));
		assertThat(result).isEqualTo(testCases.getAnswer(testCase));
	}
}